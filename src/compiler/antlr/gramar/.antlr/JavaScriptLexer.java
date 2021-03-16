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
		NOT=19, PLUS_PLUS=20, PLUS=21, MINUS=22, DIVIDE=23, MULTIPLY=24, OPEN_PAREN=25, 
		CLOSE_PAREN=26, LESS_THAN=27, MORE_THAN=28, LESS_THAN_EQUALS=29, GREATER_THAN_EQUALS=30, 
		EQUALS=31, NOT_EQUALS=32, IDENTITY_EQUALS=33, IDENTITY_NOT_EQUALS=34, 
		AND=35, OR=36, BOOLEAN=37, IF=38, ELSE=39, NUMBER=40, IDENTIFIER=41, STRING=42, 
		EOL=43, WHITE_SPACES=44;
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
			"NOT", "PLUS_PLUS", "PLUS", "MINUS", "DIVIDE", "MULTIPLY", "OPEN_PAREN", 
			"CLOSE_PAREN", "LESS_THAN", "MORE_THAN", "LESS_THAN_EQUALS", "GREATER_THAN_EQUALS", 
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
			"','", "';'", "'='", "'!'", "'++'", "'+'", "'-'", "'/'", "'*'", "'('", 
			"')'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'==='", "'!=='", 
			"'&&'", "'||'", null, "'if'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MULTI_LINE_COMMENT", "SINGLE_LINE_COMMENT", "CONSOLE_LOG", "VAR", 
			"CONTINUE", "FOR", "WHILE", "FUNCTION", "LENGTH", "RETURN", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "OPEN_BRACE", "CLOSE_BRACE", "DOT", "COMMA", "SEMI_COLON", 
			"ASSIGN", "NOT", "PLUS_PLUS", "PLUS", "MINUS", "DIVIDE", "MULTIPLY", 
			"OPEN_PAREN", "CLOSE_PAREN", "LESS_THAN", "MORE_THAN", "LESS_THAN_EQUALS", 
			"GREATER_THAN_EQUALS", "EQUALS", "NOT_EQUALS", "IDENTITY_EQUALS", "IDENTITY_NOT_EQUALS", 
			"AND", "OR", "BOOLEAN", "IF", "ELSE", "NUMBER", "IDENTIFIER", "STRING", 
			"EOL", "WHITE_SPACES"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u0165\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3\2\7"+
		"\2j\n\2\f\2\16\2m\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3x\n\3\f"+
		"\3\16\3{\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\5"+
		"&\u00ff\n&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\7)\u010d\n)\f)\16)\u0110"+
		"\13)\3)\3)\3)\7)\u0115\n)\f)\16)\u0118\13)\3)\5)\u011b\n)\3*\3*\5*\u011f"+
		"\n*\3*\3*\7*\u0123\n*\f*\16*\u0126\13*\5*\u0128\n*\3+\3+\7+\u012c\n+\f"+
		"+\16+\u012f\13+\3,\3,\7,\u0133\n,\f,\16,\u0136\13,\3,\3,\3,\7,\u013b\n"+
		",\f,\16,\u013e\13,\3,\5,\u0141\n,\3-\3-\3-\3-\5-\u0147\n-\3.\3.\3.\3."+
		"\5.\u014d\n.\3/\3/\3\60\3\60\3\60\3\61\7\61\u0155\n\61\f\61\16\61\u0158"+
		"\13\61\3\61\6\61\u015b\n\61\r\61\16\61\u015c\3\62\6\62\u0160\n\62\r\62"+
		"\16\62\u0161\3\62\3\62\3k\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S\2U+W,Y\2[\2]\2"+
		"_\2a-c.\3\2\r\5\2\f\f\17\17\u202a\u202b\3\2\62;\4\2\62;aa\3\2\63;\5\2"+
		"C\\aac|\6\2\62;C\\aac|\6\2\f\f\17\17$$^^\6\2\f\f\17\17))^^\13\2$$))^^"+
		"ddhhppttvvxx\3\2==\6\2\13\13\r\16\"\"\u00a2\u00a2\2\u0174\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2a"+
		"\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5s\3\2\2\2\7|\3\2\2\2\t\u0088\3\2\2\2\13"+
		"\u008c\3\2\2\2\r\u0095\3\2\2\2\17\u0099\3\2\2\2\21\u009f\3\2\2\2\23\u00a8"+
		"\3\2\2\2\25\u00af\3\2\2\2\27\u00b6\3\2\2\2\31\u00b8\3\2\2\2\33\u00ba\3"+
		"\2\2\2\35\u00bc\3\2\2\2\37\u00be\3\2\2\2!\u00c0\3\2\2\2#\u00c2\3\2\2\2"+
		"%\u00c4\3\2\2\2\'\u00c6\3\2\2\2)\u00c8\3\2\2\2+\u00cb\3\2\2\2-\u00cd\3"+
		"\2\2\2/\u00cf\3\2\2\2\61\u00d1\3\2\2\2\63\u00d3\3\2\2\2\65\u00d5\3\2\2"+
		"\2\67\u00d7\3\2\2\29\u00d9\3\2\2\2;\u00db\3\2\2\2=\u00de\3\2\2\2?\u00e1"+
		"\3\2\2\2A\u00e4\3\2\2\2C\u00e7\3\2\2\2E\u00eb\3\2\2\2G\u00ef\3\2\2\2I"+
		"\u00f2\3\2\2\2K\u00fe\3\2\2\2M\u0100\3\2\2\2O\u0103\3\2\2\2Q\u011a\3\2"+
		"\2\2S\u0127\3\2\2\2U\u0129\3\2\2\2W\u0140\3\2\2\2Y\u0146\3\2\2\2[\u014c"+
		"\3\2\2\2]\u014e\3\2\2\2_\u0150\3\2\2\2a\u0156\3\2\2\2c\u015f\3\2\2\2e"+
		"f\7\61\2\2fg\7,\2\2gk\3\2\2\2hj\13\2\2\2ih\3\2\2\2jm\3\2\2\2kl\3\2\2\2"+
		"ki\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7,\2\2op\7\61\2\2pq\3\2\2\2qr\b\2\2\2"+
		"r\4\3\2\2\2st\7\61\2\2tu\7\61\2\2uy\3\2\2\2vx\n\2\2\2wv\3\2\2\2x{\3\2"+
		"\2\2yw\3\2\2\2yz\3\2\2\2z\6\3\2\2\2{y\3\2\2\2|}\7e\2\2}~\7q\2\2~\177\7"+
		"p\2\2\177\u0080\7u\2\2\u0080\u0081\7q\2\2\u0081\u0082\7n\2\2\u0082\u0083"+
		"\7g\2\2\u0083\u0084\7\60\2\2\u0084\u0085\7n\2\2\u0085\u0086\7q\2\2\u0086"+
		"\u0087\7i\2\2\u0087\b\3\2\2\2\u0088\u0089\7x\2\2\u0089\u008a\7c\2\2\u008a"+
		"\u008b\7t\2\2\u008b\n\3\2\2\2\u008c\u008d\7e\2\2\u008d\u008e\7q\2\2\u008e"+
		"\u008f\7p\2\2\u008f\u0090\7v\2\2\u0090\u0091\7k\2\2\u0091\u0092\7p\2\2"+
		"\u0092\u0093\7w\2\2\u0093\u0094\7g\2\2\u0094\f\3\2\2\2\u0095\u0096\7h"+
		"\2\2\u0096\u0097\7q\2\2\u0097\u0098\7t\2\2\u0098\16\3\2\2\2\u0099\u009a"+
		"\7y\2\2\u009a\u009b\7j\2\2\u009b\u009c\7k\2\2\u009c\u009d\7n\2\2\u009d"+
		"\u009e\7g\2\2\u009e\20\3\2\2\2\u009f\u00a0\7h\2\2\u00a0\u00a1\7w\2\2\u00a1"+
		"\u00a2\7p\2\2\u00a2\u00a3\7e\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7k\2\2"+
		"\u00a5\u00a6\7q\2\2\u00a6\u00a7\7p\2\2\u00a7\22\3\2\2\2\u00a8\u00a9\7"+
		"n\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7i\2\2\u00ac\u00ad"+
		"\7v\2\2\u00ad\u00ae\7j\2\2\u00ae\24\3\2\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1"+
		"\7g\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7w\2\2\u00b3\u00b4\7t\2\2\u00b4"+
		"\u00b5\7p\2\2\u00b5\26\3\2\2\2\u00b6\u00b7\7]\2\2\u00b7\30\3\2\2\2\u00b8"+
		"\u00b9\7_\2\2\u00b9\32\3\2\2\2\u00ba\u00bb\7}\2\2\u00bb\34\3\2\2\2\u00bc"+
		"\u00bd\7\177\2\2\u00bd\36\3\2\2\2\u00be\u00bf\7\60\2\2\u00bf \3\2\2\2"+
		"\u00c0\u00c1\7.\2\2\u00c1\"\3\2\2\2\u00c2\u00c3\7=\2\2\u00c3$\3\2\2\2"+
		"\u00c4\u00c5\7?\2\2\u00c5&\3\2\2\2\u00c6\u00c7\7#\2\2\u00c7(\3\2\2\2\u00c8"+
		"\u00c9\7-\2\2\u00c9\u00ca\7-\2\2\u00ca*\3\2\2\2\u00cb\u00cc\7-\2\2\u00cc"+
		",\3\2\2\2\u00cd\u00ce\7/\2\2\u00ce.\3\2\2\2\u00cf\u00d0\7\61\2\2\u00d0"+
		"\60\3\2\2\2\u00d1\u00d2\7,\2\2\u00d2\62\3\2\2\2\u00d3\u00d4\7*\2\2\u00d4"+
		"\64\3\2\2\2\u00d5\u00d6\7+\2\2\u00d6\66\3\2\2\2\u00d7\u00d8\7>\2\2\u00d8"+
		"8\3\2\2\2\u00d9\u00da\7@\2\2\u00da:\3\2\2\2\u00db\u00dc\7>\2\2\u00dc\u00dd"+
		"\7?\2\2\u00dd<\3\2\2\2\u00de\u00df\7@\2\2\u00df\u00e0\7?\2\2\u00e0>\3"+
		"\2\2\2\u00e1\u00e2\7?\2\2\u00e2\u00e3\7?\2\2\u00e3@\3\2\2\2\u00e4\u00e5"+
		"\7#\2\2\u00e5\u00e6\7?\2\2\u00e6B\3\2\2\2\u00e7\u00e8\7?\2\2\u00e8\u00e9"+
		"\7?\2\2\u00e9\u00ea\7?\2\2\u00eaD\3\2\2\2\u00eb\u00ec\7#\2\2\u00ec\u00ed"+
		"\7?\2\2\u00ed\u00ee\7?\2\2\u00eeF\3\2\2\2\u00ef\u00f0\7(\2\2\u00f0\u00f1"+
		"\7(\2\2\u00f1H\3\2\2\2\u00f2\u00f3\7~\2\2\u00f3\u00f4\7~\2\2\u00f4J\3"+
		"\2\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8\7w\2\2\u00f8"+
		"\u00ff\7g\2\2\u00f9\u00fa\7h\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7n\2\2"+
		"\u00fc\u00fd\7u\2\2\u00fd\u00ff\7g\2\2\u00fe\u00f5\3\2\2\2\u00fe\u00f9"+
		"\3\2\2\2\u00ffL\3\2\2\2\u0100\u0101\7k\2\2\u0101\u0102\7h\2\2\u0102N\3"+
		"\2\2\2\u0103\u0104\7g\2\2\u0104\u0105\7n\2\2\u0105\u0106\7u\2\2\u0106"+
		"\u0107\7g\2\2\u0107P\3\2\2\2\u0108\u0109\5S*\2\u0109\u010a\7\60\2\2\u010a"+
		"\u010e\t\3\2\2\u010b\u010d\t\4\2\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2"+
		"\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u011b\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0111\u0112\7\60\2\2\u0112\u0116\t\3\2\2\u0113\u0115\t"+
		"\4\2\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u011b\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011b\5S"+
		"*\2\u011a\u0108\3\2\2\2\u011a\u0111\3\2\2\2\u011a\u0119\3\2\2\2\u011b"+
		"R\3\2\2\2\u011c\u0128\7\62\2\2\u011d\u011f\7/\2\2\u011e\u011d\3\2\2\2"+
		"\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0124\t\5\2\2\u0121\u0123"+
		"\t\4\2\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u011c\3\2"+
		"\2\2\u0127\u011e\3\2\2\2\u0128T\3\2\2\2\u0129\u012d\t\6\2\2\u012a\u012c"+
		"\t\7\2\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012eV\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0134\7$\2\2\u0131"+
		"\u0133\5Y-\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2"+
		"\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0141"+
		"\7$\2\2\u0138\u013c\7)\2\2\u0139\u013b\5[.\2\u013a\u0139\3\2\2\2\u013b"+
		"\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2"+
		"\2\2\u013e\u013c\3\2\2\2\u013f\u0141\7)\2\2\u0140\u0130\3\2\2\2\u0140"+
		"\u0138\3\2\2\2\u0141X\3\2\2\2\u0142\u0147\n\b\2\2\u0143\u0144\7^\2\2\u0144"+
		"\u0147\5]/\2\u0145\u0147\5_\60\2\u0146\u0142\3\2\2\2\u0146\u0143\3\2\2"+
		"\2\u0146\u0145\3\2\2\2\u0147Z\3\2\2\2\u0148\u014d\n\t\2\2\u0149\u014a"+
		"\7^\2\2\u014a\u014d\5]/\2\u014b\u014d\5_\60\2\u014c\u0148\3\2\2\2\u014c"+
		"\u0149\3\2\2\2\u014c\u014b\3\2\2\2\u014d\\\3\2\2\2\u014e\u014f\t\n\2\2"+
		"\u014f^\3\2\2\2\u0150\u0151\7^\2\2\u0151\u0152\t\2\2\2\u0152`\3\2\2\2"+
		"\u0153\u0155\t\13\2\2\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154"+
		"\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0159"+
		"\u015b\t\2\2\2\u015a\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015a\3\2"+
		"\2\2\u015c\u015d\3\2\2\2\u015db\3\2\2\2\u015e\u0160\t\f\2\2\u015f\u015e"+
		"\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163\u0164\b\62\2\2\u0164d\3\2\2\2\25\2ky\u00fe\u010e"+
		"\u0116\u011a\u011e\u0124\u0127\u012d\u0134\u013c\u0140\u0146\u014c\u0156"+
		"\u015c\u0161\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}