using System;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
public class JavaScriptListner : JavaScriptParserBaseListener {

  private AsmGenerator asmGenerator;
  public JavaScriptListner() : base()
  {
    asmGenerator = AsmGenerator.Instance;
  }

  public override void ExitVariableDeclaratiion(JavaScriptParser.VariableDeclaratiionContext context){
    string variableName = context.GetChild(1).GetText();
    
    if(Store.Variables.ContainsKey(variableName)){
      throw new InvalidOperationException($"Variable `{variableName}` already initialized.");
    }
    
    StoreItem item = StoreItem.CreateVariable(variableName);
    Store.PushStack(item);
  }

  public override void ExitArithmeticOperation(JavaScriptParser.ArithmeticOperationContext context){
    StoreItem arg2 = Store.PopStack();
    StoreItem sign = Store.PopStack();
    StoreItem arg1 = Store.PopStack();

    asmGenerator.Load(arg1);
    asmGenerator.Load(arg2);
    asmGenerator.ExecuteArithmeticOperation(sign);

    StoreItem resultItem;
    if(arg1.IsTemporary){
      resultItem = arg1;
    }else if(arg2.IsTemporary){
      resultItem = arg2;
    } else {
      resultItem = StoreItem.CreateTemporaryVariable(arg1.ItemType);
      asmGenerator.InitializeVariable(resultItem);
    }

    Store.PushStack(resultItem);
    asmGenerator.StoreVariable(resultItem);
    asmGenerator.EmptyLine();
  }

  public override void ExitNumberValue(JavaScriptParser.NumberValueContext context) {
    string value = context.GetChild(0).GetText();
    StoreItem item;
    if(value.Contains(".")){
      item = StoreItem.CreateDouble(value);
    } else {
      item = StoreItem.CreateInteger(value);
    }
    Store.PushStack(item);
  }

  public override void ExitIdentifierValue(JavaScriptParser.IdentifierValueContext context){
    string value = context.GetChild(0).GetText();
    StoreItem item = StoreItem.CreateVariable(value);
    if(!item.IsInitialized){
      throw new InvalidOperationException($"Variable {item.Value} is undfined");
    }
    Store.PushStack(item);
  }

  public override void ExitArithmeticSign(JavaScriptParser.ArithmeticSignContext context){
    string sign = context.GetChild(0).GetText();
    StoreItem item = StoreItem.CreateArithmeticSign(sign);
    Store.PushStack(item);
  }

  public override void ExitAssignOperation(JavaScriptParser.AssignOperationContext context) {
    StoreItem source = Store.PopStack();
    StoreItem dist = Store.PopStack();
    asmGenerator.Load(source);
    if(!dist.IsInitialized){
      dist.ItemType = source.ItemType;
      asmGenerator.InitializeVariable(dist);
    }
    asmGenerator.StoreVariable(dist);
    asmGenerator.EmptyLine();
  }
  
  public override void ExitWriteStdOutput(JavaScriptParser.WriteStdOutputContext context){
    string value = context.GetChild(2).GetText();
    value = value.Substring(1, value.Length - 2);
    
    Console.WriteLine($"Write std out: {value}");
    asmGenerator.WriteToStdOutput(value);
  }
}
