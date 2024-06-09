// Generated from JobAplication.g4 by ANTLR 4.13.1
package jobAP;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JobAplicationParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, LPAREN=8, RPAREN=9, 
		COMMA=10, COLON=11, ID=12, INT=13, STRING=14, WS=15;
	public static final int
		RULE_plugin = 0, RULE_jobReqParams = 1, RULE_attrList = 2, RULE_degreeArea = 3, 
		RULE_degreeLevel = 4, RULE_tools = 5, RULE_yearsOfExperience = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"plugin", "jobReqParams", "attrList", "degreeArea", "degreeLevel", "tools", 
			"yearsOfExperience"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'JobRequirementSpec'", "'Title'", "'Attributes'", "'Degree area'", 
			"'Degree level'", "'Tools'", "'Years of experience'", "'('", "')'", "','", 
			"':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "LPAREN", "RPAREN", "COMMA", 
			"COLON", "ID", "INT", "STRING", "WS"
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
	public String getGrammarFileName() { return "JobAplication.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JobAplicationParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PluginContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JobAplicationParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(JobAplicationParser.LPAREN, 0); }
		public JobReqParamsContext jobReqParams() {
			return getRuleContext(JobReqParamsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JobAplicationParser.RPAREN, 0); }
		public PluginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plugin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobAplicationListener ) ((JobAplicationListener)listener).enterPlugin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobAplicationListener ) ((JobAplicationListener)listener).exitPlugin(this);
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
		public List<TerminalNode> COLON() { return getTokens(JobAplicationParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JobAplicationParser.COLON, i);
		}
		public TerminalNode STRING() { return getToken(JobAplicationParser.STRING, 0); }
		public TerminalNode COMMA() { return getToken(JobAplicationParser.COMMA, 0); }
		public AttrListContext attrList() {
			return getRuleContext(AttrListContext.class,0);
		}
		public JobReqParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jobReqParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobAplicationListener ) ((JobAplicationListener)listener).enterJobReqParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobAplicationListener ) ((JobAplicationListener)listener).exitJobReqParams(this);
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
			attrList();
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
	public static class AttrListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JobAplicationParser.LPAREN, 0); }
		public DegreeAreaContext degreeArea() {
			return getRuleContext(DegreeAreaContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(JobAplicationParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JobAplicationParser.COMMA, i);
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
		public TerminalNode RPAREN() { return getToken(JobAplicationParser.RPAREN, 0); }
		public AttrListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobAplicationListener ) ((JobAplicationListener)listener).enterAttrList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobAplicationListener ) ((JobAplicationListener)listener).exitAttrList(this);
		}
	}

	public final AttrListContext attrList() throws RecognitionException {
		AttrListContext _localctx = new AttrListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_attrList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(LPAREN);
			setState(29);
			degreeArea();
			setState(30);
			match(COMMA);
			setState(31);
			degreeLevel();
			setState(32);
			match(COMMA);
			setState(33);
			tools();
			setState(34);
			match(COMMA);
			setState(35);
			yearsOfExperience();
			setState(36);
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
		public TerminalNode COLON() { return getToken(JobAplicationParser.COLON, 0); }
		public List<TerminalNode> STRING() { return getTokens(JobAplicationParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JobAplicationParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JobAplicationParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JobAplicationParser.COMMA, i);
		}
		public DegreeAreaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_degreeArea; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobAplicationListener ) ((JobAplicationListener)listener).enterDegreeArea(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobAplicationListener ) ((JobAplicationListener)listener).exitDegreeArea(this);
		}
	}

	public final DegreeAreaContext degreeArea() throws RecognitionException {
		DegreeAreaContext _localctx = new DegreeAreaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_degreeArea);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__3);
			setState(39);
			match(COLON);
			setState(40);
			match(STRING);
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(41);
					match(COMMA);
					setState(42);
					match(STRING);
					}
					} 
				}
				setState(47);
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
		public TerminalNode COLON() { return getToken(JobAplicationParser.COLON, 0); }
		public List<TerminalNode> STRING() { return getTokens(JobAplicationParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JobAplicationParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JobAplicationParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JobAplicationParser.COMMA, i);
		}
		public DegreeLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_degreeLevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobAplicationListener ) ((JobAplicationListener)listener).enterDegreeLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobAplicationListener ) ((JobAplicationListener)listener).exitDegreeLevel(this);
		}
	}

	public final DegreeLevelContext degreeLevel() throws RecognitionException {
		DegreeLevelContext _localctx = new DegreeLevelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_degreeLevel);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__4);
			setState(49);
			match(COLON);
			setState(50);
			match(STRING);
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(51);
					match(COMMA);
					setState(52);
					match(STRING);
					}
					} 
				}
				setState(57);
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
		public TerminalNode COLON() { return getToken(JobAplicationParser.COLON, 0); }
		public List<TerminalNode> STRING() { return getTokens(JobAplicationParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JobAplicationParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JobAplicationParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JobAplicationParser.COMMA, i);
		}
		public ToolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tools; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobAplicationListener ) ((JobAplicationListener)listener).enterTools(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobAplicationListener ) ((JobAplicationListener)listener).exitTools(this);
		}
	}

	public final ToolsContext tools() throws RecognitionException {
		ToolsContext _localctx = new ToolsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tools);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__5);
			setState(59);
			match(COLON);
			setState(60);
			match(STRING);
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(61);
					match(COMMA);
					setState(62);
					match(STRING);
					}
					} 
				}
				setState(67);
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
		public TerminalNode COLON() { return getToken(JobAplicationParser.COLON, 0); }
		public TerminalNode INT() { return getToken(JobAplicationParser.INT, 0); }
		public YearsOfExperienceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yearsOfExperience; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobAplicationListener ) ((JobAplicationListener)listener).enterYearsOfExperience(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobAplicationListener ) ((JobAplicationListener)listener).exitYearsOfExperience(this);
		}
	}

	public final YearsOfExperienceContext yearsOfExperience() throws RecognitionException {
		YearsOfExperienceContext _localctx = new YearsOfExperienceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_yearsOfExperience);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__6);
			setState(69);
			match(COLON);
			setState(70);
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
		"\u0004\u0001\u000fI\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003,\b\u0003\n\u0003\f\u0003/\t"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u00046\b\u0004\n\u0004\f\u00049\t\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005@\b\u0005\n\u0005\f\u0005C\t"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0000"+
		"\u0000\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0000D\u0000\u000e\u0001"+
		"\u0000\u0000\u0000\u0002\u0014\u0001\u0000\u0000\u0000\u0004\u001c\u0001"+
		"\u0000\u0000\u0000\u0006&\u0001\u0000\u0000\u0000\b0\u0001\u0000\u0000"+
		"\u0000\n:\u0001\u0000\u0000\u0000\fD\u0001\u0000\u0000\u0000\u000e\u000f"+
		"\u0005\u0001\u0000\u0000\u000f\u0010\u0005\f\u0000\u0000\u0010\u0011\u0005"+
		"\b\u0000\u0000\u0011\u0012\u0003\u0002\u0001\u0000\u0012\u0013\u0005\t"+
		"\u0000\u0000\u0013\u0001\u0001\u0000\u0000\u0000\u0014\u0015\u0005\u0002"+
		"\u0000\u0000\u0015\u0016\u0005\u000b\u0000\u0000\u0016\u0017\u0005\u000e"+
		"\u0000\u0000\u0017\u0018\u0005\n\u0000\u0000\u0018\u0019\u0005\u0003\u0000"+
		"\u0000\u0019\u001a\u0005\u000b\u0000\u0000\u001a\u001b\u0003\u0004\u0002"+
		"\u0000\u001b\u0003\u0001\u0000\u0000\u0000\u001c\u001d\u0005\b\u0000\u0000"+
		"\u001d\u001e\u0003\u0006\u0003\u0000\u001e\u001f\u0005\n\u0000\u0000\u001f"+
		" \u0003\b\u0004\u0000 !\u0005\n\u0000\u0000!\"\u0003\n\u0005\u0000\"#"+
		"\u0005\n\u0000\u0000#$\u0003\f\u0006\u0000$%\u0005\t\u0000\u0000%\u0005"+
		"\u0001\u0000\u0000\u0000&\'\u0005\u0004\u0000\u0000\'(\u0005\u000b\u0000"+
		"\u0000(-\u0005\u000e\u0000\u0000)*\u0005\n\u0000\u0000*,\u0005\u000e\u0000"+
		"\u0000+)\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000"+
		"\u0000\u0000-.\u0001\u0000\u0000\u0000.\u0007\u0001\u0000\u0000\u0000"+
		"/-\u0001\u0000\u0000\u000001\u0005\u0005\u0000\u000012\u0005\u000b\u0000"+
		"\u000027\u0005\u000e\u0000\u000034\u0005\n\u0000\u000046\u0005\u000e\u0000"+
		"\u000053\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000"+
		"\u0000\u000078\u0001\u0000\u0000\u00008\t\u0001\u0000\u0000\u000097\u0001"+
		"\u0000\u0000\u0000:;\u0005\u0006\u0000\u0000;<\u0005\u000b\u0000\u0000"+
		"<A\u0005\u000e\u0000\u0000=>\u0005\n\u0000\u0000>@\u0005\u000e\u0000\u0000"+
		"?=\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000"+
		"\u0000AB\u0001\u0000\u0000\u0000B\u000b\u0001\u0000\u0000\u0000CA\u0001"+
		"\u0000\u0000\u0000DE\u0005\u0007\u0000\u0000EF\u0005\u000b\u0000\u0000"+
		"FG\u0005\r\u0000\u0000G\r\u0001\u0000\u0000\u0000\u0003-7A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}