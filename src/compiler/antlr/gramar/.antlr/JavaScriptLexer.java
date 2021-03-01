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
		FOR=6, WHILE=7, FUNCTION=8, LENGTH=9, OPEN_BRACKET=10, CLOSE_BRACKET=11, 
		OPEN_BRACE=12, CLOSE_BRACE=13, DOT=14, COMMA=15, SEMI_COLON=16, ASSIGN=17, 
		PLUS=18, MINUS=19, DIVIDE=20, MULTIPLY=21, OPEN_PAREN=22, CLOSE_PAREN=23, 
		LESS_THAN=24, MORE_THAN=25, LESS_THAN_EQUALS=26, GREATER_THAN_EQUALS=27, 
		EQUALS=28, NOT_EQUALS=29, IDENTITY_EQUALS=30, IDENTITY_NOT_EQUALS=31, 
		AND=32, OR=33, BOOLEAN=34, IF=35, ELSE=36, NUMBER=37, IDENTIFIER=38, STRING=39, 
		EOL=40, WHITE_SPACES=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MULTI_LINE_COMMENT", "SINGLE_LINE_COMMENT", "CONSOLE_LOG", "VAR", "CONTINUE", 
			"FOR", "WHILE", "FUNCTION", "LENGTH", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"OPEN_BRACE", "CLOSE_BRACE", "DOT", "COMMA", "SEMI_COLON", "ASSIGN", 
			"PLUS", "MINUS", "DIVIDE", "MULTIPLY", "OPEN_PAREN", "CLOSE_PAREN", "LESS_THAN", 
			"MORE_THAN", "LESS_THAN_EQUALS", "GREATER_THAN_EQUALS", "EQUALS", "NOT_EQUALS", 
			"IDENTITY_EQUALS", "IDENTITY_NOT_EQUALS", "AND", "OR", "BOOLEAN", "IF", 
			"ELSE", "NUMBER", "INTEGER_NUMBER", "IDENTIFIER", "STRING", "DoubleStringCharacter", 
			"SingleStringCharacter", "SingleEscapeCharacter", "LineContinuation", 
			"EOL", "WHITE_SPACES"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0152\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\7\2d\n\2\f\2\16\2g\13\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3r\n\3\f\3\16\3u\13\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\5#\u00ef\n#\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\7&\u00fd\n&\f&\16&\u0100"+
		"\13&\3&\3&\3&\7&\u0105\n&\f&\16&\u0108\13&\3&\5&\u010b\n&\3\'\3\'\3\'"+
		"\7\'\u0110\n\'\f\'\16\'\u0113\13\'\5\'\u0115\n\'\3(\3(\7(\u0119\n(\f("+
		"\16(\u011c\13(\3)\3)\7)\u0120\n)\f)\16)\u0123\13)\3)\3)\3)\7)\u0128\n"+
		")\f)\16)\u012b\13)\3)\5)\u012e\n)\3*\3*\3*\3*\5*\u0134\n*\3+\3+\3+\3+"+
		"\5+\u013a\n+\3,\3,\3-\3-\3-\3.\7.\u0142\n.\f.\16.\u0145\13.\3.\6.\u0148"+
		"\n.\r.\16.\u0149\3/\6/\u014d\n/\r/\16/\u014e\3/\3/\3e\2\60\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M\2O(Q)S\2U\2W\2Y\2[*]+\3\2\r\5\2\f\f\17\17\u202a\u202b\3\2\62;"+
		"\4\2\62;aa\3\2\63;\5\2C\\aac|\6\2\62;C\\aac|\6\2\f\f\17\17$$^^\6\2\f\f"+
		"\17\17))^^\13\2$$))^^ddhhppttvvxx\3\2==\6\2\13\13\r\16\"\"\u00a2\u00a2"+
		"\2\u0160\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\3_\3\2\2\2\5m\3\2\2\2\7x\3\2\2\2\t\u0084\3\2\2\2\13\u0088\3\2"+
		"\2\2\r\u0091\3\2\2\2\17\u0095\3\2\2\2\21\u009b\3\2\2\2\23\u00a4\3\2\2"+
		"\2\25\u00ab\3\2\2\2\27\u00ad\3\2\2\2\31\u00af\3\2\2\2\33\u00b1\3\2\2\2"+
		"\35\u00b3\3\2\2\2\37\u00b5\3\2\2\2!\u00b7\3\2\2\2#\u00b9\3\2\2\2%\u00bb"+
		"\3\2\2\2\'\u00bd\3\2\2\2)\u00bf\3\2\2\2+\u00c1\3\2\2\2-\u00c3\3\2\2\2"+
		"/\u00c5\3\2\2\2\61\u00c7\3\2\2\2\63\u00c9\3\2\2\2\65\u00cb\3\2\2\2\67"+
		"\u00ce\3\2\2\29\u00d1\3\2\2\2;\u00d4\3\2\2\2=\u00d7\3\2\2\2?\u00db\3\2"+
		"\2\2A\u00df\3\2\2\2C\u00e2\3\2\2\2E\u00ee\3\2\2\2G\u00f0\3\2\2\2I\u00f3"+
		"\3\2\2\2K\u010a\3\2\2\2M\u0114\3\2\2\2O\u0116\3\2\2\2Q\u012d\3\2\2\2S"+
		"\u0133\3\2\2\2U\u0139\3\2\2\2W\u013b\3\2\2\2Y\u013d\3\2\2\2[\u0143\3\2"+
		"\2\2]\u014c\3\2\2\2_`\7\61\2\2`a\7,\2\2ae\3\2\2\2bd\13\2\2\2cb\3\2\2\2"+
		"dg\3\2\2\2ef\3\2\2\2ec\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7,\2\2ij\7\61\2\2"+
		"jk\3\2\2\2kl\b\2\2\2l\4\3\2\2\2mn\7\61\2\2no\7\61\2\2os\3\2\2\2pr\n\2"+
		"\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\b\3"+
		"\2\2w\6\3\2\2\2xy\7e\2\2yz\7q\2\2z{\7p\2\2{|\7u\2\2|}\7q\2\2}~\7n\2\2"+
		"~\177\7g\2\2\177\u0080\7\60\2\2\u0080\u0081\7n\2\2\u0081\u0082\7q\2\2"+
		"\u0082\u0083\7i\2\2\u0083\b\3\2\2\2\u0084\u0085\7x\2\2\u0085\u0086\7c"+
		"\2\2\u0086\u0087\7t\2\2\u0087\n\3\2\2\2\u0088\u0089\7e\2\2\u0089\u008a"+
		"\7q\2\2\u008a\u008b\7p\2\2\u008b\u008c\7v\2\2\u008c\u008d\7k\2\2\u008d"+
		"\u008e\7p\2\2\u008e\u008f\7w\2\2\u008f\u0090\7g\2\2\u0090\f\3\2\2\2\u0091"+
		"\u0092\7h\2\2\u0092\u0093\7q\2\2\u0093\u0094\7t\2\2\u0094\16\3\2\2\2\u0095"+
		"\u0096\7y\2\2\u0096\u0097\7j\2\2\u0097\u0098\7k\2\2\u0098\u0099\7n\2\2"+
		"\u0099\u009a\7g\2\2\u009a\20\3\2\2\2\u009b\u009c\7h\2\2\u009c\u009d\7"+
		"w\2\2\u009d\u009e\7p\2\2\u009e\u009f\7e\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1"+
		"\7k\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7p\2\2\u00a3\22\3\2\2\2\u00a4\u00a5"+
		"\7n\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7i\2\2\u00a8"+
		"\u00a9\7v\2\2\u00a9\u00aa\7j\2\2\u00aa\24\3\2\2\2\u00ab\u00ac\7]\2\2\u00ac"+
		"\26\3\2\2\2\u00ad\u00ae\7_\2\2\u00ae\30\3\2\2\2\u00af\u00b0\7}\2\2\u00b0"+
		"\32\3\2\2\2\u00b1\u00b2\7\177\2\2\u00b2\34\3\2\2\2\u00b3\u00b4\7\60\2"+
		"\2\u00b4\36\3\2\2\2\u00b5\u00b6\7.\2\2\u00b6 \3\2\2\2\u00b7\u00b8\7=\2"+
		"\2\u00b8\"\3\2\2\2\u00b9\u00ba\7?\2\2\u00ba$\3\2\2\2\u00bb\u00bc\7-\2"+
		"\2\u00bc&\3\2\2\2\u00bd\u00be\7/\2\2\u00be(\3\2\2\2\u00bf\u00c0\7\61\2"+
		"\2\u00c0*\3\2\2\2\u00c1\u00c2\7,\2\2\u00c2,\3\2\2\2\u00c3\u00c4\7*\2\2"+
		"\u00c4.\3\2\2\2\u00c5\u00c6\7+\2\2\u00c6\60\3\2\2\2\u00c7\u00c8\7>\2\2"+
		"\u00c8\62\3\2\2\2\u00c9\u00ca\7@\2\2\u00ca\64\3\2\2\2\u00cb\u00cc\7>\2"+
		"\2\u00cc\u00cd\7?\2\2\u00cd\66\3\2\2\2\u00ce\u00cf\7@\2\2\u00cf\u00d0"+
		"\7?\2\2\u00d08\3\2\2\2\u00d1\u00d2\7?\2\2\u00d2\u00d3\7?\2\2\u00d3:\3"+
		"\2\2\2\u00d4\u00d5\7#\2\2\u00d5\u00d6\7?\2\2\u00d6<\3\2\2\2\u00d7\u00d8"+
		"\7?\2\2\u00d8\u00d9\7?\2\2\u00d9\u00da\7?\2\2\u00da>\3\2\2\2\u00db\u00dc"+
		"\7#\2\2\u00dc\u00dd\7?\2\2\u00dd\u00de\7?\2\2\u00de@\3\2\2\2\u00df\u00e0"+
		"\7(\2\2\u00e0\u00e1\7(\2\2\u00e1B\3\2\2\2\u00e2\u00e3\7~\2\2\u00e3\u00e4"+
		"\7~\2\2\u00e4D\3\2\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8"+
		"\7w\2\2\u00e8\u00ef\7g\2\2\u00e9\u00ea\7h\2\2\u00ea\u00eb\7c\2\2\u00eb"+
		"\u00ec\7n\2\2\u00ec\u00ed\7u\2\2\u00ed\u00ef\7g\2\2\u00ee\u00e5\3\2\2"+
		"\2\u00ee\u00e9\3\2\2\2\u00efF\3\2\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7"+
		"h\2\2\u00f2H\3\2\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7n\2\2\u00f5\u00f6"+
		"\7u\2\2\u00f6\u00f7\7g\2\2\u00f7J\3\2\2\2\u00f8\u00f9\5M\'\2\u00f9\u00fa"+
		"\7\60\2\2\u00fa\u00fe\t\3\2\2\u00fb\u00fd\t\4\2\2\u00fc\u00fb\3\2\2\2"+
		"\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u010b"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\7\60\2\2\u0102\u0106\t\3\2\2"+
		"\u0103\u0105\t\4\2\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104"+
		"\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u010b\3\2\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u010b\5M\'\2\u010a\u00f8\3\2\2\2\u010a\u0101\3\2\2\2\u010a\u0109\3\2"+
		"\2\2\u010bL\3\2\2\2\u010c\u0115\7\62\2\2\u010d\u0111\t\5\2\2\u010e\u0110"+
		"\t\4\2\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u010c\3\2"+
		"\2\2\u0114\u010d\3\2\2\2\u0115N\3\2\2\2\u0116\u011a\t\6\2\2\u0117\u0119"+
		"\t\7\2\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011bP\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u0121\7$\2\2\u011e"+
		"\u0120\5S*\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2"+
		"\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u012e"+
		"\7$\2\2\u0125\u0129\7)\2\2\u0126\u0128\5U+\2\u0127\u0126\3\2\2\2\u0128"+
		"\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2"+
		"\2\2\u012b\u0129\3\2\2\2\u012c\u012e\7)\2\2\u012d\u011d\3\2\2\2\u012d"+
		"\u0125\3\2\2\2\u012eR\3\2\2\2\u012f\u0134\n\b\2\2\u0130\u0131\7^\2\2\u0131"+
		"\u0134\5W,\2\u0132\u0134\5Y-\2\u0133\u012f\3\2\2\2\u0133\u0130\3\2\2\2"+
		"\u0133\u0132\3\2\2\2\u0134T\3\2\2\2\u0135\u013a\n\t\2\2\u0136\u0137\7"+
		"^\2\2\u0137\u013a\5W,\2\u0138\u013a\5Y-\2\u0139\u0135\3\2\2\2\u0139\u0136"+
		"\3\2\2\2\u0139\u0138\3\2\2\2\u013aV\3\2\2\2\u013b\u013c\t\n\2\2\u013c"+
		"X\3\2\2\2\u013d\u013e\7^\2\2\u013e\u013f\t\2\2\2\u013fZ\3\2\2\2\u0140"+
		"\u0142\t\13\2\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3"+
		"\2\2\2\u0143\u0144\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0146"+
		"\u0148\t\2\2\2\u0147\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2"+
		"\2\2\u0149\u014a\3\2\2\2\u014a\\\3\2\2\2\u014b\u014d\t\f\2\2\u014c\u014b"+
		"\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0151\b/\2\2\u0151^\3\2\2\2\24\2es\u00ee\u00fe\u0106"+
		"\u010a\u0111\u0114\u011a\u0121\u0129\u012d\u0133\u0139\u0143\u0149\u014e"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}