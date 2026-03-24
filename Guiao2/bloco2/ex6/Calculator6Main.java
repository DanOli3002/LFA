import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Calculator6Main {
   public static void main(String[] args) {
      try {
         Interpreter visitor0 = new Interpreter();
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         String line;
         while ((line = reader.readLine()) != null) {
            CharStream input = CharStreams.fromString(line + "\n");
            Calculator6Lexer lexer = new Calculator6Lexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Calculator6Parser parser = new Calculator6Parser(tokens);

            ParseTree tree = parser.stat();
            if (parser.getNumberOfSyntaxErrors() == 0) {
               visitor0.visit(tree);
            }
         }
      }
      catch(IOException e) {
         e.printStackTrace();
         System.exit(1);
      }
      catch(RecognitionException e) {
         e.printStackTrace();
         System.exit(1);
      }
   }
}