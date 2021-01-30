using System;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
public class JavaScriptListner : JavaScriptParserBaseListener {

  private AsmGenerator asmGenerator;
  public JavaScriptListner() : base() {
    asmGenerator = AsmGenerator.Instance;
  }

  public override void ExitVariableDeclaratiion(JavaScriptParser.VariableDeclaratiionContext context) {
    string variableName = context.GetChild(1).GetText();

    if (Store.Variables.ContainsKey(variableName)) {
      throw new InvalidOperationException($"Variable `{variableName}` already initialized.");
    }

    StoreItem item = StoreItem.CreateVariable(variableName);
    Store.PushStack(item);
  }

  public override void ExitConditionOperation(JavaScriptParser.ConditionOperationContext context)
  {
    if (context.ChildCount <= 1) return;
    StoreItem arg2 = Store.PopStack();
    StoreItem sign = Store.PopStack();
    StoreItem arg1 = Store.PopStack();

    bool stringOperation = false;
    if (StoreItem.IsAnyType(StoreItemType.STRING, arg1, arg2)) {
      if (!Array.Exists(new[] {"==", "===", "!=", "!=="}, x => x == sign.Value) ) {
        throw new InvalidOperationException($"Operation is not allowed for strings.");
      }
      stringOperation = true;

      arg1 = castVariable(arg1, StoreItemType.STRING);
      arg2 = castVariable(arg2, StoreItemType.STRING);
    }

    asmGenerator.Load(arg1);
    asmGenerator.Load(arg2);

    if (stringOperation) {
      asmGenerator.CompareStrings(sign);
    } else {
      asmGenerator.ExecuteConditionOperation(sign);
    }

    StoreItem resultItem;
    if (arg1.IsTemporary && arg1.IsType(StoreItemType.BOOLEAN)) {
      resultItem = arg1;
    } else if (arg2.IsTemporary && arg2.IsType(StoreItemType.BOOLEAN)) {
      resultItem = arg2;
    } else {
      resultItem = StoreItem.CreateTemporaryVariable(StoreItemType.BOOLEAN);
      asmGenerator.InitializeVariable(resultItem);
    }
    Store.PushStack(resultItem);
    asmGenerator.StoreVariable(resultItem);

    asmGenerator.Comment($"{resultItem.Print} = {arg1.Print} {sign.Value} {arg2.Print}");
    asmGenerator.EmptyLine();
  }

  public override void ExitArithmeticOperation(JavaScriptParser.ArithmeticOperationContext context) {
    if (context.ChildCount > 1) {
      processArithmeticOperation();
    }
  }

  public override void ExitArithmeticOperationHigher(JavaScriptParser.ArithmeticOperationHigherContext context) {
    if (context.ChildCount > 1) {
      processArithmeticOperation();
    }
  }

  private void processArithmeticOperation() {
    StoreItem arg2 = Store.PopStack();
    StoreItem sign = Store.PopStack();
    StoreItem arg1 = Store.PopStack();

    bool stringOperation = false;

    if (StoreItem.IsAnyType(StoreItemType.STRING, arg1, arg2)) {
      if (sign.Value != "+") {
        throw new InvalidOperationException($"Operation is not allowed for strings.");
      }
      stringOperation = true;

      arg1 = castVariable(arg1, StoreItemType.STRING);
      arg2 = castVariable(arg2, StoreItemType.STRING);
    }
    if(sign.Value == "/" || StoreItem.IsAnyType(StoreItemType.DOUBLE, arg1, arg2)){
      arg1 = castVariable(arg1, StoreItemType.DOUBLE);
      arg2 = castVariable(arg2, StoreItemType.DOUBLE);
    }

    asmGenerator.Load(arg1);
    asmGenerator.Load(arg2);
    if (stringOperation) {
      asmGenerator.ConcatStrings();
    } else {
      asmGenerator.ExecuteArithmeticOperation(sign);
    }

    StoreItem resultItem;
    if (arg1.IsTemporary) {
      resultItem = arg1;
    } else if (arg2.IsTemporary) {
      resultItem = arg2;
    } else {
      resultItem = StoreItem.CreateTemporaryVariable(arg1.ItemType);
      asmGenerator.InitializeVariable(resultItem);
    }

    Store.PushStack(resultItem);
    asmGenerator.StoreVariable(resultItem);

    asmGenerator.Comment($"{resultItem.Print} = {arg1.Print} {sign.Value} {arg2.Print}");
    asmGenerator.EmptyLine();
  }

  private StoreItem castVariable(StoreItem item, StoreItemType itemType){
    if(item.ItemType == itemType){
      return item;
    }

    StoreItem vessel = item.CreateCastVariable(itemType);
    asmGenerator.InitializeVariable(vessel);
    asmGenerator.CastVariable(item, vessel);

    asmGenerator.Comment($"{item.Print} -> {vessel.Print}\n");
    return vessel;
  }

  public override void ExitAssignOperation(JavaScriptParser.AssignOperationContext context) {
    StoreItem source = Store.PopStack();
    StoreItem dist = Store.PopStack();
    asmGenerator.Load(source);
    if (!dist.IsInitialized) {
      dist.ItemType = source.ItemType;
      asmGenerator.InitializeVariable(dist);
    }
    asmGenerator.StoreVariable(dist);
    asmGenerator.Comment($"{dist.Print} = {source.Print}");
    asmGenerator.EmptyLine();
  }

  public override void ExitWriteStdOutput(JavaScriptParser.WriteStdOutputContext context) {
    StoreItem item = Store.PopStack();
    asmGenerator.WriteToStdOutput(item);
    asmGenerator.EmptyLine();
  }

  public override void ExitIdentifierValue(JavaScriptParser.IdentifierValueContext context) {
    string value = context.GetChild(0).GetText();
    StoreItem item = StoreItem.CreateVariable(value);
    if (!item.IsInitialized) {
      throw new InvalidOperationException($"Variable {item.Print} is undfined");
    }
    Store.PushStack(item);
  }

  public override void ExitNumberValue(JavaScriptParser.NumberValueContext context) {
    string value = context.GetChild(0).GetText();
    StoreItem item;
    if (value.Contains(".")) {
      item = StoreItem.CreateDouble(value);
    } else {
      item = StoreItem.CreateInteger(value);
    }
    Store.PushStack(item);
  }

  public override void ExitStringValue(JavaScriptParser.StringValueContext context) {
    string value = context.GetChild(0).GetText();
    value = value.Substring(1, value.Length - 2);
    StoreItem item = StoreItem.CreateString(value);
    Store.PushStack(item);
  }

  public override void ExitBooleanValue(JavaScriptParser.BooleanValueContext context) {
    string value = context.GetChild(0).GetText();
    string booleanValue = value == "true" ? "1" : "0";
    StoreItem item = StoreItem.CreateBoolean(booleanValue);
    Store.PushStack(item);
  }

  public override void ExitArithmeticAdditiveSign(JavaScriptParser.ArithmeticAdditiveSignContext context) {
    processArithmeticSign(context);
  }

  public override void ExitArithmeticMultiplpicativeSign(JavaScriptParser.ArithmeticMultiplpicativeSignContext context) {
    processArithmeticSign(context);
  }

  public override void ExitConditionSign(JavaScriptParser.ConditionSignContext context)
  {
    string sign = context.GetChild(0).GetText();
    StoreItem item = StoreItem.CreateConditionSign(sign);
    Store.PushStack(item);
  }

  private void processArithmeticSign(ParserRuleContext context) {
    string sign = context.GetChild(0).GetText();
    StoreItem item = StoreItem.CreateArithmeticSign(sign);
    Store.PushStack(item);
  }

  public override void EnterIfStatement(JavaScriptParser.IfStatementContext context){
    asmGenerator.Comment("ENTER IF");
  }

  public override void ExitIfStatement(JavaScriptParser.IfStatementContext context)
  {
    asmGenerator.Comment("EXIT IF");
  }
}
