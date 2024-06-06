// Generated from JobReqspec_1.g4 by ANTLR 4.13.1
package jobReq;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JobReqspec_1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, LPAREN=6, RPAREN=7, COMMA=8, COLON=9, 
		ID=10, INT=11, STRING=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "LPAREN", "RPAREN", "COMMA", 
			"COLON", "ID", "INT", "STRING", "WS"
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


	public JobReqspec_1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SprintB/JobReqspec_1.g4"; }

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
		"\u0004\u0000\rq\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0004\tY\b\t\u000b\t\f\tZ\u0001\n\u0004"+
		"\n^\b\n\u000b\n\f\n_\u0001\u000b\u0001\u000b\u0005\u000bd\b\u000b\n\u000b"+
		"\f\u000bg\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0004\fl\b\f\u000b\f"+
		"\f\fm\u0001\f\u0001\f\u0000\u0000\r\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u0001\u0000\u0004\u0002\u0000AZaz\u0001\u00000"+
		"9\u0003\u0000\n\n\r\r\"\"\u0003\u0000\t\n\r\r  t\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0001\u001b\u0001\u0000\u0000\u0000\u0003.\u0001\u0000\u0000\u0000\u0005"+
		"4\u0001\u0000\u0000\u0000\u00076\u0001\u0000\u0000\u0000\tB\u0001\u0000"+
		"\u0000\u0000\u000bO\u0001\u0000\u0000\u0000\rQ\u0001\u0000\u0000\u0000"+
		"\u000fS\u0001\u0000\u0000\u0000\u0011U\u0001\u0000\u0000\u0000\u0013X"+
		"\u0001\u0000\u0000\u0000\u0015]\u0001\u0000\u0000\u0000\u0017a\u0001\u0000"+
		"\u0000\u0000\u0019k\u0001\u0000\u0000\u0000\u001b\u001c\u0005J\u0000\u0000"+
		"\u001c\u001d\u0005o\u0000\u0000\u001d\u001e\u0005b\u0000\u0000\u001e\u001f"+
		"\u0005R\u0000\u0000\u001f \u0005e\u0000\u0000 !\u0005q\u0000\u0000!\""+
		"\u0005u\u0000\u0000\"#\u0005i\u0000\u0000#$\u0005r\u0000\u0000$%\u0005"+
		"e\u0000\u0000%&\u0005m\u0000\u0000&\'\u0005e\u0000\u0000\'(\u0005n\u0000"+
		"\u0000()\u0005t\u0000\u0000)*\u0005S\u0000\u0000*+\u0005p\u0000\u0000"+
		"+,\u0005e\u0000\u0000,-\u0005c\u0000\u0000-\u0002\u0001\u0000\u0000\u0000"+
		"./\u0005T\u0000\u0000/0\u0005i\u0000\u000001\u0005t\u0000\u000012\u0005"+
		"l\u0000\u000023\u0005e\u0000\u00003\u0004\u0001\u0000\u0000\u000045\u0005"+
		":\u0000\u00005\u0006\u0001\u0000\u0000\u000067\u0005D\u0000\u000078\u0005"+
		"e\u0000\u000089\u0005s\u0000\u00009:\u0005c\u0000\u0000:;\u0005r\u0000"+
		"\u0000;<\u0005i\u0000\u0000<=\u0005p\u0000\u0000=>\u0005t\u0000\u0000"+
		">?\u0005i\u0000\u0000?@\u0005o\u0000\u0000@A\u0005n\u0000\u0000A\b\u0001"+
		"\u0000\u0000\u0000BC\u0005R\u0000\u0000CD\u0005e\u0000\u0000DE\u0005q"+
		"\u0000\u0000EF\u0005u\u0000\u0000FG\u0005i\u0000\u0000GH\u0005r\u0000"+
		"\u0000HI\u0005e\u0000\u0000IJ\u0005m\u0000\u0000JK\u0005e\u0000\u0000"+
		"KL\u0005n\u0000\u0000LM\u0005t\u0000\u0000MN\u0005s\u0000\u0000N\n\u0001"+
		"\u0000\u0000\u0000OP\u0005(\u0000\u0000P\f\u0001\u0000\u0000\u0000QR\u0005"+
		")\u0000\u0000R\u000e\u0001\u0000\u0000\u0000ST\u0005,\u0000\u0000T\u0010"+
		"\u0001\u0000\u0000\u0000UV\u0005;\u0000\u0000V\u0012\u0001\u0000\u0000"+
		"\u0000WY\u0007\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\u0014"+
		"\u0001\u0000\u0000\u0000\\^\u0007\u0001\u0000\u0000]\\\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000"+
		"\u0000\u0000`\u0016\u0001\u0000\u0000\u0000ae\u0005\"\u0000\u0000bd\b"+
		"\u0002\u0000\u0000cb\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000"+
		"ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fh\u0001\u0000\u0000"+
		"\u0000ge\u0001\u0000\u0000\u0000hi\u0005\"\u0000\u0000i\u0018\u0001\u0000"+
		"\u0000\u0000jl\u0007\u0003\u0000\u0000kj\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000op\u0006\f\u0000\u0000p\u001a\u0001\u0000\u0000"+
		"\u0000\u0005\u0000Z_em\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}