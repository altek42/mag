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
		FOR=6, WHILE=7, FUNCTION=8, LENGTH=9, OPEN_BRACKET=10, CLOSE_BRACKET=11, 
		OPEN_BRACE=12, CLOSE_BRACE=13, DOT=14, COMMA=15, SEMI_COLON=16, ASSIGN=17, 
		PLUS=18, MINUS=19, DIVIDE=20, MULTIPLY=21, OPEN_PAREN=22, CLOSE_PAREN=23, 
		LESS_THAN=24, MORE_THAN=25, LESS_THAN_EQUALS=26, GREATER_THAN_EQUALS=27, 
		EQUALS=28, NOT_EQUALS=29, IDENTITY_EQUALS=30, IDENTITY_NOT_EQUALS=31, 
		AND=32, OR=33, BOOLEAN=34, IF=35, ELSE=36, NUMBER=37, IDENTIFIER=38, STRING=39, 
		EOL=40, WHITE_SPACES=41, RETURN=42;
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
		RULE_elementList = 40, RULE_arrayElement = 41, RULE_functionDeclaration = 42, 
		RULE_formalParameterList = 43, RULE_formalParameterArg = 44, RULE_functionCall = 45, 
		RULE_arguments = 46, RULE_argument = 47;
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
			"forExpression", "arrayLiteral", "elementList", "arrayElement", "functionDeclaration", 
			"formalParameterList", "formalParameterArg", "functionCall", "arguments", 
			"argument"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'console.log'", "'var'", "'continue'", "'for'", "'while'", 
			"'function'", "'length'", "'['", "']'", "'{'", "'}'", "'.'", "','", "';'", 
			"'='", "'+'", "'-'", "'/'", "'*'", "'('", "')'", "'<'", "'>'", "'<='", 
			"'>='", "'=='", "'!='", "'==='", "'!=='", "'&&'", "'||'", null, "'if'", 
			"'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MULTI_LINE_COMMENT", "SINGLE_LINE_COMMENT", "CONSOLE_LOG", "VAR", 
			"CONTINUE", "FOR", "WHILE", "FUNCTION", "LENGTH", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"OPEN_BRACE", "CLOSE_BRACE", "DOT", "COMMA", "SEMI_COLON", "ASSIGN", 
			"PLUS", "MINUS", "DIVIDE", "MULTIPLY", "OPEN_PAREN", "CLOSE_PAREN", "LESS_THAN", 
			"MORE_THAN", "LESS_THAN_EQUALS", "GREATER_THAN_EQUALS", "EQUALS", "NOT_EQUALS", 
			"IDENTITY_EQUALS", "IDENTITY_NOT_EQUALS", "AND", "OR", "BOOLEAN", "IF", 
			"ELSE", "NUMBER", "IDENTIFIER", "STRING", "EOL", "WHITE_SPACES", "RETURN"
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
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSOLE_LOG) | (1L << VAR) | (1L << FOR) | (1L << WHILE) | (1L << FUNCTION) | (1L << IF) | (1L << IDENTIFIER) | (1L << RETURN))) != 0)) {
				{
				{
				setState(96);
				instructions();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(102);
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
			setState(106); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(105);
					instructionLine();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(108); 
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
			setState(110);
			instruction();
			setState(111);
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
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				variableDeclaratiion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				variableDeclarationList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				assignOperation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				writeStdOutput();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(117);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(118);
				loops();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(119);
				functionDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(120);
				functionCall();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(121);
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
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOL) {
				{
				{
				setState(124);
				match(EOL);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			match(OPEN_BRACE);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOL) {
				{
				{
				setState(131);
				match(EOL);
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			instructions();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOL) {
				{
				{
				setState(138);
				match(EOL);
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(CLOSE_BRACE);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(145);
					match(EOL);
					}
					} 
				}
				setState(150);
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
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(RETURN);
				setState(152);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(RETURN);
				setState(154);
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
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				writeStdOutputConstant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				writeStdOutputIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
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
			setState(162);
			match(CONSOLE_LOG);
			setState(163);
			match(OPEN_PAREN);
			setState(164);
			constantValue();
			setState(165);
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
			setState(167);
			match(CONSOLE_LOG);
			setState(168);
			match(OPEN_PAREN);
			setState(169);
			identifierValue();
			setState(170);
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
			setState(172);
			match(CONSOLE_LOG);
			setState(173);
			match(OPEN_PAREN);
			setState(174);
			arithmeticOperation(0);
			setState(175);
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
			setState(178);
			arithmeticOperationHigher(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(186);
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
					setState(180);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(181);
					arithmeticAdditiveSign();
					setState(182);
					arithmeticOperationHigher(0);
					}
					} 
				}
				setState(188);
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
			setState(190);
			value();
			}
			_ctx.stop = _input.LT(-1);
			setState(198);
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
					setState(192);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(193);
					arithmeticMultiplpicativeSign();
					setState(194);
					value();
					}
					} 
				}
				setState(200);
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
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				arithmeticOperation(0);
				setState(202);
				conditionSign();
				setState(203);
				conditionOperation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
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
			setState(208);
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
			setState(210);
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
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				constantValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				identifierValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
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
			setState(217);
			match(IDENTIFIER);
			setState(218);
			match(DOT);
			setState(219);
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
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				stringValue();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
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
			setState(226);
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
			setState(228);
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
			setState(230);
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
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(IDENTIFIER);
				setState(234);
				match(OPEN_BRACKET);
				setState(237);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					setState(235);
					numberValue();
					}
					break;
				case IDENTIFIER:
					{
					setState(236);
					identifierValue();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(239);
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
			setState(243);
			match(VAR);
			setState(244);
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
		public List<TerminalNode> COMMA() { return getTokens(JavaScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaScriptParser.COMMA, i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(VAR);
			{
			setState(247);
			variableDeclarationListElement();
			}
			setState(250); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(248);
				match(COMMA);
				setState(249);
				variableDeclarationListElement();
				}
				}
				setState(252); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
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
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				singleAssignOperation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
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
			setState(258);
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
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				variableDeclaratiion();
				setState(261);
				match(ASSIGN);
				setState(262);
				assignValue();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
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
			setState(267);
			identifierValue();
			setState(268);
			match(ASSIGN);
			setState(269);
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
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case NUMBER:
			case IDENTIFIER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				singleExpression();
				}
				break;
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
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
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				arithmeticOperation(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				conditionOperation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
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
			setState(281);
			match(IF);
			setState(282);
			match(OPEN_PAREN);
			setState(283);
			ifStatementConditionOperation();
			setState(284);
			match(CLOSE_PAREN);
			setState(285);
			instructionBlock();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(286);
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
			setState(289);
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
			setState(291);
			match(ELSE);
			setState(292);
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
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				whileLoop();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
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
			setState(298);
			match(WHILE);
			setState(299);
			match(OPEN_PAREN);
			setState(300);
			whileStatementConditionOperation();
			setState(301);
			match(CLOSE_PAREN);
			setState(302);
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
			setState(304);
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
			setState(306);
			match(FOR);
			setState(307);
			match(OPEN_PAREN);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR || _la==IDENTIFIER) {
				{
				setState(308);
				assignOperation();
				}
			}

			setState(311);
			match(SEMI_COLON);
			setState(312);
			forStatementConditionOperation();
			setState(313);
			match(SEMI_COLON);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(314);
				forExpression();
				}
			}

			setState(317);
			match(CLOSE_PAREN);
			setState(318);
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
			setState(320);
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
			setState(322);
			identifierValue();
			setState(323);
			match(ASSIGN);
			setState(324);
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
			setState(326);
			match(OPEN_BRACKET);
			setState(327);
			elementList();
			setState(328);
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
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(330);
					match(COMMA);
					}
					} 
				}
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << NUMBER) | (1L << IDENTIFIER) | (1L << STRING))) != 0)) {
				{
				setState(336);
				arrayElement();
				}
			}

			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(340); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(339);
						match(COMMA);
						}
						}
						setState(342); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA );
					setState(344);
					arrayElement();
					}
					} 
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(350);
				match(COMMA);
				}
				}
				setState(355);
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
		enterRule(_localctx, 82, RULE_arrayElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
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
		enterRule(_localctx, 84, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(FUNCTION);
			setState(359);
			match(IDENTIFIER);
			setState(360);
			match(OPEN_PAREN);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(361);
				formalParameterList();
				}
			}

			setState(364);
			match(CLOSE_PAREN);
			setState(365);
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
		enterRule(_localctx, 86, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			formalParameterArg();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(368);
				match(COMMA);
				setState(369);
				formalParameterArg();
				}
				}
				setState(374);
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
		enterRule(_localctx, 88, RULE_formalParameterArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
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
		enterRule(_localctx, 90, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(IDENTIFIER);
			setState(378);
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
		enterRule(_localctx, 92, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(OPEN_PAREN);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << NUMBER) | (1L << IDENTIFIER) | (1L << STRING))) != 0)) {
				{
				setState(381);
				argument();
				setState(386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(382);
						match(COMMA);
						setState(383);
						argument();
						}
						} 
					}
					setState(388);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(389);
					match(COMMA);
					}
				}

				}
			}

			setState(394);
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
		enterRule(_localctx, 94, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0191\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\7\2d\n\2\f\2\16\2g\13\2"+
		"\3\2\5\2j\n\2\3\3\6\3m\n\3\r\3\16\3n\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5}\n\5\3\6\7\6\u0080\n\6\f\6\16\6\u0083\13\6\3\6\3\6"+
		"\7\6\u0087\n\6\f\6\16\6\u008a\13\6\3\6\3\6\7\6\u008e\n\6\f\6\16\6\u0091"+
		"\13\6\3\6\3\6\7\6\u0095\n\6\f\6\16\6\u0098\13\6\3\7\3\7\3\7\3\7\5\7\u009e"+
		"\n\7\3\b\3\b\3\b\5\b\u00a3\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00bb\n\f\f"+
		"\f\16\f\u00be\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00c7\n\r\f\r\16\r"+
		"\u00ca\13\r\3\16\3\16\3\16\3\16\3\16\5\16\u00d1\n\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\21\5\21\u00da\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\5\23\u00e3\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u00f0\n\27\3\27\3\27\5\27\u00f4\n\27\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\6\31\u00fd\n\31\r\31\16\31\u00fe\3\32\3\32\5\32\u0103\n\32\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\5\34\u010c\n\34\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\5\36\u0114\n\36\3\37\3\37\3\37\3\37\5\37\u011a\n\37\3 \3 \3"+
		" \3 \3 \3 \5 \u0122\n \3!\3!\3\"\3\"\3\"\3#\3#\5#\u012b\n#\3$\3$\3$\3"+
		"$\3$\3$\3%\3%\3&\3&\3&\5&\u0138\n&\3&\3&\3&\3&\5&\u013e\n&\3&\3&\3&\3"+
		"\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\7*\u014e\n*\f*\16*\u0151\13*\3*\5*\u0154"+
		"\n*\3*\6*\u0157\n*\r*\16*\u0158\3*\7*\u015c\n*\f*\16*\u015f\13*\3*\7*"+
		"\u0162\n*\f*\16*\u0165\13*\3+\3+\3,\3,\3,\3,\5,\u016d\n,\3,\3,\3,\3-\3"+
		"-\3-\7-\u0175\n-\f-\16-\u0178\13-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\7"+
		"\60\u0183\n\60\f\60\16\60\u0186\13\60\3\60\5\60\u0189\n\60\5\60\u018b"+
		"\n\60\3\60\3\60\3\61\3\61\3\61\2\4\26\30\62\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`\2\5\3\2\24\25"+
		"\3\2\26\27\3\2\32!\2\u0190\2e\3\2\2\2\4l\3\2\2\2\6p\3\2\2\2\b|\3\2\2\2"+
		"\n\u0081\3\2\2\2\f\u009d\3\2\2\2\16\u00a2\3\2\2\2\20\u00a4\3\2\2\2\22"+
		"\u00a9\3\2\2\2\24\u00ae\3\2\2\2\26\u00b3\3\2\2\2\30\u00bf\3\2\2\2\32\u00d0"+
		"\3\2\2\2\34\u00d2\3\2\2\2\36\u00d4\3\2\2\2 \u00d9\3\2\2\2\"\u00db\3\2"+
		"\2\2$\u00e2\3\2\2\2&\u00e4\3\2\2\2(\u00e6\3\2\2\2*\u00e8\3\2\2\2,\u00f3"+
		"\3\2\2\2.\u00f5\3\2\2\2\60\u00f8\3\2\2\2\62\u0102\3\2\2\2\64\u0104\3\2"+
		"\2\2\66\u010b\3\2\2\28\u010d\3\2\2\2:\u0113\3\2\2\2<\u0119\3\2\2\2>\u011b"+
		"\3\2\2\2@\u0123\3\2\2\2B\u0125\3\2\2\2D\u012a\3\2\2\2F\u012c\3\2\2\2H"+
		"\u0132\3\2\2\2J\u0134\3\2\2\2L\u0142\3\2\2\2N\u0144\3\2\2\2P\u0148\3\2"+
		"\2\2R\u014f\3\2\2\2T\u0166\3\2\2\2V\u0168\3\2\2\2X\u0171\3\2\2\2Z\u0179"+
		"\3\2\2\2\\\u017b\3\2\2\2^\u017e\3\2\2\2`\u018e\3\2\2\2bd\5\4\3\2cb\3\2"+
		"\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fi\3\2\2\2ge\3\2\2\2hj\7\2\2\3ih\3\2"+
		"\2\2ij\3\2\2\2j\3\3\2\2\2km\5\6\4\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3"+
		"\2\2\2o\5\3\2\2\2pq\5\b\5\2qr\7*\2\2r\7\3\2\2\2s}\5.\30\2t}\5\60\31\2"+
		"u}\5\66\34\2v}\5\16\b\2w}\5> \2x}\5D#\2y}\5V,\2z}\5\\/\2{}\5\f\7\2|s\3"+
		"\2\2\2|t\3\2\2\2|u\3\2\2\2|v\3\2\2\2|w\3\2\2\2|x\3\2\2\2|y\3\2\2\2|z\3"+
		"\2\2\2|{\3\2\2\2}\t\3\2\2\2~\u0080\7*\2\2\177~\3\2\2\2\u0080\u0083\3\2"+
		"\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0084\u0088\7\16\2\2\u0085\u0087\7*\2\2\u0086\u0085\3\2\2\2\u0087"+
		"\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008b\u008f\5\4\3\2\u008c\u008e\7*\2\2\u008d"+
		"\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0096\7\17\2\2\u0093"+
		"\u0095\7*\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\13\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a"+
		"\7,\2\2\u009a\u009e\5 \21\2\u009b\u009c\7,\2\2\u009c\u009e\5\\/\2\u009d"+
		"\u0099\3\2\2\2\u009d\u009b\3\2\2\2\u009e\r\3\2\2\2\u009f\u00a3\5\20\t"+
		"\2\u00a0\u00a3\5\22\n\2\u00a1\u00a3\5\24\13\2\u00a2\u009f\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\17\3\2\2\2\u00a4\u00a5\7\5\2"+
		"\2\u00a5\u00a6\7\30\2\2\u00a6\u00a7\5$\23\2\u00a7\u00a8\7\31\2\2\u00a8"+
		"\21\3\2\2\2\u00a9\u00aa\7\5\2\2\u00aa\u00ab\7\30\2\2\u00ab\u00ac\5,\27"+
		"\2\u00ac\u00ad\7\31\2\2\u00ad\23\3\2\2\2\u00ae\u00af\7\5\2\2\u00af\u00b0"+
		"\7\30\2\2\u00b0\u00b1\5\26\f\2\u00b1\u00b2\7\31\2\2\u00b2\25\3\2\2\2\u00b3"+
		"\u00b4\b\f\1\2\u00b4\u00b5\5\30\r\2\u00b5\u00bc\3\2\2\2\u00b6\u00b7\f"+
		"\4\2\2\u00b7\u00b8\5\34\17\2\u00b8\u00b9\5\30\r\2\u00b9\u00bb\3\2\2\2"+
		"\u00ba\u00b6\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\27\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\b\r\1\2\u00c0"+
		"\u00c1\5 \21\2\u00c1\u00c8\3\2\2\2\u00c2\u00c3\f\4\2\2\u00c3\u00c4\5\36"+
		"\20\2\u00c4\u00c5\5 \21\2\u00c5\u00c7\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c7"+
		"\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\31\3\2\2"+
		"\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\5\26\f\2\u00cc\u00cd\5\64\33\2\u00cd"+
		"\u00ce\5\32\16\2\u00ce\u00d1\3\2\2\2\u00cf\u00d1\5\26\f\2\u00d0\u00cb"+
		"\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\33\3\2\2\2\u00d2\u00d3\t\2\2\2\u00d3"+
		"\35\3\2\2\2\u00d4\u00d5\t\3\2\2\u00d5\37\3\2\2\2\u00d6\u00da\5$\23\2\u00d7"+
		"\u00da\5,\27\2\u00d8\u00da\5\"\22\2\u00d9\u00d6\3\2\2\2\u00d9\u00d7\3"+
		"\2\2\2\u00d9\u00d8\3\2\2\2\u00da!\3\2\2\2\u00db\u00dc\7(\2\2\u00dc\u00dd"+
		"\7\20\2\2\u00dd\u00de\7\13\2\2\u00de#\3\2\2\2\u00df\u00e3\5&\24\2\u00e0"+
		"\u00e3\5(\25\2\u00e1\u00e3\5*\26\2\u00e2\u00df\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e2\u00e1\3\2\2\2\u00e3%\3\2\2\2\u00e4\u00e5\7$\2\2\u00e5\'\3\2"+
		"\2\2\u00e6\u00e7\7)\2\2\u00e7)\3\2\2\2\u00e8\u00e9\7\'\2\2\u00e9+\3\2"+
		"\2\2\u00ea\u00f4\7(\2\2\u00eb\u00ec\7(\2\2\u00ec\u00ef\7\f\2\2\u00ed\u00f0"+
		"\5*\26\2\u00ee\u00f0\5,\27\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f2\7\r\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00ea\3\2"+
		"\2\2\u00f3\u00eb\3\2\2\2\u00f4-\3\2\2\2\u00f5\u00f6\7\6\2\2\u00f6\u00f7"+
		"\7(\2\2\u00f7/\3\2\2\2\u00f8\u00f9\7\6\2\2\u00f9\u00fc\5\62\32\2\u00fa"+
		"\u00fb\7\21\2\2\u00fb\u00fd\5\62\32\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\61\3\2\2\2\u0100"+
		"\u0103\58\35\2\u0101\u0103\7(\2\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2"+
		"\2\2\u0103\63\3\2\2\2\u0104\u0105\t\4\2\2\u0105\65\3\2\2\2\u0106\u0107"+
		"\5.\30\2\u0107\u0108\7\23\2\2\u0108\u0109\5:\36\2\u0109\u010c\3\2\2\2"+
		"\u010a\u010c\58\35\2\u010b\u0106\3\2\2\2\u010b\u010a\3\2\2\2\u010c\67"+
		"\3\2\2\2\u010d\u010e\5,\27\2\u010e\u010f\7\23\2\2\u010f\u0110\5:\36\2"+
		"\u01109\3\2\2\2\u0111\u0114\5<\37\2\u0112\u0114\5P)\2\u0113\u0111\3\2"+
		"\2\2\u0113\u0112\3\2\2\2\u0114;\3\2\2\2\u0115\u011a\5\26\f\2\u0116\u011a"+
		"\5\32\16\2\u0117\u011a\5 \21\2\u0118\u011a\5\\/\2\u0119\u0115\3\2\2\2"+
		"\u0119\u0116\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a=\3"+
		"\2\2\2\u011b\u011c\7%\2\2\u011c\u011d\7\30\2\2\u011d\u011e\5@!\2\u011e"+
		"\u011f\7\31\2\2\u011f\u0121\5\n\6\2\u0120\u0122\5B\"\2\u0121\u0120\3\2"+
		"\2\2\u0121\u0122\3\2\2\2\u0122?\3\2\2\2\u0123\u0124\5\32\16\2\u0124A\3"+
		"\2\2\2\u0125\u0126\7&\2\2\u0126\u0127\5\n\6\2\u0127C\3\2\2\2\u0128\u012b"+
		"\5F$\2\u0129\u012b\5J&\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b"+
		"E\3\2\2\2\u012c\u012d\7\t\2\2\u012d\u012e\7\30\2\2\u012e\u012f\5H%\2\u012f"+
		"\u0130\7\31\2\2\u0130\u0131\5\n\6\2\u0131G\3\2\2\2\u0132\u0133\5\32\16"+
		"\2\u0133I\3\2\2\2\u0134\u0135\7\b\2\2\u0135\u0137\7\30\2\2\u0136\u0138"+
		"\5\66\34\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2"+
		"\u0139\u013a\7\22\2\2\u013a\u013b\5L\'\2\u013b\u013d\7\22\2\2\u013c\u013e"+
		"\5N(\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0140\7\31\2\2\u0140\u0141\5\n\6\2\u0141K\3\2\2\2\u0142\u0143\5\32\16"+
		"\2\u0143M\3\2\2\2\u0144\u0145\5,\27\2\u0145\u0146\7\23\2\2\u0146\u0147"+
		"\5:\36\2\u0147O\3\2\2\2\u0148\u0149\7\f\2\2\u0149\u014a\5R*\2\u014a\u014b"+
		"\7\r\2\2\u014bQ\3\2\2\2\u014c\u014e\7\21\2\2\u014d\u014c\3\2\2\2\u014e"+
		"\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0153\3\2"+
		"\2\2\u0151\u014f\3\2\2\2\u0152\u0154\5T+\2\u0153\u0152\3\2\2\2\u0153\u0154"+
		"\3\2\2\2\u0154\u015d\3\2\2\2\u0155\u0157\7\21\2\2\u0156\u0155\3\2\2\2"+
		"\u0157\u0158\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a"+
		"\3\2\2\2\u015a\u015c\5T+\2\u015b\u0156\3\2\2\2\u015c\u015f\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0163\3\2\2\2\u015f\u015d\3\2"+
		"\2\2\u0160\u0162\7\21\2\2\u0161\u0160\3\2\2\2\u0162\u0165\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164S\3\2\2\2\u0165\u0163\3\2\2\2"+
		"\u0166\u0167\5<\37\2\u0167U\3\2\2\2\u0168\u0169\7\n\2\2\u0169\u016a\7"+
		"(\2\2\u016a\u016c\7\30\2\2\u016b\u016d\5X-\2\u016c\u016b\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\7\31\2\2\u016f\u0170\5"+
		"\n\6\2\u0170W\3\2\2\2\u0171\u0176\5Z.\2\u0172\u0173\7\21\2\2\u0173\u0175"+
		"\5Z.\2\u0174\u0172\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177Y\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017a\7(\2\2\u017a"+
		"[\3\2\2\2\u017b\u017c\7(\2\2\u017c\u017d\5^\60\2\u017d]\3\2\2\2\u017e"+
		"\u018a\7\30\2\2\u017f\u0184\5`\61\2\u0180\u0181\7\21\2\2\u0181\u0183\5"+
		"`\61\2\u0182\u0180\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0189\7\21"+
		"\2\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a"+
		"\u017f\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\7\31"+
		"\2\2\u018d_\3\2\2\2\u018e\u018f\5<\37\2\u018fa\3\2\2\2&ein|\u0081\u0088"+
		"\u008f\u0096\u009d\u00a2\u00bc\u00c8\u00d0\u00d9\u00e2\u00ef\u00f3\u00fe"+
		"\u0102\u010b\u0113\u0119\u0121\u012a\u0137\u013d\u014f\u0153\u0158\u015d"+
		"\u0163\u016c\u0176\u0184\u0188\u018a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}