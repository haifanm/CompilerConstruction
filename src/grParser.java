// Generated from C:/Users/User/IdeaProjects/newproject/src\gr.g4 by ANTLR 4.7

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WhiteSpace=1, Comments=2, TOK_IDENTIFIER=3, TOK_INVALID_IDENTIFIER=4, 
		TOK_TYPE=5, TOK_DIGIT=6, TOK_LETTER=7, TOK_ASCII_CHARS=8, TOK_SPECIAL_CHARS=9, 
		TOK_CHAR_INT=10, TOK_VALUE=11, TOK_CHAR=12, TOK_CHAR_VALUE=13, TOK_INVALID_CHAR=14, 
		UNRECOGNIZED_SYMBOL=15, TOK_INT=16, TOK_PROGRAM=17, TOK_CLASS=18, TOK_FINAL=19, 
		TOK_ELSE=20, TOK_IF=21, TOK_NEW=22, TOK_READ=23, TOK_RETURN=24, TOK_VOID=25, 
		TOK_WHILE=26, TOK_PRINT=27, TOK_TYPE_INT=28, TOK_TYPE_CHAR=29, TOK_COMMA=30, 
		TOK_SEMI=31, TOK_DOT=32, TOK_LB=33, TOK_RB=34, TOK_LCB=35, TOK_RCB=36, 
		TOK_LP=37, TOK_RP=38, TOK_MINUS=39, TOK_SINGLEQUOTE=40, TOK_DOUBLEQUOTE=41, 
		TOK_OP_ASSIGN=42, TOK_OP_REL=43, TOK_OP_ADD=44, TOK_OP_TIMES=45, OP_REL_EQ=46, 
		OP_REL_NE=47, OP_REL_LT=48, OP_REL_LE=49, OP_REL_GT=50, OP_REL_GE=51, 
		OP_ADD_PLUS=52, OP_ADD_MINUS=53, OP_MUL_TIMES=54, OP_MUL_DIV=55, OP_MUL_MOD=56, 
		TOK_W=57;
	public static final int
		RULE_program = 0, RULE_varDecl = 1, RULE_constDecl = 2, RULE_classDecl = 3, 
		RULE_methodDecl = 4, RULE_formPars = 5, RULE_block = 6, RULE_statement = 7, 
		RULE_designator = 8, RULE_actPars = 9, RULE_methodreturn = 10, RULE_read = 11, 
		RULE_print = 12, RULE_condition = 13, RULE_relop = 14, RULE_expr = 15, 
		RULE_term = 16, RULE_factor = 17, RULE_addop = 18, RULE_mulop = 19;
	public static final String[] ruleNames = {
		"program", "varDecl", "constDecl", "classDecl", "methodDecl", "formPars", 
		"block", "statement", "designator", "actPars", "methodreturn", "read", 
		"print", "condition", "relop", "expr", "term", "factor", "addop", "mulop"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "'program'", "'class'", "'final'", "'else'", 
		"'if'", "'new'", "'read'", "'return'", "'void'", "'while'", "'print'", 
		"'int'", "'char'", "','", "';'", "'.'", "'['", "']'", "'{'", "'}'", "'('", 
		"')'", null, "'''", "'\"'", "'='", null, null, null, "'=='", "'!='", "'<'", 
		null, "'>'", null, "'+'", null, "'*'", "'/'", "'%'", "'A'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WhiteSpace", "Comments", "TOK_IDENTIFIER", "TOK_INVALID_IDENTIFIER", 
		"TOK_TYPE", "TOK_DIGIT", "TOK_LETTER", "TOK_ASCII_CHARS", "TOK_SPECIAL_CHARS", 
		"TOK_CHAR_INT", "TOK_VALUE", "TOK_CHAR", "TOK_CHAR_VALUE", "TOK_INVALID_CHAR", 
		"UNRECOGNIZED_SYMBOL", "TOK_INT", "TOK_PROGRAM", "TOK_CLASS", "TOK_FINAL", 
		"TOK_ELSE", "TOK_IF", "TOK_NEW", "TOK_READ", "TOK_RETURN", "TOK_VOID", 
		"TOK_WHILE", "TOK_PRINT", "TOK_TYPE_INT", "TOK_TYPE_CHAR", "TOK_COMMA", 
		"TOK_SEMI", "TOK_DOT", "TOK_LB", "TOK_RB", "TOK_LCB", "TOK_RCB", "TOK_LP", 
		"TOK_RP", "TOK_MINUS", "TOK_SINGLEQUOTE", "TOK_DOUBLEQUOTE", "TOK_OP_ASSIGN", 
		"TOK_OP_REL", "TOK_OP_ADD", "TOK_OP_TIMES", "OP_REL_EQ", "OP_REL_NE", 
		"OP_REL_LT", "OP_REL_LE", "OP_REL_GT", "OP_REL_GE", "OP_ADD_PLUS", "OP_ADD_MINUS", 
		"OP_MUL_TIMES", "OP_MUL_DIV", "OP_MUL_MOD", "TOK_W"
	};
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
	public String getGrammarFileName() { return "gr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	grLexer lexer;
	public void setLexer(grLexer lexer){
				this.lexer=lexer;
			}

	public grParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode TOK_PROGRAM() { return getToken(grParser.TOK_PROGRAM, 0); }
		public TerminalNode TOK_IDENTIFIER() { return getToken(grParser.TOK_IDENTIFIER, 0); }
		public TerminalNode TOK_LCB() { return getToken(grParser.TOK_LCB, 0); }
		public TerminalNode TOK_RCB() { return getToken(grParser.TOK_RCB, 0); }
		public List<ConstDeclContext> constDecl() {
			return getRuleContexts(ConstDeclContext.class);
		}
		public ConstDeclContext constDecl(int i) {
			return getRuleContext(ConstDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<ClassDeclContext> classDecl() {
			return getRuleContexts(ClassDeclContext.class);
		}
		public ClassDeclContext classDecl(int i) {
			return getRuleContext(ClassDeclContext.class,i);
		}
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(TOK_PROGRAM);
			setState(41);
			match(TOK_IDENTIFIER);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_TYPE) | (1L << TOK_CLASS) | (1L << TOK_FINAL))) != 0)) {
				{
				setState(45);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TOK_FINAL:
					{
					setState(42);
					constDecl();
					}
					break;
				case TOK_TYPE:
					{
					setState(43);
					varDecl();
					}
					break;
				case TOK_CLASS:
					{
					setState(44);
					classDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(TOK_LCB);
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(51);
				methodDecl();
				}
				}
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TOK_TYPE || _la==TOK_VOID );
			setState(56);
			match(TOK_RCB);
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

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode TOK_TYPE() { return getToken(grParser.TOK_TYPE, 0); }
		public List<TerminalNode> TOK_IDENTIFIER() { return getTokens(grParser.TOK_IDENTIFIER); }
		public TerminalNode TOK_IDENTIFIER(int i) {
			return getToken(grParser.TOK_IDENTIFIER, i);
		}
		public TerminalNode TOK_SEMI() { return getToken(grParser.TOK_SEMI, 0); }
		public List<TerminalNode> TOK_COMMA() { return getTokens(grParser.TOK_COMMA); }
		public TerminalNode TOK_COMMA(int i) {
			return getToken(grParser.TOK_COMMA, i);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(TOK_TYPE);
			setState(59);
			match(TOK_IDENTIFIER);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_COMMA) {
				{
				{
				setState(60);
				match(TOK_COMMA);
				setState(61);
				match(TOK_IDENTIFIER);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(TOK_SEMI);
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

	public static class ConstDeclContext extends ParserRuleContext {
		public TerminalNode TOK_FINAL() { return getToken(grParser.TOK_FINAL, 0); }
		public TerminalNode TOK_TYPE() { return getToken(grParser.TOK_TYPE, 0); }
		public TerminalNode TOK_IDENTIFIER() { return getToken(grParser.TOK_IDENTIFIER, 0); }
		public TerminalNode TOK_OP_ASSIGN() { return getToken(grParser.TOK_OP_ASSIGN, 0); }
		public TerminalNode TOK_SEMI() { return getToken(grParser.TOK_SEMI, 0); }
		public TerminalNode TOK_CHAR() { return getToken(grParser.TOK_CHAR, 0); }
		public List<TerminalNode> TOK_LETTER() { return getTokens(grParser.TOK_LETTER); }
		public TerminalNode TOK_LETTER(int i) {
			return getToken(grParser.TOK_LETTER, i);
		}
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitConstDecl(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(TOK_FINAL);
			setState(70);
			match(TOK_TYPE);
			setState(71);
			match(TOK_IDENTIFIER);
			setState(72);
			match(TOK_OP_ASSIGN);
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOK_LETTER:
				{
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(73);
					match(TOK_LETTER);
					}
					}
					setState(76); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TOK_LETTER );
				}
				break;
			case TOK_CHAR:
				{
				setState(78);
				match(TOK_CHAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(81);
			match(TOK_SEMI);
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

	public static class ClassDeclContext extends ParserRuleContext {
		public TerminalNode TOK_CLASS() { return getToken(grParser.TOK_CLASS, 0); }
		public TerminalNode TOK_IDENTIFIER() { return getToken(grParser.TOK_IDENTIFIER, 0); }
		public TerminalNode TOK_LCB() { return getToken(grParser.TOK_LCB, 0); }
		public TerminalNode TOK_RCB() { return getToken(grParser.TOK_RCB, 0); }
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitClassDecl(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(TOK_CLASS);
			setState(84);
			match(TOK_IDENTIFIER);
			setState(85);
			match(TOK_LCB);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_TYPE) {
				{
				{
				setState(86);
				varDecl();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(TOK_RCB);
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

	public static class MethodDeclContext extends ParserRuleContext {
		public TerminalNode TOK_IDENTIFIER() { return getToken(grParser.TOK_IDENTIFIER, 0); }
		public TerminalNode TOK_LP() { return getToken(grParser.TOK_LP, 0); }
		public TerminalNode TOK_RP() { return getToken(grParser.TOK_RP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode TOK_TYPE() { return getToken(grParser.TOK_TYPE, 0); }
		public TerminalNode TOK_VOID() { return getToken(grParser.TOK_VOID, 0); }
		public FormParsContext formPars() {
			return getRuleContext(FormParsContext.class,0);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitMethodDecl(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_la = _input.LA(1);
			if ( !(_la==TOK_TYPE || _la==TOK_VOID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(95);
			match(TOK_IDENTIFIER);
			setState(96);
			match(TOK_LP);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOK_TYPE) {
				{
				setState(97);
				formPars();
				}
			}

			setState(100);
			match(TOK_RP);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_TYPE) {
				{
				{
				setState(101);
				varDecl();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			block();
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

	public static class FormParsContext extends ParserRuleContext {
		public List<TerminalNode> TOK_TYPE() { return getTokens(grParser.TOK_TYPE); }
		public TerminalNode TOK_TYPE(int i) {
			return getToken(grParser.TOK_TYPE, i);
		}
		public List<TerminalNode> TOK_IDENTIFIER() { return getTokens(grParser.TOK_IDENTIFIER); }
		public TerminalNode TOK_IDENTIFIER(int i) {
			return getToken(grParser.TOK_IDENTIFIER, i);
		}
		public List<TerminalNode> TOK_COMMA() { return getTokens(grParser.TOK_COMMA); }
		public TerminalNode TOK_COMMA(int i) {
			return getToken(grParser.TOK_COMMA, i);
		}
		public FormParsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formPars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterFormPars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitFormPars(this);
		}
	}

	public final FormParsContext formPars() throws RecognitionException {
		FormParsContext _localctx = new FormParsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formPars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(TOK_TYPE);
			setState(110);
			match(TOK_IDENTIFIER);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_COMMA) {
				{
				{
				setState(111);
				match(TOK_COMMA);
				setState(112);
				match(TOK_TYPE);
				setState(113);
				match(TOK_IDENTIFIER);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode TOK_LCB() { return getToken(grParser.TOK_LCB, 0); }
		public TerminalNode TOK_RCB() { return getToken(grParser.TOK_RCB, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(TOK_LCB);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_IDENTIFIER) | (1L << TOK_IF) | (1L << TOK_READ) | (1L << TOK_RETURN) | (1L << TOK_WHILE) | (1L << TOK_PRINT) | (1L << TOK_SEMI) | (1L << TOK_LCB))) != 0)) {
				{
				{
				setState(120);
				statement();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(TOK_RCB);
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

	public static class StatementContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode TOK_SEMI() { return getToken(grParser.TOK_SEMI, 0); }
		public TerminalNode TOK_OP_ASSIGN() { return getToken(grParser.TOK_OP_ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ActParsContext actPars() {
			return getRuleContext(ActParsContext.class,0);
		}
		public TerminalNode TOK_IF() { return getToken(grParser.TOK_IF, 0); }
		public TerminalNode TOK_LP() { return getToken(grParser.TOK_LP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode TOK_RP() { return getToken(grParser.TOK_RP, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode TOK_ELSE() { return getToken(grParser.TOK_ELSE, 0); }
		public TerminalNode TOK_WHILE() { return getToken(grParser.TOK_WHILE, 0); }
		public MethodreturnContext methodreturn() {
			return getRuleContext(MethodreturnContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOK_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				designator();
				setState(132);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TOK_OP_ASSIGN:
					{
					setState(129);
					match(TOK_OP_ASSIGN);
					setState(130);
					expr();
					}
					break;
				case TOK_LP:
					{
					setState(131);
					actPars();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(134);
				match(TOK_SEMI);
				}
				break;
			case TOK_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(TOK_IF);
				setState(137);
				match(TOK_LP);
				setState(138);
				condition();
				setState(139);
				match(TOK_RP);
				setState(140);
				statement();
				setState(143);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(141);
					match(TOK_ELSE);
					setState(142);
					statement();
					}
					break;
				}
				}
				break;
			case TOK_WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				match(TOK_WHILE);
				setState(146);
				match(TOK_LP);
				setState(147);
				condition();
				setState(148);
				match(TOK_RP);
				setState(149);
				statement();
				}
				break;
			case TOK_RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				methodreturn();
				}
				break;
			case TOK_READ:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				read();
				}
				break;
			case TOK_PRINT:
				enterOuterAlt(_localctx, 6);
				{
				setState(153);
				print();
				}
				break;
			case TOK_LCB:
				enterOuterAlt(_localctx, 7);
				{
				setState(154);
				block();
				}
				break;
			case TOK_SEMI:
				enterOuterAlt(_localctx, 8);
				{
				setState(155);
				match(TOK_SEMI);
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

	public static class DesignatorContext extends ParserRuleContext {
		public List<TerminalNode> TOK_IDENTIFIER() { return getTokens(grParser.TOK_IDENTIFIER); }
		public TerminalNode TOK_IDENTIFIER(int i) {
			return getToken(grParser.TOK_IDENTIFIER, i);
		}
		public List<TerminalNode> TOK_DOT() { return getTokens(grParser.TOK_DOT); }
		public TerminalNode TOK_DOT(int i) {
			return getToken(grParser.TOK_DOT, i);
		}
		public List<TerminalNode> TOK_LB() { return getTokens(grParser.TOK_LB); }
		public TerminalNode TOK_LB(int i) {
			return getToken(grParser.TOK_LB, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TOK_RB() { return getTokens(grParser.TOK_RB); }
		public TerminalNode TOK_RB(int i) {
			return getToken(grParser.TOK_RB, i);
		}
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitDesignator(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_designator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(TOK_IDENTIFIER);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_DOT || _la==TOK_LB) {
				{
				setState(165);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TOK_DOT:
					{
					setState(159);
					match(TOK_DOT);
					setState(160);
					match(TOK_IDENTIFIER);
					}
					break;
				case TOK_LB:
					{
					setState(161);
					match(TOK_LB);
					setState(162);
					expr();
					setState(163);
					match(TOK_RB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ActParsContext extends ParserRuleContext {
		public TerminalNode TOK_LP() { return getToken(grParser.TOK_LP, 0); }
		public TerminalNode TOK_RP() { return getToken(grParser.TOK_RP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TOK_COMMA() { return getTokens(grParser.TOK_COMMA); }
		public TerminalNode TOK_COMMA(int i) {
			return getToken(grParser.TOK_COMMA, i);
		}
		public ActParsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actPars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterActPars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitActPars(this);
		}
	}

	public final ActParsContext actPars() throws RecognitionException {
		ActParsContext _localctx = new ActParsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_actPars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(TOK_LP);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_IDENTIFIER) | (1L << TOK_DIGIT) | (1L << TOK_CHAR) | (1L << TOK_NEW) | (1L << TOK_LP) | (1L << TOK_MINUS))) != 0)) {
				{
				setState(171);
				expr();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOK_COMMA) {
					{
					{
					setState(172);
					match(TOK_COMMA);
					setState(173);
					expr();
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(181);
			match(TOK_RP);
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

	public static class MethodreturnContext extends ParserRuleContext {
		public TerminalNode TOK_RETURN() { return getToken(grParser.TOK_RETURN, 0); }
		public TerminalNode TOK_SEMI() { return getToken(grParser.TOK_SEMI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MethodreturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodreturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterMethodreturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitMethodreturn(this);
		}
	}

	public final MethodreturnContext methodreturn() throws RecognitionException {
		MethodreturnContext _localctx = new MethodreturnContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_methodreturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(TOK_RETURN);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_IDENTIFIER) | (1L << TOK_DIGIT) | (1L << TOK_CHAR) | (1L << TOK_NEW) | (1L << TOK_LP) | (1L << TOK_MINUS))) != 0)) {
				{
				setState(184);
				expr();
				}
			}

			setState(187);
			match(TOK_SEMI);
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode TOK_READ() { return getToken(grParser.TOK_READ, 0); }
		public TerminalNode TOK_LP() { return getToken(grParser.TOK_LP, 0); }
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode TOK_RP() { return getToken(grParser.TOK_RP, 0); }
		public TerminalNode TOK_SEMI() { return getToken(grParser.TOK_SEMI, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(TOK_READ);
			setState(190);
			match(TOK_LP);
			setState(191);
			designator();
			setState(192);
			match(TOK_RP);
			setState(193);
			match(TOK_SEMI);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode TOK_PRINT() { return getToken(grParser.TOK_PRINT, 0); }
		public TerminalNode TOK_LP() { return getToken(grParser.TOK_LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TOK_RP() { return getToken(grParser.TOK_RP, 0); }
		public TerminalNode TOK_SEMI() { return getToken(grParser.TOK_SEMI, 0); }
		public TerminalNode TOK_COMMA() { return getToken(grParser.TOK_COMMA, 0); }
		public List<TerminalNode> TOK_DIGIT() { return getTokens(grParser.TOK_DIGIT); }
		public TerminalNode TOK_DIGIT(int i) {
			return getToken(grParser.TOK_DIGIT, i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(TOK_PRINT);
			setState(196);
			match(TOK_LP);
			setState(197);
			expr();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOK_COMMA) {
				{
				setState(198);
				match(TOK_COMMA);
				setState(200); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(199);
					match(TOK_DIGIT);
					}
					}
					setState(202); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TOK_DIGIT );
				}
			}

			setState(206);
			match(TOK_RP);
			setState(207);
			match(TOK_SEMI);
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

	public static class ConditionContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			expr();
			setState(210);
			relop();
			setState(211);
			expr();
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

	public static class RelopContext extends ParserRuleContext {
		public TerminalNode TOK_OP_REL() { return getToken(grParser.TOK_OP_REL, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitRelop(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_relop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(TOK_OP_REL);
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

	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode TOK_MINUS() { return getToken(grParser.TOK_MINUS, 0); }
		public List<AddopContext> addop() {
			return getRuleContexts(AddopContext.class);
		}
		public AddopContext addop(int i) {
			return getRuleContext(AddopContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOK_MINUS) {
				{
				setState(215);
				match(TOK_MINUS);
				}
			}

			setState(218);
			term();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_OP_ADD) {
				{
				{
				setState(219);
				addop();
				setState(220);
				term();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MulopContext> mulop() {
			return getRuleContexts(MulopContext.class);
		}
		public MulopContext mulop(int i) {
			return getRuleContext(MulopContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			factor();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_OP_TIMES) {
				{
				{
				setState(228);
				mulop();
				setState(229);
				factor();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FactorContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public ActParsContext actPars() {
			return getRuleContext(ActParsContext.class,0);
		}
		public List<TerminalNode> TOK_DIGIT() { return getTokens(grParser.TOK_DIGIT); }
		public TerminalNode TOK_DIGIT(int i) {
			return getToken(grParser.TOK_DIGIT, i);
		}
		public TerminalNode TOK_CHAR() { return getToken(grParser.TOK_CHAR, 0); }
		public TerminalNode TOK_NEW() { return getToken(grParser.TOK_NEW, 0); }
		public TerminalNode TOK_IDENTIFIER() { return getToken(grParser.TOK_IDENTIFIER, 0); }
		public TerminalNode TOK_LB() { return getToken(grParser.TOK_LB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TOK_RB() { return getToken(grParser.TOK_RB, 0); }
		public TerminalNode TOK_LP() { return getToken(grParser.TOK_LP, 0); }
		public TerminalNode TOK_RP() { return getToken(grParser.TOK_RP, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_factor);
		int _la;
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOK_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				designator();
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TOK_LP) {
					{
					setState(237);
					actPars();
					}
				}

				}
				break;
			case TOK_DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(241); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(240);
					match(TOK_DIGIT);
					}
					}
					setState(243); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TOK_DIGIT );
				}
				break;
			case TOK_CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				match(TOK_CHAR);
				}
				break;
			case TOK_NEW:
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				match(TOK_NEW);
				setState(247);
				match(TOK_IDENTIFIER);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TOK_LB) {
					{
					setState(248);
					match(TOK_LB);
					setState(249);
					expr();
					setState(250);
					match(TOK_RB);
					}
				}

				}
				break;
			case TOK_LP:
				enterOuterAlt(_localctx, 5);
				{
				setState(254);
				match(TOK_LP);
				setState(255);
				expr();
				setState(256);
				match(TOK_RP);
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

	public static class AddopContext extends ParserRuleContext {
		public TerminalNode TOK_OP_ADD() { return getToken(grParser.TOK_OP_ADD, 0); }
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterAddop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitAddop(this);
		}
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_addop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(TOK_OP_ADD);
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

	public static class MulopContext extends ParserRuleContext {
		public TerminalNode TOK_OP_TIMES() { return getToken(grParser.TOK_OP_TIMES, 0); }
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterMulop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitMulop(this);
		}
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_mulop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(TOK_OP_TIMES);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u010b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\7\2\60\n\2\f\2\16\2"+
		"\63\13\2\3\2\3\2\6\2\67\n\2\r\2\16\28\3\2\3\2\3\3\3\3\3\3\3\3\7\3A\n\3"+
		"\f\3\16\3D\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\6\4M\n\4\r\4\16\4N\3\4\5\4"+
		"R\n\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5Z\n\5\f\5\16\5]\13\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\5\6e\n\6\3\6\3\6\7\6i\n\6\f\6\16\6l\13\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\7\7u\n\7\f\7\16\7x\13\7\3\b\3\b\7\b|\n\b\f\b\16\b\177\13\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\5\t\u0087\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u0092\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009f"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00a8\n\n\f\n\16\n\u00ab\13\n\3\13"+
		"\3\13\3\13\3\13\7\13\u00b1\n\13\f\13\16\13\u00b4\13\13\5\13\u00b6\n\13"+
		"\3\13\3\13\3\f\3\f\5\f\u00bc\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\6\16\u00cb\n\16\r\16\16\16\u00cc\5\16\u00cf\n\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21\5\21\u00db\n\21\3\21"+
		"\3\21\3\21\3\21\7\21\u00e1\n\21\f\21\16\21\u00e4\13\21\3\22\3\22\3\22"+
		"\3\22\7\22\u00ea\n\22\f\22\16\22\u00ed\13\22\3\23\3\23\5\23\u00f1\n\23"+
		"\3\23\6\23\u00f4\n\23\r\23\16\23\u00f5\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\5\23\u00ff\n\23\3\23\3\23\3\23\3\23\5\23\u0105\n\23\3\24\3\24\3\25"+
		"\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\3\4\2"+
		"\7\7\33\33\2\u011c\2*\3\2\2\2\4<\3\2\2\2\6G\3\2\2\2\bU\3\2\2\2\n`\3\2"+
		"\2\2\fo\3\2\2\2\16y\3\2\2\2\20\u009e\3\2\2\2\22\u00a0\3\2\2\2\24\u00ac"+
		"\3\2\2\2\26\u00b9\3\2\2\2\30\u00bf\3\2\2\2\32\u00c5\3\2\2\2\34\u00d3\3"+
		"\2\2\2\36\u00d7\3\2\2\2 \u00da\3\2\2\2\"\u00e5\3\2\2\2$\u0104\3\2\2\2"+
		"&\u0106\3\2\2\2(\u0108\3\2\2\2*+\7\23\2\2+\61\7\5\2\2,\60\5\6\4\2-\60"+
		"\5\4\3\2.\60\5\b\5\2/,\3\2\2\2/-\3\2\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3"+
		"\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\66\7%\2\2\65\67\5"+
		"\n\6\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29:\3\2\2\2:;\7&"+
		"\2\2;\3\3\2\2\2<=\7\7\2\2=B\7\5\2\2>?\7 \2\2?A\7\5\2\2@>\3\2\2\2AD\3\2"+
		"\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7!\2\2F\5\3\2\2\2GH\7\25"+
		"\2\2HI\7\7\2\2IJ\7\5\2\2JQ\7,\2\2KM\7\t\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2"+
		"\2\2NO\3\2\2\2OR\3\2\2\2PR\7\16\2\2QL\3\2\2\2QP\3\2\2\2RS\3\2\2\2ST\7"+
		"!\2\2T\7\3\2\2\2UV\7\24\2\2VW\7\5\2\2W[\7%\2\2XZ\5\4\3\2YX\3\2\2\2Z]\3"+
		"\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7&\2\2_\t\3\2\2\2`"+
		"a\t\2\2\2ab\7\5\2\2bd\7\'\2\2ce\5\f\7\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2"+
		"fj\7(\2\2gi\5\4\3\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2"+
		"lj\3\2\2\2mn\5\16\b\2n\13\3\2\2\2op\7\7\2\2pv\7\5\2\2qr\7 \2\2rs\7\7\2"+
		"\2su\7\5\2\2tq\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\r\3\2\2\2xv\3\2"+
		"\2\2y}\7%\2\2z|\5\20\t\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080"+
		"\3\2\2\2\177}\3\2\2\2\u0080\u0081\7&\2\2\u0081\17\3\2\2\2\u0082\u0086"+
		"\5\22\n\2\u0083\u0084\7,\2\2\u0084\u0087\5 \21\2\u0085\u0087\5\24\13\2"+
		"\u0086\u0083\3\2\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089"+
		"\7!\2\2\u0089\u009f\3\2\2\2\u008a\u008b\7\27\2\2\u008b\u008c\7\'\2\2\u008c"+
		"\u008d\5\34\17\2\u008d\u008e\7(\2\2\u008e\u0091\5\20\t\2\u008f\u0090\7"+
		"\26\2\2\u0090\u0092\5\20\t\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u009f\3\2\2\2\u0093\u0094\7\34\2\2\u0094\u0095\7\'\2\2\u0095\u0096\5"+
		"\34\17\2\u0096\u0097\7(\2\2\u0097\u0098\5\20\t\2\u0098\u009f\3\2\2\2\u0099"+
		"\u009f\5\26\f\2\u009a\u009f\5\30\r\2\u009b\u009f\5\32\16\2\u009c\u009f"+
		"\5\16\b\2\u009d\u009f\7!\2\2\u009e\u0082\3\2\2\2\u009e\u008a\3\2\2\2\u009e"+
		"\u0093\3\2\2\2\u009e\u0099\3\2\2\2\u009e\u009a\3\2\2\2\u009e\u009b\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\21\3\2\2\2\u00a0\u00a9"+
		"\7\5\2\2\u00a1\u00a2\7\"\2\2\u00a2\u00a8\7\5\2\2\u00a3\u00a4\7#\2\2\u00a4"+
		"\u00a5\5 \21\2\u00a5\u00a6\7$\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a1\3\2"+
		"\2\2\u00a7\u00a3\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\23\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00b5\7\'\2"+
		"\2\u00ad\u00b2\5 \21\2\u00ae\u00af\7 \2\2\u00af\u00b1\5 \21\2\u00b0\u00ae"+
		"\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00ad\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7(\2\2\u00b8\25\3\2\2\2\u00b9\u00bb"+
		"\7\32\2\2\u00ba\u00bc\5 \21\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2"+
		"\u00bc\u00bd\3\2\2\2\u00bd\u00be\7!\2\2\u00be\27\3\2\2\2\u00bf\u00c0\7"+
		"\31\2\2\u00c0\u00c1\7\'\2\2\u00c1\u00c2\5\22\n\2\u00c2\u00c3\7(\2\2\u00c3"+
		"\u00c4\7!\2\2\u00c4\31\3\2\2\2\u00c5\u00c6\7\35\2\2\u00c6\u00c7\7\'\2"+
		"\2\u00c7\u00ce\5 \21\2\u00c8\u00ca\7 \2\2\u00c9\u00cb\7\b\2\2\u00ca\u00c9"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00cf\3\2\2\2\u00ce\u00c8\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d1\7(\2\2\u00d1\u00d2\7!\2\2\u00d2\33\3\2\2\2\u00d3\u00d4"+
		"\5 \21\2\u00d4\u00d5\5\36\20\2\u00d5\u00d6\5 \21\2\u00d6\35\3\2\2\2\u00d7"+
		"\u00d8\7-\2\2\u00d8\37\3\2\2\2\u00d9\u00db\7)\2\2\u00da\u00d9\3\2\2\2"+
		"\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00e2\5\"\22\2\u00dd\u00de"+
		"\5&\24\2\u00de\u00df\5\"\22\2\u00df\u00e1\3\2\2\2\u00e0\u00dd\3\2\2\2"+
		"\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3!\3"+
		"\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00eb\5$\23\2\u00e6\u00e7\5(\25\2\u00e7"+
		"\u00e8\5$\23\2\u00e8\u00ea\3\2\2\2\u00e9\u00e6\3\2\2\2\u00ea\u00ed\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec#\3\2\2\2\u00ed\u00eb"+
		"\3\2\2\2\u00ee\u00f0\5\22\n\2\u00ef\u00f1\5\24\13\2\u00f0\u00ef\3\2\2"+
		"\2\u00f0\u00f1\3\2\2\2\u00f1\u0105\3\2\2\2\u00f2\u00f4\7\b\2\2\u00f3\u00f2"+
		"\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u0105\3\2\2\2\u00f7\u0105\7\16\2\2\u00f8\u00f9\7\30\2\2\u00f9\u00fe\7"+
		"\5\2\2\u00fa\u00fb\7#\2\2\u00fb\u00fc\5 \21\2\u00fc\u00fd\7$\2\2\u00fd"+
		"\u00ff\3\2\2\2\u00fe\u00fa\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0105\3\2"+
		"\2\2\u0100\u0101\7\'\2\2\u0101\u0102\5 \21\2\u0102\u0103\7(\2\2\u0103"+
		"\u0105\3\2\2\2\u0104\u00ee\3\2\2\2\u0104\u00f3\3\2\2\2\u0104\u00f7\3\2"+
		"\2\2\u0104\u00f8\3\2\2\2\u0104\u0100\3\2\2\2\u0105%\3\2\2\2\u0106\u0107"+
		"\7.\2\2\u0107\'\3\2\2\2\u0108\u0109\7/\2\2\u0109)\3\2\2\2\36/\618BNQ["+
		"djv}\u0086\u0091\u009e\u00a7\u00a9\u00b2\u00b5\u00bb\u00cc\u00ce\u00da"+
		"\u00e2\u00eb\u00f0\u00f5\u00fe\u0104";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}