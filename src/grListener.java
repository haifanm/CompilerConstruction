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
	 * Enter a parse tree produced by {@link grParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(grParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(grParser.IdentContext ctx);
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
	 * Enter a parse tree produced by {@link grParser#intCharDecl}.
	 * @param ctx the parse tree
	 */
	void enterIntCharDecl(grParser.IntCharDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#intCharDecl}.
	 * @param ctx the parse tree
	 */
	void exitIntCharDecl(grParser.IntCharDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#varDeclSEMI}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclSEMI(grParser.VarDeclSEMIContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#varDeclSEMI}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclSEMI(grParser.VarDeclSEMIContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#varDeclAssi}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclAssi(grParser.VarDeclAssiContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#varDeclAssi}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclAssi(grParser.VarDeclAssiContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#arrayDecl}.
	 * @param ctx the parse tree
	 */
	void enterArrayDecl(grParser.ArrayDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#arrayDecl}.
	 * @param ctx the parse tree
	 */
	void exitArrayDecl(grParser.ArrayDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#arrayDeclSEMI}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclSEMI(grParser.ArrayDeclSEMIContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#arrayDeclSEMI}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclSEMI(grParser.ArrayDeclSEMIContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#arrayDeclAssi}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclAssi(grParser.ArrayDeclAssiContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#arrayDeclAssi}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclAssi(grParser.ArrayDeclAssiContext ctx);
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
	 * Enter a parse tree produced by {@link grParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(grParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(grParser.MethodDeclContext ctx);
}