//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.8
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from JavaScriptParser.g4 by ANTLR 4.8

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419


using Antlr4.Runtime.Misc;
using IErrorNode = Antlr4.Runtime.Tree.IErrorNode;
using ITerminalNode = Antlr4.Runtime.Tree.ITerminalNode;
using IToken = Antlr4.Runtime.IToken;
using ParserRuleContext = Antlr4.Runtime.ParserRuleContext;

/// <summary>
/// This class provides an empty implementation of <see cref="IJavaScriptParserListener"/>,
/// which can be extended to create a listener which only needs to handle a subset
/// of the available methods.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.8")]
[System.CLSCompliant(false)]
public partial class JavaScriptParserBaseListener : IJavaScriptParserListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.parse"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterParse([NotNull] JavaScriptParser.ParseContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.parse"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitParse([NotNull] JavaScriptParser.ParseContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.instructions"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterInstructions([NotNull] JavaScriptParser.InstructionsContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.instructions"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitInstructions([NotNull] JavaScriptParser.InstructionsContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.instructionLine"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterInstructionLine([NotNull] JavaScriptParser.InstructionLineContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.instructionLine"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitInstructionLine([NotNull] JavaScriptParser.InstructionLineContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.instruction"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterInstruction([NotNull] JavaScriptParser.InstructionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.instruction"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitInstruction([NotNull] JavaScriptParser.InstructionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.instructionBlock"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterInstructionBlock([NotNull] JavaScriptParser.InstructionBlockContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.instructionBlock"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitInstructionBlock([NotNull] JavaScriptParser.InstructionBlockContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.returnStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterReturnStatement([NotNull] JavaScriptParser.ReturnStatementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.returnStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitReturnStatement([NotNull] JavaScriptParser.ReturnStatementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.writeStdOutput"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterWriteStdOutput([NotNull] JavaScriptParser.WriteStdOutputContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.writeStdOutput"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitWriteStdOutput([NotNull] JavaScriptParser.WriteStdOutputContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.writeStdOutputConstant"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterWriteStdOutputConstant([NotNull] JavaScriptParser.WriteStdOutputConstantContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.writeStdOutputConstant"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitWriteStdOutputConstant([NotNull] JavaScriptParser.WriteStdOutputConstantContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.writeStdOutputIdentifier"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterWriteStdOutputIdentifier([NotNull] JavaScriptParser.WriteStdOutputIdentifierContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.writeStdOutputIdentifier"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitWriteStdOutputIdentifier([NotNull] JavaScriptParser.WriteStdOutputIdentifierContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.writeStdOutputArithmeticOperation"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterWriteStdOutputArithmeticOperation([NotNull] JavaScriptParser.WriteStdOutputArithmeticOperationContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.writeStdOutputArithmeticOperation"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitWriteStdOutputArithmeticOperation([NotNull] JavaScriptParser.WriteStdOutputArithmeticOperationContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.writeStdOutputFunctionCall"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterWriteStdOutputFunctionCall([NotNull] JavaScriptParser.WriteStdOutputFunctionCallContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.writeStdOutputFunctionCall"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitWriteStdOutputFunctionCall([NotNull] JavaScriptParser.WriteStdOutputFunctionCallContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.arithmeticOperation"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterArithmeticOperation([NotNull] JavaScriptParser.ArithmeticOperationContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.arithmeticOperation"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitArithmeticOperation([NotNull] JavaScriptParser.ArithmeticOperationContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.arithmeticOperationHigher"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterArithmeticOperationHigher([NotNull] JavaScriptParser.ArithmeticOperationHigherContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.arithmeticOperationHigher"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitArithmeticOperationHigher([NotNull] JavaScriptParser.ArithmeticOperationHigherContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.conditionOperation"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterConditionOperation([NotNull] JavaScriptParser.ConditionOperationContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.conditionOperation"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitConditionOperation([NotNull] JavaScriptParser.ConditionOperationContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.arithmeticAdditiveSign"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterArithmeticAdditiveSign([NotNull] JavaScriptParser.ArithmeticAdditiveSignContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.arithmeticAdditiveSign"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitArithmeticAdditiveSign([NotNull] JavaScriptParser.ArithmeticAdditiveSignContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.arithmeticMultiplpicativeSign"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterArithmeticMultiplpicativeSign([NotNull] JavaScriptParser.ArithmeticMultiplpicativeSignContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.arithmeticMultiplpicativeSign"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitArithmeticMultiplpicativeSign([NotNull] JavaScriptParser.ArithmeticMultiplpicativeSignContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.value"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterValue([NotNull] JavaScriptParser.ValueContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.value"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitValue([NotNull] JavaScriptParser.ValueContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.arrayLength"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterArrayLength([NotNull] JavaScriptParser.ArrayLengthContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.arrayLength"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitArrayLength([NotNull] JavaScriptParser.ArrayLengthContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.constantValue"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterConstantValue([NotNull] JavaScriptParser.ConstantValueContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.constantValue"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitConstantValue([NotNull] JavaScriptParser.ConstantValueContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.booleanValue"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterBooleanValue([NotNull] JavaScriptParser.BooleanValueContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.booleanValue"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitBooleanValue([NotNull] JavaScriptParser.BooleanValueContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.stringValue"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterStringValue([NotNull] JavaScriptParser.StringValueContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.stringValue"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitStringValue([NotNull] JavaScriptParser.StringValueContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.numberValue"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterNumberValue([NotNull] JavaScriptParser.NumberValueContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.numberValue"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitNumberValue([NotNull] JavaScriptParser.NumberValueContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.identifierValue"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterIdentifierValue([NotNull] JavaScriptParser.IdentifierValueContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.identifierValue"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitIdentifierValue([NotNull] JavaScriptParser.IdentifierValueContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.variableDeclaratiion"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterVariableDeclaratiion([NotNull] JavaScriptParser.VariableDeclaratiionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.variableDeclaratiion"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitVariableDeclaratiion([NotNull] JavaScriptParser.VariableDeclaratiionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.variableDeclarationList"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterVariableDeclarationList([NotNull] JavaScriptParser.VariableDeclarationListContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.variableDeclarationList"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitVariableDeclarationList([NotNull] JavaScriptParser.VariableDeclarationListContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.variableDeclarationListElement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterVariableDeclarationListElement([NotNull] JavaScriptParser.VariableDeclarationListElementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.variableDeclarationListElement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitVariableDeclarationListElement([NotNull] JavaScriptParser.VariableDeclarationListElementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.conditionSign"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterConditionSign([NotNull] JavaScriptParser.ConditionSignContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.conditionSign"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitConditionSign([NotNull] JavaScriptParser.ConditionSignContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.assignOperation"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterAssignOperation([NotNull] JavaScriptParser.AssignOperationContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.assignOperation"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitAssignOperation([NotNull] JavaScriptParser.AssignOperationContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.singleAssignOperation"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterSingleAssignOperation([NotNull] JavaScriptParser.SingleAssignOperationContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.singleAssignOperation"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitSingleAssignOperation([NotNull] JavaScriptParser.SingleAssignOperationContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.assignValue"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterAssignValue([NotNull] JavaScriptParser.AssignValueContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.assignValue"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitAssignValue([NotNull] JavaScriptParser.AssignValueContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.singleExpression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterSingleExpression([NotNull] JavaScriptParser.SingleExpressionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.singleExpression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitSingleExpression([NotNull] JavaScriptParser.SingleExpressionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.ifStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterIfStatement([NotNull] JavaScriptParser.IfStatementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.ifStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitIfStatement([NotNull] JavaScriptParser.IfStatementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.ifStatementConditionOperation"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterIfStatementConditionOperation([NotNull] JavaScriptParser.IfStatementConditionOperationContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.ifStatementConditionOperation"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitIfStatementConditionOperation([NotNull] JavaScriptParser.IfStatementConditionOperationContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.elseStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterElseStatement([NotNull] JavaScriptParser.ElseStatementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.elseStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitElseStatement([NotNull] JavaScriptParser.ElseStatementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.loops"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterLoops([NotNull] JavaScriptParser.LoopsContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.loops"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitLoops([NotNull] JavaScriptParser.LoopsContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.whileLoop"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterWhileLoop([NotNull] JavaScriptParser.WhileLoopContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.whileLoop"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitWhileLoop([NotNull] JavaScriptParser.WhileLoopContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.whileStatementConditionOperation"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterWhileStatementConditionOperation([NotNull] JavaScriptParser.WhileStatementConditionOperationContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.whileStatementConditionOperation"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitWhileStatementConditionOperation([NotNull] JavaScriptParser.WhileStatementConditionOperationContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.forLoop"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterForLoop([NotNull] JavaScriptParser.ForLoopContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.forLoop"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitForLoop([NotNull] JavaScriptParser.ForLoopContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.forAssignSection"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterForAssignSection([NotNull] JavaScriptParser.ForAssignSectionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.forAssignSection"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitForAssignSection([NotNull] JavaScriptParser.ForAssignSectionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.forStatementConditionOperation"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterForStatementConditionOperation([NotNull] JavaScriptParser.ForStatementConditionOperationContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.forStatementConditionOperation"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitForStatementConditionOperation([NotNull] JavaScriptParser.ForStatementConditionOperationContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.forExpression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterForExpression([NotNull] JavaScriptParser.ForExpressionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.forExpression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitForExpression([NotNull] JavaScriptParser.ForExpressionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.forExpressionAssign"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterForExpressionAssign([NotNull] JavaScriptParser.ForExpressionAssignContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.forExpressionAssign"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitForExpressionAssign([NotNull] JavaScriptParser.ForExpressionAssignContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.arrayLiteral"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterArrayLiteral([NotNull] JavaScriptParser.ArrayLiteralContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.arrayLiteral"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitArrayLiteral([NotNull] JavaScriptParser.ArrayLiteralContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.elementList"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterElementList([NotNull] JavaScriptParser.ElementListContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.elementList"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitElementList([NotNull] JavaScriptParser.ElementListContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.commaSeparator"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterCommaSeparator([NotNull] JavaScriptParser.CommaSeparatorContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.commaSeparator"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitCommaSeparator([NotNull] JavaScriptParser.CommaSeparatorContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.arrayElement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterArrayElement([NotNull] JavaScriptParser.ArrayElementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.arrayElement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitArrayElement([NotNull] JavaScriptParser.ArrayElementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.functionDeclaration"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterFunctionDeclaration([NotNull] JavaScriptParser.FunctionDeclarationContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.functionDeclaration"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitFunctionDeclaration([NotNull] JavaScriptParser.FunctionDeclarationContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.formalParameterList"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterFormalParameterList([NotNull] JavaScriptParser.FormalParameterListContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.formalParameterList"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitFormalParameterList([NotNull] JavaScriptParser.FormalParameterListContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.formalParameterArg"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterFormalParameterArg([NotNull] JavaScriptParser.FormalParameterArgContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.formalParameterArg"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitFormalParameterArg([NotNull] JavaScriptParser.FormalParameterArgContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.functionCall"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterFunctionCall([NotNull] JavaScriptParser.FunctionCallContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.functionCall"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitFunctionCall([NotNull] JavaScriptParser.FunctionCallContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.arguments"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterArguments([NotNull] JavaScriptParser.ArgumentsContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.arguments"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitArguments([NotNull] JavaScriptParser.ArgumentsContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.argument"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterArgument([NotNull] JavaScriptParser.ArgumentContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.argument"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitArgument([NotNull] JavaScriptParser.ArgumentContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.incrementVariable"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterIncrementVariable([NotNull] JavaScriptParser.IncrementVariableContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.incrementVariable"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitIncrementVariable([NotNull] JavaScriptParser.IncrementVariableContext context) { }

	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void EnterEveryRule([NotNull] ParserRuleContext context) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void ExitEveryRule([NotNull] ParserRuleContext context) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void VisitTerminal([NotNull] ITerminalNode node) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void VisitErrorNode([NotNull] IErrorNode node) { }
}
