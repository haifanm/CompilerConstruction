// Generated from C:/Users/User/IdeaProjects/newproject/src\gr.g4 by ANTLR 4.7

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;


import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WhiteSpace", "Comments", "TOK_IDENTIFIER", "TOK_INVALID_IDENTIFIER", 
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


	  static boolean lexError = false;

	  public ArrayList<Integer> tracker=new ArrayList<Integer>(){{	  add(0);}};;
	  public static Stack<Stack<ASTNode>> tempStack=new Stack<Stack<ASTNode>>(); //list of children of the current subroot
	  Stack<ASTNode> nodeStack=new Stack<ASTNode>(); //all subtrees
	  ASTNode Ptree=new ASTNode(); //The root of the program
	  static int scope=0;
	  static int count=0;
	  static int toggle=0;
	  private java.util.Queue<Token> queue = new java.util.LinkedList<Token>();
	  public static SymbolTable symbolTable=new SymbolTable();


	  public int lexGetLine(){
	    return getLine();
	  }
	  public SymbolTableNode node;
	  @Override
	  public Token nextToken() {
	    if(!queue.isEmpty()) {
	      return queue.poll();
	    }
	    Token next = super.nextToken();

	    while(next.getType()==WhiteSpace){

	    }
	    if(next.getType() != Unknown) {
	      Token curr=next;
	      if(next.getType()==TOK_TYPE){
	        node=new SymbolTableNode();
	        node.type=getText();
	        toggle=1;
	      }
	      if(next.getType()==TOK_IDENTIFIER && toggle==1){
	        try{
	        node.name=getText();
	        node.scope=scope;
	        }catch(NullPointerException e){
	            System.out.println("ERROR "+getText());
	        }

	        toggle=0;
	      }
	      if(node!=null && !checkScope(node.name) && node.name!=null){
	        System.out.println("inserting "+ getText());
	        symbolTable.insert(node);
	        node=null;
	      }else{
	        if(node!=null && node.name!=null){
	        System.out.println("variable already exists: "+getText());
	        node=null;
	        }
	      }
	      if(next.getType()==TOK_LCB){
	        count++;
	        tracker.add(count);
	        scope=count;
	      }
	      if(next.getType()==TOK_RCB){
	        tracker.remove(tracker.size()-1);
	        scope=tracker.get(tracker.size()-1);
	      }
	      return curr;
	    }


	    StringBuilder builder = new StringBuilder();

	    while(next.getType() == Unknown) {
	      next = super.nextToken();
	    }


	    queue.offer(next);

	    return new CommonToken(Unknown, builder.toString());
	  }
	public Boolean checkScope(String name){
	        if(symbolTable.get(name)==null){
	            return false;
	        }else{
	            return true;
	        }
	    }
	     public void addTempStack(String type, String name){
	    	    Stack<ASTNode> temp=new Stack<>();
	    	    temp.push(new ASTNode(type, name));
	    	    tempStack.push(temp);
	    	}


	public grLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gr.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			WhiteSpace_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			Comments_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			TOK_INVALID_IDENTIFIER_action((RuleContext)_localctx, actionIndex);
			break;
		case 13:
			TOK_INVALID_CHAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			UNRECOGNIZED_SYMBOL_action((RuleContext)_localctx, actionIndex);
			break;
		case 15:
			TOK_INT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void Comments_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}
	private void TOK_INVALID_IDENTIFIER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			lexError=true;    System.out.println("lexical error");
			break;
		}
	}
	private void TOK_INVALID_CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			lexError=true;
			break;
		}
	}
	private void UNRECOGNIZED_SYMBOL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			lexError=true;
			break;
		}
	}
	private void TOK_INT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			 long y= Long.parseLong(getText());
			                     if(y>2147483647){
			                     lexError=true;
			                     System.out.println("lexical error");}      
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u0157\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\6\2x\n\2\r"+
		"\2\16\2y\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u0082\n\3\f\3\16\3\u0085\13\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\7\4\u008d\n\4\f\4\16\4\u0090\13\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u0098\n\5\3\6\3\6\3\6\3\6\5\6\u009e\n\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\5\13\u00aa\n\13\3\f\3\f\5\f\u00ae\n\f\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00b8\n\16\3\17\3\17\5\17\u00bc\n\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\21\6\21\u00c5\n\21\r\21\16\21\u00c6\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'"+
		"\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3,\3,\3,\5,\u0131\n,\3-\3-\5-\u0135"+
		"\n-\3.\3.\3.\5.\u013a\n.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3"+
		"\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\3"+
		"9\3:\3:\3\u0083\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;\3\2\7\3\2\62;\4\2C\\c|\3\2\"\u0080\4\2\13\f\17"+
		"\17\3\2))\2\u016c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3w\3\2\2\2\5}\3\2"+
		"\2\2\7\u0089\3\2\2\2\t\u0097\3\2\2\2\13\u0099\3\2\2\2\r\u009f\3\2\2\2"+
		"\17\u00a1\3\2\2\2\21\u00a3\3\2\2\2\23\u00a5\3\2\2\2\25\u00a9\3\2\2\2\27"+
		"\u00ad\3\2\2\2\31\u00af\3\2\2\2\33\u00b7\3\2\2\2\35\u00b9\3\2\2\2\37\u00c0"+
		"\3\2\2\2!\u00c4\3\2\2\2#\u00ca\3\2\2\2%\u00d2\3\2\2\2\'\u00d8\3\2\2\2"+
		")\u00de\3\2\2\2+\u00e3\3\2\2\2-\u00e6\3\2\2\2/\u00ea\3\2\2\2\61\u00ef"+
		"\3\2\2\2\63\u00f6\3\2\2\2\65\u00fb\3\2\2\2\67\u0101\3\2\2\29\u0107\3\2"+
		"\2\2;\u010b\3\2\2\2=\u0110\3\2\2\2?\u0112\3\2\2\2A\u0114\3\2\2\2C\u0116"+
		"\3\2\2\2E\u0118\3\2\2\2G\u011a\3\2\2\2I\u011c\3\2\2\2K\u011e\3\2\2\2M"+
		"\u0120\3\2\2\2O\u0122\3\2\2\2Q\u0124\3\2\2\2S\u0126\3\2\2\2U\u0128\3\2"+
		"\2\2W\u0130\3\2\2\2Y\u0134\3\2\2\2[\u0139\3\2\2\2]\u013b\3\2\2\2_\u013e"+
		"\3\2\2\2a\u0141\3\2\2\2c\u0143\3\2\2\2e\u0146\3\2\2\2g\u0148\3\2\2\2i"+
		"\u014b\3\2\2\2k\u014d\3\2\2\2m\u014f\3\2\2\2o\u0151\3\2\2\2q\u0153\3\2"+
		"\2\2s\u0155\3\2\2\2ux\7\"\2\2vx\5\23\n\2wu\3\2\2\2wv\3\2\2\2xy\3\2\2\2"+
		"yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\b\2\2\2|\4\3\2\2\2}~\7\61\2\2~\177\7"+
		"\61\2\2\177\u0083\3\2\2\2\u0080\u0082\13\2\2\2\u0081\u0080\3\2\2\2\u0082"+
		"\u0085\3\2\2\2\u0083\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086\3\2"+
		"\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\f\2\2\u0087\u0088\b\3\3\2\u0088"+
		"\6\3\2\2\2\u0089\u008e\5\17\b\2\u008a\u008d\5\17\b\2\u008b\u008d\5\r\7"+
		"\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\b\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0092\7a\2\2\u0092\u0098\5\7\4\2\u0093\u0094\5\r\7\2\u0094\u0095\5\7"+
		"\4\2\u0095\u0096\b\5\4\2\u0096\u0098\3\2\2\2\u0097\u0091\3\2\2\2\u0097"+
		"\u0093\3\2\2\2\u0098\n\3\2\2\2\u0099\u009d\5\7\4\2\u009a\u009b\5C\"\2"+
		"\u009b\u009c\5E#\2\u009c\u009e\3\2\2\2\u009d\u009a\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\f\3\2\2\2\u009f\u00a0\t\2\2\2\u00a0\16\3\2\2\2\u00a1\u00a2"+
		"\t\3\2\2\u00a2\20\3\2\2\2\u00a3\u00a4\t\4\2\2\u00a4\22\3\2\2\2\u00a5\u00a6"+
		"\t\5\2\2\u00a6\24\3\2\2\2\u00a7\u00aa\59\35\2\u00a8\u00aa\5;\36\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\26\3\2\2\2\u00ab\u00ae\5!\21"+
		"\2\u00ac\u00ae\5\31\r\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\30\3\2\2\2\u00af\u00b0\5Q)\2\u00b0\u00b1\5\33\16\2\u00b1\u00b2\5Q)\2"+
		"\u00b2\32\3\2\2\2\u00b3\u00b8\5\r\7\2\u00b4\u00b8\5\17\b\2\u00b5\u00b8"+
		"\5\23\n\2\u00b6\u00b8\5\21\t\2\u00b7\u00b3\3\2\2\2\u00b7\u00b4\3\2\2\2"+
		"\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\34\3\2\2\2\u00b9\u00bb"+
		"\7)\2\2\u00ba\u00bc\5\31\r\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00be\n\6\2\2\u00be\u00bf\b\17\5\2\u00bf\36\3\2\2"+
		"\2\u00c0\u00c1\13\2\2\2\u00c1\u00c2\b\20\6\2\u00c2 \3\2\2\2\u00c3\u00c5"+
		"\5\r\7\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\b\21\7\2\u00c9\"\3\2\2"+
		"\2\u00ca\u00cb\7r\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce"+
		"\7i\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7o\2\2\u00d1"+
		"$\3\2\2\2\u00d2\u00d3\7e\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5\7c\2\2\u00d5"+
		"\u00d6\7u\2\2\u00d6\u00d7\7u\2\2\u00d7&\3\2\2\2\u00d8\u00d9\7h\2\2\u00d9"+
		"\u00da\7k\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7n\2\2"+
		"\u00dd(\3\2\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7n\2\2\u00e0\u00e1\7u\2"+
		"\2\u00e1\u00e2\7g\2\2\u00e2*\3\2\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7"+
		"h\2\2\u00e5,\3\2\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9"+
		"\7y\2\2\u00e9.\3\2\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed"+
		"\7c\2\2\u00ed\u00ee\7f\2\2\u00ee\60\3\2\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1"+
		"\7g\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7w\2\2\u00f3\u00f4\7t\2\2\u00f4"+
		"\u00f5\7p\2\2\u00f5\62\3\2\2\2\u00f6\u00f7\7x\2\2\u00f7\u00f8\7q\2\2\u00f8"+
		"\u00f9\7k\2\2\u00f9\u00fa\7f\2\2\u00fa\64\3\2\2\2\u00fb\u00fc\7y\2\2\u00fc"+
		"\u00fd\7j\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7n\2\2\u00ff\u0100\7g\2\2"+
		"\u0100\66\3\2\2\2\u0101\u0102\7r\2\2\u0102\u0103\7t\2\2\u0103\u0104\7"+
		"k\2\2\u0104\u0105\7p\2\2\u0105\u0106\7v\2\2\u01068\3\2\2\2\u0107\u0108"+
		"\7k\2\2\u0108\u0109\7p\2\2\u0109\u010a\7v\2\2\u010a:\3\2\2\2\u010b\u010c"+
		"\7e\2\2\u010c\u010d\7j\2\2\u010d\u010e\7c\2\2\u010e\u010f\7t\2\2\u010f"+
		"<\3\2\2\2\u0110\u0111\7.\2\2\u0111>\3\2\2\2\u0112\u0113\7=\2\2\u0113@"+
		"\3\2\2\2\u0114\u0115\7\60\2\2\u0115B\3\2\2\2\u0116\u0117\7]\2\2\u0117"+
		"D\3\2\2\2\u0118\u0119\7_\2\2\u0119F\3\2\2\2\u011a\u011b\7}\2\2\u011bH"+
		"\3\2\2\2\u011c\u011d\7\177\2\2\u011dJ\3\2\2\2\u011e\u011f\7*\2\2\u011f"+
		"L\3\2\2\2\u0120\u0121\7+\2\2\u0121N\3\2\2\2\u0122\u0123\7/\2\2\u0123P"+
		"\3\2\2\2\u0124\u0125\7)\2\2\u0125R\3\2\2\2\u0126\u0127\7$\2\2\u0127T\3"+
		"\2\2\2\u0128\u0129\7?\2\2\u0129V\3\2\2\2\u012a\u0131\5]/\2\u012b\u0131"+
		"\5_\60\2\u012c\u0131\5a\61\2\u012d\u0131\5c\62\2\u012e\u0131\5e\63\2\u012f"+
		"\u0131\5g\64\2\u0130\u012a\3\2\2\2\u0130\u012b\3\2\2\2\u0130\u012c\3\2"+
		"\2\2\u0130\u012d\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131"+
		"X\3\2\2\2\u0132\u0135\5i\65\2\u0133\u0135\5k\66\2\u0134\u0132\3\2\2\2"+
		"\u0134\u0133\3\2\2\2\u0135Z\3\2\2\2\u0136\u013a\5m\67\2\u0137\u013a\5"+
		"o8\2\u0138\u013a\5q9\2\u0139\u0136\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u0138"+
		"\3\2\2\2\u013a\\\3\2\2\2\u013b\u013c\7?\2\2\u013c\u013d\7?\2\2\u013d^"+
		"\3\2\2\2\u013e\u013f\7#\2\2\u013f\u0140\7?\2\2\u0140`\3\2\2\2\u0141\u0142"+
		"\7>\2\2\u0142b\3\2\2\2\u0143\u0144\7>\2\2\u0144\u0145\7?\2\2\u0145d\3"+
		"\2\2\2\u0146\u0147\7@\2\2\u0147f\3\2\2\2\u0148\u0149\7>\2\2\u0149\u014a"+
		"\7?\2\2\u014ah\3\2\2\2\u014b\u014c\7-\2\2\u014cj\3\2\2\2\u014d\u014e\7"+
		"/\2\2\u014el\3\2\2\2\u014f\u0150\7,\2\2\u0150n\3\2\2\2\u0151\u0152\7\61"+
		"\2\2\u0152p\3\2\2\2\u0153\u0154\7\'\2\2\u0154r\3\2\2\2\u0155\u0156\7C"+
		"\2\2\u0156t\3\2\2\2\22\2wy\u0083\u008c\u008e\u0097\u009d\u00a9\u00ad\u00b7"+
		"\u00bb\u00c6\u0130\u0134\u0139\b\3\2\2\3\3\3\3\5\4\3\17\5\3\20\6\3\21"+
		"\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}