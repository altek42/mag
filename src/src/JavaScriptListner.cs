using System;
using Antlr4.Runtime;
public class JavaScriptListner : JavaScriptParserBaseListener {
  public override void ExitOperation(JavaScriptParser.OperationContext context){
    Console.WriteLine("ExitOperation");
    Console.WriteLine(context.ChildCount);

    string arg1 = context.GetChild(0).GetText();
    string arg2 = context.GetChild(1).GetText();
    string arg3 = context.GetChild(2).GetText();
    Console.WriteLine($"{arg1} {arg2} {arg3}");
  }
}
