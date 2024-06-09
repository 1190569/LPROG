package us1018;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;

public class InterviewProcessor {
    public static void main(String[] args) {
        try {
            ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("FinalProjectLPROG/LPROGProject/src/main/resources/Test_3_InterviewModel_with_answers"));
            InterviewModel_2_updatedLexer lexer = new InterviewModel_2_updatedLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            InterviewModel_2_updatedParser parser = new InterviewModel_2_updatedParser(tokens);

            ParseTree tree = parser.plugin();
            InterviewEvaluator evaluator = new InterviewEvaluator();
            double totalScore = evaluator.visit(tree);

            System.out.println("Total Score: " + totalScore);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
