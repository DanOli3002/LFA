import java.util.Scanner;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class NumbersMain {
   public static void main(String[] args) {
      Interpreter visitor0 = new Interpreter();
      try (Scanner scanner = new Scanner(System.in)) {
         while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            CharStream input = CharStreams.fromString(line + "\n");
            NumbersLexer lexer = new NumbersLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            NumbersParser parser = new NumbersParser(tokens);
            ParseTree tree = parser.prog();
            if (parser.getNumberOfSyntaxErrors() == 0) {
               visitor0.visit(tree);
            }
         }
      }
   }
}
