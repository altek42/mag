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
		PLUS=19, MINUS=20, DIVIDE=21, MULTIPLY=22, OPEN_PAREN=23, CLOSE_PAREN=24, 
		LESS_THAN=25, MORE_THAN=26, LESS_THAN_EQUALS=27, GREATER_THAN_EQUALS=28, 
		EQUALS=29, NOT_EQUALS=30, IDENTITY_EQUALS=31, IDENTITY_NOT_EQUALS=32, 
		AND=33, OR=34, BOOLEAN=35, IF=36, ELSE=37, NUMBER=38, IDENTIFIER=39, STRING=40, 
		EOL=41, WHITE_SPACES=42;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u015b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\7\2f\n\2\f\2\16\2i\13"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3t\n\3\f\3\16\3w\13\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u00f8\n$\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3\'\3\'\3\'\3\'\7\'\u0106\n\'\f\'\16\'\u0109\13\'\3\'\3\'\3\'\7\'"+
		"\u010e\n\'\f\'\16\'\u0111\13\'\3\'\5\'\u0114\n\'\3(\3(\3(\7(\u0119\n("+
		"\f(\16(\u011c\13(\5(\u011e\n(\3)\3)\7)\u0122\n)\f)\16)\u0125\13)\3*\3"+
		"*\7*\u0129\n*\f*\16*\u012c\13*\3*\3*\3*\7*\u0131\n*\f*\16*\u0134\13*\3"+
		"*\5*\u0137\n*\3+\3+\3+\3+\5+\u013d\n+\3,\3,\3,\3,\5,\u0143\n,\3-\3-\3"+
		".\3.\3.\3/\7/\u014b\n/\f/\16/\u014e\13/\3/\6/\u0151\n/\r/\16/\u0152\3"+
		"\60\6\60\u0156\n\60\r\60\16\60\u0157\3\60\3\60\3g\2\61\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O\2Q)S*U\2W\2Y\2[\2]+_,\3\2\r\5\2\f\f\17\17\u202a\u202b\3\2\62;\4"+
		"\2\62;aa\3\2\63;\5\2C\\aac|\6\2\62;C\\aac|\6\2\f\f\17\17$$^^\6\2\f\f\17"+
		"\17))^^\13\2$$))^^ddhhppttvvxx\3\2==\6\2\13\13\r\16\"\"\u00a2\u00a2\2"+
		"\u0169\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5o\3\2\2\2\7z\3\2\2\2\t\u0086\3\2\2\2\13"+
		"\u008a\3\2\2\2\r\u0093\3\2\2\2\17\u0097\3\2\2\2\21\u009d\3\2\2\2\23\u00a6"+
		"\3\2\2\2\25\u00ad\3\2\2\2\27\u00b4\3\2\2\2\31\u00b6\3\2\2\2\33\u00b8\3"+
		"\2\2\2\35\u00ba\3\2\2\2\37\u00bc\3\2\2\2!\u00be\3\2\2\2#\u00c0\3\2\2\2"+
		"%\u00c2\3\2\2\2\'\u00c4\3\2\2\2)\u00c6\3\2\2\2+\u00c8\3\2\2\2-\u00ca\3"+
		"\2\2\2/\u00cc\3\2\2\2\61\u00ce\3\2\2\2\63\u00d0\3\2\2\2\65\u00d2\3\2\2"+
		"\2\67\u00d4\3\2\2\29\u00d7\3\2\2\2;\u00da\3\2\2\2=\u00dd\3\2\2\2?\u00e0"+
		"\3\2\2\2A\u00e4\3\2\2\2C\u00e8\3\2\2\2E\u00eb\3\2\2\2G\u00f7\3\2\2\2I"+
		"\u00f9\3\2\2\2K\u00fc\3\2\2\2M\u0113\3\2\2\2O\u011d\3\2\2\2Q\u011f\3\2"+
		"\2\2S\u0136\3\2\2\2U\u013c\3\2\2\2W\u0142\3\2\2\2Y\u0144\3\2\2\2[\u0146"+
		"\3\2\2\2]\u014c\3\2\2\2_\u0155\3\2\2\2ab\7\61\2\2bc\7,\2\2cg\3\2\2\2d"+
		"f\13\2\2\2ed\3\2\2\2fi\3\2\2\2gh\3\2\2\2ge\3\2\2\2hj\3\2\2\2ig\3\2\2\2"+
		"jk\7,\2\2kl\7\61\2\2lm\3\2\2\2mn\b\2\2\2n\4\3\2\2\2op\7\61\2\2pq\7\61"+
		"\2\2qu\3\2\2\2rt\n\2\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2"+
		"\2\2wu\3\2\2\2xy\b\3\2\2y\6\3\2\2\2z{\7e\2\2{|\7q\2\2|}\7p\2\2}~\7u\2"+
		"\2~\177\7q\2\2\177\u0080\7n\2\2\u0080\u0081\7g\2\2\u0081\u0082\7\60\2"+
		"\2\u0082\u0083\7n\2\2\u0083\u0084\7q\2\2\u0084\u0085\7i\2\2\u0085\b\3"+
		"\2\2\2\u0086\u0087\7x\2\2\u0087\u0088\7c\2\2\u0088\u0089\7t\2\2\u0089"+
		"\n\3\2\2\2\u008a\u008b\7e\2\2\u008b\u008c\7q\2\2\u008c\u008d\7p\2\2\u008d"+
		"\u008e\7v\2\2\u008e\u008f\7k\2\2\u008f\u0090\7p\2\2\u0090\u0091\7w\2\2"+
		"\u0091\u0092\7g\2\2\u0092\f\3\2\2\2\u0093\u0094\7h\2\2\u0094\u0095\7q"+
		"\2\2\u0095\u0096\7t\2\2\u0096\16\3\2\2\2\u0097\u0098\7y\2\2\u0098\u0099"+
		"\7j\2\2\u0099\u009a\7k\2\2\u009a\u009b\7n\2\2\u009b\u009c\7g\2\2\u009c"+
		"\20\3\2\2\2\u009d\u009e\7h\2\2\u009e\u009f\7w\2\2\u009f\u00a0\7p\2\2\u00a0"+
		"\u00a1\7e\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7q\2\2"+
		"\u00a4\u00a5\7p\2\2\u00a5\22\3\2\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7"+
		"g\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7i\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac"+
		"\7j\2\2\u00ac\24\3\2\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7g\2\2\u00af\u00b0"+
		"\7v\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7p\2\2\u00b3"+
		"\26\3\2\2\2\u00b4\u00b5\7]\2\2\u00b5\30\3\2\2\2\u00b6\u00b7\7_\2\2\u00b7"+
		"\32\3\2\2\2\u00b8\u00b9\7}\2\2\u00b9\34\3\2\2\2\u00ba\u00bb\7\177\2\2"+
		"\u00bb\36\3\2\2\2\u00bc\u00bd\7\60\2\2\u00bd \3\2\2\2\u00be\u00bf\7.\2"+
		"\2\u00bf\"\3\2\2\2\u00c0\u00c1\7=\2\2\u00c1$\3\2\2\2\u00c2\u00c3\7?\2"+
		"\2\u00c3&\3\2\2\2\u00c4\u00c5\7-\2\2\u00c5(\3\2\2\2\u00c6\u00c7\7/\2\2"+
		"\u00c7*\3\2\2\2\u00c8\u00c9\7\61\2\2\u00c9,\3\2\2\2\u00ca\u00cb\7,\2\2"+
		"\u00cb.\3\2\2\2\u00cc\u00cd\7*\2\2\u00cd\60\3\2\2\2\u00ce\u00cf\7+\2\2"+
		"\u00cf\62\3\2\2\2\u00d0\u00d1\7>\2\2\u00d1\64\3\2\2\2\u00d2\u00d3\7@\2"+
		"\2\u00d3\66\3\2\2\2\u00d4\u00d5\7>\2\2\u00d5\u00d6\7?\2\2\u00d68\3\2\2"+
		"\2\u00d7\u00d8\7@\2\2\u00d8\u00d9\7?\2\2\u00d9:\3\2\2\2\u00da\u00db\7"+
		"?\2\2\u00db\u00dc\7?\2\2\u00dc<\3\2\2\2\u00dd\u00de\7#\2\2\u00de\u00df"+
		"\7?\2\2\u00df>\3\2\2\2\u00e0\u00e1\7?\2\2\u00e1\u00e2\7?\2\2\u00e2\u00e3"+
		"\7?\2\2\u00e3@\3\2\2\2\u00e4\u00e5\7#\2\2\u00e5\u00e6\7?\2\2\u00e6\u00e7"+
		"\7?\2\2\u00e7B\3\2\2\2\u00e8\u00e9\7(\2\2\u00e9\u00ea\7(\2\2\u00eaD\3"+
		"\2\2\2\u00eb\u00ec\7~\2\2\u00ec\u00ed\7~\2\2\u00edF\3\2\2\2\u00ee\u00ef"+
		"\7v\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7w\2\2\u00f1\u00f8\7g\2\2\u00f2"+
		"\u00f3\7h\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7n\2\2\u00f5\u00f6\7u\2\2"+
		"\u00f6\u00f8\7g\2\2\u00f7\u00ee\3\2\2\2\u00f7\u00f2\3\2\2\2\u00f8H\3\2"+
		"\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb\7h\2\2\u00fbJ\3\2\2\2\u00fc\u00fd"+
		"\7g\2\2\u00fd\u00fe\7n\2\2\u00fe\u00ff\7u\2\2\u00ff\u0100\7g\2\2\u0100"+
		"L\3\2\2\2\u0101\u0102\5O(\2\u0102\u0103\7\60\2\2\u0103\u0107\t\3\2\2\u0104"+
		"\u0106\t\4\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108\u0114\3\2\2\2\u0109\u0107\3\2\2\2\u010a"+
		"\u010b\7\60\2\2\u010b\u010f\t\3\2\2\u010c\u010e\t\4\2\2\u010d\u010c\3"+
		"\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0114\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0114\5O(\2\u0113\u0101\3\2\2"+
		"\2\u0113\u010a\3\2\2\2\u0113\u0112\3\2\2\2\u0114N\3\2\2\2\u0115\u011e"+
		"\7\62\2\2\u0116\u011a\t\5\2\2\u0117\u0119\t\4\2\2\u0118\u0117\3\2\2\2"+
		"\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011e"+
		"\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u0115\3\2\2\2\u011d\u0116\3\2\2\2\u011e"+
		"P\3\2\2\2\u011f\u0123\t\6\2\2\u0120\u0122\t\7\2\2\u0121\u0120\3\2\2\2"+
		"\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124R\3"+
		"\2\2\2\u0125\u0123\3\2\2\2\u0126\u012a\7$\2\2\u0127\u0129\5U+\2\u0128"+
		"\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u0137\7$\2\2\u012e"+
		"\u0132\7)\2\2\u012f\u0131\5W,\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2"+
		"\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0132"+
		"\3\2\2\2\u0135\u0137\7)\2\2\u0136\u0126\3\2\2\2\u0136\u012e\3\2\2\2\u0137"+
		"T\3\2\2\2\u0138\u013d\n\b\2\2\u0139\u013a\7^\2\2\u013a\u013d\5Y-\2\u013b"+
		"\u013d\5[.\2\u013c\u0138\3\2\2\2\u013c\u0139\3\2\2\2\u013c\u013b\3\2\2"+
		"\2\u013dV\3\2\2\2\u013e\u0143\n\t\2\2\u013f\u0140\7^\2\2\u0140\u0143\5"+
		"Y-\2\u0141\u0143\5[.\2\u0142\u013e\3\2\2\2\u0142\u013f\3\2\2\2\u0142\u0141"+
		"\3\2\2\2\u0143X\3\2\2\2\u0144\u0145\t\n\2\2\u0145Z\3\2\2\2\u0146\u0147"+
		"\7^\2\2\u0147\u0148\t\2\2\2\u0148\\\3\2\2\2\u0149\u014b\t\13\2\2\u014a"+
		"\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2"+
		"\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0151\t\2\2\2\u0150"+
		"\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2"+
		"\2\2\u0153^\3\2\2\2\u0154\u0156\t\f\2\2\u0155\u0154\3\2\2\2\u0156\u0157"+
		"\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015a\b\60\2\2\u015a`\3\2\2\2\24\2gu\u00f7\u0107\u010f\u0113\u011a\u011d"+
		"\u0123\u012a\u0132\u0136\u013c\u0142\u014c\u0152\u0157\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}