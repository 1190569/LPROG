// Generated from JobReqspec_1.g4 by ANTLR 4.13.1
package jobReq;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JobReqspec_1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	public static final int
			T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, LPAREN=9,
			RPAREN=10, COMMA=11, COLON=12, ID=13, INT=14, STRING=15, WS=16;
	public static final int
			RULE_plugin = 0, RULE_jobReqParams = 1, RULE_reqList = 2, RULE_degreeArea = 3,
			RULE_degreeLevel = 4, RULE_tools = 5, RULE_yearsOfExperience = 6;
	private static String[] makeRuleNames() {
		return new String[] {
				"plugin", "jobReqParams", "reqList", "degreeArea", "degreeLevel", "tools",
				"yearsOfExperience"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
				null, "'JobRequirementSpec'", "'Title'", "'Description'", "'Requirements'",
				"'Degree area'", "'Degree level'", "'Tools'", "'Years of experience'",
				"'('", "')'", "','", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
				null, null, null, null, null, null, null, null, null, "LPAREN", "RPAREN",
				"COMMA", "COLON", "ID", "INT", "STRING", "WS"
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
	public String getGrammarFileName() { return "JobReqspec_1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JobReqspec_1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PluginContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JobReqspec_1Parser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(JobReqspec_1Parser.LPAREN, 0); }
		public JobReqParamsContext jobReqParams() {
			return getRuleContext(JobReqParamsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JobReqspec_1Parser.RPAREN, 0); }
		public PluginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plugin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobReqspec_1Listener ) ((JobReqspec_1Listener)listener).enterPlugin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobReqspec_1Listener ) ((JobReqspec_1Listener)listener).exitPlugin(this);
		}
	}

	public final PluginContext plugin() throws RecognitionException {
		PluginContext _localctx = new PluginContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_plugin);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(14);
				match(T__0);
				setState(15);
				match(ID);
				setState(16);
				match(LPAREN);
				setState(17);
				jobReqParams();
				setState(18);
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
	public static class JobReqParamsContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(JobReqspec_1Parser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JobReqspec_1Parser.COLON, i);
		}
		public List<TerminalNode> STRING() { return getTokens(JobReqspec_1Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JobReqspec_1Parser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JobReqspec_1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JobReqspec_1Parser.COMMA, i);
		}
		public ReqListContext reqList() {
			return getRuleContext(ReqListContext.class,0);
		}
		public JobReqParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jobReqParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobReqspec_1Listener ) ((JobReqspec_1Listener)listener).enterJobReqParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobReqspec_1Listener ) ((JobReqspec_1Listener)listener).exitJobReqParams(this);
		}
	}

	public final JobReqParamsContext jobReqParams() throws RecognitionException {
		JobReqParamsContext _localctx = new JobReqParamsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_jobReqParams);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(20);
				match(T__1);
				setState(21);
				match(COLON);
				setState(22);
				match(STRING);
				setState(23);
				match(COMMA);
				setState(24);
				match(T__2);
				setState(25);
				match(COLON);
				setState(26);
				match(STRING);
				setState(27);
				match(COMMA);
				setState(28);
				match(T__3);
				setState(29);
				match(COLON);
				setState(30);
				reqList();
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
	public static class ReqListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JobReqspec_1Parser.LPAREN, 0); }
		public DegreeAreaContext degreeArea() {
			return getRuleContext(DegreeAreaContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(JobReqspec_1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JobReqspec_1Parser.COMMA, i);
		}
		public DegreeLevelContext degreeLevel() {
			return getRuleContext(DegreeLevelContext.class,0);
		}
		public ToolsContext tools() {
			return getRuleContext(ToolsContext.class,0);
		}
		public YearsOfExperienceContext yearsOfExperience() {
			return getRuleContext(YearsOfExperienceContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JobReqspec_1Parser.RPAREN, 0); }
		public ReqListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reqList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobReqspec_1Listener ) ((JobReqspec_1Listener)listener).enterReqList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobReqspec_1Listener ) ((JobReqspec_1Listener)listener).exitReqList(this);
		}
	}

	public final ReqListContext reqList() throws RecognitionException {
		ReqListContext _localctx = new ReqListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_reqList);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(32);
				match(LPAREN);
				setState(33);
				degreeArea();
				setState(34);
				match(COMMA);
				setState(35);
				degreeLevel();
				setState(36);
				match(COMMA);
				setState(37);
				tools();
				setState(38);
				match(COMMA);
				setState(39);
				yearsOfExperience();
				setState(40);
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
	public static class DegreeAreaContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(JobReqspec_1Parser.COLON, 0); }
		public List<TerminalNode> STRING() { return getTokens(JobReqspec_1Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JobReqspec_1Parser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JobReqspec_1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JobReqspec_1Parser.COMMA, i);
		}
		public DegreeAreaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_degreeArea; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobReqspec_1Listener ) ((JobReqspec_1Listener)listener).enterDegreeArea(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobReqspec_1Listener ) ((JobReqspec_1Listener)listener).exitDegreeArea(this);
		}
	}

	public final DegreeAreaContext degreeArea() throws RecognitionException {
		DegreeAreaContext _localctx = new DegreeAreaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_degreeArea);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(42);
				match(T__4);
				setState(43);
				match(COLON);
				setState(44);
				match(STRING);
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
							{
								setState(45);
								match(COMMA);
								setState(46);
								match(STRING);
							}
						}
					}
					setState(51);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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
	public static class DegreeLevelContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(JobReqspec_1Parser.COLON, 0); }
		public List<TerminalNode> STRING() { return getTokens(JobReqspec_1Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JobReqspec_1Parser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JobReqspec_1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JobReqspec_1Parser.COMMA, i);
		}
		public DegreeLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_degreeLevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobReqspec_1Listener ) ((JobReqspec_1Listener)listener).enterDegreeLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobReqspec_1Listener ) ((JobReqspec_1Listener)listener).exitDegreeLevel(this);
		}
	}

	public final DegreeLevelContext degreeLevel() throws RecognitionException {
		DegreeLevelContext _localctx = new DegreeLevelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_degreeLevel);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(52);
				match(T__5);
				setState(53);
				match(COLON);
				setState(54);
				match(STRING);
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
							{
								setState(55);
								match(COMMA);
								setState(56);
								match(STRING);
							}
						}
					}
					setState(61);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
	public static class ToolsContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(JobReqspec_1Parser.COLON, 0); }
		public List<TerminalNode> STRING() { return getTokens(JobReqspec_1Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JobReqspec_1Parser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JobReqspec_1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JobReqspec_1Parser.COMMA, i);
		}
		public ToolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tools; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobReqspec_1Listener ) ((JobReqspec_1Listener)listener).enterTools(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobReqspec_1Listener ) ((JobReqspec_1Listener)listener).exitTools(this);
		}
	}

	public final ToolsContext tools() throws RecognitionException {
		ToolsContext _localctx = new ToolsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tools);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(62);
				match(T__6);
				setState(63);
				match(COLON);
				setState(64);
				match(STRING);
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
							{
								setState(65);
								match(COMMA);
								setState(66);
								match(STRING);
							}
						}
					}
					setState(71);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
	public static class YearsOfExperienceContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(JobReqspec_1Parser.COLON, 0); }
		public TerminalNode INT() { return getToken(JobReqspec_1Parser.INT, 0); }
		public YearsOfExperienceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yearsOfExperience; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobReqspec_1Listener ) ((JobReqspec_1Listener)listener).enterYearsOfExperience(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobReqspec_1Listener ) ((JobReqspec_1Listener)listener).exitYearsOfExperience(this);
		}
	}

	public final YearsOfExperienceContext yearsOfExperience() throws RecognitionException {
		YearsOfExperienceContext _localctx = new YearsOfExperienceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_yearsOfExperience);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(72);
				match(T__7);
				setState(73);
				match(COLON);
				setState(74);
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
			"\u0004\u0001\u0010M\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
					"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
					"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
					"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
					"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
					"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
					"\u0003\u0005\u00030\b\u0003\n\u0003\f\u00033\t\u0003\u0001\u0004\u0001"+
					"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004:\b\u0004\n\u0004"+
					"\f\u0004=\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
					"\u0005\u0005\u0005D\b\u0005\n\u0005\f\u0005G\t\u0005\u0001\u0006\u0001"+
					"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0000\u0000\u0007\u0000\u0002"+
					"\u0004\u0006\b\n\f\u0000\u0000H\u0000\u000e\u0001\u0000\u0000\u0000\u0002"+
					"\u0014\u0001\u0000\u0000\u0000\u0004 \u0001\u0000\u0000\u0000\u0006*\u0001"+
					"\u0000\u0000\u0000\b4\u0001\u0000\u0000\u0000\n>\u0001\u0000\u0000\u0000"+
					"\fH\u0001\u0000\u0000\u0000\u000e\u000f\u0005\u0001\u0000\u0000\u000f"+
					"\u0010\u0005\r\u0000\u0000\u0010\u0011\u0005\t\u0000\u0000\u0011\u0012"+
					"\u0003\u0002\u0001\u0000\u0012\u0013\u0005\n\u0000\u0000\u0013\u0001\u0001"+
					"\u0000\u0000\u0000\u0014\u0015\u0005\u0002\u0000\u0000\u0015\u0016\u0005"+
					"\f\u0000\u0000\u0016\u0017\u0005\u000f\u0000\u0000\u0017\u0018\u0005\u000b"+
					"\u0000\u0000\u0018\u0019\u0005\u0003\u0000\u0000\u0019\u001a\u0005\f\u0000"+
					"\u0000\u001a\u001b\u0005\u000f\u0000\u0000\u001b\u001c\u0005\u000b\u0000"+
					"\u0000\u001c\u001d\u0005\u0004\u0000\u0000\u001d\u001e\u0005\f\u0000\u0000"+
					"\u001e\u001f\u0003\u0004\u0002\u0000\u001f\u0003\u0001\u0000\u0000\u0000"+
					" !\u0005\t\u0000\u0000!\"\u0003\u0006\u0003\u0000\"#\u0005\u000b\u0000"+
					"\u0000#$\u0003\b\u0004\u0000$%\u0005\u000b\u0000\u0000%&\u0003\n\u0005"+
					"\u0000&\'\u0005\u000b\u0000\u0000\'(\u0003\f\u0006\u0000()\u0005\n\u0000"+
					"\u0000)\u0005\u0001\u0000\u0000\u0000*+\u0005\u0005\u0000\u0000+,\u0005"+
					"\f\u0000\u0000,1\u0005\u000f\u0000\u0000-.\u0005\u000b\u0000\u0000.0\u0005"+
					"\u000f\u0000\u0000/-\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u0000"+
					"1/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u00002\u0007\u0001\u0000"+
					"\u0000\u000031\u0001\u0000\u0000\u000045\u0005\u0006\u0000\u000056\u0005"+
					"\f\u0000\u00006;\u0005\u000f\u0000\u000078\u0005\u000b\u0000\u00008:\u0005"+
					"\u000f\u0000\u000097\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000"+
					";9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<\t\u0001\u0000\u0000"+
					"\u0000=;\u0001\u0000\u0000\u0000>?\u0005\u0007\u0000\u0000?@\u0005\f\u0000"+
					"\u0000@E\u0005\u000f\u0000\u0000AB\u0005\u000b\u0000\u0000BD\u0005\u000f"+
					"\u0000\u0000CA\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001"+
					"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000F\u000b\u0001\u0000\u0000"+
					"\u0000GE\u0001\u0000\u0000\u0000HI\u0005\b\u0000\u0000IJ\u0005\f\u0000"+
					"\u0000JK\u0005\u000e\u0000\u0000K\r\u0001\u0000\u0000\u0000\u00031;E";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}