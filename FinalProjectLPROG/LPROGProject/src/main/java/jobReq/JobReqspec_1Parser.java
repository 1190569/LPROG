// Generated from JobReqspec_1.g4 by ANTLR 4.13.1
package jobReq;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JobReqspec_1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, LPAREN=6, RPAREN=7, COMMA=8, COLON=9, 
		ID=10, INT=11, STRING=12, WS=13;
	public static final int
		RULE_plugin = 0, RULE_jobReqParams = 1, RULE_reqList = 2, RULE_reqItem = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"plugin", "jobReqParams", "reqList", "reqItem"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'JobRequirementSpec'", "'Title'", "':'", "'Description'", "'Requirements'", 
			"'('", "')'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "LPAREN", "RPAREN", "COMMA", "COLON", 
			"ID", "INT", "STRING", "WS"
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
	public String getGrammarFileName() { return "SprintB/JobReqspec_1.g4"; }

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
		public TerminalNode ID(int i) { return getToken(JobReqspec_1Parser.ID, 0); }
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
			setState(8);
			match(T__0);
			setState(9);
			match(ID);
			setState(10);
			match(LPAREN);
			setState(11);
			jobReqParams();
			setState(12);
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
		public List<TerminalNode> STRING() { return getTokens(JobReqspec_1Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JobReqspec_1Parser.STRING, i);
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
			setState(14);
			match(T__1);
			setState(15);
			match(T__2);
			setState(16);
			match(STRING);
			setState(17);
			match(T__3);
			setState(18);
			match(T__2);
			setState(19);
			match(STRING);
			setState(20);
			match(T__4);
			setState(21);
			match(T__2);
			setState(22);
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
		public List<ReqItemContext> reqItem() {
			return getRuleContexts(ReqItemContext.class);
		}
		public ReqItemContext reqItem(int i) {
			return getRuleContext(ReqItemContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(JobReqspec_1Parser.RPAREN, 0); }
		public List<TerminalNode> COLON() { return getTokens(JobReqspec_1Parser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JobReqspec_1Parser.COLON, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(LPAREN);
			setState(25);
			reqItem();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(26);
				match(COLON);
				setState(27);
				reqItem();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
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
	public static class ReqItemContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JobReqspec_1Parser.STRING, 0); }
		public ReqItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reqItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobReqspec_1Listener ) ((JobReqspec_1Listener)listener).enterReqItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobReqspec_1Listener ) ((JobReqspec_1Listener)listener).exitReqItem(this);
		}
	}

	public final ReqItemContext reqItem() throws RecognitionException {
		ReqItemContext _localctx = new ReqItemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_reqItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
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

	public static final String _serializedATN =
		"\u0004\u0001\r&\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002\u001d\b\u0002\n\u0002\f\u0002 \t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0000\u0000\u0004\u0000\u0002\u0004"+
		"\u0006\u0000\u0000\"\u0000\b\u0001\u0000\u0000\u0000\u0002\u000e\u0001"+
		"\u0000\u0000\u0000\u0004\u0018\u0001\u0000\u0000\u0000\u0006#\u0001\u0000"+
		"\u0000\u0000\b\t\u0005\u0001\u0000\u0000\t\n\u0005\n\u0000\u0000\n\u000b"+
		"\u0005\u0006\u0000\u0000\u000b\f\u0003\u0002\u0001\u0000\f\r\u0005\u0007"+
		"\u0000\u0000\r\u0001\u0001\u0000\u0000\u0000\u000e\u000f\u0005\u0002\u0000"+
		"\u0000\u000f\u0010\u0005\u0003\u0000\u0000\u0010\u0011\u0005\f\u0000\u0000"+
		"\u0011\u0012\u0005\u0004\u0000\u0000\u0012\u0013\u0005\u0003\u0000\u0000"+
		"\u0013\u0014\u0005\f\u0000\u0000\u0014\u0015\u0005\u0005\u0000\u0000\u0015"+
		"\u0016\u0005\u0003\u0000\u0000\u0016\u0017\u0003\u0004\u0002\u0000\u0017"+
		"\u0003\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0006\u0000\u0000\u0019"+
		"\u001e\u0003\u0006\u0003\u0000\u001a\u001b\u0005\t\u0000\u0000\u001b\u001d"+
		"\u0003\u0006\u0003\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001d \u0001"+
		"\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001"+
		"\u0000\u0000\u0000\u001f!\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000"+
		"\u0000!\"\u0005\u0007\u0000\u0000\"\u0005\u0001\u0000\u0000\u0000#$\u0005"+
		"\f\u0000\u0000$\u0007\u0001\u0000\u0000\u0000\u0001\u001e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}