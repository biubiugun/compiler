// Generated from /Users/libohan/Desktop/Amy/compiler/src/Parser/Mxstar.g4 by ANTLR 4.9.1
package Parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MxstarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, Int=2, Bool=3, Void=4, True=5, False=6, String=7, NULL=8, For=9, 
		While=10, Break=11, Continue=12, New=13, Class=14, This=15, If=16, Else=17, 
		Return=18, Dot=19, LeftParen=20, RightParen=21, LeftBracket=22, RightBracket=23, 
		LeftBrace=24, RightBrace=25, Less=26, LessEqual=27, Greater=28, GreaterEqual=29, 
		LeftShift=30, RightShift=31, Plus=32, SelfPlus=33, Minus=34, SelfMinus=35, 
		Mul=36, Div=37, Mod=38, And=39, Or=40, AndAnd=41, OrOr=42, Caret=43, Not=44, 
		Tilde=45, Question=46, Colon=47, Semi=48, Comma=49, Assign=50, Equal=51, 
		NotEqual=52, BackSlash=53, DbQuotation=54, Identifier=55, DecimalInteger=56, 
		Whitespace=57, Newline=58, BlockComment=59, LineComment=60;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ESC", "STRING", "Int", "Bool", "Void", "True", "False", "String", "NULL", 
			"For", "While", "Break", "Continue", "New", "Class", "This", "If", "Else", 
			"Return", "Dot", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", 
			"LeftShift", "RightShift", "Plus", "SelfPlus", "Minus", "SelfMinus", 
			"Mul", "Div", "Mod", "And", "Or", "AndAnd", "OrOr", "Caret", "Not", "Tilde", 
			"Question", "Colon", "Semi", "Comma", "Assign", "Equal", "NotEqual", 
			"BackSlash", "DbQuotation", "Identifier", "DecimalInteger", "Whitespace", 
			"Newline", "BlockComment", "LineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'int'", "'bool'", "'void'", "'true'", "'false'", "'string'", 
			"'null'", "'for'", "'while'", "'break'", "'continue'", "'new'", "'class'", 
			"'this'", "'if'", "'else'", "'return'", "'.'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'<'", "'<='", "'>'", "'>='", "'<<'", "'>>'", "'+'", "'++'", 
			"'-'", "'--'", "'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", 
			"'!'", "'~'", "'?'", "':'", "';'", "','", "'='", "'=='", "'!='", "'\\\\'", 
			"'\\\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRING", "Int", "Bool", "Void", "True", "False", "String", "NULL", 
			"For", "While", "Break", "Continue", "New", "Class", "This", "If", "Else", 
			"Return", "Dot", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", 
			"LeftShift", "RightShift", "Plus", "SelfPlus", "Minus", "SelfMinus", 
			"Mul", "Div", "Mod", "And", "Or", "AndAnd", "OrOr", "Caret", "Not", "Tilde", 
			"Question", "Colon", "Semi", "Comma", "Assign", "Equal", "NotEqual", 
			"BackSlash", "DbQuotation", "Identifier", "DecimalInteger", "Whitespace", 
			"Newline", "BlockComment", "LineComment"
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


	public MxstarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mxstar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u0179\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0084\n\2\3\3\3\3\3\3\7\3\u0089\n\3"+
		"\f\3\16\3\u008c\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37"+
		"\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3"+
		"(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61"+
		"\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\38\38\38\39\39\79\u0142\n9\f9\169\u0145\139\3:\3:\7:\u0149\n:\f"+
		":\16:\u014c\13:\3:\5:\u014f\n:\3;\6;\u0152\n;\r;\16;\u0153\3;\3;\3<\3"+
		"<\5<\u015a\n<\3<\5<\u015d\n<\3<\3<\3=\3=\3=\3=\7=\u0165\n=\f=\16=\u0168"+
		"\13=\3=\3=\3=\3=\3=\3>\3>\3>\3>\7>\u0173\n>\f>\16>\u0176\13>\3>\3>\4\u008a"+
		"\u0166\2?\3\2\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16"+
		"\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\34"+
		"9\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63g\64i\65"+
		"k\66m\67o8q9s:u;w<y={>\3\2\b\4\2C\\c|\6\2\62;C\\aac|\3\2\63;\3\2\62;\4"+
		"\2\13\13\"\"\4\2\f\f\17\17\2\u0184\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2"+
		"w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\3\u0083\3\2\2\2\5\u0085\3\2\2\2\7\u008f"+
		"\3\2\2\2\t\u0093\3\2\2\2\13\u0098\3\2\2\2\r\u009d\3\2\2\2\17\u00a2\3\2"+
		"\2\2\21\u00a8\3\2\2\2\23\u00af\3\2\2\2\25\u00b4\3\2\2\2\27\u00b8\3\2\2"+
		"\2\31\u00be\3\2\2\2\33\u00c4\3\2\2\2\35\u00cd\3\2\2\2\37\u00d1\3\2\2\2"+
		"!\u00d7\3\2\2\2#\u00dc\3\2\2\2%\u00df\3\2\2\2\'\u00e4\3\2\2\2)\u00eb\3"+
		"\2\2\2+\u00ed\3\2\2\2-\u00ef\3\2\2\2/\u00f1\3\2\2\2\61\u00f3\3\2\2\2\63"+
		"\u00f5\3\2\2\2\65\u00f7\3\2\2\2\67\u00f9\3\2\2\29\u00fb\3\2\2\2;\u00fe"+
		"\3\2\2\2=\u0100\3\2\2\2?\u0103\3\2\2\2A\u0106\3\2\2\2C\u0109\3\2\2\2E"+
		"\u010b\3\2\2\2G\u010e\3\2\2\2I\u0110\3\2\2\2K\u0113\3\2\2\2M\u0115\3\2"+
		"\2\2O\u0117\3\2\2\2Q\u0119\3\2\2\2S\u011b\3\2\2\2U\u011d\3\2\2\2W\u0120"+
		"\3\2\2\2Y\u0123\3\2\2\2[\u0125\3\2\2\2]\u0127\3\2\2\2_\u0129\3\2\2\2a"+
		"\u012b\3\2\2\2c\u012d\3\2\2\2e\u012f\3\2\2\2g\u0131\3\2\2\2i\u0133\3\2"+
		"\2\2k\u0136\3\2\2\2m\u0139\3\2\2\2o\u013c\3\2\2\2q\u013f\3\2\2\2s\u014e"+
		"\3\2\2\2u\u0151\3\2\2\2w\u015c\3\2\2\2y\u0160\3\2\2\2{\u016e\3\2\2\2}"+
		"\u0084\5o8\2~\177\7^\2\2\177\u0084\7p\2\2\u0080\u0084\5m\67\2\u0081\u0082"+
		"\7^\2\2\u0082\u0084\7$\2\2\u0083}\3\2\2\2\u0083~\3\2\2\2\u0083\u0080\3"+
		"\2\2\2\u0083\u0081\3\2\2\2\u0084\4\3\2\2\2\u0085\u008a\7$\2\2\u0086\u0089"+
		"\5\3\2\2\u0087\u0089\13\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2"+
		"\u0089\u008c\3\2\2\2\u008a\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008d"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7$\2\2\u008e\6\3\2\2\2\u008f"+
		"\u0090\7k\2\2\u0090\u0091\7p\2\2\u0091\u0092\7v\2\2\u0092\b\3\2\2\2\u0093"+
		"\u0094\7d\2\2\u0094\u0095\7q\2\2\u0095\u0096\7q\2\2\u0096\u0097\7n\2\2"+
		"\u0097\n\3\2\2\2\u0098\u0099\7x\2\2\u0099\u009a\7q\2\2\u009a\u009b\7k"+
		"\2\2\u009b\u009c\7f\2\2\u009c\f\3\2\2\2\u009d\u009e\7v\2\2\u009e\u009f"+
		"\7t\2\2\u009f\u00a0\7w\2\2\u00a0\u00a1\7g\2\2\u00a1\16\3\2\2\2\u00a2\u00a3"+
		"\7h\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7u\2\2\u00a6"+
		"\u00a7\7g\2\2\u00a7\20\3\2\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa\7v\2\2\u00aa"+
		"\u00ab\7t\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7i\2\2"+
		"\u00ae\22\3\2\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2\7"+
		"n\2\2\u00b2\u00b3\7n\2\2\u00b3\24\3\2\2\2\u00b4\u00b5\7h\2\2\u00b5\u00b6"+
		"\7q\2\2\u00b6\u00b7\7t\2\2\u00b7\26\3\2\2\2\u00b8\u00b9\7y\2\2\u00b9\u00ba"+
		"\7j\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7g\2\2\u00bd"+
		"\30\3\2\2\2\u00be\u00bf\7d\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7g\2\2\u00c1"+
		"\u00c2\7c\2\2\u00c2\u00c3\7m\2\2\u00c3\32\3\2\2\2\u00c4\u00c5\7e\2\2\u00c5"+
		"\u00c6\7q\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7k\2\2"+
		"\u00c9\u00ca\7p\2\2\u00ca\u00cb\7w\2\2\u00cb\u00cc\7g\2\2\u00cc\34\3\2"+
		"\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7y\2\2\u00d0\36"+
		"\3\2\2\2\u00d1\u00d2\7e\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7c\2\2\u00d4"+
		"\u00d5\7u\2\2\u00d5\u00d6\7u\2\2\u00d6 \3\2\2\2\u00d7\u00d8\7v\2\2\u00d8"+
		"\u00d9\7j\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7u\2\2\u00db\"\3\2\2\2\u00dc"+
		"\u00dd\7k\2\2\u00dd\u00de\7h\2\2\u00de$\3\2\2\2\u00df\u00e0\7g\2\2\u00e0"+
		"\u00e1\7n\2\2\u00e1\u00e2\7u\2\2\u00e2\u00e3\7g\2\2\u00e3&\3\2\2\2\u00e4"+
		"\u00e5\7t\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7w\2\2"+
		"\u00e8\u00e9\7t\2\2\u00e9\u00ea\7p\2\2\u00ea(\3\2\2\2\u00eb\u00ec\7\60"+
		"\2\2\u00ec*\3\2\2\2\u00ed\u00ee\7*\2\2\u00ee,\3\2\2\2\u00ef\u00f0\7+\2"+
		"\2\u00f0.\3\2\2\2\u00f1\u00f2\7]\2\2\u00f2\60\3\2\2\2\u00f3\u00f4\7_\2"+
		"\2\u00f4\62\3\2\2\2\u00f5\u00f6\7}\2\2\u00f6\64\3\2\2\2\u00f7\u00f8\7"+
		"\177\2\2\u00f8\66\3\2\2\2\u00f9\u00fa\7>\2\2\u00fa8\3\2\2\2\u00fb\u00fc"+
		"\7>\2\2\u00fc\u00fd\7?\2\2\u00fd:\3\2\2\2\u00fe\u00ff\7@\2\2\u00ff<\3"+
		"\2\2\2\u0100\u0101\7@\2\2\u0101\u0102\7?\2\2\u0102>\3\2\2\2\u0103\u0104"+
		"\7>\2\2\u0104\u0105\7>\2\2\u0105@\3\2\2\2\u0106\u0107\7@\2\2\u0107\u0108"+
		"\7@\2\2\u0108B\3\2\2\2\u0109\u010a\7-\2\2\u010aD\3\2\2\2\u010b\u010c\7"+
		"-\2\2\u010c\u010d\7-\2\2\u010dF\3\2\2\2\u010e\u010f\7/\2\2\u010fH\3\2"+
		"\2\2\u0110\u0111\7/\2\2\u0111\u0112\7/\2\2\u0112J\3\2\2\2\u0113\u0114"+
		"\7,\2\2\u0114L\3\2\2\2\u0115\u0116\7\61\2\2\u0116N\3\2\2\2\u0117\u0118"+
		"\7\'\2\2\u0118P\3\2\2\2\u0119\u011a\7(\2\2\u011aR\3\2\2\2\u011b\u011c"+
		"\7~\2\2\u011cT\3\2\2\2\u011d\u011e\7(\2\2\u011e\u011f\7(\2\2\u011fV\3"+
		"\2\2\2\u0120\u0121\7~\2\2\u0121\u0122\7~\2\2\u0122X\3\2\2\2\u0123\u0124"+
		"\7`\2\2\u0124Z\3\2\2\2\u0125\u0126\7#\2\2\u0126\\\3\2\2\2\u0127\u0128"+
		"\7\u0080\2\2\u0128^\3\2\2\2\u0129\u012a\7A\2\2\u012a`\3\2\2\2\u012b\u012c"+
		"\7<\2\2\u012cb\3\2\2\2\u012d\u012e\7=\2\2\u012ed\3\2\2\2\u012f\u0130\7"+
		".\2\2\u0130f\3\2\2\2\u0131\u0132\7?\2\2\u0132h\3\2\2\2\u0133\u0134\7?"+
		"\2\2\u0134\u0135\7?\2\2\u0135j\3\2\2\2\u0136\u0137\7#\2\2\u0137\u0138"+
		"\7?\2\2\u0138l\3\2\2\2\u0139\u013a\7^\2\2\u013a\u013b\7^\2\2\u013bn\3"+
		"\2\2\2\u013c\u013d\7^\2\2\u013d\u013e\7$\2\2\u013ep\3\2\2\2\u013f\u0143"+
		"\t\2\2\2\u0140\u0142\t\3\2\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144r\3\2\2\2\u0145\u0143\3\2\2\2"+
		"\u0146\u014a\t\4\2\2\u0147\u0149\t\5\2\2\u0148\u0147\3\2\2\2\u0149\u014c"+
		"\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014f\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014d\u014f\7\62\2\2\u014e\u0146\3\2\2\2\u014e\u014d\3"+
		"\2\2\2\u014ft\3\2\2\2\u0150\u0152\t\6\2\2\u0151\u0150\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0156\b;\2\2\u0156v\3\2\2\2\u0157\u0159\7\17\2\2\u0158\u015a\7\f\2\2"+
		"\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u015d"+
		"\7\f\2\2\u015c\u0157\3\2\2\2\u015c\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u015f\b<\2\2\u015fx\3\2\2\2\u0160\u0161\7\61\2\2\u0161\u0162\7,\2\2\u0162"+
		"\u0166\3\2\2\2\u0163\u0165\13\2\2\2\u0164\u0163\3\2\2\2\u0165\u0168\3"+
		"\2\2\2\u0166\u0167\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0169\3\2\2\2\u0168"+
		"\u0166\3\2\2\2\u0169\u016a\7,\2\2\u016a\u016b\7\61\2\2\u016b\u016c\3\2"+
		"\2\2\u016c\u016d\b=\2\2\u016dz\3\2\2\2\u016e\u016f\7\61\2\2\u016f\u0170"+
		"\7\61\2\2\u0170\u0174\3\2\2\2\u0171\u0173\n\7\2\2\u0172\u0171\3\2\2\2"+
		"\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177"+
		"\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0178\b>\2\2\u0178|\3\2\2\2\16\2\u0083"+
		"\u0088\u008a\u0143\u014a\u014e\u0153\u0159\u015c\u0166\u0174\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}