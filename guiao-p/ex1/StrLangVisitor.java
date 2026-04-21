// Generated from StrLang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StrLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StrLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StrLangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(StrLangParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatPrint}
	 * labeled alternative in {@link StrLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatPrint(StrLangParser.StatPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatAssignment}
	 * labeled alternative in {@link StrLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatAssignment(StrLangParser.StatAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprString(StrLangParser.ExprStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprID(StrLangParser.ExprIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprInput}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInput(StrLangParser.ExprInputContext ctx);
}