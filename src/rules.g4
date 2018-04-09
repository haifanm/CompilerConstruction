grammar rules;

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

  public static void putInNode(){


  }
  //return true if word "final" is mentioned before the id(type)
  //most probably going to be deleted
  public static boolean isFinal(){
    return isFinal;     //static boolean (not declared yet)
  }

  /*
  adds elements in last subtree
  deletes last list
  adds last subtree to last list (append as child)
  dalates last subtree
  */
  public static void moveLastListToLastSubtree(){
  }
  //creates a new list
  public static void createList(){
  }
  //create a node of the passed info and append it to last list
  public static void addToLastList(String type, String name){
  }
  //creates a new subtree with root is the node created of the passed info
  public static void createSubtree(String type, String name){
  }
  static String readType="";

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

WhiteSpace: (' ' | TOK_SPECIAL_CHARS)+{skip();};
Comments: '//'.*?'\n'{skip();};

//Rules
program: TOK_PROGRAM    {createList();}
        TOK_IDENTIFIER  {createSubtree(type,name);}
            (constDecl
            | varDecl
            | classDecl         )*
        TOK_LCB
            (methodDecl         )+
        TOK_RCB ;


varDecl: TOK_TYPE       {readType=type; createList(); addToLastList(type,name);}
        TOK_IDENTIFIER  {createSubtree(type,name);}
        (
        TOK_COMMA       {moveLastListToLastSubtree();}
        TOK_IDENTIFIER  {createSubtree(readType,name);}
        )*
        TOK_SEMI        {moveLastListToLastSubtree();}   ;


constDecl: TOK_FINAL    {createList(); addToLastList(type,name);}
        TOK_TYPE        {addToLastList(type,name);}
        TOK_IDENTIFIER  {createSubtree(type,name);}
        TOK_OP_ASSIGN   {addToLastList(type,name);}
        (
        TOK_VALUE       {addToLastList(type,name);}
        )
        TOK_SEMI        {moveLastListToLastSubtree();}  ;


classDecl: TOK_CLASS TOK_IDENTIFIER TOK_LCB varDecl* TOK_RCB;
methodDecl: (TOK_TYPE | TOK_VOID) TOK_IDENTIFIER TOK_LP formPars? TOK_RP varDecl* block;
formPars: TOK_TYPE TOK_IDENTIFIER (TOK_COMMA TOK_TYPE TOK_IDENTIFIER)*;
block: TOK_LCB (statement)* TOK_RCB;

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
TOK_INVALID_IDENTIFIER: '_' TOK_IDENTIFIER
  | TOK_DIGIT TOK_IDENTIFIER {lexError=true;    System.out.println("lexical error");};
TOK_TYPE:TOK_IDENTIFIER (TOK_LB TOK_RB)?;
TOK_DIGIT: [0-9];
TOK_LETTER: [a-zA-Z];
TOK_ASCII_CHARS: [\u0020-\u007E];       //CHARACTER WITH ASCII BTW 32 AND 126
TOK_SPECIAL_CHARS: '\n' | '\t' | '\r'  ;
TOK_CHAR_INT: TOK_TYPE_INT | TOK_TYPE_CHAR;

TOK_VALUE: TOK_INT | TOK_CHAR;
TOK_CHAR: TOK_SINGLEQUOTE TOK_CHAR_VALUE TOK_SINGLEQUOTE;
TOK_CHAR_VALUE: TOK_DIGIT | TOK_LETTER | TOK_SPECIAL_CHARS | TOK_ASCII_CHARS;
TOK_INVALID_CHAR: '\'' (TOK_CHAR)? ~('\''){lexError=true;};
UNRECOGNIZED_SYMBOL: . {lexError=true;};
//A char literal : digit|letter|special characters:‘\n’‘\t’‘\r’|characters with ASCII btw 32&126
//max value on int:
TOK_INT: TOK_DIGIT+{ long y= Long.parseLong(getText());
                     if(y>2147483647){
                     lexError=true;
                     System.out.println("lexical error");}      };
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
TOK_OP_ASSIGN : '=' ;// OP_ASSIGN
TOK_OP_REL : OP_REL_EQ
   | OP_REL_NE
   | OP_REL_LT
   | OP_REL_LE
   | OP_REL_GT
   | OP_REL_GE;
TOK_OP_ADD : OP_ADD_PLUS
   | OP_ADD_MINUS ;
TOK_OP_TIMES : OP_MUL_TIMES //OPP_MUL_TIMES
| OP_MUL_DIV
| OP_MUL_MOD;
//OPERATOR TOKENS
OP_REL_EQ:'==';
OP_REL_NE: '!=';
OP_REL_LT: '<';
OP_REL_LE: '<=';
OP_REL_GT: '>';
OP_REL_GE: '<=';
OP_ADD_PLUS: '+';
OP_ADD_MINUS: '-';
OP_MUL_TIMES:'*';
OP_MUL_DIV:'/';
OP_MUL_MOD:'%';
TOK_W: 'A';