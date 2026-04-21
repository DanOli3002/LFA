// Generated from FracLang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FracLangParser}.
 */
public interface FracLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FracLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FracLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FracLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatDisplay}
	 * labeled alternative in {@link FracLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatDisplay(FracLangParser.StatDisplayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatDisplay}
	 * labeled alternative in {@link FracLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatDisplay(FracLangParser.StatDisplayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatAssignment}
	 * labeled alternative in {@link FracLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatAssignment(FracLangParser.StatAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatAssignment}
	 * labeled alternative in {@link FracLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatAssignment(FracLangParser.StatAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFrac}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFrac(FracLangParser.ExprFracContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFrac}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFrac(FracLangParser.ExprFracContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParens}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParens(FracLangParser.ExprParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParens}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParens(FracLangParser.ExprParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprOp}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprOp(FracLangParser.ExprOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprOp}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprOp(FracLangParser.ExprOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExptUni}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExptUni(FracLangParser.ExptUniContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExptUni}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExptUni(FracLangParser.ExptUniContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprId(FracLangParser.ExprIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprId(FracLangParser.ExprIdContext ctx);
}