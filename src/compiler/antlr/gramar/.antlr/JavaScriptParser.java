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
		PLUS_PLUS=19, PLUS=20, MINUS=21, DIVIDE=22, MULTIPLY=23, OPEN_PAREN=24, 
		CLOSE_PAREN=25, LESS_THAN=26, MORE_THAN=27, LESS_THAN_EQUALS=28, GREATER_THAN_EQUALS=29, 
		EQUALS=30, NOT_EQUALS=31, IDENTITY_EQUALS=32, IDENTITY_NOT_EQUALS=33, 
		AND=34, OR=35, BOOLEAN=36, IF=37, ELSE=38, NUMBER=39, IDENTIFIER=40, STRING=41, 
		EOL=42, WHITE_SPACES=43;
	public static final int
		RULE_parse = 0, RULE_instructions = 1, RULE_instructionLine = 2, RULE_instruction = 3, 
		RULE_instructionBlock = 4, RULE_returnStatement = 5, RULE_writeStdOutput = 6, 
		RULE_writeStdOutputConstant = 7, RULE_writeStdOutputIdentifier = 8, RULE_writeStdOutputArithmeticOperation = 9, 
		RULE_writeStdOutputFunctionCall = 10, RULE_arithmeticOperation = 11, RULE_arithmeticOperationHigher = 12, 
		RULE_conditionOperation = 13, RULE_arithmeticAdditiveSign = 14, RULE_arithmeticMultiplpicativeSign = 15, 
		RULE_value = 16, RULE_arrayLength = 17, RULE_constantValue = 18, RULE_booleanValue = 19, 
		RULE_stringValue = 20, RULE_numberValue = 21, RULE_identifierValue = 22, 
		RULE_variableDeclaratiion = 23, RULE_variableDeclarationList = 24, RULE_variableDeclarationListElement = 25, 
		RULE_conditionSign = 26, RULE_assignOperation = 27, RULE_singleAssignOperation = 28, 
		RULE_assignValue = 29, RULE_singleExpression = 30, RULE_ifStatement = 31, 
		RULE_ifStatementConditionOperation = 32, RULE_elseStatement = 33, RULE_loops = 34, 
		RULE_whileLoop = 35, RULE_whileStatementConditionOperation = 36, RULE_forLoop = 37, 
		RULE_forAssignSection = 38, RULE_forStatementConditionOperation = 39, 
		RULE_forExpression = 40, RULE_forExpressionAssign = 41, RULE_arrayLiteral = 42, 
		RULE_elementList = 43, RULE_commaSeparator = 44, RULE_arrayElement = 45, 
		RULE_functionDeclaration = 46, RULE_formalParameterList = 47, RULE_formalParameterArg = 48, 
		RULE_functionCall = 49, RULE_arguments = 50, RULE_argument = 51, RULE_incrementVariable = 52;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "instructions", "instructionLine", "instruction", "instructionBlock", 
			"returnStatement", "writeStdOutput", "writeStdOutputConstant", "writeStdOutputIdentifier", 
			"writeStdOutputArithmeticOperation", "writeStdOutputFunctionCall", "arithmeticOperation", 
			"arithmeticOperationHigher", "conditionOperation", "arithmeticAdditiveSign", 
			"arithmeticMultiplpicativeSign", "value", "arrayLength", "constantValue", 
			"booleanValue", "stringValue", "numberValue", "identifierValue", "variableDeclaratiion", 
			"variableDeclarationList", "variableDeclarationListElement", "conditionSign", 
			"assignOperation", "singleAssignOperation", "assignValue", "singleExpression", 
			"ifStatement", "ifStatementConditionOperation", "elseStatement", "loops", 
			"whileLoop", "whileStatementConditionOperation", "forLoop", "forAssignSection", 
			"forStatementConditionOperation", "forExpression", "forExpressionAssign", 
			"arrayLiteral", "elementList", "commaSeparator", "arrayElement", "functionDeclaration", 
			"formalParameterList", "formalParameterArg", "functionCall", "arguments", 
			"argument", "incrementVariable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'console.log'", "'var'", "'continue'", "'for'", "'while'", 
			"'function'", "'length'", "'return'", "'['", "']'", "'{'", "'}'", "'.'", 
			"','", "';'", "'='", "'++'", "'+'", "'-'", "'/'", "'*'", "'('", "')'", 
			"'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'==='", "'!=='", "'&&'", 
			"'||'", null, "'if'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MULTI_LINE_COMMENT", "SINGLE_LINE_COMMENT", "CONSOLE_LOG", "VAR", 
			"CONTINUE", "FOR", "WHILE", "FUNCTION", "LENGTH", "RETURN", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "OPEN_BRACE", "CLOSE_BRACE", "DOT", "COMMA", "SEMI_COLON", 
			"ASSIGN", "PLUS_PLUS", "PLUS", "MINUS", "DIVIDE", "MULTIPLY", "OPEN_PAREN", 
			"CLOSE_PAREN", "LESS_THAN", "MORE_THAN", "LESS_THAN_EQUALS", "GREATER_THAN_EQUALS", 
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
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSOLE_LOG) | (1L << VAR) | (1L << FOR) | (1L << WHILE) | (1L << FUNCTION) | (1L << RETURN) | (1L << IF) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(106);
				instructions();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(112);
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
			setState(116); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(115);
					instructionLine();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(118); 
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
			setState(120);
			instruction();
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(121);
				match(EOL);
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
		public IncrementVariableContext incrementVariable() {
			return getRuleContext(IncrementVariableContext.class,0);
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
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				variableDeclaratiion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				variableDeclarationList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				assignOperation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				writeStdOutput();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(129);
				loops();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(130);
				functionDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(131);
				functionCall();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(132);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(133);
				incrementVariable();
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
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOL) {
				{
				{
				setState(136);
				match(EOL);
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			match(OPEN_BRACE);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOL) {
				{
				{
				setState(143);
				match(EOL);
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			instructions();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOL) {
				{
				{
				setState(150);
				match(EOL);
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			match(CLOSE_BRACE);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(157);
					match(EOL);
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(RETURN);
				setState(164);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(RETURN);
				setState(166);
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
		public WriteStdOutputFunctionCallContext writeStdOutputFunctionCall() {
			return getRuleContext(WriteStdOutputFunctionCallContext.class,0);
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
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				writeStdOutputConstant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				writeStdOutputIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				writeStdOutputArithmeticOperation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				writeStdOutputFunctionCall();
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
			setState(175);
			match(CONSOLE_LOG);
			setState(176);
			match(OPEN_PAREN);
			setState(177);
			constantValue();
			setState(178);
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
			setState(180);
			match(CONSOLE_LOG);
			setState(181);
			match(OPEN_PAREN);
			setState(182);
			identifierValue();
			setState(183);
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
			setState(185);
			match(CONSOLE_LOG);
			setState(186);
			match(OPEN_PAREN);
			setState(187);
			arithmeticOperation(0);
			setState(188);
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

	public static class WriteStdOutputFunctionCallContext extends ParserRuleContext {
		public TerminalNode CONSOLE_LOG() { return getToken(JavaScriptParser.CONSOLE_LOG, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(JavaScriptParser.OPEN_PAREN, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(JavaScriptParser.CLOSE_PAREN, 0); }
		public WriteStdOutputFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStdOutputFunctionCall; }
	}

	public final WriteStdOutputFunctionCallContext writeStdOutputFunctionCall() throws RecognitionException {
		WriteStdOutputFunctionCallContext _localctx = new WriteStdOutputFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_writeStdOutputFunctionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(CONSOLE_LOG);
			setState(191);
			match(OPEN_PAREN);
			setState(192);
			functionCall();
			setState(193);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_arithmeticOperation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(196);
			arithmeticOperationHigher(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticOperationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOperation);
					setState(198);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(199);
					arithmeticAdditiveSign();
					setState(200);
					arithmeticOperationHigher(0);
					}
					} 
				}
				setState(206);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_arithmeticOperationHigher, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(208);
			value();
			}
			_ctx.stop = _input.LT(-1);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticOperationHigherContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOperationHigher);
					setState(210);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(211);
					arithmeticMultiplpicativeSign();
					setState(212);
					value();
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 26, RULE_conditionOperation);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				arithmeticOperation(0);
				setState(220);
				conditionSign();
				setState(221);
				conditionOperation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
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
		enterRule(_localctx, 28, RULE_arithmeticAdditiveSign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
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
		enterRule(_localctx, 30, RULE_arithmeticMultiplpicativeSign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
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
		enterRule(_localctx, 32, RULE_value);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				constantValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				identifierValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
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
		enterRule(_localctx, 34, RULE_arrayLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(IDENTIFIER);
			setState(236);
			match(DOT);
			setState(237);
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
		enterRule(_localctx, 36, RULE_constantValue);
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				stringValue();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
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
		enterRule(_localctx, 38, RULE_booleanValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
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
		enterRule(_localctx, 40, RULE_stringValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
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
		enterRule(_localctx, 42, RULE_numberValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
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
		public ArithmeticOperationContext arithmeticOperation() {
			return getRuleContext(ArithmeticOperationContext.class,0);
		}
		public IdentifierValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierValue; }
	}

	public final IdentifierValueContext identifierValue() throws RecognitionException {
		IdentifierValueContext _localctx = new IdentifierValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_identifierValue);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(IDENTIFIER);
				setState(252);
				match(OPEN_BRACKET);
				setState(256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(253);
					numberValue();
					}
					break;
				case 2:
					{
					setState(254);
					identifierValue();
					}
					break;
				case 3:
					{
					setState(255);
					arithmeticOperation(0);
					}
					break;
				}
				setState(258);
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
		enterRule(_localctx, 46, RULE_variableDeclaratiion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(VAR);
			setState(263);
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
		enterRule(_localctx, 48, RULE_variableDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(VAR);
			setState(266);
			variableDeclarationListElement();
			setState(270); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(267);
					commaSeparator();
					setState(268);
					variableDeclarationListElement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(272); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		enterRule(_localctx, 50, RULE_variableDeclarationListElement);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				singleAssignOperation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
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
		enterRule(_localctx, 52, RULE_conditionSign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
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
		enterRule(_localctx, 54, RULE_assignOperation);
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				variableDeclaratiion();
				setState(281);
				match(ASSIGN);
				setState(282);
				assignValue();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
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
		enterRule(_localctx, 56, RULE_singleAssignOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			identifierValue();
			setState(288);
			match(ASSIGN);
			setState(289);
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
		enterRule(_localctx, 58, RULE_assignValue);
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case NUMBER:
			case IDENTIFIER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				singleExpression();
				}
				break;
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
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
		enterRule(_localctx, 60, RULE_singleExpression);
		try {
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				arithmeticOperation(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				conditionOperation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(298);
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
		enterRule(_localctx, 62, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(IF);
			setState(302);
			match(OPEN_PAREN);
			setState(303);
			ifStatementConditionOperation();
			setState(304);
			match(CLOSE_PAREN);
			setState(305);
			instructionBlock();
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(306);
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
		enterRule(_localctx, 64, RULE_ifStatementConditionOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
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
		enterRule(_localctx, 66, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(ELSE);
			setState(312);
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
		enterRule(_localctx, 68, RULE_loops);
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				whileLoop();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
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
		enterRule(_localctx, 70, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(WHILE);
			setState(319);
			match(OPEN_PAREN);
			setState(320);
			whileStatementConditionOperation();
			setState(321);
			match(CLOSE_PAREN);
			setState(322);
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
		enterRule(_localctx, 72, RULE_whileStatementConditionOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
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
		public ForAssignSectionContext forAssignSection() {
			return getRuleContext(ForAssignSectionContext.class,0);
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
		enterRule(_localctx, 74, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(FOR);
			setState(327);
			match(OPEN_PAREN);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR || _la==IDENTIFIER) {
				{
				setState(328);
				forAssignSection();
				}
			}

			setState(331);
			match(SEMI_COLON);
			setState(332);
			forStatementConditionOperation();
			setState(333);
			match(SEMI_COLON);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(334);
				forExpression();
				}
			}

			setState(337);
			match(CLOSE_PAREN);
			setState(338);
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

	public static class ForAssignSectionContext extends ParserRuleContext {
		public List<AssignOperationContext> assignOperation() {
			return getRuleContexts(AssignOperationContext.class);
		}
		public AssignOperationContext assignOperation(int i) {
			return getRuleContext(AssignOperationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaScriptParser.COMMA, i);
		}
		public ForAssignSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forAssignSection; }
	}

	public final ForAssignSectionContext forAssignSection() throws RecognitionException {
		ForAssignSectionContext _localctx = new ForAssignSectionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_forAssignSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			assignOperation();
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(342); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(341);
					match(COMMA);
					}
					}
					setState(344); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(346);
				assignOperation();
				}
				}
				setState(351);
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
		enterRule(_localctx, 78, RULE_forStatementConditionOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
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
		public ForExpressionAssignContext forExpressionAssign() {
			return getRuleContext(ForExpressionAssignContext.class,0);
		}
		public IncrementVariableContext incrementVariable() {
			return getRuleContext(IncrementVariableContext.class,0);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_forExpression);
		try {
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				forExpressionAssign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				incrementVariable();
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

	public static class ForExpressionAssignContext extends ParserRuleContext {
		public IdentifierValueContext identifierValue() {
			return getRuleContext(IdentifierValueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaScriptParser.ASSIGN, 0); }
		public AssignValueContext assignValue() {
			return getRuleContext(AssignValueContext.class,0);
		}
		public ForExpressionAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpressionAssign; }
	}

	public final ForExpressionAssignContext forExpressionAssign() throws RecognitionException {
		ForExpressionAssignContext _localctx = new ForExpressionAssignContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_forExpressionAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			identifierValue();
			setState(359);
			match(ASSIGN);
			setState(360);
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
		enterRule(_localctx, 84, RULE_arrayLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(362);
			match(OPEN_BRACKET);
			setState(363);
			elementList();
			setState(364);
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
		enterRule(_localctx, 86, RULE_elementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(366);
					match(COMMA);
					}
					} 
				}
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << NUMBER) | (1L << IDENTIFIER) | (1L << STRING))) != 0)) {
				{
				setState(372);
				arrayElement();
				}
			}

			setState(383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(376); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(375);
						match(COMMA);
						}
						}
						setState(378); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA );
					setState(380);
					arrayElement();
					}
					} 
				}
				setState(385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(386);
				match(COMMA);
				}
				}
				setState(391);
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
		enterRule(_localctx, 88, RULE_commaSeparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOL) {
				{
				{
				setState(392);
				match(EOL);
				}
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(398);
			match(COMMA);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOL) {
				{
				{
				setState(399);
				match(EOL);
				}
				}
				setState(404);
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
		enterRule(_localctx, 90, RULE_arrayElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
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
		enterRule(_localctx, 92, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(FUNCTION);
			setState(408);
			match(IDENTIFIER);
			setState(409);
			match(OPEN_PAREN);
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(410);
				formalParameterList();
				}
			}

			setState(413);
			match(CLOSE_PAREN);
			setState(414);
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
		enterRule(_localctx, 94, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			formalParameterArg();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(417);
				match(COMMA);
				setState(418);
				formalParameterArg();
				}
				}
				setState(423);
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
		enterRule(_localctx, 96, RULE_formalParameterArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
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
		enterRule(_localctx, 98, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(IDENTIFIER);
			setState(427);
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
		enterRule(_localctx, 100, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(OPEN_PAREN);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_BRACKET) | (1L << BOOLEAN) | (1L << NUMBER) | (1L << IDENTIFIER) | (1L << STRING))) != 0)) {
				{
				setState(430);
				argument();
				setState(435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(431);
						match(COMMA);
						setState(432);
						argument();
						}
						} 
					}
					setState(437);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(438);
					match(COMMA);
					}
				}

				}
			}

			setState(443);
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
		public AssignValueContext assignValue() {
			return getRuleContext(AssignValueContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
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

	public static class IncrementVariableContext extends ParserRuleContext {
		public IdentifierValueContext identifierValue() {
			return getRuleContext(IdentifierValueContext.class,0);
		}
		public TerminalNode PLUS_PLUS() { return getToken(JavaScriptParser.PLUS_PLUS, 0); }
		public IncrementVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementVariable; }
	}

	public final IncrementVariableContext incrementVariable() throws RecognitionException {
		IncrementVariableContext _localctx = new IncrementVariableContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_incrementVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			identifierValue();
			setState(448);
			match(PLUS_PLUS);
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
		case 11:
			return arithmeticOperation_sempred((ArithmeticOperationContext)_localctx, predIndex);
		case 12:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u01c5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\7\2n\n\2\f\2\16\2q\13\2\3\2\5\2t\n\2\3\3\6"+
		"\3w\n\3\r\3\16\3x\3\4\3\4\5\4}\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5\u0089\n\5\3\6\7\6\u008c\n\6\f\6\16\6\u008f\13\6\3\6\3\6\7\6\u0093"+
		"\n\6\f\6\16\6\u0096\13\6\3\6\3\6\7\6\u009a\n\6\f\6\16\6\u009d\13\6\3\6"+
		"\3\6\7\6\u00a1\n\6\f\6\16\6\u00a4\13\6\3\7\3\7\3\7\3\7\5\7\u00aa\n\7\3"+
		"\b\3\b\3\b\3\b\5\b\u00b0\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\7\r\u00cd\n\r\f\r\16\r\u00d0\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u00d9\n\16\f\16\16\16\u00dc\13\16\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00e3\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\5\22\u00ec\n\22\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\5\24\u00f5\n\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0103\n\30\3\30\3\30\5\30\u0107"+
		"\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\6\32\u0111\n\32\r\32\16"+
		"\32\u0112\3\33\3\33\5\33\u0117\n\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u0120\n\35\3\36\3\36\3\36\3\36\3\37\3\37\5\37\u0128\n\37\3 \3 \3"+
		" \3 \5 \u012e\n \3!\3!\3!\3!\3!\3!\5!\u0136\n!\3\"\3\"\3#\3#\3#\3$\3$"+
		"\5$\u013f\n$\3%\3%\3%\3%\3%\3%\3&\3&\3\'\3\'\3\'\5\'\u014c\n\'\3\'\3\'"+
		"\3\'\3\'\5\'\u0152\n\'\3\'\3\'\3\'\3(\3(\6(\u0159\n(\r(\16(\u015a\3(\7"+
		"(\u015e\n(\f(\16(\u0161\13(\3)\3)\3*\3*\5*\u0167\n*\3+\3+\3+\3+\3,\3,"+
		"\3,\3,\3-\7-\u0172\n-\f-\16-\u0175\13-\3-\5-\u0178\n-\3-\6-\u017b\n-\r"+
		"-\16-\u017c\3-\7-\u0180\n-\f-\16-\u0183\13-\3-\7-\u0186\n-\f-\16-\u0189"+
		"\13-\3.\7.\u018c\n.\f.\16.\u018f\13.\3.\3.\7.\u0193\n.\f.\16.\u0196\13"+
		".\3/\3/\3\60\3\60\3\60\3\60\5\60\u019e\n\60\3\60\3\60\3\60\3\61\3\61\3"+
		"\61\7\61\u01a6\n\61\f\61\16\61\u01a9\13\61\3\62\3\62\3\63\3\63\3\63\3"+
		"\64\3\64\3\64\3\64\7\64\u01b4\n\64\f\64\16\64\u01b7\13\64\3\64\5\64\u01ba"+
		"\n\64\5\64\u01bc\n\64\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\2\4\30\32"+
		"\67\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTVXZ\\^`bdfhj\2\5\3\2\26\27\3\2\30\31\3\2\34#\2\u01c8\2o\3\2\2"+
		"\2\4v\3\2\2\2\6z\3\2\2\2\b\u0088\3\2\2\2\n\u008d\3\2\2\2\f\u00a9\3\2\2"+
		"\2\16\u00af\3\2\2\2\20\u00b1\3\2\2\2\22\u00b6\3\2\2\2\24\u00bb\3\2\2\2"+
		"\26\u00c0\3\2\2\2\30\u00c5\3\2\2\2\32\u00d1\3\2\2\2\34\u00e2\3\2\2\2\36"+
		"\u00e4\3\2\2\2 \u00e6\3\2\2\2\"\u00eb\3\2\2\2$\u00ed\3\2\2\2&\u00f4\3"+
		"\2\2\2(\u00f6\3\2\2\2*\u00f8\3\2\2\2,\u00fa\3\2\2\2.\u0106\3\2\2\2\60"+
		"\u0108\3\2\2\2\62\u010b\3\2\2\2\64\u0116\3\2\2\2\66\u0118\3\2\2\28\u011f"+
		"\3\2\2\2:\u0121\3\2\2\2<\u0127\3\2\2\2>\u012d\3\2\2\2@\u012f\3\2\2\2B"+
		"\u0137\3\2\2\2D\u0139\3\2\2\2F\u013e\3\2\2\2H\u0140\3\2\2\2J\u0146\3\2"+
		"\2\2L\u0148\3\2\2\2N\u0156\3\2\2\2P\u0162\3\2\2\2R\u0166\3\2\2\2T\u0168"+
		"\3\2\2\2V\u016c\3\2\2\2X\u0173\3\2\2\2Z\u018d\3\2\2\2\\\u0197\3\2\2\2"+
		"^\u0199\3\2\2\2`\u01a2\3\2\2\2b\u01aa\3\2\2\2d\u01ac\3\2\2\2f\u01af\3"+
		"\2\2\2h\u01bf\3\2\2\2j\u01c1\3\2\2\2ln\5\4\3\2ml\3\2\2\2nq\3\2\2\2om\3"+
		"\2\2\2op\3\2\2\2ps\3\2\2\2qo\3\2\2\2rt\7\2\2\3sr\3\2\2\2st\3\2\2\2t\3"+
		"\3\2\2\2uw\5\6\4\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\5\3\2\2\2"+
		"z|\5\b\5\2{}\7,\2\2|{\3\2\2\2|}\3\2\2\2}\7\3\2\2\2~\u0089\5\60\31\2\177"+
		"\u0089\5\62\32\2\u0080\u0089\58\35\2\u0081\u0089\5\16\b\2\u0082\u0089"+
		"\5@!\2\u0083\u0089\5F$\2\u0084\u0089\5^\60\2\u0085\u0089\5d\63\2\u0086"+
		"\u0089\5\f\7\2\u0087\u0089\5j\66\2\u0088~\3\2\2\2\u0088\177\3\2\2\2\u0088"+
		"\u0080\3\2\2\2\u0088\u0081\3\2\2\2\u0088\u0082\3\2\2\2\u0088\u0083\3\2"+
		"\2\2\u0088\u0084\3\2\2\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0087\3\2\2\2\u0089\t\3\2\2\2\u008a\u008c\7,\2\2\u008b\u008a\3\2\2\2"+
		"\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0094\7\17\2\2\u0091\u0093\7,\2\2\u0092"+
		"\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u009b\5\4\3\2\u0098"+
		"\u009a\7,\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e"+
		"\u00a2\7\20\2\2\u009f\u00a1\7,\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\13\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a5\u00a6\7\f\2\2\u00a6\u00aa\5\"\22\2\u00a7\u00a8\7\f\2\2"+
		"\u00a8\u00aa\5d\63\2\u00a9\u00a5\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\r\3"+
		"\2\2\2\u00ab\u00b0\5\20\t\2\u00ac\u00b0\5\22\n\2\u00ad\u00b0\5\24\13\2"+
		"\u00ae\u00b0\5\26\f\2\u00af\u00ab\3\2\2\2\u00af\u00ac\3\2\2\2\u00af\u00ad"+
		"\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\17\3\2\2\2\u00b1\u00b2\7\5\2\2\u00b2"+
		"\u00b3\7\32\2\2\u00b3\u00b4\5&\24\2\u00b4\u00b5\7\33\2\2\u00b5\21\3\2"+
		"\2\2\u00b6\u00b7\7\5\2\2\u00b7\u00b8\7\32\2\2\u00b8\u00b9\5.\30\2\u00b9"+
		"\u00ba\7\33\2\2\u00ba\23\3\2\2\2\u00bb\u00bc\7\5\2\2\u00bc\u00bd\7\32"+
		"\2\2\u00bd\u00be\5\30\r\2\u00be\u00bf\7\33\2\2\u00bf\25\3\2\2\2\u00c0"+
		"\u00c1\7\5\2\2\u00c1\u00c2\7\32\2\2\u00c2\u00c3\5d\63\2\u00c3\u00c4\7"+
		"\33\2\2\u00c4\27\3\2\2\2\u00c5\u00c6\b\r\1\2\u00c6\u00c7\5\32\16\2\u00c7"+
		"\u00ce\3\2\2\2\u00c8\u00c9\f\4\2\2\u00c9\u00ca\5\36\20\2\u00ca\u00cb\5"+
		"\32\16\2\u00cb\u00cd\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\31\3\2\2\2\u00d0\u00ce\3\2\2"+
		"\2\u00d1\u00d2\b\16\1\2\u00d2\u00d3\5\"\22\2\u00d3\u00da\3\2\2\2\u00d4"+
		"\u00d5\f\4\2\2\u00d5\u00d6\5 \21\2\u00d6\u00d7\5\"\22\2\u00d7\u00d9\3"+
		"\2\2\2\u00d8\u00d4\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\33\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\5\30\r"+
		"\2\u00de\u00df\5\66\34\2\u00df\u00e0\5\34\17\2\u00e0\u00e3\3\2\2\2\u00e1"+
		"\u00e3\5\30\r\2\u00e2\u00dd\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\35\3\2\2"+
		"\2\u00e4\u00e5\t\2\2\2\u00e5\37\3\2\2\2\u00e6\u00e7\t\3\2\2\u00e7!\3\2"+
		"\2\2\u00e8\u00ec\5&\24\2\u00e9\u00ec\5.\30\2\u00ea\u00ec\5$\23\2\u00eb"+
		"\u00e8\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec#\3\2\2\2"+
		"\u00ed\u00ee\7*\2\2\u00ee\u00ef\7\21\2\2\u00ef\u00f0\7\13\2\2\u00f0%\3"+
		"\2\2\2\u00f1\u00f5\5(\25\2\u00f2\u00f5\5*\26\2\u00f3\u00f5\5,\27\2\u00f4"+
		"\u00f1\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\'\3\2\2\2"+
		"\u00f6\u00f7\7&\2\2\u00f7)\3\2\2\2\u00f8\u00f9\7+\2\2\u00f9+\3\2\2\2\u00fa"+
		"\u00fb\7)\2\2\u00fb-\3\2\2\2\u00fc\u0107\7*\2\2\u00fd\u00fe\7*\2\2\u00fe"+
		"\u0102\7\r\2\2\u00ff\u0103\5,\27\2\u0100\u0103\5.\30\2\u0101\u0103\5\30"+
		"\r\2\u0102\u00ff\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0105\7\16\2\2\u0105\u0107\3\2\2\2\u0106\u00fc\3"+
		"\2\2\2\u0106\u00fd\3\2\2\2\u0107/\3\2\2\2\u0108\u0109\7\6\2\2\u0109\u010a"+
		"\7*\2\2\u010a\61\3\2\2\2\u010b\u010c\7\6\2\2\u010c\u0110\5\64\33\2\u010d"+
		"\u010e\5Z.\2\u010e\u010f\5\64\33\2\u010f\u0111\3\2\2\2\u0110\u010d\3\2"+
		"\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\63\3\2\2\2\u0114\u0117\5:\36\2\u0115\u0117\7*\2\2\u0116\u0114\3\2\2\2"+
		"\u0116\u0115\3\2\2\2\u0117\65\3\2\2\2\u0118\u0119\t\4\2\2\u0119\67\3\2"+
		"\2\2\u011a\u011b\5\60\31\2\u011b\u011c\7\24\2\2\u011c\u011d\5<\37\2\u011d"+
		"\u0120\3\2\2\2\u011e\u0120\5:\36\2\u011f\u011a\3\2\2\2\u011f\u011e\3\2"+
		"\2\2\u01209\3\2\2\2\u0121\u0122\5.\30\2\u0122\u0123\7\24\2\2\u0123\u0124"+
		"\5<\37\2\u0124;\3\2\2\2\u0125\u0128\5> \2\u0126\u0128\5V,\2\u0127\u0125"+
		"\3\2\2\2\u0127\u0126\3\2\2\2\u0128=\3\2\2\2\u0129\u012e\5\30\r\2\u012a"+
		"\u012e\5\34\17\2\u012b\u012e\5\"\22\2\u012c\u012e\5d\63\2\u012d\u0129"+
		"\3\2\2\2\u012d\u012a\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e"+
		"?\3\2\2\2\u012f\u0130\7\'\2\2\u0130\u0131\7\32\2\2\u0131\u0132\5B\"\2"+
		"\u0132\u0133\7\33\2\2\u0133\u0135\5\n\6\2\u0134\u0136\5D#\2\u0135\u0134"+
		"\3\2\2\2\u0135\u0136\3\2\2\2\u0136A\3\2\2\2\u0137\u0138\5\34\17\2\u0138"+
		"C\3\2\2\2\u0139\u013a\7(\2\2\u013a\u013b\5\n\6\2\u013bE\3\2\2\2\u013c"+
		"\u013f\5H%\2\u013d\u013f\5L\'\2\u013e\u013c\3\2\2\2\u013e\u013d\3\2\2"+
		"\2\u013fG\3\2\2\2\u0140\u0141\7\t\2\2\u0141\u0142\7\32\2\2\u0142\u0143"+
		"\5J&\2\u0143\u0144\7\33\2\2\u0144\u0145\5\n\6\2\u0145I\3\2\2\2\u0146\u0147"+
		"\5\34\17\2\u0147K\3\2\2\2\u0148\u0149\7\b\2\2\u0149\u014b\7\32\2\2\u014a"+
		"\u014c\5N(\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\3\2\2"+
		"\2\u014d\u014e\7\23\2\2\u014e\u014f\5P)\2\u014f\u0151\7\23\2\2\u0150\u0152"+
		"\5R*\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0154\7\33\2\2\u0154\u0155\5\n\6\2\u0155M\3\2\2\2\u0156\u015f\58\35\2"+
		"\u0157\u0159\7\22\2\2\u0158\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0158"+
		"\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\58\35\2\u015d"+
		"\u0158\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2"+
		"\2\2\u0160O\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163\5\34\17\2\u0163Q\3"+
		"\2\2\2\u0164\u0167\5T+\2\u0165\u0167\5j\66\2\u0166\u0164\3\2\2\2\u0166"+
		"\u0165\3\2\2\2\u0167S\3\2\2\2\u0168\u0169\5.\30\2\u0169\u016a\7\24\2\2"+
		"\u016a\u016b\5<\37\2\u016bU\3\2\2\2\u016c\u016d\7\r\2\2\u016d\u016e\5"+
		"X-\2\u016e\u016f\7\16\2\2\u016fW\3\2\2\2\u0170\u0172\7\22\2\2\u0171\u0170"+
		"\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0178\5\\/\2\u0177\u0176\3\2"+
		"\2\2\u0177\u0178\3\2\2\2\u0178\u0181\3\2\2\2\u0179\u017b\7\22\2\2\u017a"+
		"\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2"+
		"\2\2\u017d\u017e\3\2\2\2\u017e\u0180\5\\/\2\u017f\u017a\3\2\2\2\u0180"+
		"\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0187\3\2"+
		"\2\2\u0183\u0181\3\2\2\2\u0184\u0186\7\22\2\2\u0185\u0184\3\2\2\2\u0186"+
		"\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188Y\3\2\2\2"+
		"\u0189\u0187\3\2\2\2\u018a\u018c\7,\2\2\u018b\u018a\3\2\2\2\u018c\u018f"+
		"\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u0190\u0194\7\22\2\2\u0191\u0193\7,\2\2\u0192\u0191\3\2"+
		"\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"[\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0198\5> \2\u0198]\3\2\2\2\u0199\u019a"+
		"\7\n\2\2\u019a\u019b\7*\2\2\u019b\u019d\7\32\2\2\u019c\u019e\5`\61\2\u019d"+
		"\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\7\33"+
		"\2\2\u01a0\u01a1\5\n\6\2\u01a1_\3\2\2\2\u01a2\u01a7\5b\62\2\u01a3\u01a4"+
		"\7\22\2\2\u01a4\u01a6\5b\62\2\u01a5\u01a3\3\2\2\2\u01a6\u01a9\3\2\2\2"+
		"\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8a\3\2\2\2\u01a9\u01a7\3"+
		"\2\2\2\u01aa\u01ab\7*\2\2\u01abc\3\2\2\2\u01ac\u01ad\7*\2\2\u01ad\u01ae"+
		"\5f\64\2\u01aee\3\2\2\2\u01af\u01bb\7\32\2\2\u01b0\u01b5\5h\65\2\u01b1"+
		"\u01b2\7\22\2\2\u01b2\u01b4\5h\65\2\u01b3\u01b1\3\2\2\2\u01b4\u01b7\3"+
		"\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7"+
		"\u01b5\3\2\2\2\u01b8\u01ba\7\22\2\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3"+
		"\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01b0\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd\u01be\7\33\2\2\u01beg\3\2\2\2\u01bf\u01c0\5<\37\2"+
		"\u01c0i\3\2\2\2\u01c1\u01c2\5.\30\2\u01c2\u01c3\7\25\2\2\u01c3k\3\2\2"+
		"\2,osx|\u0088\u008d\u0094\u009b\u00a2\u00a9\u00af\u00ce\u00da\u00e2\u00eb"+
		"\u00f4\u0102\u0106\u0112\u0116\u011f\u0127\u012d\u0135\u013e\u014b\u0151"+
		"\u015a\u015f\u0166\u0173\u0177\u017c\u0181\u0187\u018d\u0194\u019d\u01a7"+
		"\u01b5\u01b9\u01bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}