import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.Parser.TraceListener;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.prefs.NodeChangeListener;

public class myclass  {
    public static void main (String args[]) throws java.io.IOException {
        grLexer lexer = new grLexer( CharStreams.fromFileName("C:\\Users\\User\\IdeaProjects\\newproject\\src\\sample.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        lexer.getAllTokens();
        grParser parser = new grParser(tokens);
        parser.setLexer(lexer);
        System.out.println("tempstack: ");
        Arrays.toString(lexer.tempStack.toArray());
        System.out.println("nodestack: ");
        Arrays.toString(lexer.nodeStack.toArray());

    }
}
