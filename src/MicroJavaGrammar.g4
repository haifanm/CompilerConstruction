grammar MicroJavaGrammar;

options{
    language=Java;
}

@header{
import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
}

@lexer::members{
  static boolean lexicalError=false;
}

//MicroJava Keywords
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
TOK_OP_REL : '==' //OP_EQ
   | '!=' //OP_NE
   | '<'  //OP_LT
   | '<='  //OP_LE
   | '>'   //OP_GT
   | '>='; //OP_GE
TOK_OP_ASSIGN : '=' ;// OP_ASSIGN
TOK_OP_ADD : '+' //OP_ADD_PLUS
   | '-' ;//OP_ADD_MINUS
TOK_OP_TIMES : '*' //OPP_MUL_TIMES
| '/'  //OP_MUL_DIV
| '%'; //OP_MUL_MOD

//MicroJava Comments
Comment: '//'.*?'\n'{skip();};
WhiteSpace: ('\r'| '\t'| '\n'|' ')+ {skip();};
//MicroJava Tokens:
TOK_INTLIT : (DIGIT)+{
long y= Long.parseLong(getText());
if(y>2147483647){
lexicalError=true;
}

};
TOK_INVALID_IDENTIFIER: '_' TOK_IDENTIFIER
  | DIGIT TOK_IDENTIFIER {lexicalError=true;};
TOK_IDENTIFIER : LETTER (LETTER|DIGIT)*;
TOK_INVALID_CHARLIT: '\'' (TOK_CHARLIT)? ~('\''){lexicalError=true;};
TOK_CHARLIT: '\''(LETTER|DIGIT|'\\n'|'\\r'|'\\t')'\'';
UNRECOGNIZED_SYMBOL: . {lexicalError=true;};

 //fragments
fragment LETTER: [a-zA-Z];
fragment DIGIT: [0-9];
fragment ESCAPE: '\\' ('n'|'r'|'t');
fragment KEYWORD: 'program'
| 'class'
| 'final'
| 'else'
| 'if'
| 'new'
| 'read'
| 'return'
| 'void'
| 'while'
| 'print';

prog: TOK_PROGRAM TOK_IDENTIFIER (constDecl|varDecl|classDecl)* TOK_LCB (methodDecl)* TOK_RCB;

varDecl: varType TOK_IDENTIFIER  (TOK_COMMA TOK_IDENTIFIER)* TOK_SEMI;

constDecl: TOK_FINAL varType TOK_IDENTIFIER TOK_OP_ASSIGN (TOK_INTLIT|TOK_CHARLIT) TOK_SEMI;
classDecl: TOK_CLASS  TOK_IDENTIFIER TOK_LCB (varDecl)* TOK_RCB ;
methodDecl: (varType| TOK_VOID) TOK_IDENTIFIER TOK_LP (formPars)? TOK_RP (varDecl)* block;
formPars: varType TOK_IDENTIFIER (TOK_COMMA varType TOK_IDENTIFIER)*;
block: TOK_LCB (statement)* TOK_RCB;
statement: designator (TOK_OP_ASSIGN expr|actPars) TOK_SEMI
| TOK_IF TOK_LP  condition TOK_RP (TOK_LCB)? (statement)* (TOK_RCB)? (TOK_ELSE (TOK_LCB)? statement (TOK_RCB)?)*
| TOK_WHILE TOK_LP condition TOK_RP statement
| TOK_RETURN (expr)? TOK_SEMI
| TOK_READ TOK_LP designator TOK_RP TOK_SEMI
| TOK_PRINT TOK_LP expr (TOK_COMMA TOK_INTLIT)? TOK_RP TOK_SEMI
|  block
| TOK_SEMI;
actPars: TOK_LP (expr (TOK_COMMA expr)*)? TOK_RP;
condition: expr relop expr;
relop: TOK_OP_REL;
expr: ('-')? term  (TOK_OP_ADD term)*;
term: factor (TOK_OP_TIMES factor)*;
factor: designator (actPars)?
| TOK_INTLIT
| TOK_CHARLIT
| TOK_NEW x
| TOK_LP expr TOK_RP;
designator: TOK_IDENTIFIER (TOK_DOT TOK_IDENTIFIER | TOK_LB expr TOK_RB)*;
x:TOK_IDENTIFIER ((TOK_LP expr TOK_RP)?|(TOK_LB (expr)? TOK_RB)*);

varType: TOK_IDENTIFIER (TOK_LB TOK_RB)?;