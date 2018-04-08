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
		WhiteSpace=1, Comments=2, Unknown=3, TOK_IDENTIFIER=4, TOK_LETTER=5, TOK_DIGIT=6, 
		TOK_TYPE=7, TOK_VALUE=8, TOK_PROGRAM=9, TOK_CLASS=10, TOK_FINAL=11, TOK_ELSE=12, 
		TOK_IF=13, TOK_NEW=14, TOK_READ=15, TOK_RETURN=16, TOK_VOID=17, TOK_WHILE=18, 
		TOK_PRINT=19, TOK_TYPE_INT=20, TOK_TYPE_CHAR=21, TOK_COMMA=22, TOK_SEMI=23, 
		TOK_DOT=24, TOK_LB=25, TOK_RB=26, TOK_LCB=27, TOK_RCB=28, TOK_LP=29, TOK_RP=30, 
		TOK_SINGLEQUOTE=31, TOK_DOUBLEQUOTE=32, TOK_OP_REL=33, TOK_OP_ADD=34, 
		TOK_OP_TIMES=35, TOK_EQ=36, TOK_OP_NE=37, TOK_OP_LT=38, TOK_OP_LE=39, 
		TOK_OP_GT=40, TOK_OP_GE=41, TOK_OP_ASSIGN=42, OP_ADD_PLUS=43, OP_ADD_MINUS=44, 
		OP_MUL_TIMES=45, OP_MUL_DIV=46, OP_MUL_MOD=47;
	public static final int
		RULE_program = 0, RULE_ident = 1, RULE_constDecl = 2, RULE_varDecl = 3, 
		RULE_intCharDecl = 4, RULE_varDeclSEMI = 5, RULE_varDeclAssi = 6, RULE_arrayDecl = 7, 
		RULE_arrayDeclSEMI = 8, RULE_arrayDeclAssi = 9, RULE_classDecl = 10, RULE_methodDecl = 11;
	public static final String[] ruleNames = {
		"program", "ident", "constDecl", "varDecl", "intCharDecl", "varDeclSEMI", 
		"varDeclAssi", "arrayDecl", "arrayDeclSEMI", "arrayDeclAssi", "classDecl", 
		"methodDecl"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, "'program'", "'class'", 
		"'final'", "'else'", "'if'", "'new'", "'read'", "'return'", "'void'", 
		"'while'", "'print'", "'int'", "'char'", "','", "';'", "'.'", "'['", "']'", 
		"'{'", "'}'", "'('", "')'", "'''", "'\"'", null, null, null, "'=='", "'!='", 
		"'<'", null, "'>'", null, "'='", "'+'", "'-'", "'*'", "'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WhiteSpace", "Comments", "Unknown", "TOK_IDENTIFIER", "TOK_LETTER", 
		"TOK_DIGIT", "TOK_TYPE", "TOK_VALUE", "TOK_PROGRAM", "TOK_CLASS", "TOK_FINAL", 
		"TOK_ELSE", "TOK_IF", "TOK_NEW", "TOK_READ", "TOK_RETURN", "TOK_VOID", 
		"TOK_WHILE", "TOK_PRINT", "TOK_TYPE_INT", "TOK_TYPE_CHAR", "TOK_COMMA", 
		"TOK_SEMI", "TOK_DOT", "TOK_LB", "TOK_RB", "TOK_LCB", "TOK_RCB", "TOK_LP", 
		"TOK_RP", "TOK_SINGLEQUOTE", "TOK_DOUBLEQUOTE", "TOK_OP_REL", "TOK_OP_ADD", 
		"TOK_OP_TIMES", "TOK_EQ", "TOK_OP_NE", "TOK_OP_LT", "TOK_OP_LE", "TOK_OP_GT", 
		"TOK_OP_GE", "TOK_OP_ASSIGN", "OP_ADD_PLUS", "OP_ADD_MINUS", "OP_MUL_TIMES", 
		"OP_MUL_DIV", "OP_MUL_MOD"
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
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
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
			setState(24);
			match(TOK_PROGRAM);
			setState(25);
			ident();
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_TYPE) | (1L << TOK_CLASS) | (1L << TOK_FINAL) | (1L << TOK_TYPE_INT))) != 0)) {
				{
				setState(29);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TOK_FINAL:
					{
					setState(26);
					constDecl();
					}
					break;
				case TOK_TYPE:
				case TOK_TYPE_INT:
					{
					setState(27);
					varDecl();
					}
					break;
				case TOK_CLASS:
					{
					setState(28);
					classDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			match(TOK_LCB);
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				methodDecl();
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TOK_CLASS );
			setState(40);
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

	public static class IdentContext extends ParserRuleContext {
		public TerminalNode TOK_IDENTIFIER() { return getToken(grParser.TOK_IDENTIFIER, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitIdent(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(TOK_IDENTIFIER);
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
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(TOK_FINAL);
			setState(45);
			varDecl();
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
		public IntCharDeclContext intCharDecl() {
			return getRuleContext(IntCharDeclContext.class,0);
		}
		public ArrayDeclContext arrayDecl() {
			return getRuleContext(ArrayDeclContext.class,0);
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
		enterRule(_localctx, 6, RULE_varDecl);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				intCharDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				arrayDecl();
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

	public static class IntCharDeclContext extends ParserRuleContext {
		public VarDeclSEMIContext varDeclSEMI() {
			return getRuleContext(VarDeclSEMIContext.class,0);
		}
		public VarDeclAssiContext varDeclAssi() {
			return getRuleContext(VarDeclAssiContext.class,0);
		}
		public IntCharDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intCharDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterIntCharDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitIntCharDecl(this);
		}
	}

	public final IntCharDeclContext intCharDecl() throws RecognitionException {
		IntCharDeclContext _localctx = new IntCharDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_intCharDecl);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOK_TYPE_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				varDeclSEMI();
				}
				break;
			case TOK_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				varDeclAssi();
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

	public static class VarDeclSEMIContext extends ParserRuleContext {
		public TerminalNode TOK_TYPE_INT() { return getToken(grParser.TOK_TYPE_INT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode TOK_SEMI() { return getToken(grParser.TOK_SEMI, 0); }
		public VarDeclSEMIContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclSEMI; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterVarDeclSEMI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitVarDeclSEMI(this);
		}
	}

	public final VarDeclSEMIContext varDeclSEMI() throws RecognitionException {
		VarDeclSEMIContext _localctx = new VarDeclSEMIContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDeclSEMI);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(TOK_TYPE_INT);
			setState(56);
			ident();
			setState(57);
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

	public static class VarDeclAssiContext extends ParserRuleContext {
		public TerminalNode TOK_TYPE() { return getToken(grParser.TOK_TYPE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode TOK_OP_ASSIGN() { return getToken(grParser.TOK_OP_ASSIGN, 0); }
		public TerminalNode TOK_VALUE() { return getToken(grParser.TOK_VALUE, 0); }
		public TerminalNode TOK_SEMI() { return getToken(grParser.TOK_SEMI, 0); }
		public VarDeclAssiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclAssi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterVarDeclAssi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitVarDeclAssi(this);
		}
	}

	public final VarDeclAssiContext varDeclAssi() throws RecognitionException {
		VarDeclAssiContext _localctx = new VarDeclAssiContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDeclAssi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(TOK_TYPE);
			setState(60);
			ident();
			setState(61);
			match(TOK_OP_ASSIGN);
			setState(62);
			match(TOK_VALUE);
			setState(63);
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

	public static class ArrayDeclContext extends ParserRuleContext {
		public ArrayDeclSEMIContext arrayDeclSEMI() {
			return getRuleContext(ArrayDeclSEMIContext.class,0);
		}
		public ArrayDeclAssiContext arrayDeclAssi() {
			return getRuleContext(ArrayDeclAssiContext.class,0);
		}
		public ArrayDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterArrayDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitArrayDecl(this);
		}
	}

	public final ArrayDeclContext arrayDecl() throws RecognitionException {
		ArrayDeclContext _localctx = new ArrayDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arrayDecl);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				arrayDeclSEMI();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				arrayDeclAssi();
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

	public static class ArrayDeclSEMIContext extends ParserRuleContext {
		public TerminalNode TOK_TYPE() { return getToken(grParser.TOK_TYPE, 0); }
		public TerminalNode TOK_LB() { return getToken(grParser.TOK_LB, 0); }
		public TerminalNode TOK_RB() { return getToken(grParser.TOK_RB, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode TOK_SEMI() { return getToken(grParser.TOK_SEMI, 0); }
		public ArrayDeclSEMIContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclSEMI; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterArrayDeclSEMI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitArrayDeclSEMI(this);
		}
	}

	public final ArrayDeclSEMIContext arrayDeclSEMI() throws RecognitionException {
		ArrayDeclSEMIContext _localctx = new ArrayDeclSEMIContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arrayDeclSEMI);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(TOK_TYPE);
			setState(70);
			match(TOK_LB);
			setState(71);
			match(TOK_RB);
			setState(72);
			ident();
			setState(73);
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

	public static class ArrayDeclAssiContext extends ParserRuleContext {
		public List<TerminalNode> TOK_TYPE() { return getTokens(grParser.TOK_TYPE); }
		public TerminalNode TOK_TYPE(int i) {
			return getToken(grParser.TOK_TYPE, i);
		}
		public List<TerminalNode> TOK_LB() { return getTokens(grParser.TOK_LB); }
		public TerminalNode TOK_LB(int i) {
			return getToken(grParser.TOK_LB, i);
		}
		public List<TerminalNode> TOK_RB() { return getTokens(grParser.TOK_RB); }
		public TerminalNode TOK_RB(int i) {
			return getToken(grParser.TOK_RB, i);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode TOK_OP_ASSIGN() { return getToken(grParser.TOK_OP_ASSIGN, 0); }
		public TerminalNode TOK_NEW() { return getToken(grParser.TOK_NEW, 0); }
		public TerminalNode TOK_SEMI() { return getToken(grParser.TOK_SEMI, 0); }
		public List<TerminalNode> TOK_DIGIT() { return getTokens(grParser.TOK_DIGIT); }
		public TerminalNode TOK_DIGIT(int i) {
			return getToken(grParser.TOK_DIGIT, i);
		}
		public ArrayDeclAssiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclAssi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterArrayDeclAssi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitArrayDeclAssi(this);
		}
	}

	public final ArrayDeclAssiContext arrayDeclAssi() throws RecognitionException {
		ArrayDeclAssiContext _localctx = new ArrayDeclAssiContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arrayDeclAssi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(TOK_TYPE);
			setState(76);
			match(TOK_LB);
			setState(77);
			match(TOK_RB);
			setState(78);
			ident();
			setState(79);
			match(TOK_OP_ASSIGN);
			setState(80);
			match(TOK_NEW);
			setState(81);
			match(TOK_TYPE);
			setState(82);
			match(TOK_LB);
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83);
				match(TOK_DIGIT);
				}
				}
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TOK_DIGIT );
			setState(88);
			match(TOK_RB);
			setState(89);
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
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
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
		enterRule(_localctx, 20, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(TOK_CLASS);
			setState(92);
			ident();
			setState(93);
			match(TOK_LCB);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_TYPE || _la==TOK_TYPE_INT) {
				{
				{
				setState(94);
				varDecl();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
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
		public TerminalNode TOK_CLASS() { return getToken(grParser.TOK_CLASS, 0); }
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
		enterRule(_localctx, 22, RULE_methodDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(TOK_CLASS);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61k\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3\2\3\2\6\2"+
		"\'\n\2\r\2\16\2(\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\5\5\64\n\5\3\6\3"+
		"\6\5\68\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\tF\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6"+
		"\13W\n\13\r\13\16\13X\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\fb\n\f\f\f\16\f"+
		"e\13\f\3\f\3\f\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2"+
		"g\2\32\3\2\2\2\4,\3\2\2\2\6.\3\2\2\2\b\63\3\2\2\2\n\67\3\2\2\2\f9\3\2"+
		"\2\2\16=\3\2\2\2\20E\3\2\2\2\22G\3\2\2\2\24M\3\2\2\2\26]\3\2\2\2\30h\3"+
		"\2\2\2\32\33\7\13\2\2\33!\5\4\3\2\34 \5\6\4\2\35 \5\b\5\2\36 \5\26\f\2"+
		"\37\34\3\2\2\2\37\35\3\2\2\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3"+
		"\2\2\2\"$\3\2\2\2#!\3\2\2\2$&\7\35\2\2%\'\5\30\r\2&%\3\2\2\2\'(\3\2\2"+
		"\2(&\3\2\2\2()\3\2\2\2)*\3\2\2\2*+\7\36\2\2+\3\3\2\2\2,-\7\6\2\2-\5\3"+
		"\2\2\2./\7\r\2\2/\60\5\b\5\2\60\7\3\2\2\2\61\64\5\n\6\2\62\64\5\20\t\2"+
		"\63\61\3\2\2\2\63\62\3\2\2\2\64\t\3\2\2\2\658\5\f\7\2\668\5\16\b\2\67"+
		"\65\3\2\2\2\67\66\3\2\2\28\13\3\2\2\29:\7\26\2\2:;\5\4\3\2;<\7\31\2\2"+
		"<\r\3\2\2\2=>\7\t\2\2>?\5\4\3\2?@\7,\2\2@A\7\n\2\2AB\7\31\2\2B\17\3\2"+
		"\2\2CF\5\22\n\2DF\5\24\13\2EC\3\2\2\2ED\3\2\2\2F\21\3\2\2\2GH\7\t\2\2"+
		"HI\7\33\2\2IJ\7\34\2\2JK\5\4\3\2KL\7\31\2\2L\23\3\2\2\2MN\7\t\2\2NO\7"+
		"\33\2\2OP\7\34\2\2PQ\5\4\3\2QR\7,\2\2RS\7\20\2\2ST\7\t\2\2TV\7\33\2\2"+
		"UW\7\b\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\7\34\2"+
		"\2[\\\7\31\2\2\\\25\3\2\2\2]^\7\f\2\2^_\5\4\3\2_c\7\35\2\2`b\5\b\5\2a"+
		"`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\36\2\2"+
		"g\27\3\2\2\2hi\7\f\2\2i\31\3\2\2\2\n\37!(\63\67EXc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}