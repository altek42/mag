// Generated from c:\doit\mag\src\compiler\antlr\gramar\JavaScriptLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaScriptLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MULTI_LINE_COMMENT", "SINGLE_LINE_COMMENT", "CONSOLE_LOG", "VAR", "CONTINUE", 
			"FOR", "WHILE", "FUNCTION", "LENGTH", "RETURN", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"OPEN_BRACE", "CLOSE_BRACE", "DOT", "COMMA", "SEMI_COLON", "ASSIGN", 
			"PLUS_PLUS", "PLUS", "MINUS", "DIVIDE", "MULTIPLY", "OPEN_PAREN", "CLOSE_PAREN", 
			"LESS_THAN", "MORE_THAN", "LESS_THAN_EQUALS", "GREATER_THAN_EQUALS", 
			"EQUALS", "NOT_EQUALS", "IDENTITY_EQUALS", "IDENTITY_NOT_EQUALS", "AND", 
			"OR", "BOOLEAN", "IF", "ELSE", "NUMBER", "INTEGER_NUMBER", "IDENTIFIER", 
			"STRING", "DoubleStringCharacter", "SingleStringCharacter", "SingleEscapeCharacter", 
			"LineContinuation", "EOL", "WHITE_SPACES"
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


	public JavaScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaScriptLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0160\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\7\2h\n\2\f"+
		"\2\16\2k\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3v\n\3\f\3\16\3y\13"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u00fd\n%"+
		"\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\7(\u010b\n(\f(\16(\u010e\13"+
		"(\3(\3(\3(\7(\u0113\n(\f(\16(\u0116\13(\3(\5(\u0119\n(\3)\3)\3)\7)\u011e"+
		"\n)\f)\16)\u0121\13)\5)\u0123\n)\3*\3*\7*\u0127\n*\f*\16*\u012a\13*\3"+
		"+\3+\7+\u012e\n+\f+\16+\u0131\13+\3+\3+\3+\7+\u0136\n+\f+\16+\u0139\13"+
		"+\3+\5+\u013c\n+\3,\3,\3,\3,\5,\u0142\n,\3-\3-\3-\3-\5-\u0148\n-\3.\3"+
		".\3/\3/\3/\3\60\7\60\u0150\n\60\f\60\16\60\u0153\13\60\3\60\6\60\u0156"+
		"\n\60\r\60\16\60\u0157\3\61\6\61\u015b\n\61\r\61\16\61\u015c\3\61\3\61"+
		"\3i\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q\2S*U+W\2Y\2[\2]\2_,a-\3\2\r\5\2\f\f\17"+
		"\17\u202a\u202b\3\2\62;\4\2\62;aa\3\2\63;\5\2C\\aac|\6\2\62;C\\aac|\6"+
		"\2\f\f\17\17$$^^\6\2\f\f\17\17))^^\13\2$$))^^ddhhppttvvxx\3\2==\6\2\13"+
		"\13\r\16\"\"\u00a2\u00a2\2\u016e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5q\3\2"+
		"\2\2\7|\3\2\2\2\t\u0088\3\2\2\2\13\u008c\3\2\2\2\r\u0095\3\2\2\2\17\u0099"+
		"\3\2\2\2\21\u009f\3\2\2\2\23\u00a8\3\2\2\2\25\u00af\3\2\2\2\27\u00b6\3"+
		"\2\2\2\31\u00b8\3\2\2\2\33\u00ba\3\2\2\2\35\u00bc\3\2\2\2\37\u00be\3\2"+
		"\2\2!\u00c0\3\2\2\2#\u00c2\3\2\2\2%\u00c4\3\2\2\2\'\u00c6\3\2\2\2)\u00c9"+
		"\3\2\2\2+\u00cb\3\2\2\2-\u00cd\3\2\2\2/\u00cf\3\2\2\2\61\u00d1\3\2\2\2"+
		"\63\u00d3\3\2\2\2\65\u00d5\3\2\2\2\67\u00d7\3\2\2\29\u00d9\3\2\2\2;\u00dc"+
		"\3\2\2\2=\u00df\3\2\2\2?\u00e2\3\2\2\2A\u00e5\3\2\2\2C\u00e9\3\2\2\2E"+
		"\u00ed\3\2\2\2G\u00f0\3\2\2\2I\u00fc\3\2\2\2K\u00fe\3\2\2\2M\u0101\3\2"+
		"\2\2O\u0118\3\2\2\2Q\u0122\3\2\2\2S\u0124\3\2\2\2U\u013b\3\2\2\2W\u0141"+
		"\3\2\2\2Y\u0147\3\2\2\2[\u0149\3\2\2\2]\u014b\3\2\2\2_\u0151\3\2\2\2a"+
		"\u015a\3\2\2\2cd\7\61\2\2de\7,\2\2ei\3\2\2\2fh\13\2\2\2gf\3\2\2\2hk\3"+
		"\2\2\2ij\3\2\2\2ig\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7,\2\2mn\7\61\2\2no\3"+
		"\2\2\2op\b\2\2\2p\4\3\2\2\2qr\7\61\2\2rs\7\61\2\2sw\3\2\2\2tv\n\2\2\2"+
		"ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\b\3\2\2"+
		"{\6\3\2\2\2|}\7e\2\2}~\7q\2\2~\177\7p\2\2\177\u0080\7u\2\2\u0080\u0081"+
		"\7q\2\2\u0081\u0082\7n\2\2\u0082\u0083\7g\2\2\u0083\u0084\7\60\2\2\u0084"+
		"\u0085\7n\2\2\u0085\u0086\7q\2\2\u0086\u0087\7i\2\2\u0087\b\3\2\2\2\u0088"+
		"\u0089\7x\2\2\u0089\u008a\7c\2\2\u008a\u008b\7t\2\2\u008b\n\3\2\2\2\u008c"+
		"\u008d\7e\2\2\u008d\u008e\7q\2\2\u008e\u008f\7p\2\2\u008f\u0090\7v\2\2"+
		"\u0090\u0091\7k\2\2\u0091\u0092\7p\2\2\u0092\u0093\7w\2\2\u0093\u0094"+
		"\7g\2\2\u0094\f\3\2\2\2\u0095\u0096\7h\2\2\u0096\u0097\7q\2\2\u0097\u0098"+
		"\7t\2\2\u0098\16\3\2\2\2\u0099\u009a\7y\2\2\u009a\u009b\7j\2\2\u009b\u009c"+
		"\7k\2\2\u009c\u009d\7n\2\2\u009d\u009e\7g\2\2\u009e\20\3\2\2\2\u009f\u00a0"+
		"\7h\2\2\u00a0\u00a1\7w\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7e\2\2\u00a3"+
		"\u00a4\7v\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7p\2\2"+
		"\u00a7\22\3\2\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7"+
		"p\2\2\u00ab\u00ac\7i\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7j\2\2\u00ae\24"+
		"\3\2\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7v\2\2\u00b2"+
		"\u00b3\7w\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7p\2\2\u00b5\26\3\2\2\2\u00b6"+
		"\u00b7\7]\2\2\u00b7\30\3\2\2\2\u00b8\u00b9\7_\2\2\u00b9\32\3\2\2\2\u00ba"+
		"\u00bb\7}\2\2\u00bb\34\3\2\2\2\u00bc\u00bd\7\177\2\2\u00bd\36\3\2\2\2"+
		"\u00be\u00bf\7\60\2\2\u00bf \3\2\2\2\u00c0\u00c1\7.\2\2\u00c1\"\3\2\2"+
		"\2\u00c2\u00c3\7=\2\2\u00c3$\3\2\2\2\u00c4\u00c5\7?\2\2\u00c5&\3\2\2\2"+
		"\u00c6\u00c7\7-\2\2\u00c7\u00c8\7-\2\2\u00c8(\3\2\2\2\u00c9\u00ca\7-\2"+
		"\2\u00ca*\3\2\2\2\u00cb\u00cc\7/\2\2\u00cc,\3\2\2\2\u00cd\u00ce\7\61\2"+
		"\2\u00ce.\3\2\2\2\u00cf\u00d0\7,\2\2\u00d0\60\3\2\2\2\u00d1\u00d2\7*\2"+
		"\2\u00d2\62\3\2\2\2\u00d3\u00d4\7+\2\2\u00d4\64\3\2\2\2\u00d5\u00d6\7"+
		">\2\2\u00d6\66\3\2\2\2\u00d7\u00d8\7@\2\2\u00d88\3\2\2\2\u00d9\u00da\7"+
		">\2\2\u00da\u00db\7?\2\2\u00db:\3\2\2\2\u00dc\u00dd\7@\2\2\u00dd\u00de"+
		"\7?\2\2\u00de<\3\2\2\2\u00df\u00e0\7?\2\2\u00e0\u00e1\7?\2\2\u00e1>\3"+
		"\2\2\2\u00e2\u00e3\7#\2\2\u00e3\u00e4\7?\2\2\u00e4@\3\2\2\2\u00e5\u00e6"+
		"\7?\2\2\u00e6\u00e7\7?\2\2\u00e7\u00e8\7?\2\2\u00e8B\3\2\2\2\u00e9\u00ea"+
		"\7#\2\2\u00ea\u00eb\7?\2\2\u00eb\u00ec\7?\2\2\u00ecD\3\2\2\2\u00ed\u00ee"+
		"\7(\2\2\u00ee\u00ef\7(\2\2\u00efF\3\2\2\2\u00f0\u00f1\7~\2\2\u00f1\u00f2"+
		"\7~\2\2\u00f2H\3\2\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6"+
		"\7w\2\2\u00f6\u00fd\7g\2\2\u00f7\u00f8\7h\2\2\u00f8\u00f9\7c\2\2\u00f9"+
		"\u00fa\7n\2\2\u00fa\u00fb\7u\2\2\u00fb\u00fd\7g\2\2\u00fc\u00f3\3\2\2"+
		"\2\u00fc\u00f7\3\2\2\2\u00fdJ\3\2\2\2\u00fe\u00ff\7k\2\2\u00ff\u0100\7"+
		"h\2\2\u0100L\3\2\2\2\u0101\u0102\7g\2\2\u0102\u0103\7n\2\2\u0103\u0104"+
		"\7u\2\2\u0104\u0105\7g\2\2\u0105N\3\2\2\2\u0106\u0107\5Q)\2\u0107\u0108"+
		"\7\60\2\2\u0108\u010c\t\3\2\2\u0109\u010b\t\4\2\2\u010a\u0109\3\2\2\2"+
		"\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0119"+
		"\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\7\60\2\2\u0110\u0114\t\3\2\2"+
		"\u0111\u0113\t\4\2\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0119\3\2\2\2\u0116\u0114\3\2\2\2\u0117"+
		"\u0119\5Q)\2\u0118\u0106\3\2\2\2\u0118\u010f\3\2\2\2\u0118\u0117\3\2\2"+
		"\2\u0119P\3\2\2\2\u011a\u0123\7\62\2\2\u011b\u011f\t\5\2\2\u011c\u011e"+
		"\t\4\2\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u011a\3\2"+
		"\2\2\u0122\u011b\3\2\2\2\u0123R\3\2\2\2\u0124\u0128\t\6\2\2\u0125\u0127"+
		"\t\7\2\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129T\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012f\7$\2\2\u012c"+
		"\u012e\5W,\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2"+
		"\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u013c"+
		"\7$\2\2\u0133\u0137\7)\2\2\u0134\u0136\5Y-\2\u0135\u0134\3\2\2\2\u0136"+
		"\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2"+
		"\2\2\u0139\u0137\3\2\2\2\u013a\u013c\7)\2\2\u013b\u012b\3\2\2\2\u013b"+
		"\u0133\3\2\2\2\u013cV\3\2\2\2\u013d\u0142\n\b\2\2\u013e\u013f\7^\2\2\u013f"+
		"\u0142\5[.\2\u0140\u0142\5]/\2\u0141\u013d\3\2\2\2\u0141\u013e\3\2\2\2"+
		"\u0141\u0140\3\2\2\2\u0142X\3\2\2\2\u0143\u0148\n\t\2\2\u0144\u0145\7"+
		"^\2\2\u0145\u0148\5[.\2\u0146\u0148\5]/\2\u0147\u0143\3\2\2\2\u0147\u0144"+
		"\3\2\2\2\u0147\u0146\3\2\2\2\u0148Z\3\2\2\2\u0149\u014a\t\n\2\2\u014a"+
		"\\\3\2\2\2\u014b\u014c\7^\2\2\u014c\u014d\t\2\2\2\u014d^\3\2\2\2\u014e"+
		"\u0150\t\13\2\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3"+
		"\2\2\2\u0151\u0152\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0154"+
		"\u0156\t\2\2\2\u0155\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155\3\2"+
		"\2\2\u0157\u0158\3\2\2\2\u0158`\3\2\2\2\u0159\u015b\t\f\2\2\u015a\u0159"+
		"\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u015f\b\61\2\2\u015fb\3\2\2\2\24\2iw\u00fc\u010c"+
		"\u0114\u0118\u011f\u0122\u0128\u012f\u0137\u013b\u0141\u0147\u0151\u0157"+
		"\u015c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}