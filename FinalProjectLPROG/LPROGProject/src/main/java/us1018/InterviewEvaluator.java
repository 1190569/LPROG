package us1018;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class InterviewEvaluator extends InterviewModel_2_updatedBaseVisitor<Double> {
    private Map<String, Double> evaluationRules;

    public InterviewEvaluator() {
        evaluationRules = new HashMap<>();
        evaluationRules.put("Python", 2.0);
        evaluationRules.put("JavaScript", 2.0);
        evaluationRules.put("Java", 2.0);
        evaluationRules.put("C#", 2.0);
        evaluationRules.put("Other", 2.0);
    }

    @Override
    public Double visitPlugin(InterviewModel_2_updatedParser.PluginContext ctx) {
        double totalScore = 0;
        for (InterviewModel_2_updatedParser.QuestionContext question : ctx.interviewParams().questionList().question()) {
            totalScore += visit(question);
        }
        return totalScore;
    }

    @Override
    public Double visitQuestion(InterviewModel_2_updatedParser.QuestionContext ctx) {
        String questionType = ctx.questionType().getText();
        String answer = ctx.STRING(1).getText().replace("\"", "");
        int maxPoints = Integer.parseInt(ctx.INT().getText());

        switch (questionType) {
            case "MultipleChoice":
                return evaluateMultipleChoice(answer, maxPoints);
            case "NumericScale":
                return evaluateNumericScale(answer, maxPoints);
            case "TrueFalse":
                return evaluateTrueFalse(answer, maxPoints);
            case "ShortTextAnswer":
                return evaluateShortTextAnswer(answer, maxPoints);
            case "SingleChoice":
                return evaluateSingleChoice(answer, maxPoints);
            case "IntegerNumber":
                return evaluateIntegerNumber(answer, maxPoints);
            case "DecimalNumber":
                return evaluateDecimalNumber(answer, maxPoints);
            case "Date":
                return evaluateDate(answer, maxPoints);
            case "Time":
                return evaluateTime(answer, maxPoints);
            default:
                return 0.0;
        }
    }

    private Double evaluateMultipleChoice(String answer, int maxPoints) {
        String[] answers = answer.split(", ");
        double score = 0;
        for (String ans : answers) {
            ans = ans.split("\\. ")[1];
            if (evaluationRules.containsKey(ans)) {
                score += evaluationRules.get(ans);
            } else {
                score += evaluationRules.get("Other");
            }
        }
        return Math.min(score, maxPoints);
    }

    private Double evaluateNumericScale(String answer, int maxPoints) {
        answer = answer.split("/")[0];
        return Math.min(Double.valueOf(answer), maxPoints);
    }

    private Double evaluateTrueFalse(String answer, int maxPoints) {
        return answer.equals("True") ? (double) maxPoints : 0.0;
    }

    private Double evaluateDate(String answer, int maxPoints) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate answerDate = LocalDate.parse(answer, formatter);
        LocalDate oneYearAgo = LocalDate.now().minusYears(1);

        if (answerDate.isAfter(oneYearAgo)) {
            return (double) maxPoints;
        } else {
            return maxPoints * 0.5;
        }
    }

    private Double evaluateShortTextAnswer(String answer, int maxPoints) {
        String[] words = answer.split("\\s+");
        if (words.length != 3) {
            return (double) maxPoints;
        } else {
            return 1.0;
        }
    }

    private Double evaluateIntegerNumber(String answer, int maxPoints) {
        int intValue = Integer.parseInt(answer);
        if (intValue >= 1500 && intValue <= 2500) {
            return (double) maxPoints;
        } else if (intValue < 1500) {
            return maxPoints * 0.5;
        } else {
            return 0.0;
        }
    }

    private Double evaluateSingleChoice(String answer, int maxPoints) {
        answer = answer.split("\\. ")[1];
        return answer.equals("A") ? (double) maxPoints : 0.0;
    }

    private Double evaluateDecimalNumber(String answer, int maxPoints) {
        return Math.min(Double.valueOf(answer), maxPoints);
    }

    private Double evaluateTime(String answer, int maxPoints) {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime answerTime = LocalTime.parse(answer, timeFormatter);
        if (answerTime.getHour() == 8 || answerTime.getHour() == 9) {
            return (double) maxPoints;
        } else if (answerTime.getHour() >= 5 && answerTime.getHour() < 8) {
            return maxPoints * 0.5;
        } else {
            return 0.0;
        }
    }
}
