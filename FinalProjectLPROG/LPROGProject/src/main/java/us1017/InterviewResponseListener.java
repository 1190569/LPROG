package us1017;

import org.antlr.v4.runtime.tree.ParseTreeProperty;
import us1017.grammar.InterviewResponsesBaseListener;
import us1017.grammar.InterviewResponsesParser;



public class InterviewResponseListener extends InterviewResponsesBaseListener {
    public boolean errormsg = false;

    @Override
    public void enterQuestionResponse(InterviewResponsesParser.QuestionResponseContext ctx) {
        String question = ctx.STRING().getText().replace("\"", "");
        String answer = ctx.response().getText().replace("\"", "");
        String expectedType = ctx.questionType().getText();

        System.out.println("Checking response for question: " + question);
        System.out.println("Type of question: " + expectedType);

        if (!validateAnswerType(answer, expectedType)) {
            String detectedType = detectType(answer);
            String error = generateErrorMessage(question, expectedType, detectedType);
            System.err.println(error);
            errormsg = true;
        } else {
            System.out.println("Answer: " + answer);
            System.out.println("Answertype: " + detectType(answer));
        }

        System.out.println();
    }

    public void enterPlugin(InterviewResponsesParser.PluginContext ctx) {
        System.out.println("Start Checking");
    }
    @Override
    public void exitPlugin(InterviewResponsesParser.PluginContext ctx) {
        System.out.println("Checking finished.");
    }

    private boolean validateAnswerType(String answer, String type) {
        switch (type) {
            case "NumericScale":
                return answer.matches("\\d/10");
            case "IntegerNumber":
                return answer.matches("\\d+");
            case "Date":
                return answer.matches("\\d{4}-\\d{2}-\\d{2}");
            case "Time":
                return answer.matches("\\d{2}:\\d{2}");
            case "DecimalNumber":
                return answer.matches("\\d+\\.\\d+");
            case "TrueFalse":
                return answer.equals("True") || answer.equals("False");
            case "SingleChoice":
            case "MultipleChoice":
                // Check if the response contains "1.", "2.", "3.", "4.", and "5."
                return answer.matches(".*(1\\.|2\\.|3\\.|4\\.|5\\.).*");
            case "ShortTextAnswer":
                return true;  // Jeglicher Text ist erlaubt
            default:
                return false;
        }
    }

    private String detectType(String answer) {
        if (answer.matches("\\d/10")) {
            return "NumericScale";
        } else if (answer.matches("\\d+")) {
            return "an integer number";
        } else if (answer.matches("\\d+\\.\\d+")) {
            return "a decimal number";
        } else if (answer.matches("\\d{4}-\\d{2}-\\d{2}")) {
            return "a date (YYYY-MM-DD)";
        } else if (answer.matches("\\d{2}:\\d{2}")) {
            return "a time (HH:MM)";
        } else if (answer.equals("True") || answer.equals("False")) {
            return "a boolean ('True' or 'False')";
        } else {
            return "text";
        }
    }

    private String generateErrorMessage(String question, String expectedType, String detectedType) {
        return "Error at question " + question + ": expected " + expectedType + ", but got " + detectedType;
    }
}