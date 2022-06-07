// Generated from /home/user/projects/antlr4-experiments/4 - indexed array (with optional typing)/TParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, INTEGER=2, VAR=3, TYPE=4, VARIABLE=5, ATTR=6, SEPARATOR=7, END=8, 
		ARRAY_OPEN=9, ARRAY_CLOSE=10, SPACETABS=11, UNKNOWN=12;
	public static final int
		RULE_main = 0, RULE_sentence = 1, RULE_expression = 2, RULE_variables = 3, 
		RULE_definition = 4, RULE_array = 5, RULE_elements = 6, RULE_value = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "sentence", "expression", "variables", "definition", "array", 
			"elements", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'var'", null, null, "'='", "','", "';'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRING", "INTEGER", "VAR", "TYPE", "VARIABLE", "ATTR", "SEPARATOR", 
			"END", "ARRAY_OPEN", "ARRAY_CLOSE", "SPACETABS", "UNKNOWN"
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
	public String getGrammarFileName() { return "TParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MainContext extends ParserRuleContext {
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TParser.EOF, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			sentence(0);
			setState(17);
			match(EOF);
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
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	}

	public final SentenceContext sentence() throws RecognitionException {
		return sentence(0);
	}

	private SentenceContext sentence(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SentenceContext _localctx = new SentenceContext(_ctx, _parentState);
		SentenceContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_sentence, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(24);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SentenceContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sentence);
					setState(20);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(21);
					expression();
					}
					} 
				}
				setState(26);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(TParser.VAR, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode END() { return getToken(TParser.END, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(VAR);
			setState(28);
			variables();
			setState(29);
			match(END);
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

	public static class VariablesContext extends ParserRuleContext {
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(TParser.SEPARATOR, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variables);
		try {
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				definition();
				setState(33);
				match(SEPARATOR);
				setState(34);
				variables();
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

	public static class DefinitionContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(TParser.VARIABLE, 0); }
		public TerminalNode ATTR() { return getToken(TParser.ATTR, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(TParser.TYPE, 0); }
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_definition);
		try {
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(VARIABLE);
				setState(39);
				match(ATTR);
				setState(40);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(VARIABLE);
				setState(42);
				match(TYPE);
				setState(43);
				match(ATTR);
				setState(44);
				value();
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode ARRAY_OPEN() { return getToken(TParser.ARRAY_OPEN, 0); }
		public TerminalNode ARRAY_CLOSE() { return getToken(TParser.ARRAY_CLOSE, 0); }
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_array);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(ARRAY_OPEN);
				setState(48);
				match(ARRAY_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(ARRAY_OPEN);
				setState(50);
				elements();
				setState(51);
				match(ARRAY_CLOSE);
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

	public static class ElementsContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(TParser.TYPE, 0); }
		public TerminalNode SEPARATOR() { return getToken(TParser.SEPARATOR, 0); }
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public ElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements; }
	}

	public final ElementsContext elements() throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elements);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				value();
				setState(57);
				match(TYPE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				value();
				setState(60);
				match(SEPARATOR);
				setState(61);
				elements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				value();
				setState(64);
				match(TYPE);
				setState(65);
				match(SEPARATOR);
				setState(66);
				elements();
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(TParser.VARIABLE, 0); }
		public TerminalNode STRING() { return getToken(TParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(TParser.INTEGER, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(VARIABLE);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(STRING);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				match(INTEGER);
				}
				break;
			case ARRAY_OPEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				array();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return sentence_sempred((SentenceContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean sentence_sempred(SentenceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16O\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5"+
		"\5\'\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\60\n\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\78\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bG\n"+
		"\b\3\t\3\t\3\t\3\t\5\tM\n\t\3\t\2\3\4\n\2\4\6\b\n\f\16\20\2\2\2P\2\22"+
		"\3\2\2\2\4\25\3\2\2\2\6\35\3\2\2\2\b&\3\2\2\2\n/\3\2\2\2\f\67\3\2\2\2"+
		"\16F\3\2\2\2\20L\3\2\2\2\22\23\5\4\3\2\23\24\7\2\2\3\24\3\3\2\2\2\25\32"+
		"\b\3\1\2\26\27\f\4\2\2\27\31\5\6\4\2\30\26\3\2\2\2\31\34\3\2\2\2\32\30"+
		"\3\2\2\2\32\33\3\2\2\2\33\5\3\2\2\2\34\32\3\2\2\2\35\36\7\5\2\2\36\37"+
		"\5\b\5\2\37 \7\n\2\2 \7\3\2\2\2!\'\5\n\6\2\"#\5\n\6\2#$\7\t\2\2$%\5\b"+
		"\5\2%\'\3\2\2\2&!\3\2\2\2&\"\3\2\2\2\'\t\3\2\2\2()\7\7\2\2)*\7\b\2\2*"+
		"\60\5\20\t\2+,\7\7\2\2,-\7\6\2\2-.\7\b\2\2.\60\5\20\t\2/(\3\2\2\2/+\3"+
		"\2\2\2\60\13\3\2\2\2\61\62\7\13\2\2\628\7\f\2\2\63\64\7\13\2\2\64\65\5"+
		"\16\b\2\65\66\7\f\2\2\668\3\2\2\2\67\61\3\2\2\2\67\63\3\2\2\28\r\3\2\2"+
		"\29G\5\20\t\2:;\5\20\t\2;<\7\6\2\2<G\3\2\2\2=>\5\20\t\2>?\7\t\2\2?@\5"+
		"\16\b\2@G\3\2\2\2AB\5\20\t\2BC\7\6\2\2CD\7\t\2\2DE\5\16\b\2EG\3\2\2\2"+
		"F9\3\2\2\2F:\3\2\2\2F=\3\2\2\2FA\3\2\2\2G\17\3\2\2\2HM\7\7\2\2IM\7\3\2"+
		"\2JM\7\4\2\2KM\5\f\7\2LH\3\2\2\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\21\3\2"+
		"\2\2\b\32&/\67FL";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}