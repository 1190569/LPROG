// Generated from C:/Users/jerem/OneDrive - bwedu/Studium/7tes Semester/LPROG/05_SprintC/LPROG/FinalProjectLPROG/LPROGProject/src/main/java/us1017/grammar/InterviewResponses.g4 by ANTLR 4.13.1
package us1017.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class InterviewResponsesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, LPAREN=14, RPAREN=15, COMMA=16, 
		COLON=17, ID=18, INT=19, STRING=20, TRUE=21, FALSE=22, HYPHEN=23, BACKSLASH=24, 
		WS=25;
	public static final int
		RULE_plugin = 0, RULE_interviewParams = 1, RULE_questionList = 2, RULE_questionResponse = 3, 
		RULE_questionType = 4, RULE_response = 5, RULE_fraction = 6, RULE_date = 7, 
		RULE_time = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"plugin", "interviewParams", "questionList", "questionResponse", "questionType", 
			"response", "fraction", "date", "time"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'InterviewModel'", "'Title'", "'Description'", "'Questions'", 
			"'TrueFalse'", "'ShortTextAnswer'", "'SingleChoice'", "'MultipleChoice'", 
			"'IntegerNumber'", "'DecimalNumber'", "'Date'", "'Time'", "'NumericScale'", 
			"'('", "')'", "','", "':'", null, null, null, "'True'", "'False'", "'-'", 
			"'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "LPAREN", "RPAREN", "COMMA", "COLON", "ID", "INT", "STRING", 
			"TRUE", "FALSE", "HYPHEN", "BACKSLASH", "WS"
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
	public String getGrammarFileName() { return "InterviewResponses.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public InterviewResponsesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PluginContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InterviewResponsesParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(InterviewResponsesParser.LPAREN, 0); }
		public InterviewParamsContext interviewParams() {
			return getRuleContext(InterviewParamsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(InterviewResponsesParser.RPAREN, 0); }
		public PluginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plugin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewResponsesListener ) ((InterviewResponsesListener)listener).enterPlugin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewResponsesListener ) ((InterviewResponsesListener)listener).exitPlugin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewResponsesVisitor ) return ((InterviewResponsesVisitor<? extends T>)visitor).visitPlugin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PluginContext plugin() throws RecognitionException {
		PluginContext _localctx = new PluginContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_plugin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(T__0);
			setState(19);
			match(ID);
			setState(20);
			match(LPAREN);
			setState(21);
			interviewParams();
			setState(22);
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
		public List<TerminalNode> COLON() { return getTokens(InterviewResponsesParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(InterviewResponsesParser.COLON, i);
		}
		public List<TerminalNode> STRING() { return getTokens(InterviewResponsesParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(InterviewResponsesParser.STRING, i);
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
			if ( listener instanceof InterviewResponsesListener ) ((InterviewResponsesListener)listener).enterInterviewParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewResponsesListener ) ((InterviewResponsesListener)listener).exitInterviewParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewResponsesVisitor ) return ((InterviewResponsesVisitor<? extends T>)visitor).visitInterviewParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterviewParamsContext interviewParams() throws RecognitionException {
		InterviewParamsContext _localctx = new InterviewParamsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_interviewParams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__1);
			setState(25);
			match(COLON);
			setState(26);
			match(STRING);
			setState(27);
			match(T__2);
			setState(28);
			match(COLON);
			setState(29);
			match(STRING);
			setState(30);
			match(T__3);
			setState(31);
			match(COLON);
			setState(32);
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
		public TerminalNode LPAREN() { return getToken(InterviewResponsesParser.LPAREN, 0); }
		public List<QuestionResponseContext> questionResponse() {
			return getRuleContexts(QuestionResponseContext.class);
		}
		public QuestionResponseContext questionResponse(int i) {
			return getRuleContext(QuestionResponseContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(InterviewResponsesParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(InterviewResponsesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InterviewResponsesParser.COMMA, i);
		}
		public QuestionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewResponsesListener ) ((InterviewResponsesListener)listener).enterQuestionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewResponsesListener ) ((InterviewResponsesListener)listener).exitQuestionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewResponsesVisitor ) return ((InterviewResponsesVisitor<? extends T>)visitor).visitQuestionList(this);
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
			setState(34);
			match(LPAREN);
			setState(35);
			questionResponse();
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(36);
				match(COMMA);
				setState(37);
				questionResponse();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
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
	public static class QuestionResponseContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(InterviewResponsesParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(InterviewResponsesParser.LPAREN, i);
		}
		public TerminalNode STRING() { return getToken(InterviewResponsesParser.STRING, 0); }
		public QuestionTypeContext questionType() {
			return getRuleContext(QuestionTypeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(InterviewResponsesParser.COMMA, 0); }
		public TerminalNode INT() { return getToken(InterviewResponsesParser.INT, 0); }
		public List<TerminalNode> RPAREN() { return getTokens(InterviewResponsesParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(InterviewResponsesParser.RPAREN, i);
		}
		public TerminalNode COLON() { return getToken(InterviewResponsesParser.COLON, 0); }
		public ResponseContext response() {
			return getRuleContext(ResponseContext.class,0);
		}
		public QuestionResponseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionResponse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewResponsesListener ) ((InterviewResponsesListener)listener).enterQuestionResponse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewResponsesListener ) ((InterviewResponsesListener)listener).exitQuestionResponse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewResponsesVisitor ) return ((InterviewResponsesVisitor<? extends T>)visitor).visitQuestionResponse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionResponseContext questionResponse() throws RecognitionException {
		QuestionResponseContext _localctx = new QuestionResponseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_questionResponse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(LPAREN);
			setState(46);
			match(STRING);
			setState(47);
			match(LPAREN);
			setState(48);
			questionType();
			setState(49);
			match(COMMA);
			setState(50);
			match(INT);
			setState(51);
			match(RPAREN);
			setState(52);
			match(RPAREN);
			setState(53);
			match(COLON);
			setState(54);
			response();
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
			if ( listener instanceof InterviewResponsesListener ) ((InterviewResponsesListener)listener).enterQuestionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewResponsesListener ) ((InterviewResponsesListener)listener).exitQuestionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewResponsesVisitor ) return ((InterviewResponsesVisitor<? extends T>)visitor).visitQuestionType(this);
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
			setState(56);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ResponseContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(InterviewResponsesParser.FALSE, 0); }
		public FractionContext fraction() {
			return getRuleContext(FractionContext.class,0);
		}
		public TerminalNode INT() { return getToken(InterviewResponsesParser.INT, 0); }
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(InterviewResponsesParser.TRUE, 0); }
		public TerminalNode STRING() { return getToken(InterviewResponsesParser.STRING, 0); }
		public ResponseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewResponsesListener ) ((InterviewResponsesListener)listener).enterResponse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewResponsesListener ) ((InterviewResponsesListener)listener).exitResponse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewResponsesVisitor ) return ((InterviewResponsesVisitor<? extends T>)visitor).visitResponse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResponseContext response() throws RecognitionException {
		ResponseContext _localctx = new ResponseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_response);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(FALSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				fraction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				date();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				time();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(63);
				match(TRUE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(64);
				match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FractionContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(InterviewResponsesParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(InterviewResponsesParser.INT, i);
		}
		public TerminalNode BACKSLASH() { return getToken(InterviewResponsesParser.BACKSLASH, 0); }
		public FractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewResponsesListener ) ((InterviewResponsesListener)listener).enterFraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewResponsesListener ) ((InterviewResponsesListener)listener).exitFraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewResponsesVisitor ) return ((InterviewResponsesVisitor<? extends T>)visitor).visitFraction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FractionContext fraction() throws RecognitionException {
		FractionContext _localctx = new FractionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fraction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(INT);
			setState(68);
			match(BACKSLASH);
			setState(69);
			match(INT);
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
	public static class DateContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(InterviewResponsesParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(InterviewResponsesParser.INT, i);
		}
		public List<TerminalNode> HYPHEN() { return getTokens(InterviewResponsesParser.HYPHEN); }
		public TerminalNode HYPHEN(int i) {
			return getToken(InterviewResponsesParser.HYPHEN, i);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewResponsesListener ) ((InterviewResponsesListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewResponsesListener ) ((InterviewResponsesListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewResponsesVisitor ) return ((InterviewResponsesVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(INT);
			setState(72);
			match(HYPHEN);
			setState(73);
			match(INT);
			setState(74);
			match(HYPHEN);
			setState(75);
			match(INT);
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
	public static class TimeContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(InterviewResponsesParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(InterviewResponsesParser.INT, i);
		}
		public TerminalNode HYPHEN() { return getToken(InterviewResponsesParser.HYPHEN, 0); }
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewResponsesListener ) ((InterviewResponsesListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewResponsesListener ) ((InterviewResponsesListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewResponsesVisitor ) return ((InterviewResponsesVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(INT);
			setState(78);
			match(HYPHEN);
			setState(79);
			match(INT);
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
		"\u0004\u0001\u0019R\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\'\b\u0002\n\u0002\f\u0002"+
		"*\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"B\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0000\u0001\u0001\u0000\u0005\rO\u0000\u0012\u0001\u0000"+
		"\u0000\u0000\u0002\u0018\u0001\u0000\u0000\u0000\u0004\"\u0001\u0000\u0000"+
		"\u0000\u0006-\u0001\u0000\u0000\u0000\b8\u0001\u0000\u0000\u0000\nA\u0001"+
		"\u0000\u0000\u0000\fC\u0001\u0000\u0000\u0000\u000eG\u0001\u0000\u0000"+
		"\u0000\u0010M\u0001\u0000\u0000\u0000\u0012\u0013\u0005\u0001\u0000\u0000"+
		"\u0013\u0014\u0005\u0012\u0000\u0000\u0014\u0015\u0005\u000e\u0000\u0000"+
		"\u0015\u0016\u0003\u0002\u0001\u0000\u0016\u0017\u0005\u000f\u0000\u0000"+
		"\u0017\u0001\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0002\u0000\u0000"+
		"\u0019\u001a\u0005\u0011\u0000\u0000\u001a\u001b\u0005\u0014\u0000\u0000"+
		"\u001b\u001c\u0005\u0003\u0000\u0000\u001c\u001d\u0005\u0011\u0000\u0000"+
		"\u001d\u001e\u0005\u0014\u0000\u0000\u001e\u001f\u0005\u0004\u0000\u0000"+
		"\u001f \u0005\u0011\u0000\u0000 !\u0003\u0004\u0002\u0000!\u0003\u0001"+
		"\u0000\u0000\u0000\"#\u0005\u000e\u0000\u0000#(\u0003\u0006\u0003\u0000"+
		"$%\u0005\u0010\u0000\u0000%\'\u0003\u0006\u0003\u0000&$\u0001\u0000\u0000"+
		"\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000"+
		"\u0000\u0000)+\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000+,\u0005"+
		"\u000f\u0000\u0000,\u0005\u0001\u0000\u0000\u0000-.\u0005\u000e\u0000"+
		"\u0000./\u0005\u0014\u0000\u0000/0\u0005\u000e\u0000\u000001\u0003\b\u0004"+
		"\u000012\u0005\u0010\u0000\u000023\u0005\u0013\u0000\u000034\u0005\u000f"+
		"\u0000\u000045\u0005\u000f\u0000\u000056\u0005\u0011\u0000\u000067\u0003"+
		"\n\u0005\u00007\u0007\u0001\u0000\u0000\u000089\u0007\u0000\u0000\u0000"+
		"9\t\u0001\u0000\u0000\u0000:B\u0005\u0016\u0000\u0000;B\u0003\f\u0006"+
		"\u0000<B\u0005\u0013\u0000\u0000=B\u0003\u000e\u0007\u0000>B\u0003\u0010"+
		"\b\u0000?B\u0005\u0015\u0000\u0000@B\u0005\u0014\u0000\u0000A:\u0001\u0000"+
		"\u0000\u0000A;\u0001\u0000\u0000\u0000A<\u0001\u0000\u0000\u0000A=\u0001"+
		"\u0000\u0000\u0000A>\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"A@\u0001\u0000\u0000\u0000B\u000b\u0001\u0000\u0000\u0000CD\u0005\u0013"+
		"\u0000\u0000DE\u0005\u0018\u0000\u0000EF\u0005\u0013\u0000\u0000F\r\u0001"+
		"\u0000\u0000\u0000GH\u0005\u0013\u0000\u0000HI\u0005\u0017\u0000\u0000"+
		"IJ\u0005\u0013\u0000\u0000JK\u0005\u0017\u0000\u0000KL\u0005\u0013\u0000"+
		"\u0000L\u000f\u0001\u0000\u0000\u0000MN\u0005\u0013\u0000\u0000NO\u0005"+
		"\u0017\u0000\u0000OP\u0005\u0013\u0000\u0000P\u0011\u0001\u0000\u0000"+
		"\u0000\u0002(A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}