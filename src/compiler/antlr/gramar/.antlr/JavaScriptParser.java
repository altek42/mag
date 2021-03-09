// Generated from c:\doit\mag\src\compiler\antlr\gramar\JavaScriptParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MULTI_LINE_COMMENT=1, SINGLE_LINE_COMMENT=2, CONSOLE_LOG=3, VAR=4, CONTINUE=5, 
		FOR=6, WHILE=7, FUNCTION=8, LENGTH=9, RETURN=10, OPEN_BRACKET=11, CLOSE_BRACKET=12, 
		OPEN_BRACE=13, CLOSE_BRACE=14, DOT=15, COMMA=16, SEMI_COLON=17, ASSIGN=18, 
		PLUS=19, MINUS=20, DIVIDE=21, MULTIPLY=22, OPEN_PAREN=23, CLOSE_PAREN=24, 
		LESS_THAN=25, MORE_THAN=26, LESS_THAN_EQUALS=27, GREATER_THAN_EQUALS=28, 
		EQUALS=29, NOT_EQUALS=30, IDENTITY_EQUALS=31, IDENTITY_NOT_EQUALS=32, 
		AND=33, OR=34, BOOLEAN=35, IF=36, ELSE=37, NUMBER=38, IDENTIFIER=39, STRING=40, 
		EOL=41, WHITE_SPACES=42;
	public static final int
		RULE_parse = 0, RULE_instructions = 1, RULE_instructionLine = 2, RULE_instruction = 3, 
		RULE_instructionBlock = 4, RULE_returnStatement = 5, RULE_writeStdOutput = 6, 
		RULE_writeStdOutputConstant = 7, RULE_writeStdOutputIdentifier = 8, RULE_writeStdOutputArithmeticOperation = 9, 
		RULE_arithmeticOperation = 10, RULE_arithmeticOperationHigher = 11, RULE_conditionOperation = 12, 
		RULE_arithmeticAdditiveSign = 13, RULE_arithmeticMultiplpicativeSign = 14, 
		RULE_value = 15, RULE_arrayLength = 16, RULE_constantValue = 17, RULE_booleanValue = 18, 
		RULE_stringValue = 19, RULE_numberValue = 20, RULE_identifierValue = 21, 
		RULE_variableDeclaratiion = 22, RULE_variableDeclarationList = 23, RULE_variableDeclarationListElement = 24, 
		RULE_conditionSign = 25, RULE_assignOperation = 26, RULE_singleAssignOperation = 27, 
		RULE_assignValue = 28, RULE_singleExpression = 29, RULE_ifStatement = 30, 
		RULE_ifStatementConditionOperation = 31, RULE_elseStatement = 32, RULE_loops = 33, 
		RULE_whileLoop = 34, RULE_whileStatementConditionOperation = 35, RULE_forLoop = 36, 
		RULE_forStatementConditionOperation = 37, RULE_forExpression = 38, RULE_arrayLiteral = 39, 
		RULE_elementList = 40, RULE_commaSeparator = 41, RULE_arrayElement = 42, 
		RULE_functionDeclaration = 43, RULE_formalParameterList = 44, RULE_formalParameterArg = 45, 
		RULE_functionCall = 46, RULE_arguments = 47, RULE_argument = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "instructions", "instructionLine", "instruction", "instructionBlock", 
			"returnStatement", "writeStdOutput", "writeStdOutputConstant", "writeStdOutputIdentifier", 
			"writeStdOutputArithmeticOperation", "arithmeticOperation", "arithmeticOperationHigher", 
			"conditionOperation", "arithmeticAdditiveSign", "arithmeticMultiplpicativeSign", 
			"value", "arrayLength", "constantValue", "booleanValue", "stringValue", 
			"numberValue", "identifierValue", "variableDeclaratiion", "variableDeclarationList", 
			"variableDeclarationListElement", "conditionSign", "assignOperation", 
			"singleAssignOperation", "assignValue", "singleExpression", "ifStatement", 
			"ifStatementConditionOperation", "elseStatement", "loops", "whileLoop", 
			"whileStatementConditionOperation", "forLoop", "forStatementConditionOperation", 
			"forExpression", "arrayLiteral", "elementList", "commaSeparator", "arrayElement", 
			"functionDeclaration", "formalParameterList", "formalParameterArg", "functionCall", 
			"arguments", "argument"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'console.log'", "'var'", "'continue'", "'for'", "'while'", 
			"'function'", "'length'", "'return'", "'['", "']'", "'{'", "'}'", "'.'", 
			"','", "';'", "'='", "'+'", "'-'", "'/'", "'*'", "'('", "')'", "'<'", 
			"'>'", "'<='", "'>='", "'=='", "'!='", "'==='", "'!=='", "'&&'", "'||'", 
			null, "'if'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MULTI_LINE_COMMENT", "SINGLE_LINE_COMMENT", "CONSOLE_LOG", "VAR", 
			"CONTINUE", "FOR", "WHILE", "FUNCTION", "LENGTH", "RETURN", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "OPEN_BRACE", "CLOSE_BRACE", "DOT", "COMMA", "SEMI_COLON", 
			"ASSIGN", "PLUS", "MINUS", "DIVIDE", "MULTIPLY", "OPEN_PAREN", "CLOSE_PAREN", 
			"LESS_THAN", "MORE_THAN", "LESS_THAN_EQUALS", "GREATER_THAN_EQUALS", 
			"EQUALS", "NOT_EQUALS", "IDENTITY_EQUALS", "IDENTITY_NOT_EQUALS", "AND", 
			"OR", "BOOLEAN", "IF", "ELSE", "NUMBER", "IDENTIFIER", "STRING", "EOL", 
			"WHITE_SPACES"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JavaScriptParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public TerminalNode EOF() { return getToken(JavaScriptParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSOLE_LOG) | (1L << VAR) | (1L << FOR) | (1L << WHILE) | (1L << FUNCTION) | (1L << RETURN) | (1L << IF) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(98);
				instructions();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(104);
				match(EOF);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionsContext extends ParserRuleContext {
		public List<InstructionLineContext> instructionLine() {
			return getRuleContexts(InstructionLineContext.class);
		}
		public InstructionLineContext instructionLine(int i) {
			return getRuleContext(InstructionLineContext.class,i);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instructions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(107);
					instructionLine();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(110); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionLineContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public TerminalNode EOL() { return getToken(JavaScriptParser.EOL, 0); }
		public InstructionLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructionLine; }
	}

	public final InstructionLineContext instructionLine() throws RecognitionException {
		InstructionLineContext _localctx = new InstructionLineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instructionLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			instruction();
			setState(113);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public VariableDeclaratiionContext variableDeclaratiion() {
			return getRuleContext(VariableDeclaratiionContext.class,0);
		}
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public AssignOperationContext assignOperation() {
			return getRuleContext(AssignOperationContext.class,0);
		}
		public WriteStdOutputContext writeStdOutput() {
			return getRuleContext(WriteStdOutputContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public LoopsContext loops() {
			return getRuleContext(LoopsContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruction);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				variableDeclaratiion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				variableDeclarationList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				assignOperation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				writeStdOutput();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(120);
				loops();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(121);
				functionDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(122);
				functionCall();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(123);
				returnStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionBlockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(JavaScriptParser.OPEN_BRACE, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(JavaScriptParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> EOL() { return getTokens(JavaScriptParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(JavaScriptParser.EOL, i);
		}
		public InstructionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructionBlock; }
	}

	public final InstructionBlockContext instructionBlock() throws RecognitionException {
		InstructionBlockContext _localctx = new InstructionBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instructionBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOL) {
				{
				{
				setState(126);
				match(EOL);
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			match(OPEN_BRACE);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOL) {
				{
				{
				setState(133);
				match(EOL);
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			instructions();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOL) {
				{
				{
				setState(140);
				match(EOL);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(CLOSE_BRACE);
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(147);
					match(EOL);
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(JavaScriptParser.RETURN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnStatement);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(RETURN);
				setState(154);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(RETURN);
				setState(156);
				functionCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteStdOutputContext extends ParserRuleContext {
		public WriteStdOutputConstantContext writeStdOutputConstant() {
			return getRuleContext(WriteStdOutputConstantContext.class,0);
		}
		public WriteStdOutputIdentifierContext writeStdOutputIdentifier() {
			return getRuleContext(WriteStdOutputIdentifierContext.class,0);
		}
		public WriteStdOutputArithmeticOperationContext writeStdOutputArithmeticOperation() {
			return getRuleContext(WriteStdOutputArithmeticOperationContext.class,0);
		}
		public WriteStdOutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStdOutput; }
	}

	public final WriteStdOutputContext writeStdOutput() throws RecognitionException {
		WriteStdOutputContext _localctx = new WriteStdOutputContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_writeStdOutput);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				writeStdOutputConstant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				writeStdOutputIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				writeStdOutputArithmeticOperation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteStdOutputConstantContext extends ParserRuleContext {
		public TerminalNode CONSOLE_LOG() { return getToken(JavaScriptParser.CONSOLE_LOG, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(JavaScriptParser.OPEN_PAREN, 0); }
		public ConstantValueContext constantValue() {
			return getRuleContext(ConstantValueContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(JavaScriptParser.CLOSE_PAREN, 0); }
		public WriteStdOutputConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStdOutputConstant; }
	}

	public final WriteStdOutputConstantContext writeStdOutputConstant() throws RecognitionException {
		WriteStdOutputConstantContext _localctx = new WriteStdOutputConstantContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_writeStdOutputConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(CONSOLE_LOG);
			setState(165);
			match(OPEN_PAREN);
			setState(166);
			constantValue();
			setState(167);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteStdOutputIdentifierContext extends ParserRuleContext {
		public TerminalNode CONSOLE_LOG() { return getToken(JavaScriptParser.CONSOLE_LOG, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(JavaScriptParser.OPEN_PAREN, 0); }
		public IdentifierValueContext identifierValue() {
			return getRuleContext(IdentifierValueContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(JavaScriptParser.CLOSE_PAREN, 0); }
		public WriteStdOutputIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStdOutputIdentifier; }
	}

	public final WriteStdOutputIdentifierContext writeStdOutputIdentifier() throws RecognitionException {
		WriteStdOutputIdentifierContext _localctx = new WriteStdOutputIdentifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_writeStdOutputIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(CONSOLE_LOG);
			setState(170);
			match(OPEN_PAREN);
			setState(171);
			identifierValue();
			setState(172);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteStdOutputArithmeticOperationContext extends ParserRuleContext {
		public TerminalNode CONSOLE_LOG() { return getToken(JavaScriptParser.CONSOLE_LOG, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(JavaScriptParser.OPEN_PAREN, 0); }
		public ArithmeticOperationContext arithmeticOperation() {
			return getRuleContext(ArithmeticOperationContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(JavaScriptParser.CLOSE_PAREN, 0); }
		public WriteStdOutputArithmeticOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStdOutputArithmeticOperation; }
	}

	public final WriteStdOutputArithmeticOperationContext writeStdOutputArithmeticOperation() throws RecognitionException {
		WriteStdOutputArithmeticOperationContext _localctx = new WriteStdOutputArithmeticOperationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_writeStdOutputArithmeticOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(CONSOLE_LOG);
			setState(175);
			match(OPEN_PAREN);
			setState(176);
			arithmeticOperation(0);
			setState(177);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticOperationContext extends ParserRuleContext {
		public ArithmeticOperationHigherContext arithmeticOperationHigher() {
			return getRuleContext(ArithmeticOperationHigherContext.class,0);
		}
		public ArithmeticOperationContext arithmeticOperation() {
			return getRuleContext(ArithmeticOperationContext.class,0);
		}
		public ArithmeticAdditiveSignContext arithmeticAdditiveSign() {
			return getRuleContext(ArithmeticAdditiveSignContext.class,0);
		}
		public ArithmeticOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperation; }
	}

	public final ArithmeticOperationContext arithmeticOperation() throws RecognitionException {
		return arithmeticOperation(0);
	}

	private ArithmeticOperationContext arithmeticOperation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticOperationContext _localctx = new ArithmeticOperationContext(_ctx, _parentState);
		ArithmeticOperationContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_arithmeticOperation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(180);
			arithmeticOperationHigher(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticOperationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOperation);
					setState(182);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(183);
					arithmeticAdditiveSign();
					setState(184);
					arithmeticOperationHigher(0);
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArithmeticOperationHigherContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArithmeticOperationHigherContext arithmeticOperationHigher() {
			return getRuleContext(ArithmeticOperationHigherContext.class,0);
		}
		public ArithmeticMultiplpicativeSignContext arithmeticMultiplpicativeSign() {
			return getRuleContext(ArithmeticMultiplpicativeSignContext.class,0);
		}
		public ArithmeticOperationHigherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperationHigher; }
	}

	public final ArithmeticOperationHigherContext arithmeticOperationHigher() throws RecognitionException {
		return arithmeticOperationHigher(0);
	}

	private ArithmeticOperationHigherContext arithmeticOperationHigher(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticOperationHigherContext _localctx = new ArithmeticOperationHigherContext(_ctx, _parentState);
		ArithmeticOperationHigherContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_arithmeticOperationHigher, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(192);
			value();
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticOperationHigherContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOperationHigher);
					setState(194);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(195);
					arithmeticMultiplpicativeSign();
					setState(196);
					value();
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionOperationContext extends ParserRuleContext {
		public ArithmeticOperationContext arithmeticOperation() {
			return getRuleContext(ArithmeticOperationContext.class,0);
		}
		public ConditionSignContext conditionSign() {
			return getRuleContext(ConditionSignContext.class,0);
		}
		public ConditionOperationContext conditionOperation() {
			return getRuleContext(ConditionOperationContext.class,0);
		}
		public ConditionOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionOperation; }
	}

	public final ConditionOperationContext conditionOperation() throws RecognitionException {
		ConditionOperationContext _localctx = new ConditionOperationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_conditionOperation);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				arithmeticOperation(0);
				setState(204);
				conditionSign();
				setState(205);
				conditionOperation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				arithmeticOperation(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticAdditiveSignContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(JavaScriptParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JavaScriptParser.MINUS, 0); }
		public ArithmeticAdditiveSignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticAdditiveSign; }
	}

	public final ArithmeticAdditiveSignContext arithmeticAdditiveSign() throws RecognitionException {
		ArithmeticAdditiveSignContext _localctx = new ArithmeticAdditiveSignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arithmeticAdditiveSign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticMultiplpicativeSignContext extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(JavaScriptParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(JavaScriptParser.DIVIDE, 0); }
		public ArithmeticMultiplpicativeSignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticMultiplpicativeSign; }
	}

	public final ArithmeticMultiplpicativeSignContext arithmeticMultiplpicativeSign() throws RecognitionException {
		ArithmeticMultiplpicativeSignContext _localctx = new ArithmeticMultiplpicativeSignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arithmeticMultiplpicativeSign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if ( !(_la==DIVIDE || _la==MULTIPLY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public ConstantValueContext constantValue() {
			return getRuleContext(ConstantValueContext.class,0);
		}
		public IdentifierValueContext identifierValue() {
			return getRuleContext(IdentifierValueContext.class,0);
		}
		public ArrayLengthContext arrayLength() {
			return getRuleContext(ArrayLengthContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_value);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				constantValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				identifierValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				arrayLength();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLengthContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaScriptParser.IDENTIFIER, 0); }
		public TerminalNode DOT() { return getToken(JavaScriptParser.DOT, 0); }
		public TerminalNode LENGTH() { return getToken(JavaScriptParser.LENGTH, 0); }
		public ArrayLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLength; }
	}

	public final ArrayLengthContext arrayLength() throws RecognitionException {
		ArrayLengthContext _localctx = new ArrayLengthContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arrayLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(IDENTIFIER);
			setState(220);
			match(DOT);
			setState(221);
			match(LENGTH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantValueContext extends ParserRuleContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public StringValueContext stringValue() {
			return getRuleContext(StringValueContext.class,0);
		}
		public NumberValueContext numberValue() {
			return getRuleContext(NumberValueContext.class,0);
		}
		public ConstantValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantValue; }
	}

	public final ConstantValueContext constantValue() throws RecognitionException {
		ConstantValueContext _localctx = new ConstantValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_constantValue);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				stringValue();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				numberValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(JavaScriptParser.BOOLEAN, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_booleanValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(BOOLEAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JavaScriptParser.STRING, 0); }
		public StringValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringValue; }
	}

	public final StringValueContext stringValue() throws RecognitionException {
		StringValueContext _localctx = new StringValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_stringValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(JavaScriptParser.NUMBER, 0); }
		public NumberValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberValue; }
	}

	public final NumberValueContext numberValue() throws RecognitionException {
		NumberValueContext _localctx = new NumberValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_numberValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierValueContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaScriptParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(JavaScriptParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(JavaScriptParser.CLOSE_BRACKET, 0); }
		public NumberValueContext numberValue() {
			return getRuleContext(NumberValueContext.class,0);
		}
		public IdentifierValueContext identifierValue() {
			return getRuleContext(IdentifierValueContext.class,0);
		}
		public IdentifierValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierValue; }
	}

	public final IdentifierValueContext identifierValue() throws RecognitionException {
		IdentifierValueContext _localctx = new IdentifierValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_identifierValue);
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(IDENTIFIER);
				setState(236);
				match(OPEN_BRACKET);
				setState(239);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					setState(237);
					numberValue();
					}
					break;
				case IDENTIFIER:
					{
					setState(238);
					identifierValue();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(241);
				match(CLOSE_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratiionContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(JavaScriptParser.VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaScriptParser.IDENTIFIER, 0); }
		public VariableDeclaratiionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratiion; }
	}

	public final VariableDeclaratiionContext variableDeclaratiion() throws RecognitionException {
		VariableDeclaratiionContext _localctx = new VariableDeclaratiionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_variableDeclaratiion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(VAR);
			setState(246);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(JavaScriptParser.VAR, 0); }
		public List<VariableDeclarationListElementContext> variableDeclarationListElement() {
			return getRuleContexts(VariableDeclarationListElementContext.class);
		}
		public VariableDeclarationListElementContext variableDeclarationListElement(int i) {
			return getRuleContext(VariableDeclarationListElementContext.class,i);
		}
		public List<CommaSeparatorContext> commaSeparator() {
			return getRuleContexts(CommaSeparatorContext.class);
		}
		public CommaSeparatorContext commaSeparator(int i) {
			return getRuleContext(CommaSeparatorContext.class,i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variableDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(VAR);
			setState(249);
			variableDeclarationListElement();
			setState(253); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(250);
					commaSeparator();
					setState(251);
					variableDeclarationListElement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(255); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationListElementContext extends ParserRuleContext {
		public SingleAssignOperationContext singleAssignOperation() {
			return getRuleContext(SingleAssignOperationContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaScriptParser.IDENTIFIER, 0); }
		public VariableDeclarationListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationListElement; }
	}

	public final VariableDeclarationListElementContext variableDeclarationListElement() throws RecognitionException {
		VariableDeclarationListElementContext _localctx = new VariableDeclarationListElementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_variableDeclarationListElement);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				singleAssignOperation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionSignContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(JavaScriptParser.LESS_THAN, 0); }
		public TerminalNode MORE_THAN() { return getToken(JavaScriptParser.MORE_THAN, 0); }
		public TerminalNode LESS_THAN_EQUALS() { return getToken(JavaScriptParser.LESS_THAN_EQUALS, 0); }
		public TerminalNode GREATER_THAN_EQUALS() { return getToken(JavaScriptParser.GREATER_THAN_EQUALS, 0); }
		public TerminalNode EQUALS() { return getToken(JavaScriptParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(JavaScriptParser.NOT_EQUALS, 0); }
		public TerminalNode IDENTITY_EQUALS() { return getToken(JavaScriptParser.IDENTITY_EQUALS, 0); }
		public TerminalNode IDENTITY_NOT_EQUALS() { return getToken(JavaScriptParser.IDENTITY_NOT_EQUALS, 0); }
		public ConditionSignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionSign; }
	}

	public final ConditionSignContext conditionSign() throws RecognitionException {
		ConditionSignContext _localctx = new ConditionSignContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_conditionSign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << MORE_THAN) | (1L << LESS_THAN_EQUALS) | (1L << GREATER_THAN_EQUALS) | (1L << EQUALS) | (1L << NOT_EQUALS) | (1L << IDENTITY_EQUALS) | (1L << IDENTITY_NOT_EQUALS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignOperationContext extends ParserRuleContext {
		public VariableDeclaratiionContext variableDeclaratiion() {
			return getRuleContext(VariableDeclaratiionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaScriptParser.ASSIGN, 0); }
		public AssignValueContext assignValue() {
			return getRuleContext(AssignValueContext.class,0);
		}
		public SingleAssignOperationContext singleAssignOperation() {
			return getRuleContext(SingleAssignOperationContext.class,0);
		}
		public AssignOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOperation; }
	}

	public final AssignOperationContext assignOperation() throws RecognitionException {
		AssignOperationContext _localctx = new AssignOperationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignOperation);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				variableDeclaratiion();
				setState(264);
				match(ASSIGN);
				setState(265);
				assignValue();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				singleAssignOperation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleAssignOperationContext extends ParserRuleContext {
		public IdentifierValueContext identifierValue() {
			return getRuleContext(IdentifierValueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaScriptParser.ASSIGN, 0); }
		public AssignValueContext assignValue() {
			return getRuleContext(AssignValueContext.class,0);
		}
		public SingleAssignOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleAssignOperation; }
	}

	public final SingleAssignOperationContext singleAssignOperation() throws RecognitionException {
		SingleAssignOperationContext _localctx = new SingleAssignOperationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_singleAssignOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			identifierValue();
			setState(271);
			match(ASSIGN);
			setState(272);
			assignValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignValueContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public AssignValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignValue; }
	}

	public final AssignValueContext assignValue() throws RecognitionException {
		AssignValueContext _localctx = new AssignValueContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_assignValue);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case NUMBER:
			case IDENTIFIER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				singleExpression();
				}
				break;
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				arrayLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleExpressionContext extends ParserRuleContext {
		public ArithmeticOperationContext arithmeticOperation() {
			return getRuleContext(ArithmeticOperationContext.class,0);
		}
		public ConditionOperationContext conditionOperation() {
			return getRuleContext(ConditionOperationContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_singleExpression);
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				arithmeticOperation(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				conditionOperation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				functionCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JavaScriptParser.IF, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(JavaScriptParser.OPEN_PAREN, 0); }
		public IfStatementConditionOperationContext ifStatementConditionOperation() {
			return getRuleContext(IfStatementConditionOperationContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(JavaScriptParser.CLOSE_PAREN, 0); }
		public InstructionBlockContext instructionBlock() {
			return getRuleContext(InstructionBlockContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(IF);
			setState(285);
			match(OPEN_PAREN);
			setState(286);
			ifStatementConditionOperation();
			setState(287);
			match(CLOSE_PAREN);
			setState(288);
			instructionBlock();
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(289);
				elseStatement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementConditionOperationContext extends ParserRuleContext {
		public ConditionOperationContext conditionOperation() {
			return getRuleContext(ConditionOperationContext.class,0);
		}
		public IfStatementConditionOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatementConditionOperation; }
	}

	public final IfStatementConditionOperationContext ifStatementConditionOperation() throws RecognitionException {
		IfStatementConditionOperationContext _localctx = new IfStatementConditionOperationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ifStatementConditionOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			conditionOperation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(JavaScriptParser.ELSE, 0); }
		public InstructionBlockContext instructionBlock() {
			return getRuleContext(InstructionBlockContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(ELSE);
			setState(295);
			instructionBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopsContext extends ParserRuleContext {
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public LoopsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loops; }
	}

	public final LoopsContext loops() throws RecognitionException {
		LoopsContext _localctx = new LoopsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_loops);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				whileLoop();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				forLoop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(JavaScriptParser.WHILE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(JavaScriptParser.OPEN_PAREN, 0); }
		public WhileStatementConditionOperationContext whileStatementConditionOperation() {
			return getRuleContext(WhileStatementConditionOperationContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(JavaScriptParser.CLOSE_PAREN, 0); }
		public InstructionBlockContext instructionBlock() {
			return getRuleContext(InstructionBlockContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(WHILE);
			setState(302);
			match(OPEN_PAREN);
			setState(303);
			whileStatementConditionOperation();
			setState(304);
			match(CLOSE_PAREN);
			setState(305);
			instructionBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementConditionOperationContext extends ParserRuleContext {
		public ConditionOperationContext conditionOperation() {
			return getRuleContext(ConditionOperationContext.class,0);
		}
		public WhileStatementConditionOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatementConditionOperation; }
	}

	public final WhileStatementConditionOperationContext whileStatementConditionOperation() throws RecognitionException {
		WhileStatementConditionOperationContext _localctx = new WhileStatementConditionOperationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_whileStatementConditionOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			conditionOperation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(JavaScriptParser.FOR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(JavaScriptParser.OPEN_PAREN, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(JavaScriptParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(JavaScriptParser.SEMI_COLON, i);
		}
		public ForStatementConditionOperationContext forStatementConditionOperation() {
			return getRuleContext(ForStatementConditionOperationContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(JavaScriptParser.CLOSE_PAREN, 0); }
		public InstructionBlockContext instructionBlock() {
			return getRuleContext(InstructionBlockContext.class,0);
		}
		public AssignOperationContext assignOperation() {
			return getRuleContext(AssignOperationContext.class,0);
		}
		public ForExpressionContext forExpression() {
			return getRuleContext(ForExpressionContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(FOR);
			setState(310);
			match(OPEN_PAREN);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR || _la==IDENTIFIER) {
				{
				setState(311);
				assignOperation();
				}
			}

			setState(314);
			match(SEMI_COLON);
			setState(315);
			forStatementConditionOperation();
			setState(316);
			match(SEMI_COLON);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(317);
				forExpression();
				}
			}

			setState(320);
			match(CLOSE_PAREN);
			setState(321);
			instructionBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementConditionOperationContext extends ParserRuleContext {
		public ConditionOperationContext conditionOperation() {
			return getRuleContext(ConditionOperationContext.class,0);
		}
		public ForStatementConditionOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementConditionOperation; }
	}

	public final ForStatementConditionOperationContext forStatementConditionOperation() throws RecognitionException {
		ForStatementConditionOperationContext _localctx = new ForStatementConditionOperationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_forStatementConditionOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			conditionOperation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForExpressionContext extends ParserRuleContext {
		public IdentifierValueContext identifierValue() {
			return getRuleContext(IdentifierValueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaScriptParser.ASSIGN, 0); }
		public AssignValueContext assignValue() {
			return getRuleContext(AssignValueContext.class,0);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_forExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			identifierValue();
			setState(326);
			match(ASSIGN);
			setState(327);
			assignValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(JavaScriptParser.OPEN_BRACKET, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(JavaScriptParser.CLOSE_BRACKET, 0); }
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_arrayLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(329);
			match(OPEN_BRACKET);
			setState(330);
			elementList();
			setState(331);
			match(CLOSE_BRACKET);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementListContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(JavaScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaScriptParser.COMMA, i);
		}
		public List<ArrayElementContext> arrayElement() {
			return getRuleContexts(ArrayElementContext.class);
		}
		public ArrayElementContext arrayElement(int i) {
			return getRuleContext(ArrayElementContext.class,i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_elementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(333);
					match(COMMA);
					}
					} 
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << NUMBER) | (1L << IDENTIFIER) | (1L << STRING))) != 0)) {
				{
				setState(339);
				arrayElement();
				}
			}

			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(343); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(342);
						match(COMMA);
						}
						}
						setState(345); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA );
					setState(347);
					arrayElement();
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(353);
				match(COMMA);
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommaSeparatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(JavaScriptParser.COMMA, 0); }
		public List<TerminalNode> EOL() { return getTokens(JavaScriptParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(JavaScriptParser.EOL, i);
		}
		public CommaSeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaSeparator; }
	}

	public final CommaSeparatorContext commaSeparator() throws RecognitionException {
		CommaSeparatorContext _localctx = new CommaSeparatorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_commaSeparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOL) {
				{
				{
				setState(359);
				match(EOL);
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365);
			match(COMMA);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOL) {
				{
				{
				setState(366);
				match(EOL);
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayElementContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElement; }
	}

	public final ArrayElementContext arrayElement() throws RecognitionException {
		ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_arrayElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			singleExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(JavaScriptParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaScriptParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(JavaScriptParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(JavaScriptParser.CLOSE_PAREN, 0); }
		public InstructionBlockContext instructionBlock() {
			return getRuleContext(InstructionBlockContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(FUNCTION);
			setState(375);
			match(IDENTIFIER);
			setState(376);
			match(OPEN_PAREN);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(377);
				formalParameterList();
				}
			}

			setState(380);
			match(CLOSE_PAREN);
			setState(381);
			instructionBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterArgContext> formalParameterArg() {
			return getRuleContexts(FormalParameterArgContext.class);
		}
		public FormalParameterArgContext formalParameterArg(int i) {
			return getRuleContext(FormalParameterArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaScriptParser.COMMA, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			formalParameterArg();
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(384);
				match(COMMA);
				setState(385);
				formalParameterArg();
				}
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterArgContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaScriptParser.IDENTIFIER, 0); }
		public FormalParameterArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterArg; }
	}

	public final FormalParameterArgContext formalParameterArg() throws RecognitionException {
		FormalParameterArgContext _localctx = new FormalParameterArgContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_formalParameterArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaScriptParser.IDENTIFIER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(IDENTIFIER);
			setState(394);
			arguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(JavaScriptParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(JavaScriptParser.CLOSE_PAREN, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaScriptParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(OPEN_PAREN);
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << NUMBER) | (1L << IDENTIFIER) | (1L << STRING))) != 0)) {
				{
				setState(397);
				argument();
				setState(402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(398);
						match(COMMA);
						setState(399);
						argument();
						}
						} 
					}
					setState(404);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(405);
					match(COMMA);
					}
				}

				}
			}

			setState(410);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			singleExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return arithmeticOperation_sempred((ArithmeticOperationContext)_localctx, predIndex);
		case 11:
			return arithmeticOperationHigher_sempred((ArithmeticOperationHigherContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmeticOperation_sempred(ArithmeticOperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean arithmeticOperationHigher_sempred(ArithmeticOperationHigherContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u01a1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\7\2f\n\2\f\2"+
		"\16\2i\13\2\3\2\5\2l\n\2\3\3\6\3o\n\3\r\3\16\3p\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\177\n\5\3\6\7\6\u0082\n\6\f\6\16\6\u0085"+
		"\13\6\3\6\3\6\7\6\u0089\n\6\f\6\16\6\u008c\13\6\3\6\3\6\7\6\u0090\n\6"+
		"\f\6\16\6\u0093\13\6\3\6\3\6\7\6\u0097\n\6\f\6\16\6\u009a\13\6\3\7\3\7"+
		"\3\7\3\7\5\7\u00a0\n\7\3\b\3\b\3\b\5\b\u00a5\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\7\f\u00bd\n\f\f\f\16\f\u00c0\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00c9"+
		"\n\r\f\r\16\r\u00cc\13\r\3\16\3\16\3\16\3\16\3\16\5\16\u00d3\n\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\5\21\u00dc\n\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\5\23\u00e5\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u00f2\n\27\3\27\3\27\5\27\u00f6\n\27\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\6\31\u0100\n\31\r\31\16\31\u0101\3\32\3\32\5\32"+
		"\u0106\n\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\5\34\u010f\n\34\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\5\36\u0117\n\36\3\37\3\37\3\37\3\37\5\37\u011d"+
		"\n\37\3 \3 \3 \3 \3 \3 \5 \u0125\n \3!\3!\3\"\3\"\3\"\3#\3#\5#\u012e\n"+
		"#\3$\3$\3$\3$\3$\3$\3%\3%\3&\3&\3&\5&\u013b\n&\3&\3&\3&\3&\5&\u0141\n"+
		"&\3&\3&\3&\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\7*\u0151\n*\f*\16*\u0154"+
		"\13*\3*\5*\u0157\n*\3*\6*\u015a\n*\r*\16*\u015b\3*\7*\u015f\n*\f*\16*"+
		"\u0162\13*\3*\7*\u0165\n*\f*\16*\u0168\13*\3+\7+\u016b\n+\f+\16+\u016e"+
		"\13+\3+\3+\7+\u0172\n+\f+\16+\u0175\13+\3,\3,\3-\3-\3-\3-\5-\u017d\n-"+
		"\3-\3-\3-\3.\3.\3.\7.\u0185\n.\f.\16.\u0188\13.\3/\3/\3\60\3\60\3\60\3"+
		"\61\3\61\3\61\3\61\7\61\u0193\n\61\f\61\16\61\u0196\13\61\3\61\5\61\u0199"+
		"\n\61\5\61\u019b\n\61\3\61\3\61\3\62\3\62\3\62\2\4\26\30\63\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`b\2\5\3\2\25\26\3\2\27\30\3\2\33\"\2\u01a1\2g\3\2\2\2\4n\3\2\2\2\6r"+
		"\3\2\2\2\b~\3\2\2\2\n\u0083\3\2\2\2\f\u009f\3\2\2\2\16\u00a4\3\2\2\2\20"+
		"\u00a6\3\2\2\2\22\u00ab\3\2\2\2\24\u00b0\3\2\2\2\26\u00b5\3\2\2\2\30\u00c1"+
		"\3\2\2\2\32\u00d2\3\2\2\2\34\u00d4\3\2\2\2\36\u00d6\3\2\2\2 \u00db\3\2"+
		"\2\2\"\u00dd\3\2\2\2$\u00e4\3\2\2\2&\u00e6\3\2\2\2(\u00e8\3\2\2\2*\u00ea"+
		"\3\2\2\2,\u00f5\3\2\2\2.\u00f7\3\2\2\2\60\u00fa\3\2\2\2\62\u0105\3\2\2"+
		"\2\64\u0107\3\2\2\2\66\u010e\3\2\2\28\u0110\3\2\2\2:\u0116\3\2\2\2<\u011c"+
		"\3\2\2\2>\u011e\3\2\2\2@\u0126\3\2\2\2B\u0128\3\2\2\2D\u012d\3\2\2\2F"+
		"\u012f\3\2\2\2H\u0135\3\2\2\2J\u0137\3\2\2\2L\u0145\3\2\2\2N\u0147\3\2"+
		"\2\2P\u014b\3\2\2\2R\u0152\3\2\2\2T\u016c\3\2\2\2V\u0176\3\2\2\2X\u0178"+
		"\3\2\2\2Z\u0181\3\2\2\2\\\u0189\3\2\2\2^\u018b\3\2\2\2`\u018e\3\2\2\2"+
		"b\u019e\3\2\2\2df\5\4\3\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hk\3"+
		"\2\2\2ig\3\2\2\2jl\7\2\2\3kj\3\2\2\2kl\3\2\2\2l\3\3\2\2\2mo\5\6\4\2nm"+
		"\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\5\3\2\2\2rs\5\b\5\2st\7+\2\2t"+
		"\7\3\2\2\2u\177\5.\30\2v\177\5\60\31\2w\177\5\66\34\2x\177\5\16\b\2y\177"+
		"\5> \2z\177\5D#\2{\177\5X-\2|\177\5^\60\2}\177\5\f\7\2~u\3\2\2\2~v\3\2"+
		"\2\2~w\3\2\2\2~x\3\2\2\2~y\3\2\2\2~z\3\2\2\2~{\3\2\2\2~|\3\2\2\2~}\3\2"+
		"\2\2\177\t\3\2\2\2\u0080\u0082\7+\2\2\u0081\u0080\3\2\2\2\u0082\u0085"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u008a\7\17\2\2\u0087\u0089\7+\2\2\u0088\u0087\3\2"+
		"\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0091\5\4\3\2\u008e\u0090\7+"+
		"\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0098\7\20"+
		"\2\2\u0095\u0097\7+\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\13\3\2\2\2\u009a\u0098\3\2\2"+
		"\2\u009b\u009c\7\f\2\2\u009c\u00a0\5 \21\2\u009d\u009e\7\f\2\2\u009e\u00a0"+
		"\5^\60\2\u009f\u009b\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\r\3\2\2\2\u00a1"+
		"\u00a5\5\20\t\2\u00a2\u00a5\5\22\n\2\u00a3\u00a5\5\24\13\2\u00a4\u00a1"+
		"\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\17\3\2\2\2\u00a6"+
		"\u00a7\7\5\2\2\u00a7\u00a8\7\31\2\2\u00a8\u00a9\5$\23\2\u00a9\u00aa\7"+
		"\32\2\2\u00aa\21\3\2\2\2\u00ab\u00ac\7\5\2\2\u00ac\u00ad\7\31\2\2\u00ad"+
		"\u00ae\5,\27\2\u00ae\u00af\7\32\2\2\u00af\23\3\2\2\2\u00b0\u00b1\7\5\2"+
		"\2\u00b1\u00b2\7\31\2\2\u00b2\u00b3\5\26\f\2\u00b3\u00b4\7\32\2\2\u00b4"+
		"\25\3\2\2\2\u00b5\u00b6\b\f\1\2\u00b6\u00b7\5\30\r\2\u00b7\u00be\3\2\2"+
		"\2\u00b8\u00b9\f\4\2\2\u00b9\u00ba\5\34\17\2\u00ba\u00bb\5\30\r\2\u00bb"+
		"\u00bd\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\27\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2"+
		"\b\r\1\2\u00c2\u00c3\5 \21\2\u00c3\u00ca\3\2\2\2\u00c4\u00c5\f\4\2\2\u00c5"+
		"\u00c6\5\36\20\2\u00c6\u00c7\5 \21\2\u00c7\u00c9\3\2\2\2\u00c8\u00c4\3"+
		"\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\31\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\5\26\f\2\u00ce\u00cf\5\64"+
		"\33\2\u00cf\u00d0\5\32\16\2\u00d0\u00d3\3\2\2\2\u00d1\u00d3\5\26\f\2\u00d2"+
		"\u00cd\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\33\3\2\2\2\u00d4\u00d5\t\2\2"+
		"\2\u00d5\35\3\2\2\2\u00d6\u00d7\t\3\2\2\u00d7\37\3\2\2\2\u00d8\u00dc\5"+
		"$\23\2\u00d9\u00dc\5,\27\2\u00da\u00dc\5\"\22\2\u00db\u00d8\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc!\3\2\2\2\u00dd\u00de\7)\2\2\u00de"+
		"\u00df\7\21\2\2\u00df\u00e0\7\13\2\2\u00e0#\3\2\2\2\u00e1\u00e5\5&\24"+
		"\2\u00e2\u00e5\5(\25\2\u00e3\u00e5\5*\26\2\u00e4\u00e1\3\2\2\2\u00e4\u00e2"+
		"\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5%\3\2\2\2\u00e6\u00e7\7%\2\2\u00e7\'"+
		"\3\2\2\2\u00e8\u00e9\7*\2\2\u00e9)\3\2\2\2\u00ea\u00eb\7(\2\2\u00eb+\3"+
		"\2\2\2\u00ec\u00f6\7)\2\2\u00ed\u00ee\7)\2\2\u00ee\u00f1\7\r\2\2\u00ef"+
		"\u00f2\5*\26\2\u00f0\u00f2\5,\27\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\7\16\2\2\u00f4\u00f6\3\2\2\2\u00f5"+
		"\u00ec\3\2\2\2\u00f5\u00ed\3\2\2\2\u00f6-\3\2\2\2\u00f7\u00f8\7\6\2\2"+
		"\u00f8\u00f9\7)\2\2\u00f9/\3\2\2\2\u00fa\u00fb\7\6\2\2\u00fb\u00ff\5\62"+
		"\32\2\u00fc\u00fd\5T+\2\u00fd\u00fe\5\62\32\2\u00fe\u0100\3\2\2\2\u00ff"+
		"\u00fc\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\61\3\2\2\2\u0103\u0106\58\35\2\u0104\u0106\7)\2\2\u0105\u0103"+
		"\3\2\2\2\u0105\u0104\3\2\2\2\u0106\63\3\2\2\2\u0107\u0108\t\4\2\2\u0108"+
		"\65\3\2\2\2\u0109\u010a\5.\30\2\u010a\u010b\7\24\2\2\u010b\u010c\5:\36"+
		"\2\u010c\u010f\3\2\2\2\u010d\u010f\58\35\2\u010e\u0109\3\2\2\2\u010e\u010d"+
		"\3\2\2\2\u010f\67\3\2\2\2\u0110\u0111\5,\27\2\u0111\u0112\7\24\2\2\u0112"+
		"\u0113\5:\36\2\u01139\3\2\2\2\u0114\u0117\5<\37\2\u0115\u0117\5P)\2\u0116"+
		"\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117;\3\2\2\2\u0118\u011d\5\26\f\2"+
		"\u0119\u011d\5\32\16\2\u011a\u011d\5 \21\2\u011b\u011d\5^\60\2\u011c\u0118"+
		"\3\2\2\2\u011c\u0119\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d"+
		"=\3\2\2\2\u011e\u011f\7&\2\2\u011f\u0120\7\31\2\2\u0120\u0121\5@!\2\u0121"+
		"\u0122\7\32\2\2\u0122\u0124\5\n\6\2\u0123\u0125\5B\"\2\u0124\u0123\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125?\3\2\2\2\u0126\u0127\5\32\16\2\u0127A\3"+
		"\2\2\2\u0128\u0129\7\'\2\2\u0129\u012a\5\n\6\2\u012aC\3\2\2\2\u012b\u012e"+
		"\5F$\2\u012c\u012e\5J&\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e"+
		"E\3\2\2\2\u012f\u0130\7\t\2\2\u0130\u0131\7\31\2\2\u0131\u0132\5H%\2\u0132"+
		"\u0133\7\32\2\2\u0133\u0134\5\n\6\2\u0134G\3\2\2\2\u0135\u0136\5\32\16"+
		"\2\u0136I\3\2\2\2\u0137\u0138\7\b\2\2\u0138\u013a\7\31\2\2\u0139\u013b"+
		"\5\66\34\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2"+
		"\u013c\u013d\7\23\2\2\u013d\u013e\5L\'\2\u013e\u0140\7\23\2\2\u013f\u0141"+
		"\5N(\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0143\7\32\2\2\u0143\u0144\5\n\6\2\u0144K\3\2\2\2\u0145\u0146\5\32\16"+
		"\2\u0146M\3\2\2\2\u0147\u0148\5,\27\2\u0148\u0149\7\24\2\2\u0149\u014a"+
		"\5:\36\2\u014aO\3\2\2\2\u014b\u014c\7\r\2\2\u014c\u014d\5R*\2\u014d\u014e"+
		"\7\16\2\2\u014eQ\3\2\2\2\u014f\u0151\7\22\2\2\u0150\u014f\3\2\2\2\u0151"+
		"\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0156\3\2"+
		"\2\2\u0154\u0152\3\2\2\2\u0155\u0157\5V,\2\u0156\u0155\3\2\2\2\u0156\u0157"+
		"\3\2\2\2\u0157\u0160\3\2\2\2\u0158\u015a\7\22\2\2\u0159\u0158\3\2\2\2"+
		"\u015a\u015b\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d"+
		"\3\2\2\2\u015d\u015f\5V,\2\u015e\u0159\3\2\2\2\u015f\u0162\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0166\3\2\2\2\u0162\u0160\3\2"+
		"\2\2\u0163\u0165\7\22\2\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166"+
		"\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167S\3\2\2\2\u0168\u0166\3\2\2\2"+
		"\u0169\u016b\7+\2\2\u016a\u0169\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a"+
		"\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u016c\3\2\2\2\u016f"+
		"\u0173\7\22\2\2\u0170\u0172\7+\2\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2"+
		"\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174U\3\2\2\2\u0175\u0173"+
		"\3\2\2\2\u0176\u0177\5<\37\2\u0177W\3\2\2\2\u0178\u0179\7\n\2\2\u0179"+
		"\u017a\7)\2\2\u017a\u017c\7\31\2\2\u017b\u017d\5Z.\2\u017c\u017b\3\2\2"+
		"\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\7\32\2\2\u017f"+
		"\u0180\5\n\6\2\u0180Y\3\2\2\2\u0181\u0186\5\\/\2\u0182\u0183\7\22\2\2"+
		"\u0183\u0185\5\\/\2\u0184\u0182\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184"+
		"\3\2\2\2\u0186\u0187\3\2\2\2\u0187[\3\2\2\2\u0188\u0186\3\2\2\2\u0189"+
		"\u018a\7)\2\2\u018a]\3\2\2\2\u018b\u018c\7)\2\2\u018c\u018d\5`\61\2\u018d"+
		"_\3\2\2\2\u018e\u019a\7\31\2\2\u018f\u0194\5b\62\2\u0190\u0191\7\22\2"+
		"\2\u0191\u0193\5b\62\2\u0192\u0190\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192"+
		"\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0197"+
		"\u0199\7\22\2\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019b\3"+
		"\2\2\2\u019a\u018f\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\u019d\7\32\2\2\u019da\3\2\2\2\u019e\u019f\5<\37\2\u019fc\3\2\2\2(gkp"+
		"~\u0083\u008a\u0091\u0098\u009f\u00a4\u00be\u00ca\u00d2\u00db\u00e4\u00f1"+
		"\u00f5\u0101\u0105\u010e\u0116\u011c\u0124\u012d\u013a\u0140\u0152\u0156"+
		"\u015b\u0160\u0166\u016c\u0173\u017c\u0186\u0194\u0198\u019a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}