using System;
using System.Collections.Generic;
public class JavaScriptListner : JavaScriptParserBaseListener {

  public JavaScriptListner() : base()
  {

  }

  private Stack<string> stack = new Stack<string>();

  public override void ExitVariableDeclaratiion(JavaScriptParser.VariableDeclaratiionContext context){
    Console.WriteLine($"Var declaration: {context.GetChild(1).GetText()}");
    Store.PushStack(context.GetChild(1).GetText());
  }

  public override void ExitArithmeticOperation(JavaScriptParser.ArithmeticOperationContext context){
    string arg1 = context.GetChild(0).GetText();
    string arg2 = context.GetChild(1).GetText();
    string arg3 = context.GetChild(2).GetText();
    Console.WriteLine($"Arithmetic: {arg1} {arg2} {arg3}");
    Store.PushStack($"{arg1} {arg2} {arg3}");
  }

  public override void ExitAssignOperation(JavaScriptParser.AssignOperationContext context) {
    string operation = Store.PopStack();
    string variable = Store.PopStack();
    Console.WriteLine($"Assign: [{variable}] = [{operation}]");
  }
  
  public override void ExitWriteStdOutput(JavaScriptParser.WriteStdOutputContext context){
    string value = context.GetChild(2).GetText();
    value = value.Substring(1, value.Length - 2);
    
    Console.WriteLine($"Write std out: {value}");
    AsmGenerator.Instance.WriteToStdOutput(value);
  }
}
