//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.8
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from JavaScriptLexer.g4 by ANTLR 4.8

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using System;
using System.IO;
using System.Text;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.8")]
[System.CLSCompliant(false)]
public partial class JavaScriptLexer : Lexer {
	protected static DFA[] decisionToDFA;
	protected static PredictionContextCache sharedContextCache = new PredictionContextCache();
	public const int
		MULTI_LINE_COMMENT=1, SINGLE_LINE_COMMENT=2, CONSOLE_LOG=3, VAR=4, CONTINUE=5, 
		FOR=6, WHILE=7, OPEN_BRACE=8, CLOSE_BRACE=9, SEMI_COLON=10, ASSIGN=11, 
		PLUS=12, MINUS=13, DIVIDE=14, MULTIPLY=15, OPEN_PAREN=16, CLOSE_PAREN=17, 
		LESS_THAN=18, MORE_THAN=19, LESS_THAN_EQUALS=20, GREATER_THAN_EQUALS=21, 
		EQUALS=22, NOT_EQUALS=23, IDENTITY_EQUALS=24, IDENTITY_NOT_EQUALS=25, 
		AND=26, OR=27, BOOLEAN=28, IF=29, ELSE=30, NUMBER=31, IDENTIFIER=32, STRING=33, 
		EOL=34, WHITE_SPACES=35;
	public static string[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static string[] modeNames = {
		"DEFAULT_MODE"
	};

	public static readonly string[] ruleNames = {
		"MULTI_LINE_COMMENT", "SINGLE_LINE_COMMENT", "CONSOLE_LOG", "VAR", "CONTINUE", 
		"FOR", "WHILE", "OPEN_BRACE", "CLOSE_BRACE", "SEMI_COLON", "ASSIGN", "PLUS", 
		"MINUS", "DIVIDE", "MULTIPLY", "OPEN_PAREN", "CLOSE_PAREN", "LESS_THAN", 
		"MORE_THAN", "LESS_THAN_EQUALS", "GREATER_THAN_EQUALS", "EQUALS", "NOT_EQUALS", 
		"IDENTITY_EQUALS", "IDENTITY_NOT_EQUALS", "AND", "OR", "BOOLEAN", "IF", 
		"ELSE", "NUMBER", "INTEGER_NUMBER", "IDENTIFIER", "STRING", "DoubleStringCharacter", 
		"SingleStringCharacter", "SingleEscapeCharacter", "LineContinuation", 
		"EOL", "WHITE_SPACES"
	};


	public JavaScriptLexer(ICharStream input)
	: this(input, Console.Out, Console.Error) { }

	public JavaScriptLexer(ICharStream input, TextWriter output, TextWriter errorOutput)
	: base(input, output, errorOutput)
	{
		Interpreter = new LexerATNSimulator(this, _ATN, decisionToDFA, sharedContextCache);
	}

	private static readonly string[] _LiteralNames = {
		null, null, null, "'console.log'", "'var'", "'continue'", "'for'", "'while'", 
		"'{'", "'}'", "';'", "'='", "'+'", "'-'", "'/'", "'*'", "'('", "')'", 
		"'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'==='", "'!=='", "'&&'", 
		"'||'", null, "'if'", "'else'"
	};
	private static readonly string[] _SymbolicNames = {
		null, "MULTI_LINE_COMMENT", "SINGLE_LINE_COMMENT", "CONSOLE_LOG", "VAR", 
		"CONTINUE", "FOR", "WHILE", "OPEN_BRACE", "CLOSE_BRACE", "SEMI_COLON", 
		"ASSIGN", "PLUS", "MINUS", "DIVIDE", "MULTIPLY", "OPEN_PAREN", "CLOSE_PAREN", 
		"LESS_THAN", "MORE_THAN", "LESS_THAN_EQUALS", "GREATER_THAN_EQUALS", "EQUALS", 
		"NOT_EQUALS", "IDENTITY_EQUALS", "IDENTITY_NOT_EQUALS", "AND", "OR", "BOOLEAN", 
		"IF", "ELSE", "NUMBER", "IDENTIFIER", "STRING", "EOL", "WHITE_SPACES"
	};
	public static readonly IVocabulary DefaultVocabulary = new Vocabulary(_LiteralNames, _SymbolicNames);

	[NotNull]
	public override IVocabulary Vocabulary
	{
		get
		{
			return DefaultVocabulary;
		}
	}

	public override string GrammarFileName { get { return "JavaScriptLexer.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string[] ChannelNames { get { return channelNames; } }

	public override string[] ModeNames { get { return modeNames; } }

	public override string SerializedAtn { get { return new string(_serializedATN); } }

	static JavaScriptLexer() {
		decisionToDFA = new DFA[_ATN.NumberOfDecisions];
		for (int i = 0; i < _ATN.NumberOfDecisions; i++) {
			decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
		}
	}
	private static char[] _serializedATN = {
		'\x3', '\x608B', '\xA72A', '\x8133', '\xB9ED', '\x417C', '\x3BE7', '\x7786', 
		'\x5964', '\x2', '%', '\x12E', '\b', '\x1', '\x4', '\x2', '\t', '\x2', 
		'\x4', '\x3', '\t', '\x3', '\x4', '\x4', '\t', '\x4', '\x4', '\x5', '\t', 
		'\x5', '\x4', '\x6', '\t', '\x6', '\x4', '\a', '\t', '\a', '\x4', '\b', 
		'\t', '\b', '\x4', '\t', '\t', '\t', '\x4', '\n', '\t', '\n', '\x4', '\v', 
		'\t', '\v', '\x4', '\f', '\t', '\f', '\x4', '\r', '\t', '\r', '\x4', '\xE', 
		'\t', '\xE', '\x4', '\xF', '\t', '\xF', '\x4', '\x10', '\t', '\x10', '\x4', 
		'\x11', '\t', '\x11', '\x4', '\x12', '\t', '\x12', '\x4', '\x13', '\t', 
		'\x13', '\x4', '\x14', '\t', '\x14', '\x4', '\x15', '\t', '\x15', '\x4', 
		'\x16', '\t', '\x16', '\x4', '\x17', '\t', '\x17', '\x4', '\x18', '\t', 
		'\x18', '\x4', '\x19', '\t', '\x19', '\x4', '\x1A', '\t', '\x1A', '\x4', 
		'\x1B', '\t', '\x1B', '\x4', '\x1C', '\t', '\x1C', '\x4', '\x1D', '\t', 
		'\x1D', '\x4', '\x1E', '\t', '\x1E', '\x4', '\x1F', '\t', '\x1F', '\x4', 
		' ', '\t', ' ', '\x4', '!', '\t', '!', '\x4', '\"', '\t', '\"', '\x4', 
		'#', '\t', '#', '\x4', '$', '\t', '$', '\x4', '%', '\t', '%', '\x4', '&', 
		'\t', '&', '\x4', '\'', '\t', '\'', '\x4', '(', '\t', '(', '\x4', ')', 
		'\t', ')', '\x3', '\x2', '\x3', '\x2', '\x3', '\x2', '\x3', '\x2', '\a', 
		'\x2', 'X', '\n', '\x2', '\f', '\x2', '\xE', '\x2', '[', '\v', '\x2', 
		'\x3', '\x2', '\x3', '\x2', '\x3', '\x2', '\x3', '\x2', '\x3', '\x2', 
		'\x3', '\x3', '\x3', '\x3', '\x3', '\x3', '\x3', '\x3', '\a', '\x3', '\x66', 
		'\n', '\x3', '\f', '\x3', '\xE', '\x3', 'i', '\v', '\x3', '\x3', '\x3', 
		'\x3', '\x3', '\x3', '\x4', '\x3', '\x4', '\x3', '\x4', '\x3', '\x4', 
		'\x3', '\x4', '\x3', '\x4', '\x3', '\x4', '\x3', '\x4', '\x3', '\x4', 
		'\x3', '\x4', '\x3', '\x4', '\x3', '\x4', '\x3', '\x5', '\x3', '\x5', 
		'\x3', '\x5', '\x3', '\x5', '\x3', '\x6', '\x3', '\x6', '\x3', '\x6', 
		'\x3', '\x6', '\x3', '\x6', '\x3', '\x6', '\x3', '\x6', '\x3', '\x6', 
		'\x3', '\x6', '\x3', '\a', '\x3', '\a', '\x3', '\a', '\x3', '\a', '\x3', 
		'\b', '\x3', '\b', '\x3', '\b', '\x3', '\b', '\x3', '\b', '\x3', '\b', 
		'\x3', '\t', '\x3', '\t', '\x3', '\n', '\x3', '\n', '\x3', '\v', '\x3', 
		'\v', '\x3', '\f', '\x3', '\f', '\x3', '\r', '\x3', '\r', '\x3', '\xE', 
		'\x3', '\xE', '\x3', '\xF', '\x3', '\xF', '\x3', '\x10', '\x3', '\x10', 
		'\x3', '\x11', '\x3', '\x11', '\x3', '\x12', '\x3', '\x12', '\x3', '\x13', 
		'\x3', '\x13', '\x3', '\x14', '\x3', '\x14', '\x3', '\x15', '\x3', '\x15', 
		'\x3', '\x15', '\x3', '\x16', '\x3', '\x16', '\x3', '\x16', '\x3', '\x17', 
		'\x3', '\x17', '\x3', '\x17', '\x3', '\x18', '\x3', '\x18', '\x3', '\x18', 
		'\x3', '\x19', '\x3', '\x19', '\x3', '\x19', '\x3', '\x19', '\x3', '\x1A', 
		'\x3', '\x1A', '\x3', '\x1A', '\x3', '\x1A', '\x3', '\x1B', '\x3', '\x1B', 
		'\x3', '\x1B', '\x3', '\x1C', '\x3', '\x1C', '\x3', '\x1C', '\x3', '\x1D', 
		'\x3', '\x1D', '\x3', '\x1D', '\x3', '\x1D', '\x3', '\x1D', '\x3', '\x1D', 
		'\x3', '\x1D', '\x3', '\x1D', '\x3', '\x1D', '\x5', '\x1D', '\xCB', '\n', 
		'\x1D', '\x3', '\x1E', '\x3', '\x1E', '\x3', '\x1E', '\x3', '\x1F', '\x3', 
		'\x1F', '\x3', '\x1F', '\x3', '\x1F', '\x3', '\x1F', '\x3', ' ', '\x3', 
		' ', '\x3', ' ', '\x3', ' ', '\a', ' ', '\xD9', '\n', ' ', '\f', ' ', 
		'\xE', ' ', '\xDC', '\v', ' ', '\x3', ' ', '\x3', ' ', '\x3', ' ', '\a', 
		' ', '\xE1', '\n', ' ', '\f', ' ', '\xE', ' ', '\xE4', '\v', ' ', '\x3', 
		' ', '\x5', ' ', '\xE7', '\n', ' ', '\x3', '!', '\x3', '!', '\x3', '!', 
		'\a', '!', '\xEC', '\n', '!', '\f', '!', '\xE', '!', '\xEF', '\v', '!', 
		'\x5', '!', '\xF1', '\n', '!', '\x3', '\"', '\x3', '\"', '\a', '\"', '\xF5', 
		'\n', '\"', '\f', '\"', '\xE', '\"', '\xF8', '\v', '\"', '\x3', '#', '\x3', 
		'#', '\a', '#', '\xFC', '\n', '#', '\f', '#', '\xE', '#', '\xFF', '\v', 
		'#', '\x3', '#', '\x3', '#', '\x3', '#', '\a', '#', '\x104', '\n', '#', 
		'\f', '#', '\xE', '#', '\x107', '\v', '#', '\x3', '#', '\x5', '#', '\x10A', 
		'\n', '#', '\x3', '$', '\x3', '$', '\x3', '$', '\x3', '$', '\x5', '$', 
		'\x110', '\n', '$', '\x3', '%', '\x3', '%', '\x3', '%', '\x3', '%', '\x5', 
		'%', '\x116', '\n', '%', '\x3', '&', '\x3', '&', '\x3', '\'', '\x3', '\'', 
		'\x3', '\'', '\x3', '(', '\a', '(', '\x11E', '\n', '(', '\f', '(', '\xE', 
		'(', '\x121', '\v', '(', '\x3', '(', '\x6', '(', '\x124', '\n', '(', '\r', 
		'(', '\xE', '(', '\x125', '\x3', ')', '\x6', ')', '\x129', '\n', ')', 
		'\r', ')', '\xE', ')', '\x12A', '\x3', ')', '\x3', ')', '\x3', 'Y', '\x2', 
		'*', '\x3', '\x3', '\x5', '\x4', '\a', '\x5', '\t', '\x6', '\v', '\a', 
		'\r', '\b', '\xF', '\t', '\x11', '\n', '\x13', '\v', '\x15', '\f', '\x17', 
		'\r', '\x19', '\xE', '\x1B', '\xF', '\x1D', '\x10', '\x1F', '\x11', '!', 
		'\x12', '#', '\x13', '%', '\x14', '\'', '\x15', ')', '\x16', '+', '\x17', 
		'-', '\x18', '/', '\x19', '\x31', '\x1A', '\x33', '\x1B', '\x35', '\x1C', 
		'\x37', '\x1D', '\x39', '\x1E', ';', '\x1F', '=', ' ', '?', '!', '\x41', 
		'\x2', '\x43', '\"', '\x45', '#', 'G', '\x2', 'I', '\x2', 'K', '\x2', 
		'M', '\x2', 'O', '$', 'Q', '%', '\x3', '\x2', '\r', '\x5', '\x2', '\f', 
		'\f', '\xF', '\xF', '\x202A', '\x202B', '\x3', '\x2', '\x32', ';', '\x4', 
		'\x2', '\x32', ';', '\x61', '\x61', '\x3', '\x2', '\x33', ';', '\x5', 
		'\x2', '\x43', '\\', '\x61', '\x61', '\x63', '|', '\x6', '\x2', '\x32', 
		';', '\x43', '\\', '\x61', '\x61', '\x63', '|', '\x6', '\x2', '\f', '\f', 
		'\xF', '\xF', '$', '$', '^', '^', '\x6', '\x2', '\f', '\f', '\xF', '\xF', 
		')', ')', '^', '^', '\v', '\x2', '$', '$', ')', ')', '^', '^', '\x64', 
		'\x64', 'h', 'h', 'p', 'p', 't', 't', 'v', 'v', 'x', 'x', '\x3', '\x2', 
		'=', '=', '\x6', '\x2', '\v', '\v', '\r', '\xE', '\"', '\"', '\xA2', '\xA2', 
		'\x2', '\x13C', '\x2', '\x3', '\x3', '\x2', '\x2', '\x2', '\x2', '\x5', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\a', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\t', '\x3', '\x2', '\x2', '\x2', '\x2', '\v', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\r', '\x3', '\x2', '\x2', '\x2', '\x2', '\xF', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\x11', '\x3', '\x2', '\x2', '\x2', '\x2', '\x13', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\x15', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x17', '\x3', '\x2', '\x2', '\x2', '\x2', '\x19', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\x1B', '\x3', '\x2', '\x2', '\x2', '\x2', '\x1D', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\x1F', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'!', '\x3', '\x2', '\x2', '\x2', '\x2', '#', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '%', '\x3', '\x2', '\x2', '\x2', '\x2', '\'', '\x3', '\x2', '\x2', 
		'\x2', '\x2', ')', '\x3', '\x2', '\x2', '\x2', '\x2', '+', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '-', '\x3', '\x2', '\x2', '\x2', '\x2', '/', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\x31', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x33', '\x3', '\x2', '\x2', '\x2', '\x2', '\x35', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\x37', '\x3', '\x2', '\x2', '\x2', '\x2', '\x39', '\x3', 
		'\x2', '\x2', '\x2', '\x2', ';', '\x3', '\x2', '\x2', '\x2', '\x2', '=', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '?', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x43', '\x3', '\x2', '\x2', '\x2', '\x2', '\x45', '\x3', '\x2', '\x2', 
		'\x2', '\x2', 'O', '\x3', '\x2', '\x2', '\x2', '\x2', 'Q', '\x3', '\x2', 
		'\x2', '\x2', '\x3', 'S', '\x3', '\x2', '\x2', '\x2', '\x5', '\x61', '\x3', 
		'\x2', '\x2', '\x2', '\a', 'l', '\x3', '\x2', '\x2', '\x2', '\t', 'x', 
		'\x3', '\x2', '\x2', '\x2', '\v', '|', '\x3', '\x2', '\x2', '\x2', '\r', 
		'\x85', '\x3', '\x2', '\x2', '\x2', '\xF', '\x89', '\x3', '\x2', '\x2', 
		'\x2', '\x11', '\x8F', '\x3', '\x2', '\x2', '\x2', '\x13', '\x91', '\x3', 
		'\x2', '\x2', '\x2', '\x15', '\x93', '\x3', '\x2', '\x2', '\x2', '\x17', 
		'\x95', '\x3', '\x2', '\x2', '\x2', '\x19', '\x97', '\x3', '\x2', '\x2', 
		'\x2', '\x1B', '\x99', '\x3', '\x2', '\x2', '\x2', '\x1D', '\x9B', '\x3', 
		'\x2', '\x2', '\x2', '\x1F', '\x9D', '\x3', '\x2', '\x2', '\x2', '!', 
		'\x9F', '\x3', '\x2', '\x2', '\x2', '#', '\xA1', '\x3', '\x2', '\x2', 
		'\x2', '%', '\xA3', '\x3', '\x2', '\x2', '\x2', '\'', '\xA5', '\x3', '\x2', 
		'\x2', '\x2', ')', '\xA7', '\x3', '\x2', '\x2', '\x2', '+', '\xAA', '\x3', 
		'\x2', '\x2', '\x2', '-', '\xAD', '\x3', '\x2', '\x2', '\x2', '/', '\xB0', 
		'\x3', '\x2', '\x2', '\x2', '\x31', '\xB3', '\x3', '\x2', '\x2', '\x2', 
		'\x33', '\xB7', '\x3', '\x2', '\x2', '\x2', '\x35', '\xBB', '\x3', '\x2', 
		'\x2', '\x2', '\x37', '\xBE', '\x3', '\x2', '\x2', '\x2', '\x39', '\xCA', 
		'\x3', '\x2', '\x2', '\x2', ';', '\xCC', '\x3', '\x2', '\x2', '\x2', '=', 
		'\xCF', '\x3', '\x2', '\x2', '\x2', '?', '\xE6', '\x3', '\x2', '\x2', 
		'\x2', '\x41', '\xF0', '\x3', '\x2', '\x2', '\x2', '\x43', '\xF2', '\x3', 
		'\x2', '\x2', '\x2', '\x45', '\x109', '\x3', '\x2', '\x2', '\x2', 'G', 
		'\x10F', '\x3', '\x2', '\x2', '\x2', 'I', '\x115', '\x3', '\x2', '\x2', 
		'\x2', 'K', '\x117', '\x3', '\x2', '\x2', '\x2', 'M', '\x119', '\x3', 
		'\x2', '\x2', '\x2', 'O', '\x11F', '\x3', '\x2', '\x2', '\x2', 'Q', '\x128', 
		'\x3', '\x2', '\x2', '\x2', 'S', 'T', '\a', '\x31', '\x2', '\x2', 'T', 
		'U', '\a', ',', '\x2', '\x2', 'U', 'Y', '\x3', '\x2', '\x2', '\x2', 'V', 
		'X', '\v', '\x2', '\x2', '\x2', 'W', 'V', '\x3', '\x2', '\x2', '\x2', 
		'X', '[', '\x3', '\x2', '\x2', '\x2', 'Y', 'Z', '\x3', '\x2', '\x2', '\x2', 
		'Y', 'W', '\x3', '\x2', '\x2', '\x2', 'Z', '\\', '\x3', '\x2', '\x2', 
		'\x2', '[', 'Y', '\x3', '\x2', '\x2', '\x2', '\\', ']', '\a', ',', '\x2', 
		'\x2', ']', '^', '\a', '\x31', '\x2', '\x2', '^', '_', '\x3', '\x2', '\x2', 
		'\x2', '_', '`', '\b', '\x2', '\x2', '\x2', '`', '\x4', '\x3', '\x2', 
		'\x2', '\x2', '\x61', '\x62', '\a', '\x31', '\x2', '\x2', '\x62', '\x63', 
		'\a', '\x31', '\x2', '\x2', '\x63', 'g', '\x3', '\x2', '\x2', '\x2', '\x64', 
		'\x66', '\n', '\x2', '\x2', '\x2', '\x65', '\x64', '\x3', '\x2', '\x2', 
		'\x2', '\x66', 'i', '\x3', '\x2', '\x2', '\x2', 'g', '\x65', '\x3', '\x2', 
		'\x2', '\x2', 'g', 'h', '\x3', '\x2', '\x2', '\x2', 'h', 'j', '\x3', '\x2', 
		'\x2', '\x2', 'i', 'g', '\x3', '\x2', '\x2', '\x2', 'j', 'k', '\b', '\x3', 
		'\x2', '\x2', 'k', '\x6', '\x3', '\x2', '\x2', '\x2', 'l', 'm', '\a', 
		'\x65', '\x2', '\x2', 'm', 'n', '\a', 'q', '\x2', '\x2', 'n', 'o', '\a', 
		'p', '\x2', '\x2', 'o', 'p', '\a', 'u', '\x2', '\x2', 'p', 'q', '\a', 
		'q', '\x2', '\x2', 'q', 'r', '\a', 'n', '\x2', '\x2', 'r', 's', '\a', 
		'g', '\x2', '\x2', 's', 't', '\a', '\x30', '\x2', '\x2', 't', 'u', '\a', 
		'n', '\x2', '\x2', 'u', 'v', '\a', 'q', '\x2', '\x2', 'v', 'w', '\a', 
		'i', '\x2', '\x2', 'w', '\b', '\x3', '\x2', '\x2', '\x2', 'x', 'y', '\a', 
		'x', '\x2', '\x2', 'y', 'z', '\a', '\x63', '\x2', '\x2', 'z', '{', '\a', 
		't', '\x2', '\x2', '{', '\n', '\x3', '\x2', '\x2', '\x2', '|', '}', '\a', 
		'\x65', '\x2', '\x2', '}', '~', '\a', 'q', '\x2', '\x2', '~', '\x7F', 
		'\a', 'p', '\x2', '\x2', '\x7F', '\x80', '\a', 'v', '\x2', '\x2', '\x80', 
		'\x81', '\a', 'k', '\x2', '\x2', '\x81', '\x82', '\a', 'p', '\x2', '\x2', 
		'\x82', '\x83', '\a', 'w', '\x2', '\x2', '\x83', '\x84', '\a', 'g', '\x2', 
		'\x2', '\x84', '\f', '\x3', '\x2', '\x2', '\x2', '\x85', '\x86', '\a', 
		'h', '\x2', '\x2', '\x86', '\x87', '\a', 'q', '\x2', '\x2', '\x87', '\x88', 
		'\a', 't', '\x2', '\x2', '\x88', '\xE', '\x3', '\x2', '\x2', '\x2', '\x89', 
		'\x8A', '\a', 'y', '\x2', '\x2', '\x8A', '\x8B', '\a', 'j', '\x2', '\x2', 
		'\x8B', '\x8C', '\a', 'k', '\x2', '\x2', '\x8C', '\x8D', '\a', 'n', '\x2', 
		'\x2', '\x8D', '\x8E', '\a', 'g', '\x2', '\x2', '\x8E', '\x10', '\x3', 
		'\x2', '\x2', '\x2', '\x8F', '\x90', '\a', '}', '\x2', '\x2', '\x90', 
		'\x12', '\x3', '\x2', '\x2', '\x2', '\x91', '\x92', '\a', '\x7F', '\x2', 
		'\x2', '\x92', '\x14', '\x3', '\x2', '\x2', '\x2', '\x93', '\x94', '\a', 
		'=', '\x2', '\x2', '\x94', '\x16', '\x3', '\x2', '\x2', '\x2', '\x95', 
		'\x96', '\a', '?', '\x2', '\x2', '\x96', '\x18', '\x3', '\x2', '\x2', 
		'\x2', '\x97', '\x98', '\a', '-', '\x2', '\x2', '\x98', '\x1A', '\x3', 
		'\x2', '\x2', '\x2', '\x99', '\x9A', '\a', '/', '\x2', '\x2', '\x9A', 
		'\x1C', '\x3', '\x2', '\x2', '\x2', '\x9B', '\x9C', '\a', '\x31', '\x2', 
		'\x2', '\x9C', '\x1E', '\x3', '\x2', '\x2', '\x2', '\x9D', '\x9E', '\a', 
		',', '\x2', '\x2', '\x9E', ' ', '\x3', '\x2', '\x2', '\x2', '\x9F', '\xA0', 
		'\a', '*', '\x2', '\x2', '\xA0', '\"', '\x3', '\x2', '\x2', '\x2', '\xA1', 
		'\xA2', '\a', '+', '\x2', '\x2', '\xA2', '$', '\x3', '\x2', '\x2', '\x2', 
		'\xA3', '\xA4', '\a', '>', '\x2', '\x2', '\xA4', '&', '\x3', '\x2', '\x2', 
		'\x2', '\xA5', '\xA6', '\a', '@', '\x2', '\x2', '\xA6', '(', '\x3', '\x2', 
		'\x2', '\x2', '\xA7', '\xA8', '\a', '>', '\x2', '\x2', '\xA8', '\xA9', 
		'\a', '?', '\x2', '\x2', '\xA9', '*', '\x3', '\x2', '\x2', '\x2', '\xAA', 
		'\xAB', '\a', '@', '\x2', '\x2', '\xAB', '\xAC', '\a', '?', '\x2', '\x2', 
		'\xAC', ',', '\x3', '\x2', '\x2', '\x2', '\xAD', '\xAE', '\a', '?', '\x2', 
		'\x2', '\xAE', '\xAF', '\a', '?', '\x2', '\x2', '\xAF', '.', '\x3', '\x2', 
		'\x2', '\x2', '\xB0', '\xB1', '\a', '#', '\x2', '\x2', '\xB1', '\xB2', 
		'\a', '?', '\x2', '\x2', '\xB2', '\x30', '\x3', '\x2', '\x2', '\x2', '\xB3', 
		'\xB4', '\a', '?', '\x2', '\x2', '\xB4', '\xB5', '\a', '?', '\x2', '\x2', 
		'\xB5', '\xB6', '\a', '?', '\x2', '\x2', '\xB6', '\x32', '\x3', '\x2', 
		'\x2', '\x2', '\xB7', '\xB8', '\a', '#', '\x2', '\x2', '\xB8', '\xB9', 
		'\a', '?', '\x2', '\x2', '\xB9', '\xBA', '\a', '?', '\x2', '\x2', '\xBA', 
		'\x34', '\x3', '\x2', '\x2', '\x2', '\xBB', '\xBC', '\a', '(', '\x2', 
		'\x2', '\xBC', '\xBD', '\a', '(', '\x2', '\x2', '\xBD', '\x36', '\x3', 
		'\x2', '\x2', '\x2', '\xBE', '\xBF', '\a', '~', '\x2', '\x2', '\xBF', 
		'\xC0', '\a', '~', '\x2', '\x2', '\xC0', '\x38', '\x3', '\x2', '\x2', 
		'\x2', '\xC1', '\xC2', '\a', 'v', '\x2', '\x2', '\xC2', '\xC3', '\a', 
		't', '\x2', '\x2', '\xC3', '\xC4', '\a', 'w', '\x2', '\x2', '\xC4', '\xCB', 
		'\a', 'g', '\x2', '\x2', '\xC5', '\xC6', '\a', 'h', '\x2', '\x2', '\xC6', 
		'\xC7', '\a', '\x63', '\x2', '\x2', '\xC7', '\xC8', '\a', 'n', '\x2', 
		'\x2', '\xC8', '\xC9', '\a', 'u', '\x2', '\x2', '\xC9', '\xCB', '\a', 
		'g', '\x2', '\x2', '\xCA', '\xC1', '\x3', '\x2', '\x2', '\x2', '\xCA', 
		'\xC5', '\x3', '\x2', '\x2', '\x2', '\xCB', ':', '\x3', '\x2', '\x2', 
		'\x2', '\xCC', '\xCD', '\a', 'k', '\x2', '\x2', '\xCD', '\xCE', '\a', 
		'h', '\x2', '\x2', '\xCE', '<', '\x3', '\x2', '\x2', '\x2', '\xCF', '\xD0', 
		'\a', 'g', '\x2', '\x2', '\xD0', '\xD1', '\a', 'n', '\x2', '\x2', '\xD1', 
		'\xD2', '\a', 'u', '\x2', '\x2', '\xD2', '\xD3', '\a', 'g', '\x2', '\x2', 
		'\xD3', '>', '\x3', '\x2', '\x2', '\x2', '\xD4', '\xD5', '\x5', '\x41', 
		'!', '\x2', '\xD5', '\xD6', '\a', '\x30', '\x2', '\x2', '\xD6', '\xDA', 
		'\t', '\x3', '\x2', '\x2', '\xD7', '\xD9', '\t', '\x4', '\x2', '\x2', 
		'\xD8', '\xD7', '\x3', '\x2', '\x2', '\x2', '\xD9', '\xDC', '\x3', '\x2', 
		'\x2', '\x2', '\xDA', '\xD8', '\x3', '\x2', '\x2', '\x2', '\xDA', '\xDB', 
		'\x3', '\x2', '\x2', '\x2', '\xDB', '\xE7', '\x3', '\x2', '\x2', '\x2', 
		'\xDC', '\xDA', '\x3', '\x2', '\x2', '\x2', '\xDD', '\xDE', '\a', '\x30', 
		'\x2', '\x2', '\xDE', '\xE2', '\t', '\x3', '\x2', '\x2', '\xDF', '\xE1', 
		'\t', '\x4', '\x2', '\x2', '\xE0', '\xDF', '\x3', '\x2', '\x2', '\x2', 
		'\xE1', '\xE4', '\x3', '\x2', '\x2', '\x2', '\xE2', '\xE0', '\x3', '\x2', 
		'\x2', '\x2', '\xE2', '\xE3', '\x3', '\x2', '\x2', '\x2', '\xE3', '\xE7', 
		'\x3', '\x2', '\x2', '\x2', '\xE4', '\xE2', '\x3', '\x2', '\x2', '\x2', 
		'\xE5', '\xE7', '\x5', '\x41', '!', '\x2', '\xE6', '\xD4', '\x3', '\x2', 
		'\x2', '\x2', '\xE6', '\xDD', '\x3', '\x2', '\x2', '\x2', '\xE6', '\xE5', 
		'\x3', '\x2', '\x2', '\x2', '\xE7', '@', '\x3', '\x2', '\x2', '\x2', '\xE8', 
		'\xF1', '\a', '\x32', '\x2', '\x2', '\xE9', '\xED', '\t', '\x5', '\x2', 
		'\x2', '\xEA', '\xEC', '\t', '\x4', '\x2', '\x2', '\xEB', '\xEA', '\x3', 
		'\x2', '\x2', '\x2', '\xEC', '\xEF', '\x3', '\x2', '\x2', '\x2', '\xED', 
		'\xEB', '\x3', '\x2', '\x2', '\x2', '\xED', '\xEE', '\x3', '\x2', '\x2', 
		'\x2', '\xEE', '\xF1', '\x3', '\x2', '\x2', '\x2', '\xEF', '\xED', '\x3', 
		'\x2', '\x2', '\x2', '\xF0', '\xE8', '\x3', '\x2', '\x2', '\x2', '\xF0', 
		'\xE9', '\x3', '\x2', '\x2', '\x2', '\xF1', '\x42', '\x3', '\x2', '\x2', 
		'\x2', '\xF2', '\xF6', '\t', '\x6', '\x2', '\x2', '\xF3', '\xF5', '\t', 
		'\a', '\x2', '\x2', '\xF4', '\xF3', '\x3', '\x2', '\x2', '\x2', '\xF5', 
		'\xF8', '\x3', '\x2', '\x2', '\x2', '\xF6', '\xF4', '\x3', '\x2', '\x2', 
		'\x2', '\xF6', '\xF7', '\x3', '\x2', '\x2', '\x2', '\xF7', '\x44', '\x3', 
		'\x2', '\x2', '\x2', '\xF8', '\xF6', '\x3', '\x2', '\x2', '\x2', '\xF9', 
		'\xFD', '\a', '$', '\x2', '\x2', '\xFA', '\xFC', '\x5', 'G', '$', '\x2', 
		'\xFB', '\xFA', '\x3', '\x2', '\x2', '\x2', '\xFC', '\xFF', '\x3', '\x2', 
		'\x2', '\x2', '\xFD', '\xFB', '\x3', '\x2', '\x2', '\x2', '\xFD', '\xFE', 
		'\x3', '\x2', '\x2', '\x2', '\xFE', '\x100', '\x3', '\x2', '\x2', '\x2', 
		'\xFF', '\xFD', '\x3', '\x2', '\x2', '\x2', '\x100', '\x10A', '\a', '$', 
		'\x2', '\x2', '\x101', '\x105', '\a', ')', '\x2', '\x2', '\x102', '\x104', 
		'\x5', 'I', '%', '\x2', '\x103', '\x102', '\x3', '\x2', '\x2', '\x2', 
		'\x104', '\x107', '\x3', '\x2', '\x2', '\x2', '\x105', '\x103', '\x3', 
		'\x2', '\x2', '\x2', '\x105', '\x106', '\x3', '\x2', '\x2', '\x2', '\x106', 
		'\x108', '\x3', '\x2', '\x2', '\x2', '\x107', '\x105', '\x3', '\x2', '\x2', 
		'\x2', '\x108', '\x10A', '\a', ')', '\x2', '\x2', '\x109', '\xF9', '\x3', 
		'\x2', '\x2', '\x2', '\x109', '\x101', '\x3', '\x2', '\x2', '\x2', '\x10A', 
		'\x46', '\x3', '\x2', '\x2', '\x2', '\x10B', '\x110', '\n', '\b', '\x2', 
		'\x2', '\x10C', '\x10D', '\a', '^', '\x2', '\x2', '\x10D', '\x110', '\x5', 
		'K', '&', '\x2', '\x10E', '\x110', '\x5', 'M', '\'', '\x2', '\x10F', '\x10B', 
		'\x3', '\x2', '\x2', '\x2', '\x10F', '\x10C', '\x3', '\x2', '\x2', '\x2', 
		'\x10F', '\x10E', '\x3', '\x2', '\x2', '\x2', '\x110', 'H', '\x3', '\x2', 
		'\x2', '\x2', '\x111', '\x116', '\n', '\t', '\x2', '\x2', '\x112', '\x113', 
		'\a', '^', '\x2', '\x2', '\x113', '\x116', '\x5', 'K', '&', '\x2', '\x114', 
		'\x116', '\x5', 'M', '\'', '\x2', '\x115', '\x111', '\x3', '\x2', '\x2', 
		'\x2', '\x115', '\x112', '\x3', '\x2', '\x2', '\x2', '\x115', '\x114', 
		'\x3', '\x2', '\x2', '\x2', '\x116', 'J', '\x3', '\x2', '\x2', '\x2', 
		'\x117', '\x118', '\t', '\n', '\x2', '\x2', '\x118', 'L', '\x3', '\x2', 
		'\x2', '\x2', '\x119', '\x11A', '\a', '^', '\x2', '\x2', '\x11A', '\x11B', 
		'\t', '\x2', '\x2', '\x2', '\x11B', 'N', '\x3', '\x2', '\x2', '\x2', '\x11C', 
		'\x11E', '\t', '\v', '\x2', '\x2', '\x11D', '\x11C', '\x3', '\x2', '\x2', 
		'\x2', '\x11E', '\x121', '\x3', '\x2', '\x2', '\x2', '\x11F', '\x11D', 
		'\x3', '\x2', '\x2', '\x2', '\x11F', '\x120', '\x3', '\x2', '\x2', '\x2', 
		'\x120', '\x123', '\x3', '\x2', '\x2', '\x2', '\x121', '\x11F', '\x3', 
		'\x2', '\x2', '\x2', '\x122', '\x124', '\t', '\x2', '\x2', '\x2', '\x123', 
		'\x122', '\x3', '\x2', '\x2', '\x2', '\x124', '\x125', '\x3', '\x2', '\x2', 
		'\x2', '\x125', '\x123', '\x3', '\x2', '\x2', '\x2', '\x125', '\x126', 
		'\x3', '\x2', '\x2', '\x2', '\x126', 'P', '\x3', '\x2', '\x2', '\x2', 
		'\x127', '\x129', '\t', '\f', '\x2', '\x2', '\x128', '\x127', '\x3', '\x2', 
		'\x2', '\x2', '\x129', '\x12A', '\x3', '\x2', '\x2', '\x2', '\x12A', '\x128', 
		'\x3', '\x2', '\x2', '\x2', '\x12A', '\x12B', '\x3', '\x2', '\x2', '\x2', 
		'\x12B', '\x12C', '\x3', '\x2', '\x2', '\x2', '\x12C', '\x12D', '\b', 
		')', '\x2', '\x2', '\x12D', 'R', '\x3', '\x2', '\x2', '\x2', '\x14', '\x2', 
		'Y', 'g', '\xCA', '\xDA', '\xE2', '\xE6', '\xED', '\xF0', '\xF6', '\xFD', 
		'\x105', '\x109', '\x10F', '\x115', '\x11F', '\x125', '\x12A', '\x3', 
		'\b', '\x2', '\x2',
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}
