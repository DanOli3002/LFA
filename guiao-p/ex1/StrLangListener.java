// Generated from StrLang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StrLangParser}.
 */
public interface StrLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StrLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(StrLangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(StrLangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatPrint}
	 * labeled alternative in {@link StrLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatPrint(StrLangParser.StatPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatPrint}
	 * labeled alternative in {@link StrLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatPrint(StrLangParser.StatPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatAssignment}
	 * labeled alternative in {@link StrLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatAssignment(StrLangParser.StatAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatAssignment}
	 * labeled alternative in {@link StrLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatAssignment(StrLangParser.StatAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprString(StrLangParser.ExprStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprString(StrLangParser.ExprStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(StrLangParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(StrLangParser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInput}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInput(StrLangParser.ExprInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInput}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInput(StrLangParser.ExprInputContext ctx);
}