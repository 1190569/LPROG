package us1017;

import org.antlr.v4.runtime.tree.*;
import us1017.grammar.grammar.InterviewResponsesBaseListener;
import us1017.grammar.grammar.InterviewResponsesParser;

public class InterviewResponsesListener extends InterviewResponsesBaseListener {
    @Override
    public void enterQuestionResponse(InterviewResponsesParser.QuestionResponseContext ctx) {
        System.out.println("Checking response for question: " + ctx.STRING().getText());
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        System.err.println("Syntax error detected: " + node.getText());
    }
}
