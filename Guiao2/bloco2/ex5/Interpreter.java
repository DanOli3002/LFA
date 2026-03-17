import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends NumbersBaseVisitor<String> {

   private final Map<String, String> env = new HashMap<>();

   public Interpreter() {
      loadDictionary("numbers.txt");
   }

   public Interpreter(String dictionaryPath) {
      loadDictionary(dictionaryPath);
   }

   private void loadDictionary(String dictionaryPath) {
      try (Scanner scanner = new Scanner(new File(dictionaryPath))) {
         while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) {
               continue;
            }
            String[] parts = line.split(" - ");
            if (parts.length == 2) {
               env.put(parts[1].toLowerCase(), parts[0]);
            }
         }
      } catch (FileNotFoundException e) {
         System.err.println("ERROR: File not found");
      }
   }

   @Override public String visitProg(NumbersParser.ProgContext ctx) {
      for (NumbersParser.LineContext line : ctx.line()) {
         String converted = visit(line);
         if (converted != null && !converted.isEmpty()) {
            System.out.println(converted);
         }
      }
      return null;
   }

   @Override public String visitLine(NumbersParser.LineContext ctx) {
      if (ctx.words() == null) {
         return "";
      }
      return visit(ctx.words());
   }

   @Override public String visitWords(NumbersParser.WordsContext ctx) {
      StringBuilder result = new StringBuilder();
      for (int i = 0; i < ctx.WORD().size(); i++) {
         String word = ctx.WORD(i).getText().toLowerCase();
         String value = env.getOrDefault(word, word);
         if (i > 0) {
            result.append(' ');
         }
         result.append(value);
      }
      return result.toString();
   }
}
