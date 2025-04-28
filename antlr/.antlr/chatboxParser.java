// Generated from e:/University/4th year/Sem 2/PPL/dsl-chatbox/antlr/chatbox.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class chatboxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ADD=15, DELETE=16, INCREASE=17, 
		DECREASE=18, SET=19, IF=20, THEN=21, DISCOUNT=22, ID=23, NAME=24, QUANTITY=25, 
		TIME=26, MONEY=27, WS=28;
	public static final int
		RULE_program = 0, RULE_command = 1, RULE_conditionalCommand = 2, RULE_condition = 3, 
		RULE_discountCheck = 4, RULE_compareWords = 5, RULE_totalValue = 6, RULE_itemAmount = 7, 
		RULE_addProduct = 8, RULE_deleteProduct = 9, RULE_increaseAmount = 10, 
		RULE_decreaseAmount = 11, RULE_setAmount = 12, RULE_applyDiscount = 13, 
		RULE_listAllProduct = 14, RULE_viewCart = 15, RULE_checkOut = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "command", "conditionalCommand", "condition", "discountCheck", 
			"compareWords", "totalValue", "itemAmount", "addProduct", "deleteProduct", 
			"increaseAmount", "decreaseAmount", "setAmount", "applyDiscount", "listAllProduct", 
			"viewCart", "checkOut"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'discount is applied'", "'equal to'", "'more than'", "'less than'", 
			"'total is'", "'amount is'", "'to cart'", "'from cart'", "'by'", "'to'", 
			"'apply'", "'list product'", "'view cart'", "'check out'", "'add'", "'delete'", 
			"'increase'", "'decrease'", "'set'", "'if'", "'then'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "ADD", "DELETE", "INCREASE", "DECREASE", "SET", "IF", 
			"THEN", "DISCOUNT", "ID", "NAME", "QUANTITY", "TIME", "MONEY", "WS"
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
	public String getGrammarFileName() { return "chatbox.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public chatboxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ConditionalCommandContext conditionalCommand() {
			return getRuleContext(ConditionalCommandContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
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
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				conditionalCommand();
				}
				break;
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case ADD:
			case DELETE:
			case INCREASE:
			case DECREASE:
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				command();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
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
		public ApplyDiscountContext applyDiscount() {
			return getRuleContext(ApplyDiscountContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				{
				setState(38);
				addProduct();
				}
				break;
			case DELETE:
				{
				setState(39);
				deleteProduct();
				}
				break;
			case INCREASE:
				{
				setState(40);
				increaseAmount();
				}
				break;
			case DECREASE:
				{
				setState(41);
				decreaseAmount();
				}
				break;
			case SET:
				{
				setState(42);
				setAmount();
				}
				break;
			case T__11:
				{
				setState(43);
				listAllProduct();
				}
				break;
			case T__12:
				{
				setState(44);
				viewCart();
				}
				break;
			case T__13:
				{
				setState(45);
				checkOut();
				}
				break;
			case T__10:
				{
				setState(46);
				applyDiscount();
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
	public static class ConditionalCommandContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(chatboxParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(chatboxParser.THEN, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public ConditionalCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalCommand; }
	}

	public final ConditionalCommandContext conditionalCommand() throws RecognitionException {
		ConditionalCommandContext _localctx = new ConditionalCommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_conditionalCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(IF);
			setState(50);
			condition();
			setState(51);
			match(THEN);
			setState(52);
			command();
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
	public static class ConditionContext extends ParserRuleContext {
		public DiscountCheckContext discountCheck() {
			return getRuleContext(DiscountCheckContext.class,0);
		}
		public TotalValueContext totalValue() {
			return getRuleContext(TotalValueContext.class,0);
		}
		public ItemAmountContext itemAmount() {
			return getRuleContext(ItemAmountContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condition);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				discountCheck();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				totalValue();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				itemAmount();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DiscountCheckContext extends ParserRuleContext {
		public DiscountCheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discountCheck; }
	}

	public final DiscountCheckContext discountCheck() throws RecognitionException {
		DiscountCheckContext _localctx = new DiscountCheckContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_discountCheck);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__0);
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
	public static class CompareWordsContext extends ParserRuleContext {
		public CompareWordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareWords; }
	}

	public final CompareWordsContext compareWords() throws RecognitionException {
		CompareWordsContext _localctx = new CompareWordsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_compareWords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0)) ) {
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
	public static class TotalValueContext extends ParserRuleContext {
		public CompareWordsContext compareWords() {
			return getRuleContext(CompareWordsContext.class,0);
		}
		public TerminalNode MONEY() { return getToken(chatboxParser.MONEY, 0); }
		public TotalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_totalValue; }
	}

	public final TotalValueContext totalValue() throws RecognitionException {
		TotalValueContext _localctx = new TotalValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_totalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__4);
			setState(64);
			compareWords();
			setState(65);
			match(MONEY);
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
	public static class ItemAmountContext extends ParserRuleContext {
		public CompareWordsContext compareWords() {
			return getRuleContext(CompareWordsContext.class,0);
		}
		public TerminalNode QUANTITY() { return getToken(chatboxParser.QUANTITY, 0); }
		public ItemAmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemAmount; }
	}

	public final ItemAmountContext itemAmount() throws RecognitionException {
		ItemAmountContext _localctx = new ItemAmountContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_itemAmount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__5);
			setState(68);
			compareWords();
			setState(69);
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
	public static class AddProductContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(chatboxParser.ADD, 0); }
		public TerminalNode QUANTITY() { return getToken(chatboxParser.QUANTITY, 0); }
		public TerminalNode ID() { return getToken(chatboxParser.ID, 0); }
		public TerminalNode NAME() { return getToken(chatboxParser.NAME, 0); }
		public AddProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addProduct; }
	}

	public final AddProductContext addProduct() throws RecognitionException {
		AddProductContext _localctx = new AddProductContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_addProduct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(ADD);
			setState(72);
			match(QUANTITY);
			setState(73);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(74);
				match(T__6);
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
		public TerminalNode DELETE() { return getToken(chatboxParser.DELETE, 0); }
		public TerminalNode ID() { return getToken(chatboxParser.ID, 0); }
		public TerminalNode NAME() { return getToken(chatboxParser.NAME, 0); }
		public DeleteProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteProduct; }
	}

	public final DeleteProductContext deleteProduct() throws RecognitionException {
		DeleteProductContext _localctx = new DeleteProductContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_deleteProduct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(DELETE);
			setState(78);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(79);
				match(T__7);
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
		public TerminalNode INCREASE() { return getToken(chatboxParser.INCREASE, 0); }
		public TerminalNode QUANTITY() { return getToken(chatboxParser.QUANTITY, 0); }
		public TerminalNode ID() { return getToken(chatboxParser.ID, 0); }
		public TerminalNode NAME() { return getToken(chatboxParser.NAME, 0); }
		public IncreaseAmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increaseAmount; }
	}

	public final IncreaseAmountContext increaseAmount() throws RecognitionException {
		IncreaseAmountContext _localctx = new IncreaseAmountContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_increaseAmount);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(INCREASE);
			setState(83);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(84);
				match(T__8);
				}
			}

			setState(87);
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
		public TerminalNode DECREASE() { return getToken(chatboxParser.DECREASE, 0); }
		public TerminalNode QUANTITY() { return getToken(chatboxParser.QUANTITY, 0); }
		public TerminalNode ID() { return getToken(chatboxParser.ID, 0); }
		public TerminalNode NAME() { return getToken(chatboxParser.NAME, 0); }
		public DecreaseAmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decreaseAmount; }
	}

	public final DecreaseAmountContext decreaseAmount() throws RecognitionException {
		DecreaseAmountContext _localctx = new DecreaseAmountContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_decreaseAmount);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(DECREASE);
			setState(90);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(91);
				match(T__8);
				}
			}

			setState(94);
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
		public TerminalNode SET() { return getToken(chatboxParser.SET, 0); }
		public TerminalNode QUANTITY() { return getToken(chatboxParser.QUANTITY, 0); }
		public TerminalNode ID() { return getToken(chatboxParser.ID, 0); }
		public TerminalNode NAME() { return getToken(chatboxParser.NAME, 0); }
		public SetAmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setAmount; }
	}

	public final SetAmountContext setAmount() throws RecognitionException {
		SetAmountContext _localctx = new SetAmountContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_setAmount);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(SET);
			setState(97);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(98);
			match(T__9);
			setState(99);
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
	public static class ApplyDiscountContext extends ParserRuleContext {
		public TerminalNode DISCOUNT() { return getToken(chatboxParser.DISCOUNT, 0); }
		public ApplyDiscountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_applyDiscount; }
	}

	public final ApplyDiscountContext applyDiscount() throws RecognitionException {
		ApplyDiscountContext _localctx = new ApplyDiscountContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_applyDiscount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__10);
			setState(102);
			match(DISCOUNT);
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
		enterRule(_localctx, 28, RULE_listAllProduct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__11);
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
		enterRule(_localctx, 30, RULE_viewCart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__12);
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
		enterRule(_localctx, 32, RULE_checkOut);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__13);
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
		"\u0004\u0001\u001co\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0003\u0000%\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00010\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003:\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\bL\b\b\u0001\t\u0001\t\u0001\t\u0003\tQ\b\t\u0001\n\u0001\n\u0001\n\u0003"+
		"\nV\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"]\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000"+
		"\u0002\u0001\u0000\u0002\u0004\u0001\u0000\u0017\u0018l\u0000$\u0001\u0000"+
		"\u0000\u0000\u0002/\u0001\u0000\u0000\u0000\u00041\u0001\u0000\u0000\u0000"+
		"\u00069\u0001\u0000\u0000\u0000\b;\u0001\u0000\u0000\u0000\n=\u0001\u0000"+
		"\u0000\u0000\f?\u0001\u0000\u0000\u0000\u000eC\u0001\u0000\u0000\u0000"+
		"\u0010G\u0001\u0000\u0000\u0000\u0012M\u0001\u0000\u0000\u0000\u0014R"+
		"\u0001\u0000\u0000\u0000\u0016Y\u0001\u0000\u0000\u0000\u0018`\u0001\u0000"+
		"\u0000\u0000\u001ae\u0001\u0000\u0000\u0000\u001ch\u0001\u0000\u0000\u0000"+
		"\u001ej\u0001\u0000\u0000\u0000 l\u0001\u0000\u0000\u0000\"%\u0003\u0004"+
		"\u0002\u0000#%\u0003\u0002\u0001\u0000$\"\u0001\u0000\u0000\u0000$#\u0001"+
		"\u0000\u0000\u0000%\u0001\u0001\u0000\u0000\u0000&0\u0003\u0010\b\u0000"+
		"\'0\u0003\u0012\t\u0000(0\u0003\u0014\n\u0000)0\u0003\u0016\u000b\u0000"+
		"*0\u0003\u0018\f\u0000+0\u0003\u001c\u000e\u0000,0\u0003\u001e\u000f\u0000"+
		"-0\u0003 \u0010\u0000.0\u0003\u001a\r\u0000/&\u0001\u0000\u0000\u0000"+
		"/\'\u0001\u0000\u0000\u0000/(\u0001\u0000\u0000\u0000/)\u0001\u0000\u0000"+
		"\u0000/*\u0001\u0000\u0000\u0000/+\u0001\u0000\u0000\u0000/,\u0001\u0000"+
		"\u0000\u0000/-\u0001\u0000\u0000\u0000/.\u0001\u0000\u0000\u00000\u0003"+
		"\u0001\u0000\u0000\u000012\u0005\u0014\u0000\u000023\u0003\u0006\u0003"+
		"\u000034\u0005\u0015\u0000\u000045\u0003\u0002\u0001\u00005\u0005\u0001"+
		"\u0000\u0000\u00006:\u0003\b\u0004\u00007:\u0003\f\u0006\u00008:\u0003"+
		"\u000e\u0007\u000096\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000"+
		"98\u0001\u0000\u0000\u0000:\u0007\u0001\u0000\u0000\u0000;<\u0005\u0001"+
		"\u0000\u0000<\t\u0001\u0000\u0000\u0000=>\u0007\u0000\u0000\u0000>\u000b"+
		"\u0001\u0000\u0000\u0000?@\u0005\u0005\u0000\u0000@A\u0003\n\u0005\u0000"+
		"AB\u0005\u001b\u0000\u0000B\r\u0001\u0000\u0000\u0000CD\u0005\u0006\u0000"+
		"\u0000DE\u0003\n\u0005\u0000EF\u0005\u0019\u0000\u0000F\u000f\u0001\u0000"+
		"\u0000\u0000GH\u0005\u000f\u0000\u0000HI\u0005\u0019\u0000\u0000IK\u0007"+
		"\u0001\u0000\u0000JL\u0005\u0007\u0000\u0000KJ\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000L\u0011\u0001\u0000\u0000\u0000MN\u0005\u0010"+
		"\u0000\u0000NP\u0007\u0001\u0000\u0000OQ\u0005\b\u0000\u0000PO\u0001\u0000"+
		"\u0000\u0000PQ\u0001\u0000\u0000\u0000Q\u0013\u0001\u0000\u0000\u0000"+
		"RS\u0005\u0011\u0000\u0000SU\u0007\u0001\u0000\u0000TV\u0005\t\u0000\u0000"+
		"UT\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000"+
		"\u0000WX\u0005\u0019\u0000\u0000X\u0015\u0001\u0000\u0000\u0000YZ\u0005"+
		"\u0012\u0000\u0000Z\\\u0007\u0001\u0000\u0000[]\u0005\t\u0000\u0000\\"+
		"[\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000"+
		"\u0000^_\u0005\u0019\u0000\u0000_\u0017\u0001\u0000\u0000\u0000`a\u0005"+
		"\u0013\u0000\u0000ab\u0007\u0001\u0000\u0000bc\u0005\n\u0000\u0000cd\u0005"+
		"\u0019\u0000\u0000d\u0019\u0001\u0000\u0000\u0000ef\u0005\u000b\u0000"+
		"\u0000fg\u0005\u0016\u0000\u0000g\u001b\u0001\u0000\u0000\u0000hi\u0005"+
		"\f\u0000\u0000i\u001d\u0001\u0000\u0000\u0000jk\u0005\r\u0000\u0000k\u001f"+
		"\u0001\u0000\u0000\u0000lm\u0005\u000e\u0000\u0000m!\u0001\u0000\u0000"+
		"\u0000\u0007$/9KPU\\";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}