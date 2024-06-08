package us1017;

import us1017.grammar.InterviewResponsesBaseListener;
import us1017.grammar.InterviewResponsesParser;

public class InterviewResponsesListener extends InterviewResponsesBaseListener {
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
                return answer.matches("\\d+");
            case "IntegerNumber":
                return answer.matches("\\d+");
            case "Date":
                return answer.matches("\\d{4}-\\d{2}-\\d{2}");
            case "TrueFalse":
                return answer.equals("True") || answer.equals("False");
            case "MultipleChoice":
                return answer.contains(",");
            case "ShortTextAnswer":
                return true;  // Jeglicher Text ist erlaubt
            default:
                return false;
        }
    }

    private String detectType(String answer) {
        if (answer.matches("\\d+")) {
            return "a numeric scale";
        } else if (answer.matches("\\d+")) {
            return "an integer number";
        } else if (answer.matches("\\d{4}-\\d{2}-\\d{2}")) {
            return "a date (YYYY-MM-DD)";
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