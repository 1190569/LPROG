// Generated from C:/Users/jerem/OneDrive - bwedu/Studium/7tes Semester/LPROG/05_SprintC/LPROG/FinalProjectLPROG/LPROGProject/src/main/java/us1017/grammar/InterviewResponses.g4 by ANTLR 4.13.1
package us1017.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link InterviewResponsesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface InterviewResponsesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link InterviewResponsesParser#plugin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlugin(InterviewResponsesParser.PluginContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewResponsesParser#interviewParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterviewParams(InterviewResponsesParser.InterviewParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewResponsesParser#questionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionList(InterviewResponsesParser.QuestionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewResponsesParser#questionResponse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionResponse(InterviewResponsesParser.QuestionResponseContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewResponsesParser#questionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionType(InterviewResponsesParser.QuestionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewResponsesParser#response}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResponse(InterviewResponsesParser.ResponseContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewResponsesParser#fraction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFraction(InterviewResponsesParser.FractionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewResponsesParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(InterviewResponsesParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewResponsesParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(InterviewResponsesParser.TimeContext ctx);
}