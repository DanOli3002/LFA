import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends FracLangBaseVisitor<Integer> {
   private final Map<String, Integer> variables = new HashMap<>();

   @Override public Integer visitProgram(FracLangParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Integer visitStatDisplay(FracLangParser.StatDisplayContext ctx) {
      Integer value = visit(ctx.expr());
      System.out.println(format(value));
      return null;
   }

   @Override public Integer visitStatAssignment(FracLangParser.StatAssignmentContext ctx) {
      Integer value = visit(ctx.expr());
      variables.put(ctx.ID().getText(), value);
      return null;
   }
   
   @Override public Integer visitExprParens(FracLangParser.ExprParensContext ctx) {
      return visit(ctx.expr());
   }

   @Override public Integer visitExprNumber(FracLangParser.ExprNumberContext ctx) {
      int n = Integer.parseInt(ctx.NUMBER().getText());
      return pack(n, 1);
   }

   @Override public Integer visitExprId(FracLangParser.ExprIdContext ctx) {
      String id = ctx.ID().getText();
      Integer value = variables.get(id);
      if (value == null) {
         throw new RuntimeException("Semantic error: variable '" + id + "' is not defined");
      }
      return value;
   }

   @Override public Integer visitExprFraction(FracLangParser.ExprFractionContext ctx) {
      int left = visit(ctx.expr(0));
      int right = visit(ctx.expr(1));

      return pack(left, right);
   }

   private static int pack(int numerator, int denominator) {
      if (denominator == 0) {
         throw new ArithmeticException("Denominator cannot be zero");
      }

      int n = numerator;
      int d = denominator;
      if (d < 0) {
         n = -n;
         d = -d;
      }

      return (n << 16) | d;
   }

   private static int num(int packed) {
      return packed >> 16;
   }

   private static int den(int packed) {
      return packed;
   }

   private static String format(int packed) {
      int n = num(packed);
      int d = den(packed);
      if (d == 1) {
         return Integer.toString(n);
      }
      return n + "/" + d;
   }
}
