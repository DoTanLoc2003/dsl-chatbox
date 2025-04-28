// Generated from e:/University/4th year/Sem 2/PPL/dsl-chatbox/antlr/command.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class commandParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, ADD=14, DELETE=15, INCREASE=16, 
		DECREASE=17, SET=18, ID=19, NAME=20, QUANTITY=21, WS=22;
	public static final int
		RULE_program = 0, RULE_addProduct = 1, RULE_deleteProduct = 2, RULE_increaseAmount = 3, 
		RULE_decreaseAmount = 4, RULE_setAmount = 5, RULE_listAllProduct = 6, 
		RULE_viewCart = 7, RULE_checkOut = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "addProduct", "deleteProduct", "increaseAmount", "decreaseAmount", 
			"setAmount", "listAllProduct", "viewCart", "checkOut"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'to cart'", "'from cart'", "'by'", "'to'", "'LIST PRODUCT'", "'list product'", 
			"'List product'", "'VIEW CART'", "'view cart'", "'View cart'", "'check out'", 
			"'Check out'", "'CHECK OUT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ADD", "DELETE", "INCREASE", "DECREASE", "SET", "ID", "NAME", 
			"QUANTITY", "WS"
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
	public String getGrammarFileName() { return "command.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public commandParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public AddProductContext addProduct() {
			return getRuleContext(AddProductContext.class,0);
		}
		public DeleteProductContext deleteProduct() {
			return getRuleContext(DeleteProductContext.class,0);
		}
		public IncreaseAmountContext increaseAmount() {
			return getRuleContext(IncreaseAmountContext.class,0);
		}
		public DecreaseAmountContext decreaseAmount() {
			return getRuleContext(DecreaseAmountContext.class,0);
		}
		public SetAmountContext setAmount() {
			return getRuleContext(SetAmountContext.class,0);
		}
		public ListAllProductContext listAllProduct() {
			return getRuleContext(ListAllProductContext.class,0);
		}
		public ViewCartContext viewCart() {
			return getRuleContext(ViewCartContext.class,0);
		}
		public CheckOutContext checkOut() {
			return getRuleContext(CheckOutContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				{
				setState(18);
				addProduct();
				}
				break;
			case DELETE:
				{
				setState(19);
				deleteProduct();
				}
				break;
			case INCREASE:
				{
				setState(20);
				increaseAmount();
				}
				break;
			case DECREASE:
				{
				setState(21);
				decreaseAmount();
				}
				break;
			case SET:
				{
				setState(22);
				setAmount();
				}
				break;
			case T__4:
			case T__5:
			case T__6:
				{
				setState(23);
				listAllProduct();
				}
				break;
			case T__7:
			case T__8:
			case T__9:
				{
				setState(24);
				viewCart();
				}
				break;
			case T__10:
			case T__11:
			case T__12:
				{
				setState(25);
				checkOut();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class AddProductContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(commandParser.ADD, 0); }
		public TerminalNode QUANTITY() { return getToken(commandParser.QUANTITY, 0); }
		public TerminalNode ID() { return getToken(commandParser.ID, 0); }
		public TerminalNode NAME() { return getToken(commandParser.NAME, 0); }
		public AddProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addProduct; }
	}

	public final AddProductContext addProduct() throws RecognitionException {
		AddProductContext _localctx = new AddProductContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_addProduct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(ADD);
			setState(29);
			match(QUANTITY);
			setState(30);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(31);
				match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeleteProductContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(commandParser.DELETE, 0); }
		public TerminalNode ID() { return getToken(commandParser.ID, 0); }
		public TerminalNode NAME() { return getToken(commandParser.NAME, 0); }
		public DeleteProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteProduct; }
	}

	public final DeleteProductContext deleteProduct() throws RecognitionException {
		DeleteProductContext _localctx = new DeleteProductContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_deleteProduct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(DELETE);
			setState(35);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(36);
				match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IncreaseAmountContext extends ParserRuleContext {
		public TerminalNode INCREASE() { return getToken(commandParser.INCREASE, 0); }
		public TerminalNode QUANTITY() { return getToken(commandParser.QUANTITY, 0); }
		public TerminalNode ID() { return getToken(commandParser.ID, 0); }
		public TerminalNode NAME() { return getToken(commandParser.NAME, 0); }
		public IncreaseAmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increaseAmount; }
	}

	public final IncreaseAmountContext increaseAmount() throws RecognitionException {
		IncreaseAmountContext _localctx = new IncreaseAmountContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_increaseAmount);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(INCREASE);
			setState(40);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(41);
				match(T__2);
				}
			}

			setState(44);
			match(QUANTITY);
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
	public static class DecreaseAmountContext extends ParserRuleContext {
		public TerminalNode DECREASE() { return getToken(commandParser.DECREASE, 0); }
		public TerminalNode QUANTITY() { return getToken(commandParser.QUANTITY, 0); }
		public TerminalNode ID() { return getToken(commandParser.ID, 0); }
		public TerminalNode NAME() { return getToken(commandParser.NAME, 0); }
		public DecreaseAmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decreaseAmount; }
	}

	public final DecreaseAmountContext decreaseAmount() throws RecognitionException {
		DecreaseAmountContext _localctx = new DecreaseAmountContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decreaseAmount);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(DECREASE);
			setState(47);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(48);
				match(T__2);
				}
			}

			setState(51);
			match(QUANTITY);
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
	public static class SetAmountContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(commandParser.SET, 0); }
		public TerminalNode QUANTITY() { return getToken(commandParser.QUANTITY, 0); }
		public TerminalNode ID() { return getToken(commandParser.ID, 0); }
		public TerminalNode NAME() { return getToken(commandParser.NAME, 0); }
		public SetAmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setAmount; }
	}

	public final SetAmountContext setAmount() throws RecognitionException {
		SetAmountContext _localctx = new SetAmountContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_setAmount);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(SET);
			setState(54);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(55);
			match(T__3);
			setState(56);
			match(QUANTITY);
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
	public static class ListAllProductContext extends ParserRuleContext {
		public ListAllProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listAllProduct; }
	}

	public final ListAllProductContext listAllProduct() throws RecognitionException {
		ListAllProductContext _localctx = new ListAllProductContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listAllProduct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) ) {
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
	public static class ViewCartContext extends ParserRuleContext {
		public ViewCartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewCart; }
	}

	public final ViewCartContext viewCart() throws RecognitionException {
		ViewCartContext _localctx = new ViewCartContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_viewCart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) ) {
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
	public static class CheckOutContext extends ParserRuleContext {
		public CheckOutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkOut; }
	}

	public final CheckOutContext checkOut() throws RecognitionException {
		CheckOutContext _localctx = new CheckOutContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_checkOut);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14336L) != 0)) ) {
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
		"\u0004\u0001\u0016A\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u001b\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001!\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002&\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003+\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u00042\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0000\u0000"+
		"\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0004\u0001\u0000\u0013"+
		"\u0014\u0001\u0000\u0005\u0007\u0001\u0000\b\n\u0001\u0000\u000b\rB\u0000"+
		"\u001a\u0001\u0000\u0000\u0000\u0002\u001c\u0001\u0000\u0000\u0000\u0004"+
		"\"\u0001\u0000\u0000\u0000\u0006\'\u0001\u0000\u0000\u0000\b.\u0001\u0000"+
		"\u0000\u0000\n5\u0001\u0000\u0000\u0000\f:\u0001\u0000\u0000\u0000\u000e"+
		"<\u0001\u0000\u0000\u0000\u0010>\u0001\u0000\u0000\u0000\u0012\u001b\u0003"+
		"\u0002\u0001\u0000\u0013\u001b\u0003\u0004\u0002\u0000\u0014\u001b\u0003"+
		"\u0006\u0003\u0000\u0015\u001b\u0003\b\u0004\u0000\u0016\u001b\u0003\n"+
		"\u0005\u0000\u0017\u001b\u0003\f\u0006\u0000\u0018\u001b\u0003\u000e\u0007"+
		"\u0000\u0019\u001b\u0003\u0010\b\u0000\u001a\u0012\u0001\u0000\u0000\u0000"+
		"\u001a\u0013\u0001\u0000\u0000\u0000\u001a\u0014\u0001\u0000\u0000\u0000"+
		"\u001a\u0015\u0001\u0000\u0000\u0000\u001a\u0016\u0001\u0000\u0000\u0000"+
		"\u001a\u0017\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000"+
		"\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u0001\u0001\u0000\u0000\u0000"+
		"\u001c\u001d\u0005\u000e\u0000\u0000\u001d\u001e\u0005\u0015\u0000\u0000"+
		"\u001e \u0007\u0000\u0000\u0000\u001f!\u0005\u0001\u0000\u0000 \u001f"+
		"\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\u0003\u0001\u0000"+
		"\u0000\u0000\"#\u0005\u000f\u0000\u0000#%\u0007\u0000\u0000\u0000$&\u0005"+
		"\u0002\u0000\u0000%$\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000"+
		"&\u0005\u0001\u0000\u0000\u0000\'(\u0005\u0010\u0000\u0000(*\u0007\u0000"+
		"\u0000\u0000)+\u0005\u0003\u0000\u0000*)\u0001\u0000\u0000\u0000*+\u0001"+
		"\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0005\u0015\u0000\u0000"+
		"-\u0007\u0001\u0000\u0000\u0000./\u0005\u0011\u0000\u0000/1\u0007\u0000"+
		"\u0000\u000002\u0005\u0003\u0000\u000010\u0001\u0000\u0000\u000012\u0001"+
		"\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0005\u0015\u0000\u0000"+
		"4\t\u0001\u0000\u0000\u000056\u0005\u0012\u0000\u000067\u0007\u0000\u0000"+
		"\u000078\u0005\u0004\u0000\u000089\u0005\u0015\u0000\u00009\u000b\u0001"+
		"\u0000\u0000\u0000:;\u0007\u0001\u0000\u0000;\r\u0001\u0000\u0000\u0000"+
		"<=\u0007\u0002\u0000\u0000=\u000f\u0001\u0000\u0000\u0000>?\u0007\u0003"+
		"\u0000\u0000?\u0011\u0001\u0000\u0000\u0000\u0005\u001a %*1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}