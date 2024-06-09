// Generated from JobAplication.g4 by ANTLR 4.13.1
package jobAP;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JobAplicationParser}.
 */
public interface JobAplicationListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JobAplicationParser#plugin}.
	 * @param ctx the parse tree
	 */
	void enterPlugin(JobAplicationParser.PluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobAplicationParser#plugin}.
	 * @param ctx the parse tree
	 */
	void exitPlugin(JobAplicationParser.PluginContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobAplicationParser#jobReqParams}.
	 * @param ctx the parse tree
	 */
	void enterJobReqParams(JobAplicationParser.JobReqParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobAplicationParser#jobReqParams}.
	 * @param ctx the parse tree
	 */
	void exitJobReqParams(JobAplicationParser.JobReqParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobAplicationParser#attrList}.
	 * @param ctx the parse tree
	 */
	void enterAttrList(JobAplicationParser.AttrListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobAplicationParser#attrList}.
	 * @param ctx the parse tree
	 */
	void exitAttrList(JobAplicationParser.AttrListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobAplicationParser#degreeArea}.
	 * @param ctx the parse tree
	 */
	void enterDegreeArea(JobAplicationParser.DegreeAreaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobAplicationParser#degreeArea}.
	 * @param ctx the parse tree
	 */
	void exitDegreeArea(JobAplicationParser.DegreeAreaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobAplicationParser#degreeLevel}.
	 * @param ctx the parse tree
	 */
	void enterDegreeLevel(JobAplicationParser.DegreeLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobAplicationParser#degreeLevel}.
	 * @param ctx the parse tree
	 */
	void exitDegreeLevel(JobAplicationParser.DegreeLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobAplicationParser#tools}.
	 * @param ctx the parse tree
	 */
	void enterTools(JobAplicationParser.ToolsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobAplicationParser#tools}.
	 * @param ctx the parse tree
	 */
	void exitTools(JobAplicationParser.ToolsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobAplicationParser#yearsOfExperience}.
	 * @param ctx the parse tree
	 */
	void enterYearsOfExperience(JobAplicationParser.YearsOfExperienceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobAplicationParser#yearsOfExperience}.
	 * @param ctx the parse tree
	 */
	void exitYearsOfExperience(JobAplicationParser.YearsOfExperienceContext ctx);
}