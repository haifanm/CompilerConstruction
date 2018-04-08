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
Unknown: '!'|'@'|'#'|'$'|'^';       //delete

//Rules
program: TOK_PROGRAM TOK_IDENTIFIER (constDecl | varDecl | classDecl)*
        TOK_LCB (methodDecl)+ TOK_RCB ;

varDecl: TOK_TYPE TOK_IDENTIFIER (TOK_COMMA TOK_IDENTIFIER)* TOK_SEMI;
constDecl: TOK_FINAL TOK_TYPE TOK_IDENTIFIER TOK_OP_ASSIGN (TOK_LETTER+|TOK_CHAR) TOK_SEMI;
classDecl: TOK_CLASS TOK_IDENTIFIER TOK_LCB varDecl* TOK_RCB;
methodDecl: (TOK_TYPE | TOK_VOID) TOK_IDENTIFIER TOK_LP formPars? TOK_RP varDecl* block;
formPars: TOK_TYPE TOK_IDENTIFIER (TOK_COMMA TOK_TYPE TOK_IDENTIFIER)*;
block: TOK_LCB (statement)* TOK_RCB;

//arrayAssi: TOK_IDENTIFIER TOK_OP_ASSIGN TOK_NEW TOK_TYPE TOK_LB TOK_DIGIT+ TOK_RB TOK_SEMI; //array1= new int[20];
//arrayAssiValues: TOK_IDENTIFIER TOK_OP_ASSIGN actPars TOK_SEMI;       //array2= (1,2,3,4,5,6);        fill the whole array
//arrayAddValue: arrayIndex TOK_OP_ASSIGN TOK_VALUE TOK_SEMI;        //array3[2]= 'd';

statement: designator (TOK_OP_ASSIGN expr | actPars) TOK_SEMI
            | TOK_IF TOK_LP condition TOK_RP statement (TOK_ELSE statement)?
            | TOK_WHILE TOK_LP condition TOK_RP statement
            | methodreturn
            | read
            | print
            | block
            | TOK_SEMI;

designator: TOK_IDENTIFIER (TOK_DOT TOK_IDENTIFIER | TOK_LB expr TOK_RB)*;
actPars: TOK_LP (expr (TOK_COMMA expr)*)? TOK_RP;

methodreturn: TOK_RETURN expr? TOK_SEMI;
read: TOK_READ TOK_LP designator TOK_RP TOK_SEMI;
print: TOK_PRINT TOK_LP expr (TOK_COMMA TOK_DIGIT+)? TOK_RP TOK_SEMI;

condition: expr relop expr;
relop: TOK_OP_REL;
///expr:
expr: (TOK_MINUS)? term (addop term)*;
term: factor (mulop factor)*;
factor: designator actPars?
           | TOK_DIGIT+
           | TOK_CHAR
           | TOK_NEW TOK_IDENTIFIER (TOK_LB expr TOK_RB)?
           | TOK_LP expr TOK_RP ;
addop: TOK_OP_ADD;
mulop: TOK_OP_TIMES;

TOK_IDENTIFIER: TOK_LETTER (TOK_LETTER|TOK_DIGIT)*;
TOK_TYPE:TOK_IDENTIFIER (TOK_LB TOK_RB)?;
TOK_DIGIT: [0-9];
TOK_LETTER: [a-zA-Z];
TOK_ASCII_CHARS: [\u0020-\u007E];
TOK_SPECIAL_CHARS: '\n' | '\t' | '\r'  ;
TOK_CHAR_INT: TOK_TYPE_INT | TOK_TYPE_CHAR;
TOK_VALUE: TOK_DIGIT+ | TOK_SINGLEQUOTE TOK_LETTER TOK_SINGLEQUOTE;
TOK_CHAR: TOK_SINGLEQUOTE TOK_DIGIT TOK_SINGLEQUOTE| TOK_SINGLEQUOTE TOK_LETTER TOK_SINGLEQUOTE | TOK_SPECIAL_CHARS | TOK_ASCII_CHARS ;
TOK_INT: TOK_DIGIT+;
//A char literal : digit|letter|special characters:‘\n’‘\t’‘\r’|characters with ASCII btw 32&126

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
TOK_MINUS : '-';
TOK_SINGLEQUOTE:'\'';
TOK_DOUBLEQUOTE: '"';
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
