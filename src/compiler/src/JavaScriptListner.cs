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
  private readonly ArrayModule arrayModule = ArrayModule.Instance;
  private readonly FunctionModule functionModule = FunctionModule.Instance;

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
    if(context.ChildCount > 1) {
      arrayModule.CreateTableVariable(value);
    } else {
      variableModule.CreateVariable(value);
    }
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
    loopModule.EndForExpression();
  }

  public override void ExitForExpressionAssign([NotNull] JavaScriptParser.ForExpressionAssignContext context)
  {
    arithmeticModule.Assign();
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

  public override void EnterArrayLiteral(JavaScriptParser.ArrayLiteralContext context)
  {
    arrayModule.CreateTempArray();
  }

  public override void ExitArrayElement([NotNull] JavaScriptParser.ArrayElementContext context)
  {
    arrayModule.AddElementToArray();
  }

  public override void EnterFunctionDeclaration([NotNull] JavaScriptParser.FunctionDeclarationContext context)
  {
    string funcName = context.GetChild(1).GetText();
    functionModule.BeginFunctionDeclaration(funcName);
  }

  public override void ExitFunctionDeclaration([NotNull] JavaScriptParser.FunctionDeclarationContext context)
  {
    string funcName = context.GetChild(1).GetText();
    functionModule.EndFunctionDeclaration(funcName);
  }

  public override void ExitFormalParameterArg([NotNull] JavaScriptParser.FormalParameterArgContext context)
  {
    string parameterName = context.GetChild(0).GetText();
    functionModule.AddParameter(parameterName);
  }

  public override void ExitFunctionCall([NotNull] JavaScriptParser.FunctionCallContext context)
  {
    string funcName = context.GetChild(0).GetText();
    functionModule.CallFunction(funcName);
  }

  public override void EnterArguments([NotNull] JavaScriptParser.ArgumentsContext context)
  {
    functionModule.InitializeCallFunctionArguments();
  }

  public override void ExitArgument([NotNull] JavaScriptParser.ArgumentContext context)
  {
    functionModule.AddArgument();
  }

  public override void ExitArrayLength([NotNull] JavaScriptParser.ArrayLengthContext context)
  {
    string arrayName = context.GetChild(0).GetText();
    arrayModule.GetArrayLength(arrayName);
  }

  public override void EnterVariableDeclarationList([NotNull] JavaScriptParser.VariableDeclarationListContext context)
  {
    variableModule.BeginDeclareVariables();
  }

  public override void ExitVariableDeclarationList([NotNull] JavaScriptParser.VariableDeclarationListContext context)
  {
    variableModule.EndDeclareVariables();
  }

  public override void ExitVariableDeclarationListElement([NotNull] JavaScriptParser.VariableDeclarationListElementContext context)
  {
    IParseTree child = context.GetChild(0);
    if(child.ChildCount > 0){
      arithmeticModule.Assign();
    }else {
      string variableName = child.GetText();
      variableModule.DeclareUndefinedVariable(variableName);
    }
  }

  public override void ExitReturnStatement([NotNull] JavaScriptParser.ReturnStatementContext context)
  {
    functionModule.ProcessReturn();
  }

  public override void ExitIncrementVariable([NotNull] JavaScriptParser.IncrementVariableContext context)
  {
    arithmeticModule.IncrementVariable();
  }

  public override void ExitNotStatement([NotNull] JavaScriptParser.NotStatementContext context)
  {
    conditionModule.NotStatement();
  }

}
