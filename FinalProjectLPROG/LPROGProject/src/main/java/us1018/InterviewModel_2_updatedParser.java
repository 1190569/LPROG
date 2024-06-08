package us1018;
// Generated from InterviewModel_2_updated.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class InterviewModel_2_updatedParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, LPAREN=14, RPAREN=15, COMMA=16, 
		COLON=17, ID=18, INT=19, STRING=20, WS=21;
	public static final int
		RULE_plugin = 0, RULE_interviewParams = 1, RULE_questionList = 2, RULE_question = 3, 
		RULE_questionType = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"plugin", "interviewParams", "questionList", "question", "questionType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'InterviewModel'", "'Title'", "'Description'", "'Questions'", 
			"'TrueFalse'", "'ShortTextAnswer'", "'SingleChoice'", "'MultipleChoice'", 
			"'IntegerNumber'", "'DecimalNumber'", "'Date'", "'Time'", "'NumericScale'", 
			"'('", "')'", "','", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "LPAREN", "RPAREN", "COMMA", "COLON", "ID", "INT", "STRING", 
			"WS"
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
	public String getGrammarFileName() { return "InterviewModel_2_updated.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public InterviewModel_2_updatedParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PluginContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InterviewModel_2_updatedParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(InterviewModel_2_updatedParser.LPAREN, 0); }
		public InterviewParamsContext interviewParams() {
			return getRuleContext(InterviewParamsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(InterviewModel_2_updatedParser.RPAREN, 0); }
		public PluginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plugin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModel_2_updatedListener ) ((InterviewModel_2_updatedListener)listener).enterPlugin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModel_2_updatedListener ) ((InterviewModel_2_updatedListener)listener).exitPlugin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModel_2_updatedVisitor ) return ((InterviewModel_2_updatedVisitor<? extends T>)visitor).visitPlugin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PluginContext plugin() throws RecognitionException {
		PluginContext _localctx = new PluginContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_plugin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(T__0);
			setState(11);
			match(ID);
			setState(12);
			match(LPAREN);
			setState(13);
			interviewParams();
			setState(14);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterviewParamsContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(InterviewModel_2_updatedParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(InterviewModel_2_updatedParser.COLON, i);
		}
		public List<TerminalNode> STRING() { return getTokens(InterviewModel_2_updatedParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(InterviewModel_2_updatedParser.STRING, i);
		}
		public QuestionListContext questionList() {
			return getRuleContext(QuestionListContext.class,0);
		}
		public InterviewParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interviewParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModel_2_updatedListener ) ((InterviewModel_2_updatedListener)listener).enterInterviewParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModel_2_updatedListener ) ((InterviewModel_2_updatedListener)listener).exitInterviewParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModel_2_updatedVisitor ) return ((InterviewModel_2_updatedVisitor<? extends T>)visitor).visitInterviewParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterviewParamsContext interviewParams() throws RecognitionException {
		InterviewParamsContext _localctx = new InterviewParamsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_interviewParams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(T__1);
			setState(17);
			match(COLON);
			setState(18);
			match(STRING);
			setState(19);
			match(T__2);
			setState(20);
			match(COLON);
			setState(21);
			match(STRING);
			setState(22);
			match(T__3);
			setState(23);
			match(COLON);
			setState(24);
			questionList();
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

	@SuppressWarnings("CheckReturnValue")
	public static class QuestionListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(InterviewModel_2_updatedParser.LPAREN, 0); }
		public List<QuestionContext> question() {
			return getRuleContexts(QuestionContext.class);
		}
		public QuestionContext question(int i) {
			return getRuleContext(QuestionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(InterviewModel_2_updatedParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(InterviewModel_2_updatedParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InterviewModel_2_updatedParser.COMMA, i);
		}
		public QuestionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModel_2_updatedListener ) ((InterviewModel_2_updatedListener)listener).enterQuestionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModel_2_updatedListener ) ((InterviewModel_2_updatedListener)listener).exitQuestionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModel_2_updatedVisitor ) return ((InterviewModel_2_updatedVisitor<? extends T>)visitor).visitQuestionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionListContext questionList() throws RecognitionException {
		QuestionListContext _localctx = new QuestionListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_questionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(LPAREN);
			setState(27);
			question();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(28);
				match(COMMA);
				setState(29);
				question();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class QuestionContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(InterviewModel_2_updatedParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(InterviewModel_2_updatedParser.LPAREN, i);
		}
		public List<TerminalNode> STRING() { return getTokens(InterviewModel_2_updatedParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(InterviewModel_2_updatedParser.STRING, i);
		}
		public QuestionTypeContext questionType() {
			return getRuleContext(QuestionTypeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(InterviewModel_2_updatedParser.COMMA, 0); }
		public TerminalNode INT() { return getToken(InterviewModel_2_updatedParser.INT, 0); }
		public List<TerminalNode> RPAREN() { return getTokens(InterviewModel_2_updatedParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(InterviewModel_2_updatedParser.RPAREN, i);
		}
		public TerminalNode COLON() { return getToken(InterviewModel_2_updatedParser.COLON, 0); }
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModel_2_updatedListener ) ((InterviewModel_2_updatedListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModel_2_updatedListener ) ((InterviewModel_2_updatedListener)listener).exitQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModel_2_updatedVisitor ) return ((InterviewModel_2_updatedVisitor<? extends T>)visitor).visitQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(LPAREN);
			setState(38);
			match(STRING);
			setState(39);
			match(LPAREN);
			setState(40);
			questionType();
			setState(41);
			match(COMMA);
			setState(42);
			match(INT);
			setState(43);
			match(RPAREN);
			setState(44);
			match(RPAREN);
			setState(45);
			match(COLON);
			setState(46);
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

	@SuppressWarnings("CheckReturnValue")
	public static class QuestionTypeContext extends ParserRuleContext {
		public QuestionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModel_2_updatedListener ) ((InterviewModel_2_updatedListener)listener).enterQuestionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewModel_2_updatedListener ) ((InterviewModel_2_updatedListener)listener).exitQuestionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewModel_2_updatedVisitor ) return ((InterviewModel_2_updatedVisitor<? extends T>)visitor).visitQuestionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionTypeContext questionType() throws RecognitionException {
		QuestionTypeContext _localctx = new QuestionTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_questionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16352L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u00153\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002\u001f\b\u0002\n\u0002\f\u0002\"\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0000"+
		"\u0002\u0004\u0006\b\u0000\u0001\u0001\u0000\u0005\r.\u0000\n\u0001\u0000"+
		"\u0000\u0000\u0002\u0010\u0001\u0000\u0000\u0000\u0004\u001a\u0001\u0000"+
		"\u0000\u0000\u0006%\u0001\u0000\u0000\u0000\b0\u0001\u0000\u0000\u0000"+
		"\n\u000b\u0005\u0001\u0000\u0000\u000b\f\u0005\u0012\u0000\u0000\f\r\u0005"+
		"\u000e\u0000\u0000\r\u000e\u0003\u0002\u0001\u0000\u000e\u000f\u0005\u000f"+
		"\u0000\u0000\u000f\u0001\u0001\u0000\u0000\u0000\u0010\u0011\u0005\u0002"+
		"\u0000\u0000\u0011\u0012\u0005\u0011\u0000\u0000\u0012\u0013\u0005\u0014"+
		"\u0000\u0000\u0013\u0014\u0005\u0003\u0000\u0000\u0014\u0015\u0005\u0011"+
		"\u0000\u0000\u0015\u0016\u0005\u0014\u0000\u0000\u0016\u0017\u0005\u0004"+
		"\u0000\u0000\u0017\u0018\u0005\u0011\u0000\u0000\u0018\u0019\u0003\u0004"+
		"\u0002\u0000\u0019\u0003\u0001\u0000\u0000\u0000\u001a\u001b\u0005\u000e"+
		"\u0000\u0000\u001b \u0003\u0006\u0003\u0000\u001c\u001d\u0005\u0010\u0000"+
		"\u0000\u001d\u001f\u0003\u0006\u0003\u0000\u001e\u001c\u0001\u0000\u0000"+
		"\u0000\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000"+
		" !\u0001\u0000\u0000\u0000!#\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000"+
		"\u0000#$\u0005\u000f\u0000\u0000$\u0005\u0001\u0000\u0000\u0000%&\u0005"+
		"\u000e\u0000\u0000&\'\u0005\u0014\u0000\u0000\'(\u0005\u000e\u0000\u0000"+
		"()\u0003\b\u0004\u0000)*\u0005\u0010\u0000\u0000*+\u0005\u0013\u0000\u0000"+
		"+,\u0005\u000f\u0000\u0000,-\u0005\u000f\u0000\u0000-.\u0005\u0011\u0000"+
		"\u0000./\u0005\u0014\u0000\u0000/\u0007\u0001\u0000\u0000\u000001\u0007"+
		"\u0000\u0000\u00001\t\u0001\u0000\u0000\u0000\u0001 ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}