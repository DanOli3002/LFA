import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends FracLangBaseVisitor<Fraction> {
   private Map<String,Fraction> variables = new HashMap<>();

   @Override public Fraction visitStatDisplay(FracLangParser.StatDisplayContext ctx) {
      Fraction res = visit(ctx.expr());
      if(res != null) {
         System.out.println(res.toString());
      }
      return res;
   }

   @Override public Fraction visitStatAssignment(FracLangParser.StatAssignmentContext ctx) {
      Fraction res = visit(ctx.expr());
      if(res != null) {
         String var = ctx.ID().getText();
         variables.put(var, res);
      }
      return res;
   }

   @Override public Fraction visitExprFrac(FracLangParser.ExprFracContext ctx) {
      Integer left,right;
      String res = ctx.FRAC().getText();
      String[] List = res.split("/");
      if(List.length > 1) {
         left = Integer.parseInt(List[0]);
         right = Integer.parseInt(List[1]);
      } else {
         left = Integer.parseInt(List[0]);
         right = 1;
      }
      Fraction frac = new Fraction(left, right);
      return frac;
   }

   @Override public Fraction visitExprParens(FracLangParser.ExprParensContext ctx) {
      Fraction res = visit(ctx.expr());
      return res;
   }

   @Override public Fraction visitExprOp(FracLangParser.ExprOpContext ctx) {
      Fraction left = visit(ctx.expr(0));
      Fraction right = visit(ctx.expr(1));
      String op = ctx.op.getText();
      Fraction res = null;
      if(op.equals('+')) {
         res = Fraction.addFraction(left, right);
      } if(op.equals('-')) {
         res = Fraction.subFraction(left, right);
      } if(op.equals('*')) {
         res = Fraction.mulFraction(left, right);
      } if(op.equals(':')) {
         res = Fraction.divFraction(left, right);
      }
      return res;
   }

   @Override public Fraction visitExprId(FracLangParser.ExprIdContext ctx) {
      Fraction var = null;
      String res = ctx.ID().getText();
      if(variables.containsKey(res)) {
         var = variables.get(res);
      }
      return var;
   }
}
