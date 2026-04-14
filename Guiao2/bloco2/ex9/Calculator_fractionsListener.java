// Generated from Calculator_fractions.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Calculator_fractionsParser}.
 */
public interface Calculator_fractionsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Calculator_fractionsParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Calculator_fractionsParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Calculator_fractionsParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Calculator_fractionsParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatPrint}
	 * labeled alternative in {@link Calculator_fractionsParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatPrint(Calculator_fractionsParser.StatPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatPrint}
	 * labeled alternative in {@link Calculator_fractionsParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatPrint(Calculator_fractionsParser.StatPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatAssignment}
	 * labeled alternative in {@link Calculator_fractionsParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatAssignment(Calculator_fractionsParser.StatAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatAssignment}
	 * labeled alternative in {@link Calculator_fractionsParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatAssignment(Calculator_fractionsParser.StatAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatExpr}
	 * labeled alternative in {@link Calculator_fractionsParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatExpr(Calculator_fractionsParser.StatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatExpr}
	 * labeled alternative in {@link Calculator_fractionsParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatExpr(Calculator_fractionsParser.StatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyStat}
	 * labeled alternative in {@link Calculator_fractionsParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStat(Calculator_fractionsParser.EmptyStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyStat}
	 * labeled alternative in {@link Calculator_fractionsParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStat(Calculator_fractionsParser.EmptyStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link Calculator_fractionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(Calculator_fractionsParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link Calculator_fractionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(Calculator_fractionsParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link Calculator_fractionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParent(Calculator_fractionsParser.ExprParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link Calculator_fractionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParent(Calculator_fractionsParser.ExprParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link Calculator_fractionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprUnary(Calculator_fractionsParser.ExprUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link Calculator_fractionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprUnary(Calculator_fractionsParser.ExprUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link Calculator_fractionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPow(Calculator_fractionsParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link Calculator_fractionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPow(Calculator_fractionsParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link Calculator_fractionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDiv(Calculator_fractionsParser.ExprMultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link Calculator_fractionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDiv(Calculator_fractionsParser.ExprMultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link Calculator_fractionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInteger(Calculator_fractionsParser.ExprIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link Calculator_fractionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInteger(Calculator_fractionsParser.ExprIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Reduce}
	 * labeled alternative in {@link Calculator_fractionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterReduce(Calculator_fractionsParser.ReduceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Reduce}
	 * labeled alternative in {@link Calculator_fractionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitReduce(Calculator_fractionsParser.ReduceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link Calculator_fractionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprId(Calculator_fractionsParser.ExprIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link Calculator_fractionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprId(Calculator_fractionsParser.ExprIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadPrompt}
	 * labeled alternative in {@link Calculator_fractionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterReadPrompt(Calculator_fractionsParser.ReadPromptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadPrompt}
	 * labeled alternative in {@link Calculator_fractionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitReadPrompt(Calculator_fractionsParser.ReadPromptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link Calculator_fractionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFraction(Calculator_fractionsParser.ExprFractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link Calculator_fractionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFraction(Calculator_fractionsParser.ExprFractionContext ctx);
}