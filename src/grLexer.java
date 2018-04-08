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
		WhiteSpace=1, Comments=2, Unknown=3, TOK_IDENTIFIER=4, TOK_TYPE=5, TOK_DIGIT=6, 
		TOK_LETTER=7, TOK_ASCII_CHARS=8, TOK_SPECIAL_CHARS=9, TOK_CHAR_INT=10, 
		TOK_VALUE=11, TOK_CHAR=12, TOK_INT=13, TOK_PROGRAM=14, TOK_CLASS=15, TOK_FINAL=16, 
		TOK_ELSE=17, TOK_IF=18, TOK_NEW=19, TOK_READ=20, TOK_RETURN=21, TOK_VOID=22, 
		TOK_WHILE=23, TOK_PRINT=24, TOK_TYPE_INT=25, TOK_TYPE_CHAR=26, TOK_COMMA=27, 
		TOK_SEMI=28, TOK_DOT=29, TOK_LB=30, TOK_RB=31, TOK_LCB=32, TOK_RCB=33, 
		TOK_LP=34, TOK_RP=35, TOK_MINUS=36, TOK_SINGLEQUOTE=37, TOK_DOUBLEQUOTE=38, 
		TOK_OP_REL=39, TOK_OP_ADD=40, TOK_OP_TIMES=41, TOK_EQ=42, TOK_OP_NE=43, 
		TOK_OP_LT=44, TOK_OP_LE=45, TOK_OP_GT=46, TOK_OP_GE=47, TOK_OP_ASSIGN=48, 
		OP_ADD_PLUS=49, OP_ADD_MINUS=50, OP_MUL_TIMES=51, OP_MUL_DIV=52, OP_MUL_MOD=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WhiteSpace", "Comments", "Unknown", "TOK_IDENTIFIER", "TOK_TYPE", "TOK_DIGIT", 
		"TOK_LETTER", "TOK_ASCII_CHARS", "TOK_SPECIAL_CHARS", "TOK_CHAR_INT", 
		"TOK_VALUE", "TOK_CHAR", "TOK_INT", "TOK_PROGRAM", "TOK_CLASS", "TOK_FINAL", 
		"TOK_ELSE", "TOK_IF", "TOK_NEW", "TOK_READ", "TOK_RETURN", "TOK_VOID", 
		"TOK_WHILE", "TOK_PRINT", "TOK_TYPE_INT", "TOK_TYPE_CHAR", "TOK_COMMA", 
		"TOK_SEMI", "TOK_DOT", "TOK_LB", "TOK_RB", "TOK_LCB", "TOK_RCB", "TOK_LP", 
		"TOK_RP", "TOK_MINUS", "TOK_SINGLEQUOTE", "TOK_DOUBLEQUOTE", "TOK_OP_REL", 
		"TOK_OP_ADD", "TOK_OP_TIMES", "TOK_EQ", "TOK_OP_NE", "TOK_OP_LT", "TOK_OP_LE", 
		"TOK_OP_GT", "TOK_OP_GE", "TOK_OP_ASSIGN", "OP_ADD_PLUS", "OP_ADD_MINUS", 
		"OP_MUL_TIMES", "OP_MUL_DIV", "OP_MUL_MOD"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'program'", "'class'", "'final'", "'else'", "'if'", "'new'", 
		"'read'", "'return'", "'void'", "'while'", "'print'", "'int'", "'char'", 
		"','", "';'", "'.'", "'['", "']'", "'{'", "'}'", "'('", "')'", null, "'''", 
		"'\"'", null, null, null, "'=='", "'!='", "'<'", null, "'>'", null, "'='", 
		"'+'", null, "'*'", "'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WhiteSpace", "Comments", "Unknown", "TOK_IDENTIFIER", "TOK_TYPE", 
		"TOK_DIGIT", "TOK_LETTER", "TOK_ASCII_CHARS", "TOK_SPECIAL_CHARS", "TOK_CHAR_INT", 
		"TOK_VALUE", "TOK_CHAR", "TOK_INT", "TOK_PROGRAM", "TOK_CLASS", "TOK_FINAL", 
		"TOK_ELSE", "TOK_IF", "TOK_NEW", "TOK_READ", "TOK_RETURN", "TOK_VOID", 
		"TOK_WHILE", "TOK_PRINT", "TOK_TYPE_INT", "TOK_TYPE_CHAR", "TOK_COMMA", 
		"TOK_SEMI", "TOK_DOT", "TOK_LB", "TOK_RB", "TOK_LCB", "TOK_RCB", "TOK_LP", 
		"TOK_RP", "TOK_MINUS", "TOK_SINGLEQUOTE", "TOK_DOUBLEQUOTE", "TOK_OP_REL", 
		"TOK_OP_ADD", "TOK_OP_TIMES", "TOK_EQ", "TOK_OP_NE", "TOK_OP_LT", "TOK_OP_LE", 
		"TOK_OP_GT", "TOK_OP_GE", "TOK_OP_ASSIGN", "OP_ADD_PLUS", "OP_ADD_MINUS", 
		"OP_MUL_TIMES", "OP_MUL_DIV", "OP_MUL_MOD"
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u013f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3u\n\3\f\3\16"+
		"\3x\13\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\7\5\u0082\n\5\f\5\16\5\u0085"+
		"\13\5\3\6\3\6\3\6\3\6\5\6\u008b\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\5\13\u0097\n\13\3\f\6\f\u009a\n\f\r\f\16\f\u009b\3\f\3\f\3\f"+
		"\3\f\5\f\u00a2\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ae\n"+
		"\r\3\16\6\16\u00b1\n\16\r\16\16\16\u00b2\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3"+
		"(\3(\3(\3(\5(\u0119\n(\3)\3)\5)\u011d\n)\3*\3*\3*\5*\u0122\n*\3+\3+\3"+
		"+\3,\3,\3,\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3v\2\67\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67\3\2\b\5\2\13\f\17\17\"\"\6\2"+
		"##%&BB``\3\2\62;\4\2C\\c|\3\2\"\u0080\4\2\13\f\17\17\2\u0151\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5p\3\2\2"+
		"\2\7|\3\2\2\2\t~\3\2\2\2\13\u0086\3\2\2\2\r\u008c\3\2\2\2\17\u008e\3\2"+
		"\2\2\21\u0090\3\2\2\2\23\u0092\3\2\2\2\25\u0096\3\2\2\2\27\u00a1\3\2\2"+
		"\2\31\u00ad\3\2\2\2\33\u00b0\3\2\2\2\35\u00b4\3\2\2\2\37\u00bc\3\2\2\2"+
		"!\u00c2\3\2\2\2#\u00c8\3\2\2\2%\u00cd\3\2\2\2\'\u00d0\3\2\2\2)\u00d4\3"+
		"\2\2\2+\u00d9\3\2\2\2-\u00e0\3\2\2\2/\u00e5\3\2\2\2\61\u00eb\3\2\2\2\63"+
		"\u00f1\3\2\2\2\65\u00f5\3\2\2\2\67\u00fa\3\2\2\29\u00fc\3\2\2\2;\u00fe"+
		"\3\2\2\2=\u0100\3\2\2\2?\u0102\3\2\2\2A\u0104\3\2\2\2C\u0106\3\2\2\2E"+
		"\u0108\3\2\2\2G\u010a\3\2\2\2I\u010c\3\2\2\2K\u010e\3\2\2\2M\u0110\3\2"+
		"\2\2O\u0118\3\2\2\2Q\u011c\3\2\2\2S\u0121\3\2\2\2U\u0123\3\2\2\2W\u0126"+
		"\3\2\2\2Y\u0129\3\2\2\2[\u012b\3\2\2\2]\u012e\3\2\2\2_\u0130\3\2\2\2a"+
		"\u0133\3\2\2\2c\u0135\3\2\2\2e\u0137\3\2\2\2g\u0139\3\2\2\2i\u013b\3\2"+
		"\2\2k\u013d\3\2\2\2mn\t\2\2\2no\b\2\2\2o\4\3\2\2\2pq\7\61\2\2qr\7\61\2"+
		"\2rv\3\2\2\2su\13\2\2\2ts\3\2\2\2ux\3\2\2\2vw\3\2\2\2vt\3\2\2\2wy\3\2"+
		"\2\2xv\3\2\2\2yz\7\f\2\2z{\b\3\3\2{\6\3\2\2\2|}\t\3\2\2}\b\3\2\2\2~\u0083"+
		"\5\17\b\2\177\u0082\5\17\b\2\u0080\u0082\5\r\7\2\u0081\177\3\2\2\2\u0081"+
		"\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\n\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u008a\5\t\5\2\u0087\u0088"+
		"\5=\37\2\u0088\u0089\5? \2\u0089\u008b\3\2\2\2\u008a\u0087\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\f\3\2\2\2\u008c\u008d\t\4\2\2\u008d\16\3\2\2\2\u008e"+
		"\u008f\t\5\2\2\u008f\20\3\2\2\2\u0090\u0091\t\6\2\2\u0091\22\3\2\2\2\u0092"+
		"\u0093\t\7\2\2\u0093\24\3\2\2\2\u0094\u0097\5\63\32\2\u0095\u0097\5\65"+
		"\33\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097\26\3\2\2\2\u0098\u009a"+
		"\5\r\7\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u00a2\3\2\2\2\u009d\u009e\5K&\2\u009e\u009f\5\17"+
		"\b\2\u009f\u00a0\5K&\2\u00a0\u00a2\3\2\2\2\u00a1\u0099\3\2\2\2\u00a1\u009d"+
		"\3\2\2\2\u00a2\30\3\2\2\2\u00a3\u00a4\5K&\2\u00a4\u00a5\5\r\7\2\u00a5"+
		"\u00a6\5K&\2\u00a6\u00ae\3\2\2\2\u00a7\u00a8\5K&\2\u00a8\u00a9\5\17\b"+
		"\2\u00a9\u00aa\5K&\2\u00aa\u00ae\3\2\2\2\u00ab\u00ae\5\23\n\2\u00ac\u00ae"+
		"\5\21\t\2\u00ad\u00a3\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ad\u00ab\3\2\2\2"+
		"\u00ad\u00ac\3\2\2\2\u00ae\32\3\2\2\2\u00af\u00b1\5\r\7\2\u00b0\u00af"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\34\3\2\2\2\u00b4\u00b5\7r\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7q\2\2\u00b7"+
		"\u00b8\7i\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7o\2\2"+
		"\u00bb\36\3\2\2\2\u00bc\u00bd\7e\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7"+
		"c\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7u\2\2\u00c1 \3\2\2\2\u00c2\u00c3"+
		"\7h\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7c\2\2\u00c6"+
		"\u00c7\7n\2\2\u00c7\"\3\2\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7n\2\2\u00ca"+
		"\u00cb\7u\2\2\u00cb\u00cc\7g\2\2\u00cc$\3\2\2\2\u00cd\u00ce\7k\2\2\u00ce"+
		"\u00cf\7h\2\2\u00cf&\3\2\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7g\2\2\u00d2"+
		"\u00d3\7y\2\2\u00d3(\3\2\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7g\2\2\u00d6"+
		"\u00d7\7c\2\2\u00d7\u00d8\7f\2\2\u00d8*\3\2\2\2\u00d9\u00da\7t\2\2\u00da"+
		"\u00db\7g\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7w\2\2\u00dd\u00de\7t\2\2"+
		"\u00de\u00df\7p\2\2\u00df,\3\2\2\2\u00e0\u00e1\7x\2\2\u00e1\u00e2\7q\2"+
		"\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7f\2\2\u00e4.\3\2\2\2\u00e5\u00e6\7"+
		"y\2\2\u00e6\u00e7\7j\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ea"+
		"\7g\2\2\u00ea\60\3\2\2\2\u00eb\u00ec\7r\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee"+
		"\7k\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7v\2\2\u00f0\62\3\2\2\2\u00f1\u00f2"+
		"\7k\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4\7v\2\2\u00f4\64\3\2\2\2\u00f5\u00f6"+
		"\7e\2\2\u00f6\u00f7\7j\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9\7t\2\2\u00f9"+
		"\66\3\2\2\2\u00fa\u00fb\7.\2\2\u00fb8\3\2\2\2\u00fc\u00fd\7=\2\2\u00fd"+
		":\3\2\2\2\u00fe\u00ff\7\60\2\2\u00ff<\3\2\2\2\u0100\u0101\7]\2\2\u0101"+
		">\3\2\2\2\u0102\u0103\7_\2\2\u0103@\3\2\2\2\u0104\u0105\7}\2\2\u0105B"+
		"\3\2\2\2\u0106\u0107\7\177\2\2\u0107D\3\2\2\2\u0108\u0109\7*\2\2\u0109"+
		"F\3\2\2\2\u010a\u010b\7+\2\2\u010bH\3\2\2\2\u010c\u010d\7/\2\2\u010dJ"+
		"\3\2\2\2\u010e\u010f\7)\2\2\u010fL\3\2\2\2\u0110\u0111\7$\2\2\u0111N\3"+
		"\2\2\2\u0112\u0119\5U+\2\u0113\u0119\5W,\2\u0114\u0119\5Y-\2\u0115\u0119"+
		"\5[.\2\u0116\u0119\5]/\2\u0117\u0119\5_\60\2\u0118\u0112\3\2\2\2\u0118"+
		"\u0113\3\2\2\2\u0118\u0114\3\2\2\2\u0118\u0115\3\2\2\2\u0118\u0116\3\2"+
		"\2\2\u0118\u0117\3\2\2\2\u0119P\3\2\2\2\u011a\u011d\5c\62\2\u011b\u011d"+
		"\5e\63\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011dR\3\2\2\2\u011e"+
		"\u0122\5g\64\2\u011f\u0122\5i\65\2\u0120\u0122\5k\66\2\u0121\u011e\3\2"+
		"\2\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122T\3\2\2\2\u0123\u0124"+
		"\7?\2\2\u0124\u0125\7?\2\2\u0125V\3\2\2\2\u0126\u0127\7#\2\2\u0127\u0128"+
		"\7?\2\2\u0128X\3\2\2\2\u0129\u012a\7>\2\2\u012aZ\3\2\2\2\u012b\u012c\7"+
		">\2\2\u012c\u012d\7?\2\2\u012d\\\3\2\2\2\u012e\u012f\7@\2\2\u012f^\3\2"+
		"\2\2\u0130\u0131\7>\2\2\u0131\u0132\7?\2\2\u0132`\3\2\2\2\u0133\u0134"+
		"\7?\2\2\u0134b\3\2\2\2\u0135\u0136\7-\2\2\u0136d\3\2\2\2\u0137\u0138\7"+
		"/\2\2\u0138f\3\2\2\2\u0139\u013a\7,\2\2\u013ah\3\2\2\2\u013b\u013c\7\61"+
		"\2\2\u013cj\3\2\2\2\u013d\u013e\7\'\2\2\u013el\3\2\2\2\17\2v\u0081\u0083"+
		"\u008a\u0096\u009b\u00a1\u00ad\u00b2\u0118\u011c\u0121\4\3\2\2\3\3\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}