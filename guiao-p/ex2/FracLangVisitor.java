// Generated from FracLang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FracLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FracLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FracLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FracLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatDisplay}
	 * labeled alternative in {@link FracLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatDisplay(FracLangParser.StatDisplayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatAssignment}
	 * labeled alternative in {@link FracLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatAssignment(FracLangParser.StatAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFrac}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFrac(FracLangParser.ExprFracContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParens}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParens(FracLangParser.ExprParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprOp}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOp(FracLangParser.ExprOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprId(FracLangParser.ExprIdContext ctx);
}