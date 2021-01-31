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
  private readonly LoopModule loopModule = LoopModule.Instance;

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
    if (context.ChildCount <= 1) return;
    arithmeticModule.ProcessArithmeticOperation();
  }

  public override void ExitArithmeticOperationHigher(JavaScriptParser.ArithmeticOperationHigherContext context) {
    if (context.ChildCount <= 1) return;
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
    conditionModule.BeginIfStatement();
  }

  public override void ExitIfStatementConditionOperation(JavaScriptParser.IfStatementConditionOperationContext context)
  {
    conditionModule.IfStatementCondition();
  }

  public override void ExitIfStatement(JavaScriptParser.IfStatementContext context)
  {
    conditionModule.EndIfStatement();
  }

  public override void EnterElseStatement(JavaScriptParser.ElseStatementContext context)
  {
    conditionModule.ElseStatement();
  }

  public override void EnterWhileLoop(JavaScriptParser.WhileLoopContext context)
  {
    loopModule.BeginWhile();
  }

  public override void ExitWhileLoop([NotNull] JavaScriptParser.WhileLoopContext context)
  {
    loopModule.EndWhile();
  }

  public override void ExitWhileStatementConditionOperation([NotNull] JavaScriptParser.WhileStatementConditionOperationContext context)
  {
    loopModule.CheckWhileCondition();
  }

  public override void EnterForExpression(JavaScriptParser.ForExpressionContext context)
  {
    loopModule.BeginForExpression();
  }

  public override void ExitForExpression(JavaScriptParser.ForExpressionContext context)
  {
    arithmeticModule.Assign();
    loopModule.EndForExpression();
  }

  public override void EnterForStatementConditionOperation(JavaScriptParser.ForStatementConditionOperationContext context)
  {
    loopModule.BeginFor();
  }

  public override void ExitForStatementConditionOperation(JavaScriptParser.ForStatementConditionOperationContext context)
  {
    loopModule.CheckForCondition();
  }

  public override void ExitForLoop(JavaScriptParser.ForLoopContext context)
  {
    loopModule.EndFor();
  }

}
