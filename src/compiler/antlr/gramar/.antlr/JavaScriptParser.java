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
		EOL=40, WHITE_SPACES=41;
	public static final int
		RULE_parse = 0, RULE_instructions = 1, RULE_instructionLine = 2, RULE_instruction = 3, 
		RULE_instructionBlock = 4, RULE_writeStdOutput = 5, RULE_writeStdOutputConstant = 6, 
		RULE_writeStdOutputIdentifier = 7, RULE_writeStdOutputArithmeticOperation = 8, 
		RULE_arithmeticOperation = 9, RULE_arithmeticOperationHigher = 10, RULE_conditionOperation = 11, 
		RULE_arithmeticAdditiveSign = 12, RULE_arithmeticMultiplpicativeSign = 13, 
		RULE_value = 14, RULE_arrayLength = 15, RULE_constantValue = 16, RULE_booleanValue = 17, 
		RULE_stringValue = 18, RULE_numberValue = 19, RULE_identifierValue = 20, 
		RULE_variableDeclaratiion = 21, RULE_variableDeclarationList = 22, RULE_variableDeclarationListElement = 23, 
		RULE_conditionSign = 24, RULE_assignOperation = 25, RULE_singleAssignOperation = 26, 
		RULE_assignValue = 27, RULE_singleExpression = 28, RULE_ifStatement = 29, 
		RULE_ifStatementConditionOperation = 30, RULE_elseStatement = 31, RULE_loops = 32, 
		RULE_whileLoop = 33, RULE_whileStatementConditionOperation = 34, RULE_forLoop = 35, 
		RULE_forStatementConditionOperation = 36, RULE_forExpression = 37, RULE_arrayLiteral = 38, 
		RULE_elementList = 39, RULE_arrayElement = 40, RULE_functionDeclaration = 41, 
		RULE_formalParameterList = 42, RULE_formalParameterArg = 43, RULE_functionCall = 44, 
		RULE_arguments = 45, RULE_argument = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "instructions", "instructionLine", "instruction", "instructionBlock", 
			"writeStdOutput", "writeStdOutputConstant", "writeStdOutputIdentifier", 
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
			"ELSE", "NUMBER", "IDENTIFIER", "STRING", "EOL", "WHITE_SPACES"
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
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSOLE_LOG) | (1L << VAR) | (1L << FOR) | (1L << WHILE) | (1L << FUNCTION) | (1L << IF) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(94);
				instructions();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(100);
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
			setState(104); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(103);
					instructionLine();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(106); 
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
			setState(108);
			instruction();
			setState(109);
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
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruction);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				variableDeclaratiion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				variableDeclarationList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				assignOperation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				writeStdOutput();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(116);
				loops();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(117);
				functionDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(118);
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
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOL) {
				{
				{
				setState(121);
				match(EOL);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(OPEN_BRACE);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOL) {
				{
				{
				setState(128);
				match(EOL);
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			instructions();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOL) {
				{
				{
				setState(135);
				match(EOL);
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			match(CLOSE_BRACE);
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(142);
					match(EOL);
					}
					} 
				}
				setState(147);
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
		enterRule(_localctx, 10, RULE_writeStdOutput);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				writeStdOutputConstant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				writeStdOutputIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
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
		enterRule(_localctx, 12, RULE_writeStdOutputConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(CONSOLE_LOG);
			setState(154);
			match(OPEN_PAREN);
			setState(155);
			constantValue();
			setState(156);
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
		enterRule(_localctx, 14, RULE_writeStdOutputIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(CONSOLE_LOG);
			setState(159);
			match(OPEN_PAREN);
			setState(160);
			identifierValue();
			setState(161);
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
		enterRule(_localctx, 16, RULE_writeStdOutputArithmeticOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(CONSOLE_LOG);
			setState(164);
			match(OPEN_PAREN);
			setState(165);
			arithmeticOperation(0);
			setState(166);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_arithmeticOperation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(169);
			arithmeticOperationHigher(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticOperationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOperation);
					setState(171);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(172);
					arithmeticAdditiveSign();
					setState(173);
					arithmeticOperationHigher(0);
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_arithmeticOperationHigher, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(181);
			value();
			}
			_ctx.stop = _input.LT(-1);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticOperationHigherContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOperationHigher);
					setState(183);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(184);
					arithmeticMultiplpicativeSign();
					setState(185);
					value();
					}
					} 
				}
				setState(191);
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
		enterRule(_localctx, 22, RULE_conditionOperation);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				arithmeticOperation(0);
				setState(193);
				conditionSign();
				setState(194);
				conditionOperation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
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
		enterRule(_localctx, 24, RULE_arithmeticAdditiveSign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
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
		enterRule(_localctx, 26, RULE_arithmeticMultiplpicativeSign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
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
		enterRule(_localctx, 28, RULE_value);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				constantValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				identifierValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
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
		enterRule(_localctx, 30, RULE_arrayLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(IDENTIFIER);
			setState(209);
			match(DOT);
			setState(210);
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
		enterRule(_localctx, 32, RULE_constantValue);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				stringValue();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
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
		enterRule(_localctx, 34, RULE_booleanValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
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
		enterRule(_localctx, 36, RULE_stringValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
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
		enterRule(_localctx, 38, RULE_numberValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
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
		enterRule(_localctx, 40, RULE_identifierValue);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(IDENTIFIER);
				setState(225);
				match(OPEN_BRACKET);
				setState(228);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					setState(226);
					numberValue();
					}
					break;
				case IDENTIFIER:
					{
					setState(227);
					identifierValue();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(230);
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
		enterRule(_localctx, 42, RULE_variableDeclaratiion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(VAR);
			setState(235);
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
		enterRule(_localctx, 44, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(VAR);
			{
			setState(238);
			variableDeclarationListElement();
			}
			setState(241); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(239);
				match(COMMA);
				setState(240);
				variableDeclarationListElement();
				}
				}
				setState(243); 
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
		enterRule(_localctx, 46, RULE_variableDeclarationListElement);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				singleAssignOperation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
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
		enterRule(_localctx, 48, RULE_conditionSign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
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
		enterRule(_localctx, 50, RULE_assignOperation);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				variableDeclaratiion();
				setState(252);
				match(ASSIGN);
				setState(253);
				assignValue();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
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
		enterRule(_localctx, 52, RULE_singleAssignOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			identifierValue();
			setState(259);
			match(ASSIGN);
			setState(260);
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
		enterRule(_localctx, 54, RULE_assignValue);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case NUMBER:
			case IDENTIFIER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				singleExpression();
				}
				break;
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
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
		enterRule(_localctx, 56, RULE_singleExpression);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				arithmeticOperation(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				conditionOperation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
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
		enterRule(_localctx, 58, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(IF);
			setState(273);
			match(OPEN_PAREN);
			setState(274);
			ifStatementConditionOperation();
			setState(275);
			match(CLOSE_PAREN);
			setState(276);
			instructionBlock();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(277);
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
		enterRule(_localctx, 60, RULE_ifStatementConditionOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
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
		enterRule(_localctx, 62, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(ELSE);
			setState(283);
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
		enterRule(_localctx, 64, RULE_loops);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				whileLoop();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
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
		enterRule(_localctx, 66, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(WHILE);
			setState(290);
			match(OPEN_PAREN);
			setState(291);
			whileStatementConditionOperation();
			setState(292);
			match(CLOSE_PAREN);
			setState(293);
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
		enterRule(_localctx, 68, RULE_whileStatementConditionOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
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
		enterRule(_localctx, 70, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(FOR);
			setState(298);
			match(OPEN_PAREN);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR || _la==IDENTIFIER) {
				{
				setState(299);
				assignOperation();
				}
			}

			setState(302);
			match(SEMI_COLON);
			setState(303);
			forStatementConditionOperation();
			setState(304);
			match(SEMI_COLON);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(305);
				forExpression();
				}
			}

			setState(308);
			match(CLOSE_PAREN);
			setState(309);
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
		enterRule(_localctx, 72, RULE_forStatementConditionOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
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
		enterRule(_localctx, 74, RULE_forExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			identifierValue();
			setState(314);
			match(ASSIGN);
			setState(315);
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
		enterRule(_localctx, 76, RULE_arrayLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(317);
			match(OPEN_BRACKET);
			setState(318);
			elementList();
			setState(319);
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
		enterRule(_localctx, 78, RULE_elementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(321);
					match(COMMA);
					}
					} 
				}
				setState(326);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << NUMBER) | (1L << IDENTIFIER) | (1L << STRING))) != 0)) {
				{
				setState(327);
				arrayElement();
				}
			}

			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(331); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(330);
						match(COMMA);
						}
						}
						setState(333); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA );
					setState(335);
					arrayElement();
					}
					} 
				}
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(341);
				match(COMMA);
				}
				}
				setState(346);
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
		enterRule(_localctx, 80, RULE_arrayElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
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
		enterRule(_localctx, 82, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(FUNCTION);
			setState(350);
			match(IDENTIFIER);
			setState(351);
			match(OPEN_PAREN);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(352);
				formalParameterList();
				}
			}

			setState(355);
			match(CLOSE_PAREN);
			setState(356);
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
		enterRule(_localctx, 84, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			formalParameterArg();
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(359);
				match(COMMA);
				setState(360);
				formalParameterArg();
				}
				}
				setState(365);
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
		enterRule(_localctx, 86, RULE_formalParameterArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
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
		enterRule(_localctx, 88, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(IDENTIFIER);
			setState(369);
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
		enterRule(_localctx, 90, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(OPEN_PAREN);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << NUMBER) | (1L << IDENTIFIER) | (1L << STRING))) != 0)) {
				{
				setState(372);
				argument();
				setState(377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(373);
						match(COMMA);
						setState(374);
						argument();
						}
						} 
					}
					setState(379);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(380);
					match(COMMA);
					}
				}

				}
			}

			setState(385);
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
		enterRule(_localctx, 92, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
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
		case 9:
			return arithmeticOperation_sempred((ArithmeticOperationContext)_localctx, predIndex);
		case 10:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0188\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\7\2b\n\2\f\2\16\2e\13\2\3\2\5\2h"+
		"\n\2\3\3\6\3k\n\3\r\3\16\3l\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5z\n\5\3\6\7\6}\n\6\f\6\16\6\u0080\13\6\3\6\3\6\7\6\u0084\n\6\f\6"+
		"\16\6\u0087\13\6\3\6\3\6\7\6\u008b\n\6\f\6\16\6\u008e\13\6\3\6\3\6\7\6"+
		"\u0092\n\6\f\6\16\6\u0095\13\6\3\7\3\7\3\7\5\7\u009a\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\7\13\u00b2\n\13\f\13\16\13\u00b5\13\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\7\f\u00be\n\f\f\f\16\f\u00c1\13\f\3\r\3\r\3\r\3\r\3\r\5\r\u00c8"+
		"\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\5\20\u00d1\n\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\5\22\u00da\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u00e7\n\26\3\26\3\26\5\26\u00eb\n\26\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\6\30\u00f4\n\30\r\30\16\30\u00f5\3\31\3\31"+
		"\5\31\u00fa\n\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5\33\u0103\n\33\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\5\35\u010b\n\35\3\36\3\36\3\36\3\36\5\36"+
		"\u0111\n\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0119\n\37\3 \3 \3!\3!"+
		"\3!\3\"\3\"\5\"\u0122\n\"\3#\3#\3#\3#\3#\3#\3$\3$\3%\3%\3%\5%\u012f\n"+
		"%\3%\3%\3%\3%\5%\u0135\n%\3%\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3"+
		")\7)\u0145\n)\f)\16)\u0148\13)\3)\5)\u014b\n)\3)\6)\u014e\n)\r)\16)\u014f"+
		"\3)\7)\u0153\n)\f)\16)\u0156\13)\3)\7)\u0159\n)\f)\16)\u015c\13)\3*\3"+
		"*\3+\3+\3+\3+\5+\u0164\n+\3+\3+\3+\3,\3,\3,\7,\u016c\n,\f,\16,\u016f\13"+
		",\3-\3-\3.\3.\3.\3/\3/\3/\3/\7/\u017a\n/\f/\16/\u017d\13/\3/\5/\u0180"+
		"\n/\5/\u0182\n/\3/\3/\3\60\3\60\3\60\2\4\24\26\61\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^\2\5\3\2\24"+
		"\25\3\2\26\27\3\2\32!\2\u0186\2c\3\2\2\2\4j\3\2\2\2\6n\3\2\2\2\by\3\2"+
		"\2\2\n~\3\2\2\2\f\u0099\3\2\2\2\16\u009b\3\2\2\2\20\u00a0\3\2\2\2\22\u00a5"+
		"\3\2\2\2\24\u00aa\3\2\2\2\26\u00b6\3\2\2\2\30\u00c7\3\2\2\2\32\u00c9\3"+
		"\2\2\2\34\u00cb\3\2\2\2\36\u00d0\3\2\2\2 \u00d2\3\2\2\2\"\u00d9\3\2\2"+
		"\2$\u00db\3\2\2\2&\u00dd\3\2\2\2(\u00df\3\2\2\2*\u00ea\3\2\2\2,\u00ec"+
		"\3\2\2\2.\u00ef\3\2\2\2\60\u00f9\3\2\2\2\62\u00fb\3\2\2\2\64\u0102\3\2"+
		"\2\2\66\u0104\3\2\2\28\u010a\3\2\2\2:\u0110\3\2\2\2<\u0112\3\2\2\2>\u011a"+
		"\3\2\2\2@\u011c\3\2\2\2B\u0121\3\2\2\2D\u0123\3\2\2\2F\u0129\3\2\2\2H"+
		"\u012b\3\2\2\2J\u0139\3\2\2\2L\u013b\3\2\2\2N\u013f\3\2\2\2P\u0146\3\2"+
		"\2\2R\u015d\3\2\2\2T\u015f\3\2\2\2V\u0168\3\2\2\2X\u0170\3\2\2\2Z\u0172"+
		"\3\2\2\2\\\u0175\3\2\2\2^\u0185\3\2\2\2`b\5\4\3\2a`\3\2\2\2be\3\2\2\2"+
		"ca\3\2\2\2cd\3\2\2\2dg\3\2\2\2ec\3\2\2\2fh\7\2\2\3gf\3\2\2\2gh\3\2\2\2"+
		"h\3\3\2\2\2ik\5\6\4\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\5\3\2\2"+
		"\2no\5\b\5\2op\7*\2\2p\7\3\2\2\2qz\5,\27\2rz\5.\30\2sz\5\64\33\2tz\5\f"+
		"\7\2uz\5<\37\2vz\5B\"\2wz\5T+\2xz\5Z.\2yq\3\2\2\2yr\3\2\2\2ys\3\2\2\2"+
		"yt\3\2\2\2yu\3\2\2\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2\2z\t\3\2\2\2{}\7*\2\2"+
		"|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080"+
		"~\3\2\2\2\u0081\u0085\7\16\2\2\u0082\u0084\7*\2\2\u0083\u0082\3\2\2\2"+
		"\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008c\5\4\3\2\u0089\u008b\7*\2\2\u008a"+
		"\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0093\7\17\2\2\u0090"+
		"\u0092\7*\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\13\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u009a"+
		"\5\16\b\2\u0097\u009a\5\20\t\2\u0098\u009a\5\22\n\2\u0099\u0096\3\2\2"+
		"\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\r\3\2\2\2\u009b\u009c"+
		"\7\5\2\2\u009c\u009d\7\30\2\2\u009d\u009e\5\"\22\2\u009e\u009f\7\31\2"+
		"\2\u009f\17\3\2\2\2\u00a0\u00a1\7\5\2\2\u00a1\u00a2\7\30\2\2\u00a2\u00a3"+
		"\5*\26\2\u00a3\u00a4\7\31\2\2\u00a4\21\3\2\2\2\u00a5\u00a6\7\5\2\2\u00a6"+
		"\u00a7\7\30\2\2\u00a7\u00a8\5\24\13\2\u00a8\u00a9\7\31\2\2\u00a9\23\3"+
		"\2\2\2\u00aa\u00ab\b\13\1\2\u00ab\u00ac\5\26\f\2\u00ac\u00b3\3\2\2\2\u00ad"+
		"\u00ae\f\4\2\2\u00ae\u00af\5\32\16\2\u00af\u00b0\5\26\f\2\u00b0\u00b2"+
		"\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\25\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\b\f\1"+
		"\2\u00b7\u00b8\5\36\20\2\u00b8\u00bf\3\2\2\2\u00b9\u00ba\f\4\2\2\u00ba"+
		"\u00bb\5\34\17\2\u00bb\u00bc\5\36\20\2\u00bc\u00be\3\2\2\2\u00bd\u00b9"+
		"\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\27\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\5\24\13\2\u00c3\u00c4\5\62"+
		"\32\2\u00c4\u00c5\5\30\r\2\u00c5\u00c8\3\2\2\2\u00c6\u00c8\5\24\13\2\u00c7"+
		"\u00c2\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\31\3\2\2\2\u00c9\u00ca\t\2\2"+
		"\2\u00ca\33\3\2\2\2\u00cb\u00cc\t\3\2\2\u00cc\35\3\2\2\2\u00cd\u00d1\5"+
		"\"\22\2\u00ce\u00d1\5*\26\2\u00cf\u00d1\5 \21\2\u00d0\u00cd\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\37\3\2\2\2\u00d2\u00d3\7(\2\2"+
		"\u00d3\u00d4\7\20\2\2\u00d4\u00d5\7\13\2\2\u00d5!\3\2\2\2\u00d6\u00da"+
		"\5$\23\2\u00d7\u00da\5&\24\2\u00d8\u00da\5(\25\2\u00d9\u00d6\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da#\3\2\2\2\u00db\u00dc\7$\2\2\u00dc"+
		"%\3\2\2\2\u00dd\u00de\7)\2\2\u00de\'\3\2\2\2\u00df\u00e0\7\'\2\2\u00e0"+
		")\3\2\2\2\u00e1\u00eb\7(\2\2\u00e2\u00e3\7(\2\2\u00e3\u00e6\7\f\2\2\u00e4"+
		"\u00e7\5(\25\2\u00e5\u00e7\5*\26\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7\r\2\2\u00e9\u00eb\3\2\2\2\u00ea"+
		"\u00e1\3\2\2\2\u00ea\u00e2\3\2\2\2\u00eb+\3\2\2\2\u00ec\u00ed\7\6\2\2"+
		"\u00ed\u00ee\7(\2\2\u00ee-\3\2\2\2\u00ef\u00f0\7\6\2\2\u00f0\u00f3\5\60"+
		"\31\2\u00f1\u00f2\7\21\2\2\u00f2\u00f4\5\60\31\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6/\3\2\2\2"+
		"\u00f7\u00fa\5\66\34\2\u00f8\u00fa\7(\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8"+
		"\3\2\2\2\u00fa\61\3\2\2\2\u00fb\u00fc\t\4\2\2\u00fc\63\3\2\2\2\u00fd\u00fe"+
		"\5,\27\2\u00fe\u00ff\7\23\2\2\u00ff\u0100\58\35\2\u0100\u0103\3\2\2\2"+
		"\u0101\u0103\5\66\34\2\u0102\u00fd\3\2\2\2\u0102\u0101\3\2\2\2\u0103\65"+
		"\3\2\2\2\u0104\u0105\5*\26\2\u0105\u0106\7\23\2\2\u0106\u0107\58\35\2"+
		"\u0107\67\3\2\2\2\u0108\u010b\5:\36\2\u0109\u010b\5N(\2\u010a\u0108\3"+
		"\2\2\2\u010a\u0109\3\2\2\2\u010b9\3\2\2\2\u010c\u0111\5\24\13\2\u010d"+
		"\u0111\5\30\r\2\u010e\u0111\5\36\20\2\u010f\u0111\5Z.\2\u0110\u010c\3"+
		"\2\2\2\u0110\u010d\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111"+
		";\3\2\2\2\u0112\u0113\7%\2\2\u0113\u0114\7\30\2\2\u0114\u0115\5> \2\u0115"+
		"\u0116\7\31\2\2\u0116\u0118\5\n\6\2\u0117\u0119\5@!\2\u0118\u0117\3\2"+
		"\2\2\u0118\u0119\3\2\2\2\u0119=\3\2\2\2\u011a\u011b\5\30\r\2\u011b?\3"+
		"\2\2\2\u011c\u011d\7&\2\2\u011d\u011e\5\n\6\2\u011eA\3\2\2\2\u011f\u0122"+
		"\5D#\2\u0120\u0122\5H%\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122"+
		"C\3\2\2\2\u0123\u0124\7\t\2\2\u0124\u0125\7\30\2\2\u0125\u0126\5F$\2\u0126"+
		"\u0127\7\31\2\2\u0127\u0128\5\n\6\2\u0128E\3\2\2\2\u0129\u012a\5\30\r"+
		"\2\u012aG\3\2\2\2\u012b\u012c\7\b\2\2\u012c\u012e\7\30\2\2\u012d\u012f"+
		"\5\64\33\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2"+
		"\u0130\u0131\7\22\2\2\u0131\u0132\5J&\2\u0132\u0134\7\22\2\2\u0133\u0135"+
		"\5L\'\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0137\7\31\2\2\u0137\u0138\5\n\6\2\u0138I\3\2\2\2\u0139\u013a\5\30\r"+
		"\2\u013aK\3\2\2\2\u013b\u013c\5*\26\2\u013c\u013d\7\23\2\2\u013d\u013e"+
		"\58\35\2\u013eM\3\2\2\2\u013f\u0140\7\f\2\2\u0140\u0141\5P)\2\u0141\u0142"+
		"\7\r\2\2\u0142O\3\2\2\2\u0143\u0145\7\21\2\2\u0144\u0143\3\2\2\2\u0145"+
		"\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u014a\3\2"+
		"\2\2\u0148\u0146\3\2\2\2\u0149\u014b\5R*\2\u014a\u0149\3\2\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\u0154\3\2\2\2\u014c\u014e\7\21\2\2\u014d\u014c\3\2\2\2"+
		"\u014e\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151"+
		"\3\2\2\2\u0151\u0153\5R*\2\u0152\u014d\3\2\2\2\u0153\u0156\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u015a\3\2\2\2\u0156\u0154\3\2"+
		"\2\2\u0157\u0159\7\21\2\2\u0158\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a"+
		"\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015bQ\3\2\2\2\u015c\u015a\3\2\2\2"+
		"\u015d\u015e\5:\36\2\u015eS\3\2\2\2\u015f\u0160\7\n\2\2\u0160\u0161\7"+
		"(\2\2\u0161\u0163\7\30\2\2\u0162\u0164\5V,\2\u0163\u0162\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\7\31\2\2\u0166\u0167\5"+
		"\n\6\2\u0167U\3\2\2\2\u0168\u016d\5X-\2\u0169\u016a\7\21\2\2\u016a\u016c"+
		"\5X-\2\u016b\u0169\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016eW\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7(\2\2\u0171"+
		"Y\3\2\2\2\u0172\u0173\7(\2\2\u0173\u0174\5\\/\2\u0174[\3\2\2\2\u0175\u0181"+
		"\7\30\2\2\u0176\u017b\5^\60\2\u0177\u0178\7\21\2\2\u0178\u017a\5^\60\2"+
		"\u0179\u0177\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c"+
		"\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u0180\7\21\2\2"+
		"\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u0176"+
		"\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\7\31\2\2"+
		"\u0184]\3\2\2\2\u0185\u0186\5:\36\2\u0186_\3\2\2\2%cgly~\u0085\u008c\u0093"+
		"\u0099\u00b3\u00bf\u00c7\u00d0\u00d9\u00e6\u00ea\u00f5\u00f9\u0102\u010a"+
		"\u0110\u0118\u0121\u012e\u0134\u0146\u014a\u014f\u0154\u015a\u0163\u016d"+
		"\u017b\u017f\u0181";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}