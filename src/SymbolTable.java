import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

public final class SymbolTable {
    public static BST symbolTable=new BST();

    public static BST SymbolTable()  {
        return symbolTable;
    }

    public static void insert(String name, String type, int scope) {
        symbolTable.put(name, type,scope);
    }
    public static void remove(String name){
        symbolTable.remove(name);
    }
    public static void insert(SymbolTableNode node){
        symbolTable.put(node.name, node.type,node.scope);
    }

    public static void print() {
            BSTPrinter printer=new BSTPrinter();
            printer.printNode(symbolTable.root);
    }
    public static Object get(String name){
        if(!(symbolTable.root==null)) {
            return symbolTable.root.find(name);
        }
        return null;
    }
}
