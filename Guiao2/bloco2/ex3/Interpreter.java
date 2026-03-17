@SuppressWarnings("CheckReturnValue")
public class Interpreter extends CalculatorBaseVisitor<Integer> {

   @Override public Integer visitProgram(CalculatorParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Integer visitStat(CalculatorParser.StatContext ctx) {
      if (ctx.expr() != null) {
         Integer res = visit(ctx.expr());
         System.out.println(res);
      }
      return null;
   }

   @Override public Integer visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      Integer left  = visit(ctx.expr(0));
      Integer right = visit(ctx.expr(1));
      if (ctx.op.getText().equals("+")) return left + right;
      else                              return left - right;
   }

   @Override public Integer visitExprParent(CalculatorParser.ExprParentContext ctx) {
      return visit(ctx.expr());
   }

   @Override public Integer visitExprUnary(CalculatorParser.ExprUnaryContext ctx) {
      Integer val = visit(ctx.expr());
      if (ctx.op.getText().equals("-")) return -val;
      else                              return +val;
   }

   @Override public Integer visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      return Integer.parseInt(ctx.Integer().getText());
   }

   @Override public Integer visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      Integer left  = visit(ctx.expr(0));
      Integer right = visit(ctx.expr(1));
      switch (ctx.op.getText()) {
         case "*": return left * right;
         case "/": return left / right;
         default:  return left % right;
      }
   }
}
