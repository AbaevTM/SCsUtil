// Generated from /media/timur/EE286A072869CEE1/Work/SC/SCSTranslator/Grammars/scsNew.g4 by ANTLR 4.1
package net.ostis.scs.util.parsing.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SCSNewParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID_SYSTEM=1, COMMENT=2, CONTENT=3, LINK=4, CONNECTORS=5, SEP_SENTENCE=6, 
		SEP_SIMPLE=7, SEP_LPAR=8, SEP_RPAR=9, SEP_ATTR_CONST=10, SEP_ATTR_VAR=11, 
		SEP_IDTF=12, SEP_LINT=13, SEP_RINT=14, SEP_LTUPLE=15, SEP_RTUPLE=16, SEP_LSET=17, 
		SEP_RSET=18, SEP_LCONTENT=19, SEP_RCONTENT=20, SEP_ASSIGN=21, WS=22;
	public static final String[] tokenNames = {
		"<INVALID>", "ID_SYSTEM", "COMMENT", "CONTENT", "LINK", "CONNECTORS", 
		"';;'", "'|'", "'('", "')'", "':'", "'::'", "';'", "'(*'", "'*)'", "'<'", 
		"'>'", "'{'", "'}'", "'['", "']'", "'='", "WS"
	};
	public static final int
		RULE_syntax = 0, RULE_sentence = 1, RULE_sentence_level2_6 = 2, RULE_sentence_level1 = 3, 
		RULE_sentence_internal_list = 4, RULE_sentence_assignment = 5, RULE_sentence_internal = 6, 
		RULE_attrs_idtf_list = 7, RULE_idtf_attrs = 8, RULE_attrs_list = 9, RULE_attr_sep = 10, 
		RULE_idtf_internal = 11, RULE_idtf_tuple = 12, RULE_idtf_set = 13, RULE_idtf = 14, 
		RULE_idtf_level1 = 15, RULE_idtf_edge = 16;
	public static final String[] ruleNames = {
		"syntax", "sentence", "sentence_level2_6", "sentence_level1", "sentence_internal_list", 
		"sentence_assignment", "sentence_internal", "attrs_idtf_list", "idtf_attrs", 
		"attrs_list", "attr_sep", "idtf_internal", "idtf_tuple", "idtf_set", "idtf", 
		"idtf_level1", "idtf_edge"
	};

	@Override
	public String getGrammarFileName() { return "scsNew.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public SCSNewParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SyntaxContext extends ParserRuleContext {
		public TerminalNode SEP_SENTENCE(int i) {
			return getToken(SCSNewParser.SEP_SENTENCE, i);
		}
		public TerminalNode EOF() { return getToken(SCSNewParser.EOF, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public TerminalNode COMMENT(int i) {
			return getToken(SCSNewParser.COMMENT, i);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(SCSNewParser.COMMENT); }
		public List<TerminalNode> SEP_SENTENCE() { return getTokens(SCSNewParser.SEP_SENTENCE); }
		public SyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).enterSyntax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).exitSyntax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCSNewVisitor ) return ((SCSNewVisitor<? extends T>)visitor).visitSyntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SyntaxContext syntax() throws RecognitionException {
		SyntaxContext _localctx = new SyntaxContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_syntax);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID_SYSTEM) | (1L << COMMENT) | (1L << CONTENT) | (1L << LINK) | (1L << SEP_SENTENCE) | (1L << SEP_LPAR) | (1L << SEP_LTUPLE) | (1L << SEP_LSET))) != 0)) {
				{
				setState(38);
				switch (_input.LA(1)) {
				case ID_SYSTEM:
				case CONTENT:
				case LINK:
				case SEP_SENTENCE:
				case SEP_LPAR:
				case SEP_LTUPLE:
				case SEP_LSET:
					{
					setState(34); sentence();
					setState(35); match(SEP_SENTENCE);
					}
					break;
				case COMMENT:
					{
					setState(37); match(COMMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43); match(EOF);
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

	public static class SentenceContext extends ParserRuleContext {
		public Sentence_assignmentContext sentence_assignment() {
			return getRuleContext(Sentence_assignmentContext.class,0);
		}
		public Sentence_level2_6Context sentence_level2_6() {
			return getRuleContext(Sentence_level2_6Context.class,0);
		}
		public Sentence_level1Context sentence_level1() {
			return getRuleContext(Sentence_level1Context.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCSNewVisitor ) return ((SCSNewVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(48);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45); sentence_level1();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46); sentence_level2_6();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(47); sentence_assignment();
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

	public static class Sentence_level2_6Context extends ParserRuleContext {
		public Token c1;
		public Attrs_idtf_listContext a1;
		public Token c2;
		public Attrs_idtf_listContext a2;
		public TerminalNode SEP_IDTF(int i) {
			return getToken(SCSNewParser.SEP_IDTF, i);
		}
		public List<Attrs_idtf_listContext> attrs_idtf_list() {
			return getRuleContexts(Attrs_idtf_listContext.class);
		}
		public TerminalNode CONNECTORS(int i) {
			return getToken(SCSNewParser.CONNECTORS, i);
		}
		public IdtfContext idtf() {
			return getRuleContext(IdtfContext.class,0);
		}
		public Attrs_idtf_listContext attrs_idtf_list(int i) {
			return getRuleContext(Attrs_idtf_listContext.class,i);
		}
		public List<TerminalNode> CONNECTORS() { return getTokens(SCSNewParser.CONNECTORS); }
		public List<TerminalNode> SEP_IDTF() { return getTokens(SCSNewParser.SEP_IDTF); }
		public Sentence_level2_6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence_level2_6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).enterSentence_level2_6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).exitSentence_level2_6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCSNewVisitor ) return ((SCSNewVisitor<? extends T>)visitor).visitSentence_level2_6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentence_level2_6Context sentence_level2_6() throws RecognitionException {
		Sentence_level2_6Context _localctx = new Sentence_level2_6Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentence_level2_6);
		int _la;
		try {
			setState(63);
			switch (_input.LA(1)) {
			case SEP_SENTENCE:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ID_SYSTEM:
			case CONTENT:
			case LINK:
			case SEP_LPAR:
			case SEP_LTUPLE:
			case SEP_LSET:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(51); idtf();
				setState(52); ((Sentence_level2_6Context)_localctx).c1 = match(CONNECTORS);
				setState(53); ((Sentence_level2_6Context)_localctx).a1 = attrs_idtf_list();
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEP_IDTF) {
					{
					{
					setState(55); match(SEP_IDTF);
					setState(56); ((Sentence_level2_6Context)_localctx).c2 = match(CONNECTORS);
					setState(57); ((Sentence_level2_6Context)_localctx).a2 = attrs_idtf_list();
					}
					}
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Sentence_level1Context extends ParserRuleContext {
		public List<TerminalNode> SEP_SIMPLE() { return getTokens(SCSNewParser.SEP_SIMPLE); }
		public Idtf_level1Context idtf_level1(int i) {
			return getRuleContext(Idtf_level1Context.class,i);
		}
		public TerminalNode SEP_SIMPLE(int i) {
			return getToken(SCSNewParser.SEP_SIMPLE, i);
		}
		public List<Idtf_level1Context> idtf_level1() {
			return getRuleContexts(Idtf_level1Context.class);
		}
		public Sentence_level1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence_level1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).enterSentence_level1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).exitSentence_level1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCSNewVisitor ) return ((SCSNewVisitor<? extends T>)visitor).visitSentence_level1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentence_level1Context sentence_level1() throws RecognitionException {
		Sentence_level1Context _localctx = new Sentence_level1Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentence_level1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); idtf_level1();
			setState(66); match(SEP_SIMPLE);
			setState(67); idtf_level1();
			setState(68); match(SEP_SIMPLE);
			setState(69); idtf_level1();
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

	public static class Sentence_internal_listContext extends ParserRuleContext {
		public TerminalNode SEP_SENTENCE(int i) {
			return getToken(SCSNewParser.SEP_SENTENCE, i);
		}
		public List<Sentence_internalContext> sentence_internal() {
			return getRuleContexts(Sentence_internalContext.class);
		}
		public Sentence_internalContext sentence_internal(int i) {
			return getRuleContext(Sentence_internalContext.class,i);
		}
		public TerminalNode SEP_LINT() { return getToken(SCSNewParser.SEP_LINT, 0); }
		public List<TerminalNode> SEP_SENTENCE() { return getTokens(SCSNewParser.SEP_SENTENCE); }
		public TerminalNode SEP_RINT() { return getToken(SCSNewParser.SEP_RINT, 0); }
		public Sentence_internal_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence_internal_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).enterSentence_internal_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).exitSentence_internal_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCSNewVisitor ) return ((SCSNewVisitor<? extends T>)visitor).visitSentence_internal_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentence_internal_listContext sentence_internal_list() throws RecognitionException {
		Sentence_internal_listContext _localctx = new Sentence_internal_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentence_internal_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(SEP_LINT);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONNECTORS) {
				{
				{
				setState(72); sentence_internal();
				setState(73); match(SEP_SENTENCE);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80); match(SEP_RINT);
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

	public static class Sentence_assignmentContext extends ParserRuleContext {
		public TerminalNode SEP_ASSIGN() { return getToken(SCSNewParser.SEP_ASSIGN, 0); }
		public List<IdtfContext> idtf() {
			return getRuleContexts(IdtfContext.class);
		}
		public IdtfContext idtf(int i) {
			return getRuleContext(IdtfContext.class,i);
		}
		public Sentence_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).enterSentence_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).exitSentence_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCSNewVisitor ) return ((SCSNewVisitor<? extends T>)visitor).visitSentence_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentence_assignmentContext sentence_assignment() throws RecognitionException {
		Sentence_assignmentContext _localctx = new Sentence_assignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sentence_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); idtf();
			setState(83); match(SEP_ASSIGN);
			setState(84); idtf();
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

	public static class Sentence_internalContext extends ParserRuleContext {
		public Attrs_idtf_listContext attrs_idtf_list() {
			return getRuleContext(Attrs_idtf_listContext.class,0);
		}
		public TerminalNode CONNECTORS() { return getToken(SCSNewParser.CONNECTORS, 0); }
		public Sentence_internalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence_internal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).enterSentence_internal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).exitSentence_internal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCSNewVisitor ) return ((SCSNewVisitor<? extends T>)visitor).visitSentence_internal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentence_internalContext sentence_internal() throws RecognitionException {
		Sentence_internalContext _localctx = new Sentence_internalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sentence_internal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(CONNECTORS);
			setState(87); attrs_idtf_list();
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

	public static class Attrs_idtf_listContext extends ParserRuleContext {
		public TerminalNode SEP_IDTF(int i) {
			return getToken(SCSNewParser.SEP_IDTF, i);
		}
		public Idtf_attrsContext idtf_attrs(int i) {
			return getRuleContext(Idtf_attrsContext.class,i);
		}
		public List<Idtf_attrsContext> idtf_attrs() {
			return getRuleContexts(Idtf_attrsContext.class);
		}
		public List<TerminalNode> SEP_IDTF() { return getTokens(SCSNewParser.SEP_IDTF); }
		public Attrs_idtf_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrs_idtf_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).enterAttrs_idtf_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).exitAttrs_idtf_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCSNewVisitor ) return ((SCSNewVisitor<? extends T>)visitor).visitAttrs_idtf_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attrs_idtf_listContext attrs_idtf_list() throws RecognitionException {
		Attrs_idtf_listContext _localctx = new Attrs_idtf_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attrs_idtf_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89); idtf_attrs();
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(90); match(SEP_IDTF);
					setState(91); idtf_attrs();
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class Idtf_attrsContext extends ParserRuleContext {
		public Idtf_internalContext idtf_internal() {
			return getRuleContext(Idtf_internalContext.class,0);
		}
		public Attrs_listContext attrs_list() {
			return getRuleContext(Attrs_listContext.class,0);
		}
		public Idtf_attrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idtf_attrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).enterIdtf_attrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).exitIdtf_attrs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCSNewVisitor ) return ((SCSNewVisitor<? extends T>)visitor).visitIdtf_attrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Idtf_attrsContext idtf_attrs() throws RecognitionException {
		Idtf_attrsContext _localctx = new Idtf_attrsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_idtf_attrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); attrs_list();
			setState(98); idtf_internal();
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

	public static class Attrs_listContext extends ParserRuleContext {
		public Attr_sepContext attr_sep(int i) {
			return getRuleContext(Attr_sepContext.class,i);
		}
		public List<Attr_sepContext> attr_sep() {
			return getRuleContexts(Attr_sepContext.class);
		}
		public Attrs_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrs_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).enterAttrs_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).exitAttrs_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCSNewVisitor ) return ((SCSNewVisitor<? extends T>)visitor).visitAttrs_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attrs_listContext attrs_list() throws RecognitionException {
		Attrs_listContext _localctx = new Attrs_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attrs_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(100); attr_sep();
					}
					} 
				}
				setState(105);
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

	public static class Attr_sepContext extends ParserRuleContext {
		public TerminalNode SEP_ATTR_VAR() { return getToken(SCSNewParser.SEP_ATTR_VAR, 0); }
		public TerminalNode SEP_ATTR_CONST() { return getToken(SCSNewParser.SEP_ATTR_CONST, 0); }
		public Idtf_level1Context idtf_level1() {
			return getRuleContext(Idtf_level1Context.class,0);
		}
		public Attr_sepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_sep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).enterAttr_sep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).exitAttr_sep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCSNewVisitor ) return ((SCSNewVisitor<? extends T>)visitor).visitAttr_sep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attr_sepContext attr_sep() throws RecognitionException {
		Attr_sepContext _localctx = new Attr_sepContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attr_sep);
		try {
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106); idtf_level1();
				setState(107); match(SEP_ATTR_VAR);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109); idtf_level1();
				setState(110); match(SEP_ATTR_CONST);
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

	public static class Idtf_internalContext extends ParserRuleContext {
		public Sentence_internal_listContext sentence_internal_list() {
			return getRuleContext(Sentence_internal_listContext.class,0);
		}
		public IdtfContext idtf() {
			return getRuleContext(IdtfContext.class,0);
		}
		public Idtf_internalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idtf_internal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).enterIdtf_internal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).exitIdtf_internal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCSNewVisitor ) return ((SCSNewVisitor<? extends T>)visitor).visitIdtf_internal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Idtf_internalContext idtf_internal() throws RecognitionException {
		Idtf_internalContext _localctx = new Idtf_internalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_idtf_internal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); idtf();
			setState(116);
			_la = _input.LA(1);
			if (_la==SEP_LINT) {
				{
				setState(115); sentence_internal_list();
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

	public static class Idtf_tupleContext extends ParserRuleContext {
		public TerminalNode SEP_RTUPLE() { return getToken(SCSNewParser.SEP_RTUPLE, 0); }
		public TerminalNode SEP_LTUPLE() { return getToken(SCSNewParser.SEP_LTUPLE, 0); }
		public Attrs_idtf_listContext attrs_idtf_list() {
			return getRuleContext(Attrs_idtf_listContext.class,0);
		}
		public Idtf_tupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idtf_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).enterIdtf_tuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).exitIdtf_tuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCSNewVisitor ) return ((SCSNewVisitor<? extends T>)visitor).visitIdtf_tuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Idtf_tupleContext idtf_tuple() throws RecognitionException {
		Idtf_tupleContext _localctx = new Idtf_tupleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_idtf_tuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(SEP_LTUPLE);
			setState(119); attrs_idtf_list();
			setState(120); match(SEP_RTUPLE);
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

	public static class Idtf_setContext extends ParserRuleContext {
		public TerminalNode SEP_LSET() { return getToken(SCSNewParser.SEP_LSET, 0); }
		public TerminalNode SEP_RSET() { return getToken(SCSNewParser.SEP_RSET, 0); }
		public Attrs_idtf_listContext attrs_idtf_list() {
			return getRuleContext(Attrs_idtf_listContext.class,0);
		}
		public Idtf_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idtf_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).enterIdtf_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).exitIdtf_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCSNewVisitor ) return ((SCSNewVisitor<? extends T>)visitor).visitIdtf_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Idtf_setContext idtf_set() throws RecognitionException {
		Idtf_setContext _localctx = new Idtf_setContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_idtf_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); match(SEP_LSET);
			setState(123); attrs_idtf_list();
			setState(124); match(SEP_RSET);
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

	public static class IdtfContext extends ParserRuleContext {
		public Idtf_tupleContext idtf_tuple() {
			return getRuleContext(Idtf_tupleContext.class,0);
		}
		public TerminalNode CONTENT() { return getToken(SCSNewParser.CONTENT, 0); }
		public Idtf_setContext idtf_set() {
			return getRuleContext(Idtf_setContext.class,0);
		}
		public Idtf_edgeContext idtf_edge() {
			return getRuleContext(Idtf_edgeContext.class,0);
		}
		public Idtf_level1Context idtf_level1() {
			return getRuleContext(Idtf_level1Context.class,0);
		}
		public IdtfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idtf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).enterIdtf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).exitIdtf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCSNewVisitor ) return ((SCSNewVisitor<? extends T>)visitor).visitIdtf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdtfContext idtf() throws RecognitionException {
		IdtfContext _localctx = new IdtfContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_idtf);
		try {
			setState(131);
			switch (_input.LA(1)) {
			case ID_SYSTEM:
			case LINK:
				enterOuterAlt(_localctx, 1);
				{
				setState(126); idtf_level1();
				}
				break;
			case SEP_LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(127); idtf_edge();
				}
				break;
			case SEP_LTUPLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(128); idtf_tuple();
				}
				break;
			case SEP_LSET:
				enterOuterAlt(_localctx, 4);
				{
				setState(129); idtf_set();
				}
				break;
			case CONTENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(130); match(CONTENT);
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

	public static class Idtf_level1Context extends ParserRuleContext {
		public TerminalNode ID_SYSTEM() { return getToken(SCSNewParser.ID_SYSTEM, 0); }
		public TerminalNode LINK() { return getToken(SCSNewParser.LINK, 0); }
		public Idtf_level1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idtf_level1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).enterIdtf_level1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).exitIdtf_level1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCSNewVisitor ) return ((SCSNewVisitor<? extends T>)visitor).visitIdtf_level1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Idtf_level1Context idtf_level1() throws RecognitionException {
		Idtf_level1Context _localctx = new Idtf_level1Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_idtf_level1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !(_la==ID_SYSTEM || _la==LINK) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Idtf_edgeContext extends ParserRuleContext {
		public List<IdtfContext> idtf() {
			return getRuleContexts(IdtfContext.class);
		}
		public TerminalNode CONNECTORS() { return getToken(SCSNewParser.CONNECTORS, 0); }
		public IdtfContext idtf(int i) {
			return getRuleContext(IdtfContext.class,i);
		}
		public TerminalNode SEP_LPAR() { return getToken(SCSNewParser.SEP_LPAR, 0); }
		public TerminalNode SEP_RPAR() { return getToken(SCSNewParser.SEP_RPAR, 0); }
		public Idtf_edgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idtf_edge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).enterIdtf_edge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCSNewListener ) ((SCSNewListener)listener).exitIdtf_edge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCSNewVisitor ) return ((SCSNewVisitor<? extends T>)visitor).visitIdtf_edge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Idtf_edgeContext idtf_edge() throws RecognitionException {
		Idtf_edgeContext _localctx = new Idtf_edgeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_idtf_edge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); match(SEP_LPAR);
			setState(136); idtf();
			setState(137); match(CONNECTORS);
			setState(138); idtf();
			setState(139); match(SEP_RPAR);
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\30\u0090\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\2\3\2\3\3\3\3\3\3\5\3\63\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\5\4B\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6N\n\6\f\6\16\6Q\13\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\7\t_\n\t\f\t\16\tb\13\t\3\n\3"+
		"\n\3\n\3\13\7\13h\n\13\f\13\16\13k\13\13\3\f\3\f\3\f\3\f\3\f\3\f\5\fs"+
		"\n\f\3\r\3\r\5\rw\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u0086\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\3\4\2\3\3\6\6\u008d"+
		"\2*\3\2\2\2\4\62\3\2\2\2\6A\3\2\2\2\bC\3\2\2\2\nI\3\2\2\2\fT\3\2\2\2\16"+
		"X\3\2\2\2\20[\3\2\2\2\22c\3\2\2\2\24i\3\2\2\2\26r\3\2\2\2\30t\3\2\2\2"+
		"\32x\3\2\2\2\34|\3\2\2\2\36\u0085\3\2\2\2 \u0087\3\2\2\2\"\u0089\3\2\2"+
		"\2$%\5\4\3\2%&\7\b\2\2&)\3\2\2\2\')\7\4\2\2($\3\2\2\2(\'\3\2\2\2),\3\2"+
		"\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-.\7\2\2\3.\3\3\2\2\2/\63"+
		"\5\b\5\2\60\63\5\6\4\2\61\63\5\f\7\2\62/\3\2\2\2\62\60\3\2\2\2\62\61\3"+
		"\2\2\2\63\5\3\2\2\2\64B\3\2\2\2\65\66\5\36\20\2\66\67\7\7\2\2\678\5\20"+
		"\t\28>\3\2\2\29:\7\16\2\2:;\7\7\2\2;=\5\20\t\2<9\3\2\2\2=@\3\2\2\2><\3"+
		"\2\2\2>?\3\2\2\2?B\3\2\2\2@>\3\2\2\2A\64\3\2\2\2A\65\3\2\2\2B\7\3\2\2"+
		"\2CD\5 \21\2DE\7\t\2\2EF\5 \21\2FG\7\t\2\2GH\5 \21\2H\t\3\2\2\2IO\7\17"+
		"\2\2JK\5\16\b\2KL\7\b\2\2LN\3\2\2\2MJ\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3"+
		"\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7\20\2\2S\13\3\2\2\2TU\5\36\20\2UV\7\27\2"+
		"\2VW\5\36\20\2W\r\3\2\2\2XY\7\7\2\2YZ\5\20\t\2Z\17\3\2\2\2[`\5\22\n\2"+
		"\\]\7\16\2\2]_\5\22\n\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\21\3"+
		"\2\2\2b`\3\2\2\2cd\5\24\13\2de\5\30\r\2e\23\3\2\2\2fh\5\26\f\2gf\3\2\2"+
		"\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\25\3\2\2\2ki\3\2\2\2lm\5 \21\2mn\7\r"+
		"\2\2ns\3\2\2\2op\5 \21\2pq\7\f\2\2qs\3\2\2\2rl\3\2\2\2ro\3\2\2\2s\27\3"+
		"\2\2\2tv\5\36\20\2uw\5\n\6\2vu\3\2\2\2vw\3\2\2\2w\31\3\2\2\2xy\7\21\2"+
		"\2yz\5\20\t\2z{\7\22\2\2{\33\3\2\2\2|}\7\23\2\2}~\5\20\t\2~\177\7\24\2"+
		"\2\177\35\3\2\2\2\u0080\u0086\5 \21\2\u0081\u0086\5\"\22\2\u0082\u0086"+
		"\5\32\16\2\u0083\u0086\5\34\17\2\u0084\u0086\7\5\2\2\u0085\u0080\3\2\2"+
		"\2\u0085\u0081\3\2\2\2\u0085\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084"+
		"\3\2\2\2\u0086\37\3\2\2\2\u0087\u0088\t\2\2\2\u0088!\3\2\2\2\u0089\u008a"+
		"\7\n\2\2\u008a\u008b\5\36\20\2\u008b\u008c\7\7\2\2\u008c\u008d\5\36\20"+
		"\2\u008d\u008e\7\13\2\2\u008e#\3\2\2\2\r(*\62>AO`irv\u0085";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}