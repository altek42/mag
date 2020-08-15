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
    Console.WriteLine($"Var declaration: {variableName}");
    StoreItem item = StoreItem.CreateVariable(variableName);
    Store.PushStack(item);
  }

  public override void ExitArithmeticOperation(JavaScriptParser.ArithmeticOperationContext context){
    StoreItem arg2 = Store.PopStack();
    StoreItem sign = Store.PopStack();
    StoreItem arg1 = Store.PopStack();

    asmGenerator.LoadConstant(arg1);
    asmGenerator.LoadConstant(arg2);
    asmGenerator.ExecuteArithmeticOperation(sign);

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
    Store.PushStack(item);
  }

  public override void ExitArithmeticSign(JavaScriptParser.ArithmeticSignContext context){
    string sign = context.GetChild(0).GetText();
    StoreItem item = StoreItem.CreateArithmeticSign(sign);
    Store.PushStack(item);
  }

  public override void ExitAssignOperation(JavaScriptParser.AssignOperationContext context) {
    // string operation = Store.PopStack();
    // string variable = Store.PopStack();
    // Console.WriteLine($"Assign: [{variable}] = [{operation}]");
    Console.WriteLine($"Assign");
  }
  
  public override void ExitWriteStdOutput(JavaScriptParser.WriteStdOutputContext context){
    string value = context.GetChild(2).GetText();
    value = value.Substring(1, value.Length - 2);
    
    Console.WriteLine($"Write std out: {value}");
    asmGenerator.WriteToStdOutput(value);
  }
}
