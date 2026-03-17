@SuppressWarnings("CheckReturnValue")
public class Intrepreter extends PrefixCalculatorBaseVisitor<Integer> {

   @Override public Integer visitProgram(PrefixCalculatorParser.ProgramContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Integer visitStat(PrefixCalculatorParser.StatContext ctx) {
      if (ctx.expr() != null) {
         Integer res = visit(ctx.expr());
         System.out.println(res);
      }
      return null;
   }

   @Override public Integer visitExprPrefix(PrefixCalculatorParser.ExprPrefixContext ctx) {
      String op = ctx.op.getText();
      Integer op1 = visit(ctx.expr(0));
      Integer op2 = visit(ctx.expr(1));

      if(op1 == null || op2 == null) {
         System.err.println("Invalid expression: missing operand(s)");
         return null;
      }
      switch (op) {
         case "*":
            return op1 * op2;
         case "/":
            if(op1 == 0 || op2 == 0) {
               System.err.println("Invalid expression: division by zero");
               return null;
            }
            else {
               return op1 / op2;
            }
         case "+":
            return op1 + op2;
         case "-":
            return op1 - op2;
      }
      return null;
   }

   @Override public Integer visitExprNumber(PrefixCalculatorParser.ExprNumberContext ctx) {
      return Integer.parseInt(ctx.Number().getText());
   }
}
