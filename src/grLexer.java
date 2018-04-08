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
		WhiteSpace=1, Comments=2, Unknown=3, TOK_IDENTIFIER=4, TOK_LETTER=5, TOK_DIGIT=6, 
		TOK_TYPE=7, TOK_VALUE=8, TOK_PROGRAM=9, TOK_CLASS=10, TOK_FINAL=11, TOK_ELSE=12, 
		TOK_IF=13, TOK_NEW=14, TOK_READ=15, TOK_RETURN=16, TOK_VOID=17, TOK_WHILE=18, 
		TOK_PRINT=19, TOK_TYPE_INT=20, TOK_TYPE_CHAR=21, TOK_COMMA=22, TOK_SEMI=23, 
		TOK_DOT=24, TOK_LB=25, TOK_RB=26, TOK_LCB=27, TOK_RCB=28, TOK_LP=29, TOK_RP=30, 
		TOK_SINGLEQUOTE=31, TOK_DOUBLEQUOTE=32, TOK_OP_REL=33, TOK_OP_ADD=34, 
		TOK_OP_TIMES=35, TOK_EQ=36, TOK_OP_NE=37, TOK_OP_LT=38, TOK_OP_LE=39, 
		TOK_OP_GT=40, TOK_OP_GE=41, TOK_OP_ASSIGN=42, OP_ADD_PLUS=43, OP_ADD_MINUS=44, 
		OP_MUL_TIMES=45, OP_MUL_DIV=46, OP_MUL_MOD=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WhiteSpace", "Comments", "Unknown", "TOK_IDENTIFIER", "TOK_LETTER", "TOK_DIGIT", 
		"TOK_TYPE", "TOK_VALUE", "TOK_PROGRAM", "TOK_CLASS", "TOK_FINAL", "TOK_ELSE", 
		"TOK_IF", "TOK_NEW", "TOK_READ", "TOK_RETURN", "TOK_VOID", "TOK_WHILE", 
		"TOK_PRINT", "TOK_TYPE_INT", "TOK_TYPE_CHAR", "TOK_COMMA", "TOK_SEMI", 
		"TOK_DOT", "TOK_LB", "TOK_RB", "TOK_LCB", "TOK_RCB", "TOK_LP", "TOK_RP", 
		"TOK_SINGLEQUOTE", "TOK_DOUBLEQUOTE", "TOK_OP_REL", "TOK_OP_ADD", "TOK_OP_TIMES", 
		"TOK_EQ", "TOK_OP_NE", "TOK_OP_LT", "TOK_OP_LE", "TOK_OP_GT", "TOK_OP_GE", 
		"TOK_OP_ASSIGN", "OP_ADD_PLUS", "OP_ADD_MINUS", "OP_MUL_TIMES", "OP_MUL_DIV", 
		"OP_MUL_MOD"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0116\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3i\n"+
		"\3\f\3\16\3l\13\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\7\5v\n\5\f\5\16\5y\13"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\5\b\u0081\n\b\3\t\6\t\u0084\n\t\r\t\16\t\u0085"+
		"\3\t\3\t\3\t\3\t\5\t\u008c\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u00f0\n\"\3#\3#\5#\u00f4\n#\3$\3$\3$\5$\u00f9\n$\3%\3%\3%\3&\3&\3"+
		"&\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3"+
		"\60\3j\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\6\5\2\13\f\17"+
		"\17\"\"\6\2##%&BB``\4\2C\\c|\3\2\62;\2\u0123\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5d\3\2\2\2\7p\3\2\2"+
		"\2\tr\3\2\2\2\13z\3\2\2\2\r|\3\2\2\2\17\u0080\3\2\2\2\21\u008b\3\2\2\2"+
		"\23\u008d\3\2\2\2\25\u0095\3\2\2\2\27\u009b\3\2\2\2\31\u00a1\3\2\2\2\33"+
		"\u00a6\3\2\2\2\35\u00a9\3\2\2\2\37\u00ad\3\2\2\2!\u00b2\3\2\2\2#\u00b9"+
		"\3\2\2\2%\u00be\3\2\2\2\'\u00c4\3\2\2\2)\u00ca\3\2\2\2+\u00ce\3\2\2\2"+
		"-\u00d3\3\2\2\2/\u00d5\3\2\2\2\61\u00d7\3\2\2\2\63\u00d9\3\2\2\2\65\u00db"+
		"\3\2\2\2\67\u00dd\3\2\2\29\u00df\3\2\2\2;\u00e1\3\2\2\2=\u00e3\3\2\2\2"+
		"?\u00e5\3\2\2\2A\u00e7\3\2\2\2C\u00ef\3\2\2\2E\u00f3\3\2\2\2G\u00f8\3"+
		"\2\2\2I\u00fa\3\2\2\2K\u00fd\3\2\2\2M\u0100\3\2\2\2O\u0102\3\2\2\2Q\u0105"+
		"\3\2\2\2S\u0107\3\2\2\2U\u010a\3\2\2\2W\u010c\3\2\2\2Y\u010e\3\2\2\2["+
		"\u0110\3\2\2\2]\u0112\3\2\2\2_\u0114\3\2\2\2ab\t\2\2\2bc\b\2\2\2c\4\3"+
		"\2\2\2de\7\61\2\2ef\7\61\2\2fj\3\2\2\2gi\13\2\2\2hg\3\2\2\2il\3\2\2\2"+
		"jk\3\2\2\2jh\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7\f\2\2no\b\3\3\2o\6\3\2\2"+
		"\2pq\t\3\2\2q\b\3\2\2\2rw\5\13\6\2sv\5\13\6\2tv\5\r\7\2us\3\2\2\2ut\3"+
		"\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\n\3\2\2\2yw\3\2\2\2z{\t\4\2\2{\f"+
		"\3\2\2\2|}\t\5\2\2}\16\3\2\2\2~\u0081\5)\25\2\177\u0081\5+\26\2\u0080"+
		"~\3\2\2\2\u0080\177\3\2\2\2\u0081\20\3\2\2\2\u0082\u0084\5\r\7\2\u0083"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u008c\3\2\2\2\u0087\u0088\5? \2\u0088\u0089\5\13\6\2\u0089"+
		"\u008a\5? \2\u008a\u008c\3\2\2\2\u008b\u0083\3\2\2\2\u008b\u0087\3\2\2"+
		"\2\u008c\22\3\2\2\2\u008d\u008e\7r\2\2\u008e\u008f\7t\2\2\u008f\u0090"+
		"\7q\2\2\u0090\u0091\7i\2\2\u0091\u0092\7t\2\2\u0092\u0093\7c\2\2\u0093"+
		"\u0094\7o\2\2\u0094\24\3\2\2\2\u0095\u0096\7e\2\2\u0096\u0097\7n\2\2\u0097"+
		"\u0098\7c\2\2\u0098\u0099\7u\2\2\u0099\u009a\7u\2\2\u009a\26\3\2\2\2\u009b"+
		"\u009c\7h\2\2\u009c\u009d\7k\2\2\u009d\u009e\7p\2\2\u009e\u009f\7c\2\2"+
		"\u009f\u00a0\7n\2\2\u00a0\30\3\2\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7"+
		"n\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5\7g\2\2\u00a5\32\3\2\2\2\u00a6\u00a7"+
		"\7k\2\2\u00a7\u00a8\7h\2\2\u00a8\34\3\2\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab"+
		"\7g\2\2\u00ab\u00ac\7y\2\2\u00ac\36\3\2\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af"+
		"\7g\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7f\2\2\u00b1 \3\2\2\2\u00b2\u00b3"+
		"\7t\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7w\2\2\u00b6"+
		"\u00b7\7t\2\2\u00b7\u00b8\7p\2\2\u00b8\"\3\2\2\2\u00b9\u00ba\7x\2\2\u00ba"+
		"\u00bb\7q\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7f\2\2\u00bd$\3\2\2\2\u00be"+
		"\u00bf\7y\2\2\u00bf\u00c0\7j\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7n\2\2"+
		"\u00c2\u00c3\7g\2\2\u00c3&\3\2\2\2\u00c4\u00c5\7r\2\2\u00c5\u00c6\7t\2"+
		"\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7v\2\2\u00c9(\3\2"+
		"\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7v\2\2\u00cd*\3"+
		"\2\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d0\7j\2\2\u00d0\u00d1\7c\2\2\u00d1"+
		"\u00d2\7t\2\2\u00d2,\3\2\2\2\u00d3\u00d4\7.\2\2\u00d4.\3\2\2\2\u00d5\u00d6"+
		"\7=\2\2\u00d6\60\3\2\2\2\u00d7\u00d8\7\60\2\2\u00d8\62\3\2\2\2\u00d9\u00da"+
		"\7]\2\2\u00da\64\3\2\2\2\u00db\u00dc\7_\2\2\u00dc\66\3\2\2\2\u00dd\u00de"+
		"\7}\2\2\u00de8\3\2\2\2\u00df\u00e0\7\177\2\2\u00e0:\3\2\2\2\u00e1\u00e2"+
		"\7*\2\2\u00e2<\3\2\2\2\u00e3\u00e4\7+\2\2\u00e4>\3\2\2\2\u00e5\u00e6\7"+
		")\2\2\u00e6@\3\2\2\2\u00e7\u00e8\7$\2\2\u00e8B\3\2\2\2\u00e9\u00f0\5I"+
		"%\2\u00ea\u00f0\5K&\2\u00eb\u00f0\5M\'\2\u00ec\u00f0\5O(\2\u00ed\u00f0"+
		"\5Q)\2\u00ee\u00f0\5S*\2\u00ef\u00e9\3\2\2\2\u00ef\u00ea\3\2\2\2\u00ef"+
		"\u00eb\3\2\2\2\u00ef\u00ec\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2"+
		"\2\2\u00f0D\3\2\2\2\u00f1\u00f4\5W,\2\u00f2\u00f4\5Y-\2\u00f3\u00f1\3"+
		"\2\2\2\u00f3\u00f2\3\2\2\2\u00f4F\3\2\2\2\u00f5\u00f9\5[.\2\u00f6\u00f9"+
		"\5]/\2\u00f7\u00f9\5_\60\2\u00f8\u00f5\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f7\3\2\2\2\u00f9H\3\2\2\2\u00fa\u00fb\7?\2\2\u00fb\u00fc\7?\2\2\u00fc"+
		"J\3\2\2\2\u00fd\u00fe\7#\2\2\u00fe\u00ff\7?\2\2\u00ffL\3\2\2\2\u0100\u0101"+
		"\7>\2\2\u0101N\3\2\2\2\u0102\u0103\7>\2\2\u0103\u0104\7?\2\2\u0104P\3"+
		"\2\2\2\u0105\u0106\7@\2\2\u0106R\3\2\2\2\u0107\u0108\7>\2\2\u0108\u0109"+
		"\7?\2\2\u0109T\3\2\2\2\u010a\u010b\7?\2\2\u010bV\3\2\2\2\u010c\u010d\7"+
		"-\2\2\u010dX\3\2\2\2\u010e\u010f\7/\2\2\u010fZ\3\2\2\2\u0110\u0111\7,"+
		"\2\2\u0111\\\3\2\2\2\u0112\u0113\7\61\2\2\u0113^\3\2\2\2\u0114\u0115\7"+
		"\'\2\2\u0115`\3\2\2\2\f\2juw\u0080\u0085\u008b\u00ef\u00f3\u00f8\4\3\2"+
		"\2\3\3\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}