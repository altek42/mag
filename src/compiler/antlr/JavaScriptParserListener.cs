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
	/// Enter a parse tree produced by <see cref="JavaScriptParser.assignOperation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterAssignOperation([NotNull] JavaScriptParser.AssignOperationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="JavaScriptParser.assignOperation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitAssignOperation([NotNull] JavaScriptParser.AssignOperationContext context);
}
