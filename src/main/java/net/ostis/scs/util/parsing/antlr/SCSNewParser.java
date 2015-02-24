// Generated from /media/timur/EE286A072869CEE1/Work/SC/SCSTranslator/Grammars/scsNew.g4 by ANTLR 4.1
package net.ostis.scs.util.parsing.antlr;

import java.util.List;

import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNSimulator;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class SCSNewParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int ID_SYSTEM = 1, COMMENT = 2, CONTENT = 3, LINK = 4,
			CONNECTORS = 5, SEP_SENTENCE = 6, SEP_SIMPLE = 7, SEP_LPAR = 8,
			SEP_RPAR = 9, SEP_ATTR_CONST = 10, SEP_ATTR_VAR = 11,
			SEP_IDTF = 12, SEP_LINT = 13, SEP_RINT = 14, SEP_LTUPLE = 15,
			SEP_RTUPLE = 16, SEP_LSET = 17, SEP_RSET = 18, SEP_LCONTENT = 19,
			SEP_RCONTENT = 20, SEP_ASSIGN = 21, WS = 22;
	public static final String[] tokenNames = { "<INVALID>", "ID_SYSTEM",
		"COMMENT", "CONTENT", "LINK", "CONNECTORS", "';;'", "'|'", "'('",
		"')'", "':'", "'::'", "';'", "'(*'", "'*)'", "'<'", "'>'", "'{'",
		"'}'", "'['", "']'", "'='", "WS" };
	public static final int RULE_syntax = 0, RULE_sentence = 1,
			RULE_sentence_level2_6 = 2, RULE_sentence_level1 = 3,
			RULE_sentence_internal_list = 4, RULE_sentence_assignment = 5,
			RULE_sentence_internal = 6, RULE_attrs_idtf_list = 7,
			RULE_idtf_attrs = 8, RULE_attrs_list = 9, RULE_attr_sep = 10,
			RULE_idtf_internal = 11, RULE_idtf_tuple = 12, RULE_idtf_set = 13,
			RULE_idtf = 14, RULE_idtf_level1 = 15, RULE_idtf_edge = 16;
	public static final String[] ruleNames = { "syntax", "sentence",
		"sentence_level2_6", "sentence_level1", "sentence_internal_list",
		"sentence_assignment", "sentence_internal", "attrs_idtf_list",
		"idtf_attrs", "attrs_list", "attr_sep", "idtf_internal",
		"idtf_tuple", "idtf_set", "idtf", "idtf_level1", "idtf_edge" };

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
	public ATN getATN() {
		return _ATN;
	}

	public SCSNewParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA,
				_sharedContextCache);
	}

	public static class SyntaxContext extends ParserRuleContext {
		public TerminalNode SEP_SENTENCE(int i) {
			return getToken(SCSNewParser.SEP_SENTENCE, i);
		}

		public TerminalNode EOF() {
			return getToken(SCSNewParser.EOF, 0);
		}

		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}

		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class, i);
		}

		public List<TerminalNode> SEP_SENTENCE() {
			return getTokens(SCSNewParser.SEP_SENTENCE);
		}

		public SyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_syntax;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).enterSyntax(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).exitSyntax(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SCSNewVisitor)
				return ((SCSNewVisitor<? extends T>) visitor).visitSyntax(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final SyntaxContext syntax() throws RecognitionException {
		SyntaxContext _localctx = new SyntaxContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_syntax);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID_SYSTEM)
						| (1L << CONTENT)
						| (1L << LINK)
						| (1L << SEP_SENTENCE)
						| (1L << SEP_LPAR) | (1L << SEP_LTUPLE) | (1L << SEP_LSET))) != 0)) {
					{
						{
							setState(34);
							sentence();
							setState(35);
							match(SEP_SENTENCE);
						}
					}
					setState(41);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(42);
				match(EOF);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenceContext extends ParserRuleContext {
		public Sentence_assignmentContext sentence_assignment() {
			return getRuleContext(Sentence_assignmentContext.class, 0);
		}

		public Sentence_level2_6Context sentence_level2_6() {
			return getRuleContext(Sentence_level2_6Context.class, 0);
		}

		public Sentence_level1Context sentence_level1() {
			return getRuleContext(Sentence_level1Context.class, 0);
		}

		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_sentence;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).enterSentence(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).exitSentence(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SCSNewVisitor)
				return ((SCSNewVisitor<? extends T>) visitor)
						.visitSentence(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(47);
			switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(44);
					sentence_level1();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(45);
					sentence_level2_6();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(46);
					sentence_assignment();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
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
			return getRuleContext(IdtfContext.class, 0);
		}

		public Attrs_idtf_listContext attrs_idtf_list(int i) {
			return getRuleContext(Attrs_idtf_listContext.class, i);
		}

		public List<TerminalNode> CONNECTORS() {
			return getTokens(SCSNewParser.CONNECTORS);
		}

		public List<TerminalNode> SEP_IDTF() {
			return getTokens(SCSNewParser.SEP_IDTF);
		}

		public Sentence_level2_6Context(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_sentence_level2_6;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).enterSentence_level2_6(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).exitSentence_level2_6(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SCSNewVisitor)
				return ((SCSNewVisitor<? extends T>) visitor)
						.visitSentence_level2_6(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Sentence_level2_6Context sentence_level2_6()
			throws RecognitionException {
		Sentence_level2_6Context _localctx = new Sentence_level2_6Context(_ctx,
				getState());
		enterRule(_localctx, 4, RULE_sentence_level2_6);
		int _la;
		try {
			setState(62);
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
						setState(50);
						idtf();
						setState(51);
						_localctx.c1 = match(CONNECTORS);
						setState(52);
						_localctx.a1 = attrs_idtf_list();
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == SEP_IDTF) {
						{
							{
								setState(54);
								match(SEP_IDTF);
								setState(55);
								_localctx.c2 = match(CONNECTORS);
								setState(56);
								_localctx.a2 = attrs_idtf_list();
							}
						}
						setState(61);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sentence_level1Context extends ParserRuleContext {
		public List<TerminalNode> SEP_SIMPLE() {
			return getTokens(SCSNewParser.SEP_SIMPLE);
		}

		public Idtf_level1Context idtf_level1(int i) {
			return getRuleContext(Idtf_level1Context.class, i);
		}

		public TerminalNode SEP_SIMPLE(int i) {
			return getToken(SCSNewParser.SEP_SIMPLE, i);
		}

		public List<Idtf_level1Context> idtf_level1() {
			return getRuleContexts(Idtf_level1Context.class);
		}

		public Sentence_level1Context(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_sentence_level1;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).enterSentence_level1(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).exitSentence_level1(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SCSNewVisitor)
				return ((SCSNewVisitor<? extends T>) visitor)
						.visitSentence_level1(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Sentence_level1Context sentence_level1()
			throws RecognitionException {
		Sentence_level1Context _localctx = new Sentence_level1Context(_ctx,
				getState());
		enterRule(_localctx, 6, RULE_sentence_level1);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(64);
				idtf_level1();
				setState(65);
				match(SEP_SIMPLE);
				setState(66);
				idtf_level1();
				setState(67);
				match(SEP_SIMPLE);
				setState(68);
				idtf_level1();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
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
			return getRuleContext(Sentence_internalContext.class, i);
		}

		public TerminalNode SEP_LINT() {
			return getToken(SCSNewParser.SEP_LINT, 0);
		}

		public List<TerminalNode> SEP_SENTENCE() {
			return getTokens(SCSNewParser.SEP_SENTENCE);
		}

		public TerminalNode SEP_RINT() {
			return getToken(SCSNewParser.SEP_RINT, 0);
		}

		public Sentence_internal_listContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_sentence_internal_list;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).enterSentence_internal_list(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).exitSentence_internal_list(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SCSNewVisitor)
				return ((SCSNewVisitor<? extends T>) visitor)
						.visitSentence_internal_list(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Sentence_internal_listContext sentence_internal_list()
			throws RecognitionException {
		Sentence_internal_listContext _localctx = new Sentence_internal_listContext(
				_ctx, getState());
		enterRule(_localctx, 8, RULE_sentence_internal_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(70);
				match(SEP_LINT);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == CONNECTORS) {
					{
						{
							setState(71);
							sentence_internal();
							setState(72);
							match(SEP_SENTENCE);
						}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(79);
				match(SEP_RINT);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sentence_assignmentContext extends ParserRuleContext {
		public TerminalNode SEP_ASSIGN() {
			return getToken(SCSNewParser.SEP_ASSIGN, 0);
		}

		public List<IdtfContext> idtf() {
			return getRuleContexts(IdtfContext.class);
		}

		public IdtfContext idtf(int i) {
			return getRuleContext(IdtfContext.class, i);
		}

		public Sentence_assignmentContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_sentence_assignment;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).enterSentence_assignment(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).exitSentence_assignment(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SCSNewVisitor)
				return ((SCSNewVisitor<? extends T>) visitor)
						.visitSentence_assignment(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Sentence_assignmentContext sentence_assignment()
			throws RecognitionException {
		Sentence_assignmentContext _localctx = new Sentence_assignmentContext(
				_ctx, getState());
		enterRule(_localctx, 10, RULE_sentence_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(81);
				idtf();
				setState(82);
				match(SEP_ASSIGN);
				setState(83);
				idtf();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sentence_internalContext extends ParserRuleContext {
		public Attrs_idtf_listContext attrs_idtf_list() {
			return getRuleContext(Attrs_idtf_listContext.class, 0);
		}

		public TerminalNode CONNECTORS() {
			return getToken(SCSNewParser.CONNECTORS, 0);
		}

		public Sentence_internalContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_sentence_internal;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).enterSentence_internal(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).exitSentence_internal(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SCSNewVisitor)
				return ((SCSNewVisitor<? extends T>) visitor)
						.visitSentence_internal(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Sentence_internalContext sentence_internal()
			throws RecognitionException {
		Sentence_internalContext _localctx = new Sentence_internalContext(_ctx,
				getState());
		enterRule(_localctx, 12, RULE_sentence_internal);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(85);
				match(CONNECTORS);
				setState(86);
				attrs_idtf_list();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attrs_idtf_listContext extends ParserRuleContext {
		public TerminalNode SEP_IDTF(int i) {
			return getToken(SCSNewParser.SEP_IDTF, i);
		}

		public Idtf_attrsContext idtf_attrs(int i) {
			return getRuleContext(Idtf_attrsContext.class, i);
		}

		public List<Idtf_attrsContext> idtf_attrs() {
			return getRuleContexts(Idtf_attrsContext.class);
		}

		public List<TerminalNode> SEP_IDTF() {
			return getTokens(SCSNewParser.SEP_IDTF);
		}

		public Attrs_idtf_listContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_attrs_idtf_list;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).enterAttrs_idtf_list(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).exitAttrs_idtf_list(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SCSNewVisitor)
				return ((SCSNewVisitor<? extends T>) visitor)
						.visitAttrs_idtf_list(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Attrs_idtf_listContext attrs_idtf_list()
			throws RecognitionException {
		Attrs_idtf_listContext _localctx = new Attrs_idtf_listContext(_ctx,
				getState());
		enterRule(_localctx, 14, RULE_attrs_idtf_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(88);
				idtf_attrs();
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
				while (_alt != 2 && _alt != -1) {
					if (_alt == 1) {
						{
							{
								setState(89);
								match(SEP_IDTF);
								setState(90);
								idtf_attrs();
							}
						}
					}
					setState(95);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Idtf_attrsContext extends ParserRuleContext {
		public Idtf_internalContext idtf_internal() {
			return getRuleContext(Idtf_internalContext.class, 0);
		}

		public Attrs_listContext attrs_list() {
			return getRuleContext(Attrs_listContext.class, 0);
		}

		public Idtf_attrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_idtf_attrs;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).enterIdtf_attrs(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).exitIdtf_attrs(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SCSNewVisitor)
				return ((SCSNewVisitor<? extends T>) visitor)
						.visitIdtf_attrs(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Idtf_attrsContext idtf_attrs() throws RecognitionException {
		Idtf_attrsContext _localctx = new Idtf_attrsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_idtf_attrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(96);
				attrs_list();
				setState(97);
				idtf_internal();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attrs_listContext extends ParserRuleContext {
		public Attr_sepContext attr_sep(int i) {
			return getRuleContext(Attr_sepContext.class, i);
		}

		public List<Attr_sepContext> attr_sep() {
			return getRuleContexts(Attr_sepContext.class);
		}

		public Attrs_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_attrs_list;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).enterAttrs_list(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).exitAttrs_list(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SCSNewVisitor)
				return ((SCSNewVisitor<? extends T>) visitor)
						.visitAttrs_list(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Attrs_listContext attrs_list() throws RecognitionException {
		Attrs_listContext _localctx = new Attrs_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attrs_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
				while (_alt != 2 && _alt != -1) {
					if (_alt == 1) {
						{
							{
								setState(99);
								attr_sep();
							}
						}
					}
					setState(104);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attr_sepContext extends ParserRuleContext {
		public TerminalNode SEP_ATTR_VAR() {
			return getToken(SCSNewParser.SEP_ATTR_VAR, 0);
		}

		public TerminalNode SEP_ATTR_CONST() {
			return getToken(SCSNewParser.SEP_ATTR_CONST, 0);
		}

		public Idtf_level1Context idtf_level1() {
			return getRuleContext(Idtf_level1Context.class, 0);
		}

		public Attr_sepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_attr_sep;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).enterAttr_sep(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).exitAttr_sep(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SCSNewVisitor)
				return ((SCSNewVisitor<? extends T>) visitor)
						.visitAttr_sep(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Attr_sepContext attr_sep() throws RecognitionException {
		Attr_sepContext _localctx = new Attr_sepContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attr_sep);
		try {
			setState(111);
			switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(105);
					idtf_level1();
					setState(106);
					match(SEP_ATTR_VAR);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(108);
					idtf_level1();
					setState(109);
					match(SEP_ATTR_CONST);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Idtf_internalContext extends ParserRuleContext {
		public Sentence_internal_listContext sentence_internal_list() {
			return getRuleContext(Sentence_internal_listContext.class, 0);
		}

		public IdtfContext idtf() {
			return getRuleContext(IdtfContext.class, 0);
		}

		public Idtf_internalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_idtf_internal;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).enterIdtf_internal(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).exitIdtf_internal(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SCSNewVisitor)
				return ((SCSNewVisitor<? extends T>) visitor)
						.visitIdtf_internal(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Idtf_internalContext idtf_internal()
			throws RecognitionException {
		Idtf_internalContext _localctx = new Idtf_internalContext(_ctx,
				getState());
		enterRule(_localctx, 22, RULE_idtf_internal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(113);
				idtf();
				setState(115);
				_la = _input.LA(1);
				if (_la == SEP_LINT) {
					{
						setState(114);
						sentence_internal_list();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Idtf_tupleContext extends ParserRuleContext {
		public TerminalNode SEP_RTUPLE() {
			return getToken(SCSNewParser.SEP_RTUPLE, 0);
		}

		public TerminalNode SEP_LTUPLE() {
			return getToken(SCSNewParser.SEP_LTUPLE, 0);
		}

		public Attrs_idtf_listContext attrs_idtf_list() {
			return getRuleContext(Attrs_idtf_listContext.class, 0);
		}

		public Idtf_tupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_idtf_tuple;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).enterIdtf_tuple(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).exitIdtf_tuple(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SCSNewVisitor)
				return ((SCSNewVisitor<? extends T>) visitor)
						.visitIdtf_tuple(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Idtf_tupleContext idtf_tuple() throws RecognitionException {
		Idtf_tupleContext _localctx = new Idtf_tupleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_idtf_tuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(117);
				match(SEP_LTUPLE);
				setState(118);
				attrs_idtf_list();
				setState(119);
				match(SEP_RTUPLE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Idtf_setContext extends ParserRuleContext {
		public TerminalNode SEP_LSET() {
			return getToken(SCSNewParser.SEP_LSET, 0);
		}

		public TerminalNode SEP_RSET() {
			return getToken(SCSNewParser.SEP_RSET, 0);
		}

		public Attrs_idtf_listContext attrs_idtf_list() {
			return getRuleContext(Attrs_idtf_listContext.class, 0);
		}

		public Idtf_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_idtf_set;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).enterIdtf_set(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).exitIdtf_set(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SCSNewVisitor)
				return ((SCSNewVisitor<? extends T>) visitor)
						.visitIdtf_set(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Idtf_setContext idtf_set() throws RecognitionException {
		Idtf_setContext _localctx = new Idtf_setContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_idtf_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(121);
				match(SEP_LSET);
				setState(122);
				attrs_idtf_list();
				setState(123);
				match(SEP_RSET);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdtfContext extends ParserRuleContext {
		public Idtf_tupleContext idtf_tuple() {
			return getRuleContext(Idtf_tupleContext.class, 0);
		}

		public TerminalNode CONTENT() {
			return getToken(SCSNewParser.CONTENT, 0);
		}

		public Idtf_setContext idtf_set() {
			return getRuleContext(Idtf_setContext.class, 0);
		}

		public Idtf_edgeContext idtf_edge() {
			return getRuleContext(Idtf_edgeContext.class, 0);
		}

		public Idtf_level1Context idtf_level1() {
			return getRuleContext(Idtf_level1Context.class, 0);
		}

		public IdtfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_idtf;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).enterIdtf(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).exitIdtf(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SCSNewVisitor)
				return ((SCSNewVisitor<? extends T>) visitor).visitIdtf(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final IdtfContext idtf() throws RecognitionException {
		IdtfContext _localctx = new IdtfContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_idtf);
		try {
			setState(130);
			switch (_input.LA(1)) {
			case ID_SYSTEM:
			case LINK:
				enterOuterAlt(_localctx, 1);
				{
					setState(125);
					idtf_level1();
				}
				break;
			case SEP_LPAR:
				enterOuterAlt(_localctx, 2);
				{
					setState(126);
					idtf_edge();
				}
				break;
			case SEP_LTUPLE:
				enterOuterAlt(_localctx, 3);
				{
					setState(127);
					idtf_tuple();
				}
				break;
			case SEP_LSET:
				enterOuterAlt(_localctx, 4);
				{
					setState(128);
					idtf_set();
				}
				break;
			case CONTENT:
				enterOuterAlt(_localctx, 5);
				{
					setState(129);
					match(CONTENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Idtf_level1Context extends ParserRuleContext {
		public TerminalNode ID_SYSTEM() {
			return getToken(SCSNewParser.ID_SYSTEM, 0);
		}

		public TerminalNode LINK() {
			return getToken(SCSNewParser.LINK, 0);
		}

		public Idtf_level1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_idtf_level1;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).enterIdtf_level1(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).exitIdtf_level1(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SCSNewVisitor)
				return ((SCSNewVisitor<? extends T>) visitor)
						.visitIdtf_level1(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Idtf_level1Context idtf_level1() throws RecognitionException {
		Idtf_level1Context _localctx = new Idtf_level1Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_idtf_level1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(132);
				_la = _input.LA(1);
				if (!(_la == ID_SYSTEM || _la == LINK)) {
					_errHandler.recoverInline(this);
				}
				consume();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Idtf_edgeContext extends ParserRuleContext {
		public List<IdtfContext> idtf() {
			return getRuleContexts(IdtfContext.class);
		}

		public TerminalNode CONNECTORS() {
			return getToken(SCSNewParser.CONNECTORS, 0);
		}

		public IdtfContext idtf(int i) {
			return getRuleContext(IdtfContext.class, i);
		}

		public TerminalNode SEP_LPAR() {
			return getToken(SCSNewParser.SEP_LPAR, 0);
		}

		public TerminalNode SEP_RPAR() {
			return getToken(SCSNewParser.SEP_RPAR, 0);
		}

		public Idtf_edgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_idtf_edge;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).enterIdtf_edge(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SCSNewListener)
				((SCSNewListener) listener).exitIdtf_edge(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SCSNewVisitor)
				return ((SCSNewVisitor<? extends T>) visitor)
						.visitIdtf_edge(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Idtf_edgeContext idtf_edge() throws RecognitionException {
		Idtf_edgeContext _localctx = new Idtf_edgeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_idtf_edge);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(134);
				match(SEP_LPAR);
				setState(135);
				idtf();
				setState(136);
				match(CONNECTORS);
				setState(137);
				idtf();
				setState(138);
				match(SEP_RPAR);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\30\u008f\4\2\t\2"
			+ "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"
			+ "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
			+ "\3\2\3\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\3\3\3\3\3\5\3\62\n\3\3"
			+ "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\5\4A\n\4\3\5\3"
			+ "\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6M\n\6\f\6\16\6P\13\6\3\6\3\6\3\7"
			+ "\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\7\t^\n\t\f\t\16\ta\13\t\3\n\3\n\3"
			+ "\n\3\13\7\13g\n\13\f\13\16\13j\13\13\3\f\3\f\3\f\3\f\3\f\3\f\5\fr\n\f"
			+ "\3\r\3\r\5\rv\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3"
			+ "\20\3\20\3\20\5\20\u0085\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"
			+ "\3\22\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\3\4\2\3\3\6\6\u008b"
			+ "\2)\3\2\2\2\4\61\3\2\2\2\6@\3\2\2\2\bB\3\2\2\2\nH\3\2\2\2\fS\3\2\2\2\16"
			+ "W\3\2\2\2\20Z\3\2\2\2\22b\3\2\2\2\24h\3\2\2\2\26q\3\2\2\2\30s\3\2\2\2"
			+ "\32w\3\2\2\2\34{\3\2\2\2\36\u0084\3\2\2\2 \u0086\3\2\2\2\"\u0088\3\2\2"
			+ "\2$%\5\4\3\2%&\7\b\2\2&(\3\2\2\2\'$\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2"
			+ "\2\2*,\3\2\2\2+)\3\2\2\2,-\7\2\2\3-\3\3\2\2\2.\62\5\b\5\2/\62\5\6\4\2"
			+ "\60\62\5\f\7\2\61.\3\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\5\3\2\2\2\63A"
			+ "\3\2\2\2\64\65\5\36\20\2\65\66\7\7\2\2\66\67\5\20\t\2\67=\3\2\2\289\7"
			+ "\16\2\29:\7\7\2\2:<\5\20\t\2;8\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>"
			+ "A\3\2\2\2?=\3\2\2\2@\63\3\2\2\2@\64\3\2\2\2A\7\3\2\2\2BC\5 \21\2CD\7\t"
			+ "\2\2DE\5 \21\2EF\7\t\2\2FG\5 \21\2G\t\3\2\2\2HN\7\17\2\2IJ\5\16\b\2JK"
			+ "\7\b\2\2KM\3\2\2\2LI\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2P"
			+ "N\3\2\2\2QR\7\20\2\2R\13\3\2\2\2ST\5\36\20\2TU\7\27\2\2UV\5\36\20\2V\r"
			+ "\3\2\2\2WX\7\7\2\2XY\5\20\t\2Y\17\3\2\2\2Z_\5\22\n\2[\\\7\16\2\2\\^\5"
			+ "\22\n\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\21\3\2\2\2a_\3\2\2\2"
			+ "bc\5\24\13\2cd\5\30\r\2d\23\3\2\2\2eg\5\26\f\2fe\3\2\2\2gj\3\2\2\2hf\3"
			+ "\2\2\2hi\3\2\2\2i\25\3\2\2\2jh\3\2\2\2kl\5 \21\2lm\7\r\2\2mr\3\2\2\2n"
			+ "o\5 \21\2op\7\f\2\2pr\3\2\2\2qk\3\2\2\2qn\3\2\2\2r\27\3\2\2\2su\5\36\20"
			+ "\2tv\5\n\6\2ut\3\2\2\2uv\3\2\2\2v\31\3\2\2\2wx\7\21\2\2xy\5\20\t\2yz\7"
			+ "\22\2\2z\33\3\2\2\2{|\7\23\2\2|}\5\20\t\2}~\7\24\2\2~\35\3\2\2\2\177\u0085"
			+ "\5 \21\2\u0080\u0085\5\"\22\2\u0081\u0085\5\32\16\2\u0082\u0085\5\34\17"
			+ "\2\u0083\u0085\7\5\2\2\u0084\177\3\2\2\2\u0084\u0080\3\2\2\2\u0084\u0081"
			+ "\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\37\3\2\2\2\u0086"
			+ "\u0087\t\2\2\2\u0087!\3\2\2\2\u0088\u0089\7\n\2\2\u0089\u008a\5\36\20"
			+ "\2\u008a\u008b\7\7\2\2\u008b\u008c\5\36\20\2\u008c\u008d\7\13\2\2\u008d"
			+ "#\3\2\2\2\f)\61=@N_hqu\u0084";
	public static final ATN _ATN = ATNSimulator.deserialize(_serializedATN
			.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}