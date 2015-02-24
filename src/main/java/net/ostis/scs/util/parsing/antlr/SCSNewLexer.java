// Generated from /media/timur/EE286A072869CEE1/Work/SC/SCSTranslator/Grammars/scsNew.g4 by ANTLR 4.1
package net.ostis.scs.util.parsing.antlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNSimulator;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class SCSNewLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int ID_SYSTEM = 1, COMMENT = 2, CONTENT = 3, LINK = 4,
			CONNECTORS = 5, SEP_SENTENCE = 6, SEP_SIMPLE = 7, SEP_LPAR = 8,
			SEP_RPAR = 9, SEP_ATTR_CONST = 10, SEP_ATTR_VAR = 11,
			SEP_IDTF = 12, SEP_LINT = 13, SEP_RINT = 14, SEP_LTUPLE = 15,
			SEP_RTUPLE = 16, SEP_LSET = 17, SEP_RSET = 18, SEP_LCONTENT = 19,
			SEP_RCONTENT = 20, SEP_ASSIGN = 21, WS = 22;
	public static String[] modeNames = { "DEFAULT_MODE" };

	public static final String[] tokenNames = { "<INVALID>", "ID_SYSTEM",
		"COMMENT", "CONTENT", "LINK", "CONNECTORS", "';;'", "'|'", "'('",
		"')'", "':'", "'::'", "';'", "'(*'", "'*)'", "'<'", "'>'", "'{'",
		"'}'", "'['", "']'", "'='", "WS" };
	public static final String[] ruleNames = { "ID_SYSTEM", "COMMENT",
		"CONTENT", "LINK", "CONNECTORS", "SEP_SENTENCE", "SEP_SIMPLE",
		"SEP_LPAR", "SEP_RPAR", "SEP_ATTR_CONST", "SEP_ATTR_VAR",
		"SEP_IDTF", "SEP_LINT", "SEP_RINT", "SEP_LTUPLE", "SEP_RTUPLE",
		"SEP_LSET", "SEP_RSET", "SEP_LCONTENT", "SEP_RCONTENT",
		"SEP_ASSIGN", "HEX_DIGIT", "OCTAL_ESC", "UNICODE_ESC", "WS" };

	public SCSNewLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA,
				_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() {
		return "scsNew.g4";
	}

	@Override
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String[] getModeNames() {
		return modeNames;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 24:
			WS_action(_localctx, actionIndex);
			break;
		}
	}

	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\30\u0125\b\1\4\2"
			+ "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"
			+ "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"
			+ "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"
			+ "\t\31\4\32\t\32\3\2\6\2\67\n\2\r\2\16\28\3\3\3\3\3\3\3\3\7\3?\n\3\f\3"
			+ "\16\3B\13\3\3\3\5\3E\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3M\n\3\3\3\7\3P\n\3"
			+ "\f\3\16\3S\13\3\3\3\3\3\5\3W\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4_\n\4\7\4"
			+ "a\n\4\f\4\16\4d\13\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5l\n\5\f\5\16\5o\13\5\3"
			+ "\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"
			+ "\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"
			+ "\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"
			+ "\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"
			+ "\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"
			+ "\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"
			+ "\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00e8\n\6\3"
			+ "\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16"
			+ "\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"
			+ "\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"
			+ "\3\30\3\30\5\30\u0119\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"
			+ "\3\32\3\32\3Q\33\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23"
			+ "\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1"
			+ "\'\25\1)\26\1+\27\1-\2\1/\2\1\61\2\1\63\30\2\3\2\t\b\2%%\60\60\62;C\\"
			+ "aac|\4\2\f\f\17\17\4\2]]__\3\2$$\4\2>>@@\5\2\62;CHch\5\2\13\f\17\17\""
			+ "\"\u0154\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"
			+ "\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"
			+ "\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"
			+ "\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2\63\3\2\2"
			+ "\2\3\66\3\2\2\2\5V\3\2\2\2\7X\3\2\2\2\tg\3\2\2\2\13\u00e7\3\2\2\2\r\u00e9"
			+ "\3\2\2\2\17\u00ec\3\2\2\2\21\u00ee\3\2\2\2\23\u00f0\3\2\2\2\25\u00f2\3"
			+ "\2\2\2\27\u00f4\3\2\2\2\31\u00f7\3\2\2\2\33\u00f9\3\2\2\2\35\u00fc\3\2"
			+ "\2\2\37\u00ff\3\2\2\2!\u0101\3\2\2\2#\u0103\3\2\2\2%\u0105\3\2\2\2\'\u0107"
			+ "\3\2\2\2)\u0109\3\2\2\2+\u010b\3\2\2\2-\u010d\3\2\2\2/\u0118\3\2\2\2\61"
			+ "\u011a\3\2\2\2\63\u0121\3\2\2\2\65\67\t\2\2\2\66\65\3\2\2\2\678\3\2\2"
			+ "\28\66\3\2\2\289\3\2\2\29\4\3\2\2\2:;\7\61\2\2;<\7\61\2\2<@\3\2\2\2=?"
			+ "\n\3\2\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AD\3\2\2\2B@\3\2\2\2C"
			+ "E\7\17\2\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FW\7\f\2\2GH\7\61\2\2HM\7,\2\2"
			+ "IJ\7\61\2\2JK\7#\2\2KM\7,\2\2LG\3\2\2\2LI\3\2\2\2MQ\3\2\2\2NP\13\2\2\2"
			+ "ON\3\2\2\2PS\3\2\2\2QR\3\2\2\2QO\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7,\2\2"
			+ "UW\7\61\2\2V:\3\2\2\2VL\3\2\2\2W\6\3\2\2\2Xb\5\'\24\2Ya\n\4\2\2Z[\7^\2"
			+ "\2[_\7]\2\2\\]\7^\2\2]_\7_\2\2^Z\3\2\2\2^\\\3\2\2\2_a\3\2\2\2`Y\3\2\2"
			+ "\2`^\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\5)\25"
			+ "\2f\b\3\2\2\2gm\7$\2\2hl\n\5\2\2ij\7^\2\2jl\7$\2\2kh\3\2\2\2ki\3\2\2\2"
			+ "lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7$\2\2q\n\3\2\2\2"
			+ "rs\7>\2\2s\u00e8\7@\2\2t\u00e8\t\6\2\2uv\7\60\2\2vw\7\60\2\2w\u00e8\7"
			+ "@\2\2xy\7>\2\2yz\7\60\2\2z\u00e8\7\60\2\2{|\7/\2\2|\u00e8\7@\2\2}~\7>"
			+ "\2\2~\u00e8\7/\2\2\177\u0080\7>\2\2\u0080\u0081\7?\2\2\u0081\u00e8\7@"
			+ "\2\2\u0082\u0083\7?\2\2\u0083\u00e8\7@\2\2\u0084\u0085\7>\2\2\u0085\u00e8"
			+ "\7?\2\2\u0086\u0087\7/\2\2\u0087\u0088\7~\2\2\u0088\u00e8\7@\2\2\u0089"
			+ "\u008a\7>\2\2\u008a\u008b\7~\2\2\u008b\u00e8\7/\2\2\u008c\u008d\7/\2\2"
			+ "\u008d\u008e\7\61\2\2\u008e\u00e8\7@\2\2\u008f\u0090\7>\2\2\u0090\u0091"
			+ "\7\61\2\2\u0091\u00e8\7/\2\2\u0092\u0093\7\u0080\2\2\u0093\u00e8\7@\2"
			+ "\2\u0094\u0095\7>\2\2\u0095\u00e8\7\u0080\2\2\u0096\u0097\7\u0080\2\2"
			+ "\u0097\u0098\7~\2\2\u0098\u00e8\7@\2\2\u0099\u009a\7>\2\2\u009a\u009b"
			+ "\7~\2\2\u009b\u00e8\7\u0080\2\2\u009c\u009d\7\u0080\2\2\u009d\u009e\7"
			+ "\61\2\2\u009e\u00e8\7@\2\2\u009f\u00a0\7>\2\2\u00a0\u00a1\7\61\2\2\u00a1"
			+ "\u00e8\7\u0080\2\2\u00a2\u00a3\7a\2\2\u00a3\u00a4\7>\2\2\u00a4\u00e8\7"
			+ "@\2\2\u00a5\u00a6\7a\2\2\u00a6\u00e8\7@\2\2\u00a7\u00a8\7a\2\2\u00a8\u00e8"
			+ "\7>\2\2\u00a9\u00aa\7a\2\2\u00aa\u00ab\7\60\2\2\u00ab\u00ac\7\60\2\2\u00ac"
			+ "\u00e8\7@\2\2\u00ad\u00ae\7a\2\2\u00ae\u00af\7>\2\2\u00af\u00b0\7\60\2"
			+ "\2\u00b0\u00e8\7\60\2\2\u00b1\u00b2\7a\2\2\u00b2\u00b3\7/\2\2\u00b3\u00e8"
			+ "\7@\2\2\u00b4\u00b5\7a\2\2\u00b5\u00b6\7>\2\2\u00b6\u00e8\7/\2\2\u00b7"
			+ "\u00b8\7a\2\2\u00b8\u00b9\7>\2\2\u00b9\u00ba\7?\2\2\u00ba\u00e8\7@\2\2"
			+ "\u00bb\u00bc\7a\2\2\u00bc\u00bd\7?\2\2\u00bd\u00e8\7@\2\2\u00be\u00bf"
			+ "\7a\2\2\u00bf\u00c0\7>\2\2\u00c0\u00e8\7?\2\2\u00c1\u00c2\7a\2\2\u00c2"
			+ "\u00c3\7/\2\2\u00c3\u00c4\7~\2\2\u00c4\u00e8\7@\2\2\u00c5\u00c6\7a\2\2"
			+ "\u00c6\u00c7\7>\2\2\u00c7\u00c8\7~\2\2\u00c8\u00e8\7/\2\2\u00c9\u00ca"
			+ "\7a\2\2\u00ca\u00cb\7/\2\2\u00cb\u00cc\7\61\2\2\u00cc\u00e8\7@\2\2\u00cd"
			+ "\u00ce\7a\2\2\u00ce\u00cf\7>\2\2\u00cf\u00d0\7\61\2\2\u00d0\u00e8\7/\2"
			+ "\2\u00d1\u00d2\7a\2\2\u00d2\u00d3\7\u0080\2\2\u00d3\u00e8\7@\2\2\u00d4"
			+ "\u00d5\7a\2\2\u00d5\u00d6\7>\2\2\u00d6\u00e8\7\u0080\2\2\u00d7\u00d8\7"
			+ "a\2\2\u00d8\u00d9\7\u0080\2\2\u00d9\u00da\7~\2\2\u00da\u00e8\7@\2\2\u00db"
			+ "\u00dc\7a\2\2\u00dc\u00dd\7>\2\2\u00dd\u00de\7~\2\2\u00de\u00e8\7\u0080"
			+ "\2\2\u00df\u00e0\7a\2\2\u00e0\u00e1\7\u0080\2\2\u00e1\u00e2\7\61\2\2\u00e2"
			+ "\u00e8\7@\2\2\u00e3\u00e4\7a\2\2\u00e4\u00e5\7>\2\2\u00e5\u00e6\7\61\2"
			+ "\2\u00e6\u00e8\7\u0080\2\2\u00e7r\3\2\2\2\u00e7t\3\2\2\2\u00e7u\3\2\2"
			+ "\2\u00e7x\3\2\2\2\u00e7{\3\2\2\2\u00e7}\3\2\2\2\u00e7\177\3\2\2\2\u00e7"
			+ "\u0082\3\2\2\2\u00e7\u0084\3\2\2\2\u00e7\u0086\3\2\2\2\u00e7\u0089\3\2"
			+ "\2\2\u00e7\u008c\3\2\2\2\u00e7\u008f\3\2\2\2\u00e7\u0092\3\2\2\2\u00e7"
			+ "\u0094\3\2\2\2\u00e7\u0096\3\2\2\2\u00e7\u0099\3\2\2\2\u00e7\u009c\3\2"
			+ "\2\2\u00e7\u009f\3\2\2\2\u00e7\u00a2\3\2\2\2\u00e7\u00a5\3\2\2\2\u00e7"
			+ "\u00a7\3\2\2\2\u00e7\u00a9\3\2\2\2\u00e7\u00ad\3\2\2\2\u00e7\u00b1\3\2"
			+ "\2\2\u00e7\u00b4\3\2\2\2\u00e7\u00b7\3\2\2\2\u00e7\u00bb\3\2\2\2\u00e7"
			+ "\u00be\3\2\2\2\u00e7\u00c1\3\2\2\2\u00e7\u00c5\3\2\2\2\u00e7\u00c9\3\2"
			+ "\2\2\u00e7\u00cd\3\2\2\2\u00e7\u00d1\3\2\2\2\u00e7\u00d4\3\2\2\2\u00e7"
			+ "\u00d7\3\2\2\2\u00e7\u00db\3\2\2\2\u00e7\u00df\3\2\2\2\u00e7\u00e3\3\2"
			+ "\2\2\u00e8\f\3\2\2\2\u00e9\u00ea\7=\2\2\u00ea\u00eb\7=\2\2\u00eb\16\3"
			+ "\2\2\2\u00ec\u00ed\7~\2\2\u00ed\20\3\2\2\2\u00ee\u00ef\7*\2\2\u00ef\22"
			+ "\3\2\2\2\u00f0\u00f1\7+\2\2\u00f1\24\3\2\2\2\u00f2\u00f3\7<\2\2\u00f3"
			+ "\26\3\2\2\2\u00f4\u00f5\7<\2\2\u00f5\u00f6\7<\2\2\u00f6\30\3\2\2\2\u00f7"
			+ "\u00f8\7=\2\2\u00f8\32\3\2\2\2\u00f9\u00fa\7*\2\2\u00fa\u00fb\7,\2\2\u00fb"
			+ "\34\3\2\2\2\u00fc\u00fd\7,\2\2\u00fd\u00fe\7+\2\2\u00fe\36\3\2\2\2\u00ff"
			+ "\u0100\7>\2\2\u0100 \3\2\2\2\u0101\u0102\7@\2\2\u0102\"\3\2\2\2\u0103"
			+ "\u0104\7}\2\2\u0104$\3\2\2\2\u0105\u0106\7\177\2\2\u0106&\3\2\2\2\u0107"
			+ "\u0108\7]\2\2\u0108(\3\2\2\2\u0109\u010a\7_\2\2\u010a*\3\2\2\2\u010b\u010c"
			+ "\7?\2\2\u010c,\3\2\2\2\u010d\u010e\t\7\2\2\u010e.\3\2\2\2\u010f\u0110"
			+ "\7^\2\2\u0110\u0111\4\62\65\2\u0111\u0112\4\629\2\u0112\u0119\4\629\2"
			+ "\u0113\u0114\7^\2\2\u0114\u0115\4\629\2\u0115\u0119\4\629\2\u0116\u0117"
			+ "\7^\2\2\u0117\u0119\4\629\2\u0118\u010f\3\2\2\2\u0118\u0113\3\2\2\2\u0118"
			+ "\u0116\3\2\2\2\u0119\60\3\2\2\2\u011a\u011b\7^\2\2\u011b\u011c\7w\2\2"
			+ "\u011c\u011d\5-\27\2\u011d\u011e\5-\27\2\u011e\u011f\5-\27\2\u011f\u0120"
			+ "\5-\27\2\u0120\62\3\2\2\2\u0121\u0122\t\b\2\2\u0122\u0123\3\2\2\2\u0123"
			+ "\u0124\b\32\2\2\u0124\64\3\2\2\2\20\28@DLQV^`bkm\u00e7\u0118";
	public static final ATN _ATN = ATNSimulator.deserialize(_serializedATN
			.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}