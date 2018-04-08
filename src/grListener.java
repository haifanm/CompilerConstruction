// Generated from C:/Users/User/IdeaProjects/newproject/src\gr.g4 by ANTLR 4.7

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grParser}.
 */
public interface grListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(grParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(grParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#cbOpen}.
	 * @param ctx the parse tree
	 */
	void enterCbOpen(grParser.CbOpenContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#cbOpen}.
	 * @param ctx the parse tree
	 */
	void exitCbOpen(grParser.CbOpenContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#cbClose}.
	 * @param ctx the parse tree
	 */
	void enterCbClose(grParser.CbCloseContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#cbClose}.
	 * @param ctx the parse tree
	 */
	void exitCbClose(grParser.CbCloseContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#progStart}.
	 * @param ctx the parse tree
	 */
	void enterProgStart(grParser.ProgStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#progStart}.
	 * @param ctx the parse tree
	 */
	void exitProgStart(grParser.ProgStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(grParser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(grParser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#equals}.
	 * @param ctx the parse tree
	 */
	void enterEquals(grParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#equals}.
	 * @param ctx the parse tree
	 */
	void exitEquals(grParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#semi}.
	 * @param ctx the parse tree
	 */
	void enterSemi(grParser.SemiContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#semi}.
	 * @param ctx the parse tree
	 */
	void exitSemi(grParser.SemiContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(grParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(grParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#chara}.
	 * @param ctx the parse tree
	 */
	void enterChara(grParser.CharaContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#chara}.
	 * @param ctx the parse tree
	 */
	void exitChara(grParser.CharaContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#fin}.
	 * @param ctx the parse tree
	 */
	void enterFin(grParser.FinContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#fin}.
	 * @param ctx the parse tree
	 */
	void exitFin(grParser.FinContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(grParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(grParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#cl}.
	 * @param ctx the parse tree
	 */
	void enterCl(grParser.ClContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#cl}.
	 * @param ctx the parse tree
	 */
	void exitCl(grParser.ClContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(grParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(grParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(grParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(grParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#methodType}.
	 * @param ctx the parse tree
	 */
	void enterMethodType(grParser.MethodTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#methodType}.
	 * @param ctx the parse tree
	 */
	void exitMethodType(grParser.MethodTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#vd}.
	 * @param ctx the parse tree
	 */
	void enterVd(grParser.VdContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#vd}.
	 * @param ctx the parse tree
	 */
	void exitVd(grParser.VdContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#formPars}.
	 * @param ctx the parse tree
	 */
	void enterFormPars(grParser.FormParsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#formPars}.
	 * @param ctx the parse tree
	 */
	void exitFormPars(grParser.FormParsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#pOpen}.
	 * @param ctx the parse tree
	 */
	void enterPOpen(grParser.POpenContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#pOpen}.
	 * @param ctx the parse tree
	 */
	void exitPOpen(grParser.POpenContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#pClose}.
	 * @param ctx the parse tree
	 */
	void enterPClose(grParser.PCloseContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#pClose}.
	 * @param ctx the parse tree
	 */
	void exitPClose(grParser.PCloseContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#comma}.
	 * @param ctx the parse tree
	 */
	void enterComma(grParser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#comma}.
	 * @param ctx the parse tree
	 */
	void exitComma(grParser.CommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(grParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(grParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#terminated}.
	 * @param ctx the parse tree
	 */
	void enterTerminated(grParser.TerminatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#terminated}.
	 * @param ctx the parse tree
	 */
	void exitTerminated(grParser.TerminatedContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(grParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(grParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(grParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(grParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#unterminated}.
	 * @param ctx the parse tree
	 */
	void enterUnterminated(grParser.UnterminatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#unterminated}.
	 * @param ctx the parse tree
	 */
	void exitUnterminated(grParser.UnterminatedContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(grParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(grParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#bracketOpen}.
	 * @param ctx the parse tree
	 */
	void enterBracketOpen(grParser.BracketOpenContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#bracketOpen}.
	 * @param ctx the parse tree
	 */
	void exitBracketOpen(grParser.BracketOpenContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#bracketClose}.
	 * @param ctx the parse tree
	 */
	void enterBracketClose(grParser.BracketCloseContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#bracketClose}.
	 * @param ctx the parse tree
	 */
	void exitBracketClose(grParser.BracketCloseContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(grParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(grParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(grParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(grParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#iff}.
	 * @param ctx the parse tree
	 */
	void enterIff(grParser.IffContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#iff}.
	 * @param ctx the parse tree
	 */
	void exitIff(grParser.IffContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#mif}.
	 * @param ctx the parse tree
	 */
	void enterMif(grParser.MifContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#mif}.
	 * @param ctx the parse tree
	 */
	void exitMif(grParser.MifContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#uif}.
	 * @param ctx the parse tree
	 */
	void enterUif(grParser.UifContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#uif}.
	 * @param ctx the parse tree
	 */
	void exitUif(grParser.UifContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#ifKey}.
	 * @param ctx the parse tree
	 */
	void enterIfKey(grParser.IfKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#ifKey}.
	 * @param ctx the parse tree
	 */
	void exitIfKey(grParser.IfKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#el}.
	 * @param ctx the parse tree
	 */
	void enterEl(grParser.ElContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#el}.
	 * @param ctx the parse tree
	 */
	void exitEl(grParser.ElContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#whileKey}.
	 * @param ctx the parse tree
	 */
	void enterWhileKey(grParser.WhileKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#whileKey}.
	 * @param ctx the parse tree
	 */
	void exitWhileKey(grParser.WhileKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#returnKey}.
	 * @param ctx the parse tree
	 */
	void enterReturnKey(grParser.ReturnKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#returnKey}.
	 * @param ctx the parse tree
	 */
	void exitReturnKey(grParser.ReturnKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#readKey}.
	 * @param ctx the parse tree
	 */
	void enterReadKey(grParser.ReadKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#readKey}.
	 * @param ctx the parse tree
	 */
	void exitReadKey(grParser.ReadKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#printKey}.
	 * @param ctx the parse tree
	 */
	void enterPrintKey(grParser.PrintKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#printKey}.
	 * @param ctx the parse tree
	 */
	void exitPrintKey(grParser.PrintKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(grParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(grParser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#actPars}.
	 * @param ctx the parse tree
	 */
	void enterActPars(grParser.ActParsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#actPars}.
	 * @param ctx the parse tree
	 */
	void exitActPars(grParser.ActParsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(grParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(grParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(grParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(grParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#equalsEquals}.
	 * @param ctx the parse tree
	 */
	void enterEqualsEquals(grParser.EqualsEqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#equalsEquals}.
	 * @param ctx the parse tree
	 */
	void exitEqualsEquals(grParser.EqualsEqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#notEquals}.
	 * @param ctx the parse tree
	 */
	void enterNotEquals(grParser.NotEqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#notEquals}.
	 * @param ctx the parse tree
	 */
	void exitNotEquals(grParser.NotEqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#greaterThan}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(grParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#greaterThan}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(grParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#greaterThanOrEq}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanOrEq(grParser.GreaterThanOrEqContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#greaterThanOrEq}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanOrEq(grParser.GreaterThanOrEqContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#lessThan}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(grParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#lessThan}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(grParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#lessThanOrEq}.
	 * @param ctx the parse tree
	 */
	void enterLessThanOrEq(grParser.LessThanOrEqContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#lessThanOrEq}.
	 * @param ctx the parse tree
	 */
	void exitLessThanOrEq(grParser.LessThanOrEqContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr(grParser.BoolexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr(grParser.BoolexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#boolterm}.
	 * @param ctx the parse tree
	 */
	void enterBoolterm(grParser.BooltermContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#boolterm}.
	 * @param ctx the parse tree
	 */
	void exitBoolterm(grParser.BooltermContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#boolfactor}.
	 * @param ctx the parse tree
	 */
	void enterBoolfactor(grParser.BoolfactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#boolfactor}.
	 * @param ctx the parse tree
	 */
	void exitBoolfactor(grParser.BoolfactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(grParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(grParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(grParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(grParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#booland}.
	 * @param ctx the parse tree
	 */
	void enterBooland(grParser.BoolandContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#booland}.
	 * @param ctx the parse tree
	 */
	void exitBooland(grParser.BoolandContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#boolor}.
	 * @param ctx the parse tree
	 */
	void enterBoolor(grParser.BoolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#boolor}.
	 * @param ctx the parse tree
	 */
	void exitBoolor(grParser.BoolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(grParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(grParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#minus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(grParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#minus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(grParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(grParser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(grParser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(grParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(grParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(grParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(grParser.MulopContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(grParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(grParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#newKey}.
	 * @param ctx the parse tree
	 */
	void enterNewKey(grParser.NewKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#newKey}.
	 * @param ctx the parse tree
	 */
	void exitNewKey(grParser.NewKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(grParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(grParser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#dot}.
	 * @param ctx the parse tree
	 */
	void enterDot(grParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#dot}.
	 * @param ctx the parse tree
	 */
	void exitDot(grParser.DotContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(grParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(grParser.IdentContext ctx);
}