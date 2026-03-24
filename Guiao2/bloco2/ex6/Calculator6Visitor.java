// Generated from Calculator6.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Calculator6Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Calculator6Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Calculator6Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Calculator6Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatAssignment}
	 * labeled alternative in {@link Calculator6Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatAssignment(Calculator6Parser.StatAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatExpr}
	 * labeled alternative in {@link Calculator6Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatExpr(Calculator6Parser.StatExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Calculator6Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Calculator6Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link Calculator6Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(Calculator6Parser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link Calculator6Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParent(Calculator6Parser.ExprParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link Calculator6Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUnary(Calculator6Parser.ExprUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link Calculator6Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInteger(Calculator6Parser.ExprIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link Calculator6Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprId(Calculator6Parser.ExprIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link Calculator6Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultDivMod(Calculator6Parser.ExprMultDivModContext ctx);
}