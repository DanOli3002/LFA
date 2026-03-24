// Generated from Calculator6.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Calculator6Parser}.
 */
public interface Calculator6Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Calculator6Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Calculator6Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Calculator6Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Calculator6Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatAssignment}
	 * labeled alternative in {@link Calculator6Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatAssignment(Calculator6Parser.StatAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatAssignment}
	 * labeled alternative in {@link Calculator6Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatAssignment(Calculator6Parser.StatAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatExpr}
	 * labeled alternative in {@link Calculator6Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatExpr(Calculator6Parser.StatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatExpr}
	 * labeled alternative in {@link Calculator6Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatExpr(Calculator6Parser.StatExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Calculator6Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Calculator6Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Calculator6Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Calculator6Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link Calculator6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(Calculator6Parser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link Calculator6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(Calculator6Parser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link Calculator6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParent(Calculator6Parser.ExprParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link Calculator6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParent(Calculator6Parser.ExprParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link Calculator6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprUnary(Calculator6Parser.ExprUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link Calculator6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprUnary(Calculator6Parser.ExprUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link Calculator6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInteger(Calculator6Parser.ExprIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link Calculator6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInteger(Calculator6Parser.ExprIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link Calculator6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprId(Calculator6Parser.ExprIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link Calculator6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprId(Calculator6Parser.ExprIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link Calculator6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDivMod(Calculator6Parser.ExprMultDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link Calculator6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDivMod(Calculator6Parser.ExprMultDivModContext ctx);
}