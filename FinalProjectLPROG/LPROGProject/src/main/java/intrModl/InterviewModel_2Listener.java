// Generated from InterviewModel_2.g4 by ANTLR 4.13.1
package intrModl;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InterviewModel_2Parser}.
 */
public interface InterviewModel_2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InterviewModel_2Parser#plugin}.
	 * @param ctx the parse tree
	 */
	void enterPlugin(InterviewModel_2Parser.PluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModel_2Parser#plugin}.
	 * @param ctx the parse tree
	 */
	void exitPlugin(InterviewModel_2Parser.PluginContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModel_2Parser#interviewParams}.
	 * @param ctx the parse tree
	 */
	void enterInterviewParams(InterviewModel_2Parser.InterviewParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModel_2Parser#interviewParams}.
	 * @param ctx the parse tree
	 */
	void exitInterviewParams(InterviewModel_2Parser.InterviewParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModel_2Parser#questionList}.
	 * @param ctx the parse tree
	 */
	void enterQuestionList(InterviewModel_2Parser.QuestionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModel_2Parser#questionList}.
	 * @param ctx the parse tree
	 */
	void exitQuestionList(InterviewModel_2Parser.QuestionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModel_2Parser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(InterviewModel_2Parser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModel_2Parser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(InterviewModel_2Parser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModel_2Parser#questionType}.
	 * @param ctx the parse tree
	 */
	void enterQuestionType(InterviewModel_2Parser.QuestionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModel_2Parser#questionType}.
	 * @param ctx the parse tree
	 */
	void exitQuestionType(InterviewModel_2Parser.QuestionTypeContext ctx);
}