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
		WhiteSpace=1, Comments=2, Unknown=3, TOK_PROGRAM=4, TOK_CLASS=5, TOK_FINAL=6, 
		TOK_ELSE=7, TOK_IF=8, TOK_NEW=9, TOK_READ=10, TOK_RETURN=11, TOK_VOID=12, 
		TOK_WHILE=13, TOK_PRINT=14, TOK_COMMA=15, TOK_SEMI=16, TOK_DOT=17, TOK_LB=18, 
		TOK_RB=19, TOK_LCB=20, TOK_RCB=21, TOK_LP=22, TOK_RP=23, TOK_OP_REL=24, 
		TOK_OP_ADD=25, TOK_OP_TIMES=26, TOK_EQ=27, TOK_OP_NE=28, TOK_OP_LT=29, 
		TOK_OP_LE=30, TOK_OP_GT=31, TOK_OP_GE=32, TOK_OP_ASSIGN=33, OP_ADD_PLUS=34, 
		OP_ADD_MINUS=35, OP_MUL_TIMES=36, OP_MUL_DIV=37, OP_MUL_MOD=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WhiteSpace", "Comments", "Unknown", "TOK_PROGRAM", "TOK_CLASS", "TOK_FINAL", 
		"TOK_ELSE", "TOK_IF", "TOK_NEW", "TOK_READ", "TOK_RETURN", "TOK_VOID", 
		"TOK_WHILE", "TOK_PRINT", "TOK_COMMA", "TOK_SEMI", "TOK_DOT", "TOK_LB", 
		"TOK_RB", "TOK_LCB", "TOK_RCB", "TOK_LP", "TOK_RP", "TOK_OP_REL", "TOK_OP_ADD", 
		"TOK_OP_TIMES", "TOK_EQ", "TOK_OP_NE", "TOK_OP_LT", "TOK_OP_LE", "TOK_OP_GT", 
		"TOK_OP_GE", "TOK_OP_ASSIGN", "OP_ADD_PLUS", "OP_ADD_MINUS", "OP_MUL_TIMES", 
		"OP_MUL_DIV", "OP_MUL_MOD"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'program'", "'class'", "'final'", "'else'", "'if'", 
		"'new'", "'read'", "'return'", "'void'", "'while'", "'print'", "','", 
		"';'", "'.'", "'['", "']'", "'{'", "'}'", "'('", "')'", null, null, null, 
		"'=='", "'!='", "'<'", null, "'>'", null, "'='", "'+'", "'-'", "'*'", 
		"'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WhiteSpace", "Comments", "Unknown", "TOK_PROGRAM", "TOK_CLASS", 
		"TOK_FINAL", "TOK_ELSE", "TOK_IF", "TOK_NEW", "TOK_READ", "TOK_RETURN", 
		"TOK_VOID", "TOK_WHILE", "TOK_PRINT", "TOK_COMMA", "TOK_SEMI", "TOK_DOT", 
		"TOK_LB", "TOK_RB", "TOK_LCB", "TOK_RCB", "TOK_LP", "TOK_RP", "TOK_OP_REL", 
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
	      if(next.getType()==VariableType){
	        node=new SymbolTableNode();
	        node.type=getText();
	        toggle=1;
	      }
	      if(next.getType()==Identifier && toggle==1){
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
	      if(next.getType()==CbOpen){
	        count++;
	        tracker.add(count);
	        scope=count;
	      }
	      if(next.getType()==CbClose){
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u00dc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\7\3W\n\3\f\3\16\3Z\13\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\5\31\u00b6\n\31\3\32\3\32\5\32\u00ba\n\32\3\33\3\33\3\33\5\33"+
		"\u00bf\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 "+
		"\3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3X\2(\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(\3\2\4\5\2\13\f\17\17\"\"\6\2##%&BB``\2\u00e4\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5R\3\2\2\2\7^\3\2\2\2\t`\3\2\2\2\13h\3"+
		"\2\2\2\rn\3\2\2\2\17t\3\2\2\2\21y\3\2\2\2\23|\3\2\2\2\25\u0080\3\2\2\2"+
		"\27\u0085\3\2\2\2\31\u008c\3\2\2\2\33\u0091\3\2\2\2\35\u0097\3\2\2\2\37"+
		"\u009d\3\2\2\2!\u009f\3\2\2\2#\u00a1\3\2\2\2%\u00a3\3\2\2\2\'\u00a5\3"+
		"\2\2\2)\u00a7\3\2\2\2+\u00a9\3\2\2\2-\u00ab\3\2\2\2/\u00ad\3\2\2\2\61"+
		"\u00b5\3\2\2\2\63\u00b9\3\2\2\2\65\u00be\3\2\2\2\67\u00c0\3\2\2\29\u00c3"+
		"\3\2\2\2;\u00c6\3\2\2\2=\u00c8\3\2\2\2?\u00cb\3\2\2\2A\u00cd\3\2\2\2C"+
		"\u00d0\3\2\2\2E\u00d2\3\2\2\2G\u00d4\3\2\2\2I\u00d6\3\2\2\2K\u00d8\3\2"+
		"\2\2M\u00da\3\2\2\2OP\t\2\2\2PQ\b\2\2\2Q\4\3\2\2\2RS\7\61\2\2ST\7\61\2"+
		"\2TX\3\2\2\2UW\13\2\2\2VU\3\2\2\2WZ\3\2\2\2XY\3\2\2\2XV\3\2\2\2Y[\3\2"+
		"\2\2ZX\3\2\2\2[\\\7\f\2\2\\]\b\3\3\2]\6\3\2\2\2^_\t\3\2\2_\b\3\2\2\2`"+
		"a\7r\2\2ab\7t\2\2bc\7q\2\2cd\7i\2\2de\7t\2\2ef\7c\2\2fg\7o\2\2g\n\3\2"+
		"\2\2hi\7e\2\2ij\7n\2\2jk\7c\2\2kl\7u\2\2lm\7u\2\2m\f\3\2\2\2no\7h\2\2"+
		"op\7k\2\2pq\7p\2\2qr\7c\2\2rs\7n\2\2s\16\3\2\2\2tu\7g\2\2uv\7n\2\2vw\7"+
		"u\2\2wx\7g\2\2x\20\3\2\2\2yz\7k\2\2z{\7h\2\2{\22\3\2\2\2|}\7p\2\2}~\7"+
		"g\2\2~\177\7y\2\2\177\24\3\2\2\2\u0080\u0081\7t\2\2\u0081\u0082\7g\2\2"+
		"\u0082\u0083\7c\2\2\u0083\u0084\7f\2\2\u0084\26\3\2\2\2\u0085\u0086\7"+
		"t\2\2\u0086\u0087\7g\2\2\u0087\u0088\7v\2\2\u0088\u0089\7w\2\2\u0089\u008a"+
		"\7t\2\2\u008a\u008b\7p\2\2\u008b\30\3\2\2\2\u008c\u008d\7x\2\2\u008d\u008e"+
		"\7q\2\2\u008e\u008f\7k\2\2\u008f\u0090\7f\2\2\u0090\32\3\2\2\2\u0091\u0092"+
		"\7y\2\2\u0092\u0093\7j\2\2\u0093\u0094\7k\2\2\u0094\u0095\7n\2\2\u0095"+
		"\u0096\7g\2\2\u0096\34\3\2\2\2\u0097\u0098\7r\2\2\u0098\u0099\7t\2\2\u0099"+
		"\u009a\7k\2\2\u009a\u009b\7p\2\2\u009b\u009c\7v\2\2\u009c\36\3\2\2\2\u009d"+
		"\u009e\7.\2\2\u009e \3\2\2\2\u009f\u00a0\7=\2\2\u00a0\"\3\2\2\2\u00a1"+
		"\u00a2\7\60\2\2\u00a2$\3\2\2\2\u00a3\u00a4\7]\2\2\u00a4&\3\2\2\2\u00a5"+
		"\u00a6\7_\2\2\u00a6(\3\2\2\2\u00a7\u00a8\7}\2\2\u00a8*\3\2\2\2\u00a9\u00aa"+
		"\7\177\2\2\u00aa,\3\2\2\2\u00ab\u00ac\7*\2\2\u00ac.\3\2\2\2\u00ad\u00ae"+
		"\7+\2\2\u00ae\60\3\2\2\2\u00af\u00b6\5\67\34\2\u00b0\u00b6\59\35\2\u00b1"+
		"\u00b6\5;\36\2\u00b2\u00b6\5=\37\2\u00b3\u00b6\5? \2\u00b4\u00b6\5A!\2"+
		"\u00b5\u00af\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b5\u00b2"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\62\3\2\2\2\u00b7"+
		"\u00ba\5E#\2\u00b8\u00ba\5G$\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2"+
		"\u00ba\64\3\2\2\2\u00bb\u00bf\5I%\2\u00bc\u00bf\5K&\2\u00bd\u00bf\5M\'"+
		"\2\u00be\u00bb\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\66"+
		"\3\2\2\2\u00c0\u00c1\7?\2\2\u00c1\u00c2\7?\2\2\u00c28\3\2\2\2\u00c3\u00c4"+
		"\7#\2\2\u00c4\u00c5\7?\2\2\u00c5:\3\2\2\2\u00c6\u00c7\7>\2\2\u00c7<\3"+
		"\2\2\2\u00c8\u00c9\7>\2\2\u00c9\u00ca\7?\2\2\u00ca>\3\2\2\2\u00cb\u00cc"+
		"\7@\2\2\u00cc@\3\2\2\2\u00cd\u00ce\7>\2\2\u00ce\u00cf\7?\2\2\u00cfB\3"+
		"\2\2\2\u00d0\u00d1\7?\2\2\u00d1D\3\2\2\2\u00d2\u00d3\7-\2\2\u00d3F\3\2"+
		"\2\2\u00d4\u00d5\7/\2\2\u00d5H\3\2\2\2\u00d6\u00d7\7,\2\2\u00d7J\3\2\2"+
		"\2\u00d8\u00d9\7\61\2\2\u00d9L\3\2\2\2\u00da\u00db\7\'\2\2\u00dbN\3\2"+
		"\2\2\7\2X\u00b5\u00b9\u00be\4\3\2\2\3\3\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}