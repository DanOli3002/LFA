// Generated from Numbers.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NumbersParser}.
 */
public interface NumbersListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NumbersParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(NumbersParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumbersParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(NumbersParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumbersParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(NumbersParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumbersParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(NumbersParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumbersParser#words}.
	 * @param ctx the parse tree
	 */
	void enterWords(NumbersParser.WordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumbersParser#words}.
	 * @param ctx the parse tree
	 */
	void exitWords(NumbersParser.WordsContext ctx);
}