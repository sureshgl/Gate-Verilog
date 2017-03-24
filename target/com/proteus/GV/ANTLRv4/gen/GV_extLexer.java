// Generated from GV_ext.g4 by ANTLR 4.5
package com.proteus.GV.ANTLRv4.gen;
 import com.proteus.GV.ext.*; 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GV_extLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, Decimal_number=16, 
		Binary_number=17, Octal_number=18, Hex_number=19, Sign=20, Size=21, Non_zero_unsigned_number=22, 
		Unsigned_number=23, Binary_value=24, Octal_value=25, Hex_value=26, Decimal_base=27, 
		Binary_base=28, Octal_base=29, Hex_base=30, Non_zero_decimal_digit=31, 
		Decimal_digit=32, Binary_digit=33, Octal_digit=34, Hex_digit=35, X_digit=36, 
		Z_digit=37, String=38, One_line_comment=39, Block_comment=40, Escaped_identifier=41, 
		Simple_identifier=42, Dollar_Identifier=43, White_space=44;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "Decimal_number", 
		"Binary_number", "Octal_number", "Hex_number", "Sign", "Size", "Non_zero_unsigned_number", 
		"Unsigned_number", "Binary_value", "Octal_value", "Hex_value", "Decimal_base", 
		"Binary_base", "Octal_base", "Hex_base", "Non_zero_decimal_digit", "Decimal_digit", 
		"Binary_digit", "Octal_digit", "Hex_digit", "X_digit", "Z_digit", "String", 
		"One_line_comment", "Block_comment", "Escaped_identifier", "Simple_identifier", 
		"Dollar_Identifier", "White_space"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'module'", "';'", "'endmodule'", "'('", "','", "')'", "'wire'", 
		"'='", "'['", "':'", "']'", "'.'", "'assign'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "Decimal_number", "Binary_number", "Octal_number", 
		"Hex_number", "Sign", "Size", "Non_zero_unsigned_number", "Unsigned_number", 
		"Binary_value", "Octal_value", "Hex_value", "Decimal_base", "Binary_base", 
		"Octal_base", "Hex_base", "Non_zero_decimal_digit", "Decimal_digit", "Binary_digit", 
		"Octal_digit", "Hex_digit", "X_digit", "Z_digit", "String", "One_line_comment", 
		"Block_comment", "Escaped_identifier", "Simple_identifier", "Dollar_Identifier", 
		"White_space"
	};
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


	public GV_extLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GV_ext.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2.\u015e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\5\21\u0091\n\21\3\21\3\21\3\21\3\21\5\21"+
		"\u0097\n\21\3\21\3\21\3\21\7\21\u009c\n\21\f\21\16\21\u009f\13\21\3\21"+
		"\5\21\u00a2\n\21\3\21\3\21\3\21\7\21\u00a7\n\21\f\21\16\21\u00aa\13\21"+
		"\5\21\u00ac\n\21\3\22\5\22\u00af\n\22\3\22\3\22\3\22\3\23\5\23\u00b5\n"+
		"\23\3\23\3\23\3\23\3\24\5\24\u00bb\n\24\3\24\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\27\7\27\u00c7\n\27\f\27\16\27\u00ca\13\27\3\30\3\30"+
		"\3\30\7\30\u00cf\n\30\f\30\16\30\u00d2\13\30\3\31\3\31\3\31\7\31\u00d7"+
		"\n\31\f\31\16\31\u00da\13\31\3\32\3\32\3\32\7\32\u00df\n\32\f\32\16\32"+
		"\u00e2\13\32\3\33\3\33\3\33\7\33\u00e7\n\33\f\33\16\33\u00ea\13\33\3\34"+
		"\3\34\5\34\u00ee\n\34\3\34\3\34\3\35\3\35\5\35\u00f4\n\35\3\35\3\35\3"+
		"\36\3\36\5\36\u00fa\n\36\3\36\3\36\3\37\3\37\5\37\u0100\n\37\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\3\"\3\"\5\"\u010b\n\"\3#\3#\3#\5#\u0110\n#\3$\3$\3$\5"+
		"$\u0115\n$\3%\3%\3&\3&\3\'\3\'\7\'\u011d\n\'\f\'\16\'\u0120\13\'\3\'\3"+
		"\'\3(\3(\3(\3(\7(\u0128\n(\f(\16(\u012b\13(\3(\5(\u012e\n(\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\7)\u0138\n)\f)\16)\u013b\13)\3)\3)\3)\3)\3)\3*\3*\7*\u0144"+
		"\n*\f*\16*\u0147\13*\3+\3+\7+\u014b\n+\f+\16+\u014e\13+\3,\3,\3,\7,\u0153"+
		"\n,\f,\16,\u0156\13,\3-\6-\u0159\n-\r-\16-\u015a\3-\3-\4\u0129\u0139\2"+
		".\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.\3\2\23\4\2--//\4\2UUuu\4\2FFff\4\2DD"+
		"dd\4\2QQqq\4\2JJjj\3\2\63;\3\2\62;\3\2\62\63\3\2\629\5\2\62;CHch\4\2Z"+
		"Zzz\5\2AA\\\\||\4\2\f\f\17\17\5\2\13\f\17\17\"\"\5\2C\\aac|\7\2&&\62;"+
		"C\\aac|\u0184\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5b\3\2\2\2\7d\3"+
		"\2\2\2\tn\3\2\2\2\13p\3\2\2\2\rr\3\2\2\2\17t\3\2\2\2\21y\3\2\2\2\23{\3"+
		"\2\2\2\25}\3\2\2\2\27\177\3\2\2\2\31\u0081\3\2\2\2\33\u0083\3\2\2\2\35"+
		"\u008a\3\2\2\2\37\u008c\3\2\2\2!\u00ab\3\2\2\2#\u00ae\3\2\2\2%\u00b4\3"+
		"\2\2\2\'\u00ba\3\2\2\2)\u00bf\3\2\2\2+\u00c1\3\2\2\2-\u00c3\3\2\2\2/\u00cb"+
		"\3\2\2\2\61\u00d3\3\2\2\2\63\u00db\3\2\2\2\65\u00e3\3\2\2\2\67\u00eb\3"+
		"\2\2\29\u00f1\3\2\2\2;\u00f7\3\2\2\2=\u00fd\3\2\2\2?\u0103\3\2\2\2A\u0105"+
		"\3\2\2\2C\u010a\3\2\2\2E\u010f\3\2\2\2G\u0114\3\2\2\2I\u0116\3\2\2\2K"+
		"\u0118\3\2\2\2M\u011a\3\2\2\2O\u0123\3\2\2\2Q\u0133\3\2\2\2S\u0141\3\2"+
		"\2\2U\u0148\3\2\2\2W\u014f\3\2\2\2Y\u0158\3\2\2\2[\\\7o\2\2\\]\7q\2\2"+
		"]^\7f\2\2^_\7w\2\2_`\7n\2\2`a\7g\2\2a\4\3\2\2\2bc\7=\2\2c\6\3\2\2\2de"+
		"\7g\2\2ef\7p\2\2fg\7f\2\2gh\7o\2\2hi\7q\2\2ij\7f\2\2jk\7w\2\2kl\7n\2\2"+
		"lm\7g\2\2m\b\3\2\2\2no\7*\2\2o\n\3\2\2\2pq\7.\2\2q\f\3\2\2\2rs\7+\2\2"+
		"s\16\3\2\2\2tu\7y\2\2uv\7k\2\2vw\7t\2\2wx\7g\2\2x\20\3\2\2\2yz\7?\2\2"+
		"z\22\3\2\2\2{|\7]\2\2|\24\3\2\2\2}~\7<\2\2~\26\3\2\2\2\177\u0080\7_\2"+
		"\2\u0080\30\3\2\2\2\u0081\u0082\7\60\2\2\u0082\32\3\2\2\2\u0083\u0084"+
		"\7c\2\2\u0084\u0085\7u\2\2\u0085\u0086\7u\2\2\u0086\u0087\7k\2\2\u0087"+
		"\u0088\7i\2\2\u0088\u0089\7p\2\2\u0089\34\3\2\2\2\u008a\u008b\7}\2\2\u008b"+
		"\36\3\2\2\2\u008c\u008d\7\177\2\2\u008d \3\2\2\2\u008e\u00ac\5/\30\2\u008f"+
		"\u0091\5+\26\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0093\5\67\34\2\u0093\u0094\5/\30\2\u0094\u00ac\3\2\2\2\u0095"+
		"\u0097\5+\26\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u0099\5\67\34\2\u0099\u009d\5I%\2\u009a\u009c\7a\2\2\u009b"+
		"\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\u00ac\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\5+\26\2\u00a1"+
		"\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\5\67"+
		"\34\2\u00a4\u00a8\5K&\2\u00a5\u00a7\7a\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa"+
		"\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u008e\3\2\2\2\u00ab\u0090\3\2\2\2\u00ab\u0096\3\2"+
		"\2\2\u00ab\u00a1\3\2\2\2\u00ac\"\3\2\2\2\u00ad\u00af\5+\26\2\u00ae\u00ad"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\59\35\2\u00b1"+
		"\u00b2\5\61\31\2\u00b2$\3\2\2\2\u00b3\u00b5\5+\26\2\u00b4\u00b3\3\2\2"+
		"\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\5;\36\2\u00b7\u00b8"+
		"\5\63\32\2\u00b8&\3\2\2\2\u00b9\u00bb\5+\26\2\u00ba\u00b9\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\5=\37\2\u00bd\u00be\5\65"+
		"\33\2\u00be(\3\2\2\2\u00bf\u00c0\t\2\2\2\u00c0*\3\2\2\2\u00c1\u00c2\5"+
		"-\27\2\u00c2,\3\2\2\2\u00c3\u00c8\5? \2\u00c4\u00c7\7a\2\2\u00c5\u00c7"+
		"\5A!\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9.\3\2\2\2\u00ca\u00c8\3\2\2\2"+
		"\u00cb\u00d0\5A!\2\u00cc\u00cf\7a\2\2\u00cd\u00cf\5A!\2\u00ce\u00cc\3"+
		"\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\60\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d8\5C\"\2"+
		"\u00d4\u00d7\7a\2\2\u00d5\u00d7\5C\"\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5"+
		"\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\62\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00e0\5E#\2\u00dc\u00df\7a\2\2\u00dd"+
		"\u00df\5E#\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2"+
		"\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\64\3\2\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e3\u00e8\5G$\2\u00e4\u00e7\7a\2\2\u00e5\u00e7\5G$\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\66\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ed"+
		"\7)\2\2\u00ec\u00ee\t\3\2\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f0\t\4\2\2\u00f08\3\2\2\2\u00f1\u00f3\7)\2\2\u00f2"+
		"\u00f4\t\3\2\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f6\t\5\2\2\u00f6:\3\2\2\2\u00f7\u00f9\7)\2\2\u00f8\u00fa"+
		"\t\3\2\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fc\t\6\2\2\u00fc<\3\2\2\2\u00fd\u00ff\7)\2\2\u00fe\u0100\t\3\2\2\u00ff"+
		"\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\t\7"+
		"\2\2\u0102>\3\2\2\2\u0103\u0104\t\b\2\2\u0104@\3\2\2\2\u0105\u0106\t\t"+
		"\2\2\u0106B\3\2\2\2\u0107\u010b\5I%\2\u0108\u010b\5K&\2\u0109\u010b\t"+
		"\n\2\2\u010a\u0107\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b"+
		"D\3\2\2\2\u010c\u0110\5I%\2\u010d\u0110\5K&\2\u010e\u0110\t\13\2\2\u010f"+
		"\u010c\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110F\3\2\2\2"+
		"\u0111\u0115\5I%\2\u0112\u0115\5K&\2\u0113\u0115\t\f\2\2\u0114\u0111\3"+
		"\2\2\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115H\3\2\2\2\u0116\u0117"+
		"\t\r\2\2\u0117J\3\2\2\2\u0118\u0119\t\16\2\2\u0119L\3\2\2\2\u011a\u011e"+
		"\7$\2\2\u011b\u011d\n\17\2\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0121\u0122\7$\2\2\u0122N\3\2\2\2\u0123\u0124\7\61\2\2\u0124\u0125"+
		"\7\61\2\2\u0125\u0129\3\2\2\2\u0126\u0128\13\2\2\2\u0127\u0126\3\2\2\2"+
		"\u0128\u012b\3\2\2\2\u0129\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012d"+
		"\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012e\7\17\2\2\u012d\u012c\3\2\2\2"+
		"\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\7\f\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u0132\b(\2\2\u0132P\3\2\2\2\u0133\u0134\7\61\2\2\u0134"+
		"\u0135\7,\2\2\u0135\u0139\3\2\2\2\u0136\u0138\13\2\2\2\u0137\u0136\3\2"+
		"\2\2\u0138\u013b\3\2\2\2\u0139\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a"+
		"\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7,\2\2\u013d\u013e\7\61"+
		"\2\2\u013e\u013f\3\2\2\2\u013f\u0140\b)\2\2\u0140R\3\2\2\2\u0141\u0145"+
		"\7^\2\2\u0142\u0144\n\20\2\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146T\3\2\2\2\u0147\u0145\3\2\2\2"+
		"\u0148\u014c\t\21\2\2\u0149\u014b\t\22\2\2\u014a\u0149\3\2\2\2\u014b\u014e"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014dV\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014f\u0150\7&\2\2\u0150\u0154\t\22\2\2\u0151\u0153\t\22"+
		"\2\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155X\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0159\t\20\2\2"+
		"\u0158\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\b-\2\2\u015dZ\3\2\2\2%\2\u0090"+
		"\u0096\u009d\u00a1\u00a8\u00ab\u00ae\u00b4\u00ba\u00c6\u00c8\u00ce\u00d0"+
		"\u00d6\u00d8\u00de\u00e0\u00e6\u00e8\u00ed\u00f3\u00f9\u00ff\u010a\u010f"+
		"\u0114\u011e\u0129\u012d\u0139\u0145\u014c\u0154\u015a\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}