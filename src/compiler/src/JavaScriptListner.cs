using System;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
public class JavaScriptListner : JavaScriptParserBaseListener {

  private AsmGenerator asmGenerator;
  private readonly ArithmeticModule arithmeticModule = ArithmeticModule.Instance;
  private readonly ConditionModule conditionModule = ConditionModule.Instance;
  private readonly ConsoleModule consoleModule = ConsoleModule.Instance;
  private readonly VariableModule variableModule = VariableModule.Instance;

  public JavaScriptListner() : base() {
    asmGenerator = AsmGenerator.Instance;
  }

  public override void ExitVariableDeclaratiion(JavaScriptParser.VariableDeclaratiionContext context) {
    string variableName = context.GetChild(1).GetText();
    variableModule.DeclareVariable(variableName);
  }

  public override void ExitConditionOperation(JavaScriptParser.ConditionOperationContext context)
  {
    if (context.ChildCount <= 1) return;
    conditionModule.ProcessCondition();
  }

  public override void ExitArithmeticOperation(JavaScriptParser.ArithmeticOperationContext context) {
    if (context.ChildCount > 1) return;
    arithmeticModule.ProcessArithmeticOperation();
  }

  public override void ExitArithmeticOperationHigher(JavaScriptParser.ArithmeticOperationHigherContext context) {
    if (context.ChildCount > 1) return;
    arithmeticModule.ProcessArithmeticOperation();
  }

  public override void ExitAssignOperation(JavaScriptParser.AssignOperationContext context) {
    arithmeticModule.Assign();
  }

  public override void ExitWriteStdOutput(JavaScriptParser.WriteStdOutputContext context) {
    consoleModule.WriteStdOutput();
  }

  public override void ExitIdentifierValue(JavaScriptParser.IdentifierValueContext context) {
    string value = context.GetChild(0).GetText();
    variableModule.CreateVariable(value);
  }

  public override void ExitNumberValue(JavaScriptParser.NumberValueContext context) {
    string value = context.GetChild(0).GetText();
    variableModule.CreateNumber(value);
  }

  public override void ExitStringValue(JavaScriptParser.StringValueContext context) {
    string value = context.GetChild(0).GetText();
    variableModule.CreateString(value);
  }

  public override void ExitBooleanValue(JavaScriptParser.BooleanValueContext context) {
    string value = context.GetChild(0).GetText();
    variableModule.CreateBoolean(value);
  }

  public override void ExitArithmeticAdditiveSign(JavaScriptParser.ArithmeticAdditiveSignContext context) {
    string sign = context.GetChild(0).GetText();
    arithmeticModule.ProcessArithmeticSign(sign);
  }

  public override void ExitArithmeticMultiplpicativeSign(JavaScriptParser.ArithmeticMultiplpicativeSignContext context) {
    string sign = context.GetChild(0).GetText();
    arithmeticModule.ProcessArithmeticSign(sign);
  }

  public override void ExitConditionSign(JavaScriptParser.ConditionSignContext context)
  {
    string sign = context.GetChild(0).GetText();
    conditionModule.ProcessConditionSign(sign);
  }

  public override void EnterIfStatement(JavaScriptParser.IfStatementContext context){
    asmGenerator.Comment("ENTER IF");
  }

  public override void ExitIfStatement(JavaScriptParser.IfStatementContext context)
  {
    asmGenerator.Comment("EXIT IF");
  }
}
