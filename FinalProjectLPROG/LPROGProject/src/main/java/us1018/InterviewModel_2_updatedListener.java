package us1018;
// Generated from InterviewModel_2_updated.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InterviewModel_2_updatedParser}.
 */
public interface InterviewModel_2_updatedListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InterviewModel_2_updatedParser#plugin}.
	 * @param ctx the parse tree
	 */
	void enterPlugin(InterviewModel_2_updatedParser.PluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModel_2_updatedParser#plugin}.
	 * @param ctx the parse tree
	 */
	void exitPlugin(InterviewModel_2_updatedParser.PluginContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModel_2_updatedParser#interviewParams}.
	 * @param ctx the parse tree
	 */
	void enterInterviewParams(InterviewModel_2_updatedParser.InterviewParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModel_2_updatedParser#interviewParams}.
	 * @param ctx the parse tree
	 */
	void exitInterviewParams(InterviewModel_2_updatedParser.InterviewParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModel_2_updatedParser#questionList}.
	 * @param ctx the parse tree
	 */
	void enterQuestionList(InterviewModel_2_updatedParser.QuestionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModel_2_updatedParser#questionList}.
	 * @param ctx the parse tree
	 */
	void exitQuestionList(InterviewModel_2_updatedParser.QuestionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModel_2_updatedParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(InterviewModel_2_updatedParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModel_2_updatedParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(InterviewModel_2_updatedParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewModel_2_updatedParser#questionType}.
	 * @param ctx the parse tree
	 */
	void enterQuestionType(InterviewModel_2_updatedParser.QuestionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewModel_2_updatedParser#questionType}.
	 * @param ctx the parse tree
	 */
	void exitQuestionType(InterviewModel_2_updatedParser.QuestionTypeContext ctx);
}