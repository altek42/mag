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
using IParseTreeListener = Antlr4.Runtime.Tree.IParseTreeListener;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete listener for a parse tree produced by
/// <see cref="JavaScriptParser"/>.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.8")]
[System.CLSCompliant(false)]
public interface IJavaScriptParserListener : IParseTreeListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.parse"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterParse([NotNull] JavaScriptParser.ParseContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.parse"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitParse([NotNull] JavaScriptParser.ParseContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.instructions"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterInstructions([NotNull] JavaScriptParser.InstructionsContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.instructions"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitInstructions([NotNull] JavaScriptParser.InstructionsContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.instructionLine"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterInstructionLine([NotNull] JavaScriptParser.InstructionLineContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.instructionLine"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitInstructionLine([NotNull] JavaScriptParser.InstructionLineContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.instruction"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterInstruction([NotNull] JavaScriptParser.InstructionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.instruction"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitInstruction([NotNull] JavaScriptParser.InstructionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.instructionBlock"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterInstructionBlock([NotNull] JavaScriptParser.InstructionBlockContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.instructionBlock"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitInstructionBlock([NotNull] JavaScriptParser.InstructionBlockContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.writeStdOutput"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterWriteStdOutput([NotNull] JavaScriptParser.WriteStdOutputContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.writeStdOutput"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitWriteStdOutput([NotNull] JavaScriptParser.WriteStdOutputContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.writeStdOutputConstant"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterWriteStdOutputConstant([NotNull] JavaScriptParser.WriteStdOutputConstantContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.writeStdOutputConstant"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitWriteStdOutputConstant([NotNull] JavaScriptParser.WriteStdOutputConstantContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.writeStdOutputIdentifier"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterWriteStdOutputIdentifier([NotNull] JavaScriptParser.WriteStdOutputIdentifierContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.writeStdOutputIdentifier"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitWriteStdOutputIdentifier([NotNull] JavaScriptParser.WriteStdOutputIdentifierContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.writeStdOutputArithmeticOperation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterWriteStdOutputArithmeticOperation([NotNull] JavaScriptParser.WriteStdOutputArithmeticOperationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.writeStdOutputArithmeticOperation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitWriteStdOutputArithmeticOperation([NotNull] JavaScriptParser.WriteStdOutputArithmeticOperationContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.arithmeticOperation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterArithmeticOperation([NotNull] JavaScriptParser.ArithmeticOperationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.arithmeticOperation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitArithmeticOperation([NotNull] JavaScriptParser.ArithmeticOperationContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.arithmeticOperationHigher"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterArithmeticOperationHigher([NotNull] JavaScriptParser.ArithmeticOperationHigherContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.arithmeticOperationHigher"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitArithmeticOperationHigher([NotNull] JavaScriptParser.ArithmeticOperationHigherContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.conditionOperation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterConditionOperation([NotNull] JavaScriptParser.ConditionOperationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.conditionOperation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitConditionOperation([NotNull] JavaScriptParser.ConditionOperationContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.arithmeticAdditiveSign"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterArithmeticAdditiveSign([NotNull] JavaScriptParser.ArithmeticAdditiveSignContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.arithmeticAdditiveSign"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitArithmeticAdditiveSign([NotNull] JavaScriptParser.ArithmeticAdditiveSignContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.arithmeticMultiplpicativeSign"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterArithmeticMultiplpicativeSign([NotNull] JavaScriptParser.ArithmeticMultiplpicativeSignContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.arithmeticMultiplpicativeSign"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitArithmeticMultiplpicativeSign([NotNull] JavaScriptParser.ArithmeticMultiplpicativeSignContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.value"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterValue([NotNull] JavaScriptParser.ValueContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.value"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitValue([NotNull] JavaScriptParser.ValueContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.arrayLength"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterArrayLength([NotNull] JavaScriptParser.ArrayLengthContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.arrayLength"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitArrayLength([NotNull] JavaScriptParser.ArrayLengthContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.constantValue"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterConstantValue([NotNull] JavaScriptParser.ConstantValueContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.constantValue"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitConstantValue([NotNull] JavaScriptParser.ConstantValueContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.booleanValue"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterBooleanValue([NotNull] JavaScriptParser.BooleanValueContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.booleanValue"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitBooleanValue([NotNull] JavaScriptParser.BooleanValueContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.stringValue"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStringValue([NotNull] JavaScriptParser.StringValueContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.stringValue"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStringValue([NotNull] JavaScriptParser.StringValueContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.numberValue"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterNumberValue([NotNull] JavaScriptParser.NumberValueContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.numberValue"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitNumberValue([NotNull] JavaScriptParser.NumberValueContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.identifierValue"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterIdentifierValue([NotNull] JavaScriptParser.IdentifierValueContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.identifierValue"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitIdentifierValue([NotNull] JavaScriptParser.IdentifierValueContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.variableDeclaratiion"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterVariableDeclaratiion([NotNull] JavaScriptParser.VariableDeclaratiionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.variableDeclaratiion"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitVariableDeclaratiion([NotNull] JavaScriptParser.VariableDeclaratiionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.variableDeclarationList"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterVariableDeclarationList([NotNull] JavaScriptParser.VariableDeclarationListContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.variableDeclarationList"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitVariableDeclarationList([NotNull] JavaScriptParser.VariableDeclarationListContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.variableDeclarationListElement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterVariableDeclarationListElement([NotNull] JavaScriptParser.VariableDeclarationListElementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.variableDeclarationListElement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitVariableDeclarationListElement([NotNull] JavaScriptParser.VariableDeclarationListElementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.conditionSign"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterConditionSign([NotNull] JavaScriptParser.ConditionSignContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.conditionSign"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitConditionSign([NotNull] JavaScriptParser.ConditionSignContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.assignOperation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterAssignOperation([NotNull] JavaScriptParser.AssignOperationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.assignOperation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitAssignOperation([NotNull] JavaScriptParser.AssignOperationContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.singleAssignOperation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterSingleAssignOperation([NotNull] JavaScriptParser.SingleAssignOperationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.singleAssignOperation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitSingleAssignOperation([NotNull] JavaScriptParser.SingleAssignOperationContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.assignValue"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterAssignValue([NotNull] JavaScriptParser.AssignValueContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.assignValue"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitAssignValue([NotNull] JavaScriptParser.AssignValueContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.singleExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterSingleExpression([NotNull] JavaScriptParser.SingleExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.singleExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitSingleExpression([NotNull] JavaScriptParser.SingleExpressionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.ifStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterIfStatement([NotNull] JavaScriptParser.IfStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.ifStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitIfStatement([NotNull] JavaScriptParser.IfStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.ifStatementConditionOperation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterIfStatementConditionOperation([NotNull] JavaScriptParser.IfStatementConditionOperationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.ifStatementConditionOperation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitIfStatementConditionOperation([NotNull] JavaScriptParser.IfStatementConditionOperationContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.elseStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterElseStatement([NotNull] JavaScriptParser.ElseStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.elseStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitElseStatement([NotNull] JavaScriptParser.ElseStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.loops"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterLoops([NotNull] JavaScriptParser.LoopsContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.loops"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitLoops([NotNull] JavaScriptParser.LoopsContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.whileLoop"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterWhileLoop([NotNull] JavaScriptParser.WhileLoopContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.whileLoop"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitWhileLoop([NotNull] JavaScriptParser.WhileLoopContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.whileStatementConditionOperation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterWhileStatementConditionOperation([NotNull] JavaScriptParser.WhileStatementConditionOperationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.whileStatementConditionOperation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitWhileStatementConditionOperation([NotNull] JavaScriptParser.WhileStatementConditionOperationContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.forLoop"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterForLoop([NotNull] JavaScriptParser.ForLoopContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.forLoop"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitForLoop([NotNull] JavaScriptParser.ForLoopContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.forStatementConditionOperation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterForStatementConditionOperation([NotNull] JavaScriptParser.ForStatementConditionOperationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.forStatementConditionOperation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitForStatementConditionOperation([NotNull] JavaScriptParser.ForStatementConditionOperationContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.forExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterForExpression([NotNull] JavaScriptParser.ForExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.forExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitForExpression([NotNull] JavaScriptParser.ForExpressionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.arrayLiteral"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterArrayLiteral([NotNull] JavaScriptParser.ArrayLiteralContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.arrayLiteral"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitArrayLiteral([NotNull] JavaScriptParser.ArrayLiteralContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.elementList"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterElementList([NotNull] JavaScriptParser.ElementListContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.elementList"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitElementList([NotNull] JavaScriptParser.ElementListContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.arrayElement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterArrayElement([NotNull] JavaScriptParser.ArrayElementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.arrayElement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitArrayElement([NotNull] JavaScriptParser.ArrayElementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.functionDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFunctionDeclaration([NotNull] JavaScriptParser.FunctionDeclarationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.functionDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFunctionDeclaration([NotNull] JavaScriptParser.FunctionDeclarationContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.formalParameterList"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFormalParameterList([NotNull] JavaScriptParser.FormalParameterListContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.formalParameterList"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFormalParameterList([NotNull] JavaScriptParser.FormalParameterListContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.formalParameterArg"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFormalParameterArg([NotNull] JavaScriptParser.FormalParameterArgContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.formalParameterArg"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFormalParameterArg([NotNull] JavaScriptParser.FormalParameterArgContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.functionCall"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFunctionCall([NotNull] JavaScriptParser.FunctionCallContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.functionCall"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFunctionCall([NotNull] JavaScriptParser.FunctionCallContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.arguments"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterArguments([NotNull] JavaScriptParser.ArgumentsContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.arguments"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitArguments([NotNull] JavaScriptParser.ArgumentsContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="JavaScriptParser.argument"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterArgument([NotNull] JavaScriptParser.ArgumentContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.argument"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitArgument([NotNull] JavaScriptParser.ArgumentContext context);
}
