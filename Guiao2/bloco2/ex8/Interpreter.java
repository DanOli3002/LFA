import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends CalculatorBaseVisitor<String> {

   private final Map<String, Integer> vars = new HashMap<>();

   @Override public String visitProgram(CalculatorParser.ProgramContext ctx) {
        StringBuilder out = new StringBuilder();
        for (var stat : ctx.stat()) {
            String r = visit(stat);
            if (r != null && !r.isBlank()) out.append(r).append("\n");
        }
        return out.toString();
    }

   @Override public String visitStatAssignment(CalculatorParser.StatAssignmentContext ctx) {
      return visit(ctx.assignment());
   }

   @Override public String visitStatExpr(CalculatorParser.StatExprContext ctx) {
      if (ctx.expr() != null) {
         return visit(ctx.expr());
      }
      return null;
   }

   @Override public String visitAssignment(CalculatorParser.AssignmentContext ctx) {
      String id = ctx.ID().getText();
      String expr = visit(ctx.expr());
      return id + " = " + expr;
   }

   @Override public String visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      String left  = visit(ctx.expr(0));
      String right = visit(ctx.expr(1));
      return left + " " + right + " " + ctx.op.getText();
   }

   @Override public String visitExprParent(CalculatorParser.ExprParentContext ctx) {
      return visit(ctx.expr());
   }

   @Override public String visitExprUnary(CalculatorParser.ExprUnaryContext ctx) {
      String expr = visit(ctx.expr());
      if (ctx.op.getText().equals("+")) return expr + "!+";
      else return expr + "!-";
   }

   @Override public String visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      return ctx.Integer().getText();
   }

   @Override public String visitExprId(CalculatorParser.ExprIdContext ctx) {
      return ctx.ID().getText();
   }

   @Override public String visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      String left  = visit(ctx.expr(0));
      String right = visit(ctx.expr(1));
      switch (ctx.op.getText()) {
         case "*": return left + right + " * ";
         case "/": return left + right + " / ";
         default:  return left + right + " % ";
      }
   }
}
