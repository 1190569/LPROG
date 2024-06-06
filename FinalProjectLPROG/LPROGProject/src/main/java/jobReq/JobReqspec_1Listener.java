// Generated from JobReqspec_1.g4 by ANTLR 4.13.1
package jobReq;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JobReqspec_1Parser}.
 */
public interface JobReqspec_1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JobReqspec_1Parser#plugin}.
	 * @param ctx the parse tree
	 */
	void enterPlugin(JobReqspec_1Parser.PluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobReqspec_1Parser#plugin}.
	 * @param ctx the parse tree
	 */
	void exitPlugin(JobReqspec_1Parser.PluginContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobReqspec_1Parser#jobReqParams}.
	 * @param ctx the parse tree
	 */
	void enterJobReqParams(JobReqspec_1Parser.JobReqParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobReqspec_1Parser#jobReqParams}.
	 * @param ctx the parse tree
	 */
	void exitJobReqParams(JobReqspec_1Parser.JobReqParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobReqspec_1Parser#reqList}.
	 * @param ctx the parse tree
	 */
	void enterReqList(JobReqspec_1Parser.ReqListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobReqspec_1Parser#reqList}.
	 * @param ctx the parse tree
	 */
	void exitReqList(JobReqspec_1Parser.ReqListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobReqspec_1Parser#reqItem}.
	 * @param ctx the parse tree
	 */
	void enterReqItem(JobReqspec_1Parser.ReqItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobReqspec_1Parser#reqItem}.
	 * @param ctx the parse tree
	 */
	void exitReqItem(JobReqspec_1Parser.ReqItemContext ctx);
}