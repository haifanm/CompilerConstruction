grammar gr;

options{
    language=Java;
}


//The following code is so that any unknown characters result in printing of an error statement and continuing.
@lexer::header{
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

}
@lexer::members{
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
}
@parser:: members{
grLexer lexer;
public void setLexer(grLexer lexer){
			this.lexer=lexer;
		}
}
@parser::header{
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

}

WhiteSpace: (' ' | '\n'| '\r'| '\t'){skip();};
Comments: '//'.*?'\n'{skip();};
Unknown: '!'|'@'|'#'|'$'|'^';

//Rules
program: TOK_PROGRAM ident (constDecl | varDecl | varDeclAssi | classDecl)*
        TOK_LCB (methodDecl)+ TOK_RCB ;


ident: TOK_IDENTIFIER;

constDecl: TOK_FINAL varDecl ;

varDecl: TOK_TYPE;

TOK_IDENTIFIER: TOK_LETTER (TOK_LETTER|TOK_DIGIT)*;
TOK_LETTER: [a-zA-Z];
TOK_DIGIT: [0-9];

TOK_TYPE: TOK_TYPE_INT | TOK_TYPE_CHAR;

//Keywords
TOK_PROGRAM : 'program';
TOK_CLASS : 'class';
TOK_FINAL : 'final';
TOK_ELSE : 'else';
TOK_IF : 'if';
TOK_NEW : 'new';
TOK_READ : 'read';
TOK_RETURN : 'return';
TOK_VOID : 'void';
TOK_WHILE : 'while';
TOK_PRINT : 'print';
TOK_TYPE_INT: 'int';
TOK_TYPE_CHAR: 'char';

//MicroJava Delimiters
TOK_COMMA : ',';
TOK_SEMI : ';';
TOK_DOT : '.';
TOK_LB : '[';
TOK_RB : ']';
TOK_LCB : '{' ;
TOK_RCB : '}';
TOK_LP : '(';
TOK_RP : ')';

//MicroJava Operators
TOK_OP_REL : TOK_EQ
   | TOK_OP_NE
   | TOK_OP_LT
   | TOK_OP_LE
   | TOK_OP_GT
   | TOK_OP_GE;

TOK_OP_ADD : OP_ADD_PLUS
   | OP_ADD_MINUS ;


TOK_OP_TIMES : OP_MUL_TIMES //OPP_MUL_TIMES
| OP_MUL_DIV
| OP_MUL_MOD;

//OPERATOR TOKENS
TOK_EQ:'==';
TOK_OP_NE: '!=';
TOK_OP_LT: '<';
TOK_OP_LE: '<=';
TOK_OP_GT: '>';
TOK_OP_GE: '<=';
TOK_OP_ASSIGN : '=' ;// OP_ASSIGN
OP_ADD_PLUS: '+';
OP_ADD_MINUS: '-';
OP_MUL_TIMES:'*';
OP_MUL_DIV:'/';
OP_MUL_MOD:'%';