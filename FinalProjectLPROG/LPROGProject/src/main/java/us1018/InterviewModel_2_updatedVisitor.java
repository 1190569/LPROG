package us1018;
// Generated from InterviewModel_2_updated.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link InterviewModel_2_updatedParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface InterviewModel_2_updatedVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link InterviewModel_2_updatedParser#plugin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlugin(InterviewModel_2_updatedParser.PluginContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewModel_2_updatedParser#interviewParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterviewParams(InterviewModel_2_updatedParser.InterviewParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewModel_2_updatedParser#questionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionList(InterviewModel_2_updatedParser.QuestionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewModel_2_updatedParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(InterviewModel_2_updatedParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewModel_2_updatedParser#questionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionType(InterviewModel_2_updatedParser.QuestionTypeContext ctx);
}