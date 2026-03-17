@SuppressWarnings("CheckReturnValue")
public class Execute extends SuffixCalculatorBaseVisitor<Double> {

   @Override
   public Double visitProgram(SuffixCalculatorParser.ProgramContext ctx) {
      // Double res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Double visitStat(SuffixCalculatorParser.StatContext ctx) {
      if (ctx.expr() != null) {
         Double res = visit(ctx.expr());
         System.out.println(res);
      }
      return null;
   }

   @Override
   public Double visitExprNumber(SuffixCalculatorParser.ExprNumberContext ctx) {
      return Double.parseDouble(ctx.Number().getText());
   }

   @Override
   public Double visitExprSuffix(SuffixCalculatorParser.ExprSuffixContext ctx) {
      Double op1 = visit(ctx.expr(0));
      Double op2 = visit(ctx.expr(1));
      String op = ctx.op.getText();

      switch (op) {
         case "*":
            return op1 * op2;
         case "/":
            return op1 / op2;
         case "+":
            return op1 + op2;
         case "-":
            return op1 - op2;
      }
      return 0.0;
   }
}