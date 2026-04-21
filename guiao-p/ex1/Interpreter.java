import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends StrLangBaseVisitor<String> {
   private Map<String,String> variables = new HashMap<>();

   @Override public String visitStatPrint(StrLangParser.StatPrintContext ctx) {
      String res = visit(ctx.expr());
      if(res != null) {
         System.out.println(res);
      }
      return res;
   }

   @Override public String visitStatAssignment(StrLangParser.StatAssignmentContext ctx) {
      String res = visit(ctx.expr());
      String id = ctx.ID().getText();
      if(res != null) {
         variables.put(id, res);
      }
      return res;
   }

   @Override public String visitExprString(StrLangParser.ExprStringContext ctx) {
      String res = ctx.STRING().getText();;
      return res;
   }

   @Override public String visitExprID(StrLangParser.ExprIDContext ctx) {
      String res = ctx.ID().getText();
      if(variables.containsKey(res)) {
         return variables.get(res);
      }
      return res;
   }

   @Override public String visitExprInput(StrLangParser.ExprInputContext ctx) {
      System.out.print("Input: ");
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
      return input;
   }
}
