// Generated from C:/Users/jerem/OneDrive - bwedu/Studium/7tes Semester/LPROG/05_SprintC/LPROG/FinalProjectLPROG/LPROGProject/src/main/java/us1017/grammar/InterviewResponses.g4 by ANTLR 4.13.1
package us1017.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InterviewResponsesParser}.
 */
public interface InterviewResponsesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InterviewResponsesParser#plugin}.
	 * @param ctx the parse tree
	 */
	void enterPlugin(InterviewResponsesParser.PluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewResponsesParser#plugin}.
	 * @param ctx the parse tree
	 */
	void exitPlugin(InterviewResponsesParser.PluginContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewResponsesParser#interviewParams}.
	 * @param ctx the parse tree
	 */
	void enterInterviewParams(InterviewResponsesParser.InterviewParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewResponsesParser#interviewParams}.
	 * @param ctx the parse tree
	 */
	void exitInterviewParams(InterviewResponsesParser.InterviewParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewResponsesParser#questionList}.
	 * @param ctx the parse tree
	 */
	void enterQuestionList(InterviewResponsesParser.QuestionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewResponsesParser#questionList}.
	 * @param ctx the parse tree
	 */
	void exitQuestionList(InterviewResponsesParser.QuestionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewResponsesParser#questionResponse}.
	 * @param ctx the parse tree
	 */
	void enterQuestionResponse(InterviewResponsesParser.QuestionResponseContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewResponsesParser#questionResponse}.
	 * @param ctx the parse tree
	 */
	void exitQuestionResponse(InterviewResponsesParser.QuestionResponseContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewResponsesParser#questionType}.
	 * @param ctx the parse tree
	 */
	void enterQuestionType(InterviewResponsesParser.QuestionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewResponsesParser#questionType}.
	 * @param ctx the parse tree
	 */
	void exitQuestionType(InterviewResponsesParser.QuestionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewResponsesParser#response}.
	 * @param ctx the parse tree
	 */
	void enterResponse(InterviewResponsesParser.ResponseContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewResponsesParser#response}.
	 * @param ctx the parse tree
	 */
	void exitResponse(InterviewResponsesParser.ResponseContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewResponsesParser#fraction}.
	 * @param ctx the parse tree
	 */
	void enterFraction(InterviewResponsesParser.FractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewResponsesParser#fraction}.
	 * @param ctx the parse tree
	 */
	void exitFraction(InterviewResponsesParser.FractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewResponsesParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(InterviewResponsesParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewResponsesParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(InterviewResponsesParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewResponsesParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(InterviewResponsesParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewResponsesParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(InterviewResponsesParser.TimeContext ctx);
}