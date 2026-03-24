import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends Calculator6BaseVisitor<Integer> {

   private final Map<String, Integer> vars = new HashMap<>();

   @Override public Integer visitProgram(Calculator6Parser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Integer visitStatAssignment(Calculator6Parser.StatAssignmentContext ctx) {
      return visit(ctx.assignment());
   }

   @Override public Integer visitStatExpr(Calculator6Parser.StatExprContext ctx) {
      if (ctx.expr() != null) {
         Integer res = visit(ctx.expr());
         System.out.println(res);
      }
      return null;
   }

   @Override public Integer visitAssignment(Calculator6Parser.AssignmentContext ctx) {
      String id = ctx.ID().getText();
      Integer value = visit(ctx.expr());
      vars.put(id, value);
      return value;
   }

   @Override public Integer visitExprAddSub(Calculator6Parser.ExprAddSubContext ctx) {
      Integer left  = visit(ctx.expr(0));
      Integer right = visit(ctx.expr(1));
      if (ctx.op.getText().equals("+")) return left + right;
      else                              return left - right;
   }

   @Override public Integer visitExprParent(Calculator6Parser.ExprParentContext ctx) {
      return visit(ctx.expr());
   }

   @Override public Integer visitExprUnary(Calculator6Parser.ExprUnaryContext ctx) {
      Integer val = visit(ctx.expr());
      if (ctx.op.getText().equals("-")) return -val;
      else                              return +val;
   }

   @Override public Integer visitExprInteger(Calculator6Parser.ExprIntegerContext ctx) {
      return Integer.parseInt(ctx.Integer().getText());
   }

   @Override public Integer visitExprId(Calculator6Parser.ExprIdContext ctx) {
      String id = ctx.ID().getText();
      Integer value = vars.get(id);
      if (value == null) {
         throw new RuntimeException("Variavel nao definida: " + id);
      }
      return value;
   }

   @Override public Integer visitExprMultDivMod(Calculator6Parser.ExprMultDivModContext ctx) {
      Integer left  = visit(ctx.expr(0));
      Integer right = visit(ctx.expr(1));
      switch (ctx.op.getText()) {
         case "*": return left * right;
         case "/": return left / right;
         default:  return left % right;
      }
   }
}
