import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends Calculator_fractionsBaseVisitor<long[]> {

   private final Map<String, long[]> vars = new HashMap<>();
   private final Scanner scanner = new Scanner(System.in);

   // Utility methods for fraction operations
   private static long gcd(long a, long b) {
      a = Math.abs(a);
      b = Math.abs(b);
      while (b != 0) {
         long temp = b;
         b = a % b;
         a = temp;
      }
      return a;
   }

   private static long[] reduce(long num, long den) {
      if (den == 0) throw new ArithmeticException("Division by zero");
      if (den < 0) {
         num = -num;
         den = -den;
      }
      long g = gcd(num, den);
      return new long[]{num / g, den / g};
   }

   private static long[] add(long[] a, long[] b) {
      long num = a[0] * b[1] + b[0] * a[1];
      long den = a[1] * b[1];
      return reduce(num, den);
   }

   private static long[] subtract(long[] a, long[] b) {
      long num = a[0] * b[1] - b[0] * a[1];
      long den = a[1] * b[1];
      return reduce(num, den);
   }

   private static long[] multiply(long[] a, long[] b) {
      long num = a[0] * b[0];
      long den = a[1] * b[1];
      return reduce(num, den);
   }

   private static long[] divide(long[] a, long[] b) {
      if (b[0] == 0) throw new ArithmeticException("Division by zero");
      long num = a[0] * b[1];
      long den = a[1] * b[0];
      return reduce(num, den);
   }

   private static long[] power(long[] base, long exponent) {
      if (exponent == 0) return new long[]{1, 1};
      if (exponent < 0) {
         long[] inverted = new long[]{base[1], base[0]};
         return power(inverted, -exponent);
      }
      long[] result = new long[]{1, 1};
      for (long i = 0; i < exponent; i++) {
         result = multiply(result, base);
      }
      return result;
   }

   private static long[] negate(long[] frac) {
      return new long[]{-frac[0], frac[1]};
   }

   private static String fractionToString(long[] frac) {
      if (frac[1] == 1) {
         return String.valueOf(frac[0]);
      }
      return frac[0] + "/" + frac[1];
   }

   // Visitor methods
   @Override public long[] visitProgram(Calculator_fractionsParser.ProgramContext ctx) {
      for (var stat : ctx.stat()) {
         visit(stat);
      }
      return null;
   }

   @Override public long[] visitStatPrint(Calculator_fractionsParser.StatPrintContext ctx) {
      long[] result = visit(ctx.expr());
      if (result != null) {
         System.out.println(fractionToString(result));
      }
      return null;
   }

   @Override public long[] visitStatAssignment(Calculator_fractionsParser.StatAssignmentContext ctx) {
      String id = ctx.ID().getText();
      long[] value = visit(ctx.expr());
      vars.put(id, value);
      return null;
   }

   @Override public long[] visitStatExpr(Calculator_fractionsParser.StatExprContext ctx) {
      return visit(ctx.expr());
   }

   @Override public long[] visitEmptyStat(Calculator_fractionsParser.EmptyStatContext ctx) {
      return null;
   }

   @Override public long[] visitExprAddSub(Calculator_fractionsParser.ExprAddSubContext ctx) {
      long[] left = visit(ctx.expr(0));
      long[] right = visit(ctx.expr(1));
      String op = ctx.op.getText();
      
      if (op.equals("+")) {
         return add(left, right);
      } else {
         return subtract(left, right);
      }
   }

   @Override public long[] visitExprMultDiv(Calculator_fractionsParser.ExprMultDivContext ctx) {
      long[] left = visit(ctx.expr(0));
      long[] right = visit(ctx.expr(1));
      String op = ctx.op.getText();
      
      switch (op) {
         case "*": return multiply(left, right);
         case "/": return divide(left, right);
         case ":": return divide(left, right);
         case "%": 
            throw new RuntimeException("Modulo operation not supported for fractions");
         default: return null;
      }
   }

   @Override public long[] visitExprParent(Calculator_fractionsParser.ExprParentContext ctx) {
      return visit(ctx.expr());
   }

   @Override public long[] visitExprUnary(Calculator_fractionsParser.ExprUnaryContext ctx) {
      long[] expr = visit(ctx.expr());
      String op = ctx.op.getText();
      
      if (op.equals("+")) {
         return expr;
      } else {
         return negate(expr);
      }
   }

   @Override public long[] visitPow(Calculator_fractionsParser.PowContext ctx) {
      long[] base = visit(ctx.expr(0));
      long[] exponentFraction = visit(ctx.expr(1));
      
      if (exponentFraction[1] != 1) {
         throw new RuntimeException("Exponent must be an integer");
      }
      
      long exponent = exponentFraction[0];
      return power(base, exponent);
   }

   @Override public long[] visitExprInteger(Calculator_fractionsParser.ExprIntegerContext ctx) {
      long value = Long.parseLong(ctx.Integer().getText());
      return new long[]{value, 1};
   }

   @Override public long[] visitExprFraction(Calculator_fractionsParser.ExprFractionContext ctx) {
      long numerator = Long.parseLong(ctx.Integer(0).getText());
      long denominator = Long.parseLong(ctx.Integer(1).getText());
      return reduce(numerator, denominator);
   }

   @Override public long[] visitReduce(Calculator_fractionsParser.ReduceContext ctx) {
      long[] expr = visit(ctx.expr());
      return reduce(expr[0], expr[1]);
   }

   @Override public long[] visitReadPrompt(Calculator_fractionsParser.ReadPromptContext ctx) {
      String prompt = ctx.STRING().getText();
      prompt = prompt.substring(1, prompt.length() - 1);
      
      System.out.print(prompt + ": ");
      String input = scanner.nextLine().trim();
      
      if (input.contains("/")) {
         String[] parts = input.split("/");
         long num = Long.parseLong(parts[0]);
         long den = Long.parseLong(parts[1]);
         return reduce(num, den);
      } else {
         long value = Long.parseLong(input);
         return new long[]{value, 1};
      }
   }

   @Override public long[] visitExprId(Calculator_fractionsParser.ExprIdContext ctx) {
      String id = ctx.ID().getText();
      long[] value = vars.get(id);
      if (value == null) {
         throw new RuntimeException("Variable '" + id + "' not defined");
      }
      return value;
   }
}
