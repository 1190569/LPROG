package us2004;

import java.io.FileInputStream;
import java.io.IOException;
import org.antlr.v4.runtime.tree.TerminalNode;

import jobReq.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class JobRequirementVerifier {

    public JobRequirements verifyJobRequirements(String filePath) throws IOException {
        CharStream input = CharStreams.fromStream(new FileInputStream(filePath));
        JobReqspec_1Lexer lexer = new JobReqspec_1Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JobReqspec_1Parser parser = new JobReqspec_1Parser(tokens);

        ParseTree tree = parser.plugin();
        ParseTreeWalker walker = new ParseTreeWalker();
        JobReqListener listener = new JobReqListener();

        walker.walk(listener, tree);

        JobRequirements jobRequirements = listener.getJobRequirements();
        System.out.println(jobRequirements);
        return jobRequirements;

    }
}