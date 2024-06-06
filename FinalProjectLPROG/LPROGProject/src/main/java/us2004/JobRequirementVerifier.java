package us2004;

import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.tree.TerminalNode;
import jobReq.JobReqspec_1BaseListener;
import jobReq.JobReqspec_1Parser;
import jobReq.JobReqspec_1Lexer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class JobRequirementVerifier {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the path to the input file.");
            return;
        }

        String filePath = args[0];

        try {
            JobRequirementVerifier verifier = new JobRequirementVerifier();
            verifier.verifyJobRequirements(filePath);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    public void verifyJobRequirements(String filePath) throws IOException {
        CharStream input = CharStreams.fromStream(new FileInputStream(filePath));
        JobReqspec_1Lexer lexer = new JobReqspec_1Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JobReqspec_1Parser parser = new JobReqspec_1Parser(tokens);

        ParseTree tree = parser.plugin();
        ParseTreeWalker walker = new ParseTreeWalker();
        JobReqListener listener = new JobReqListener();

        walker.walk(listener, tree);
    }
}



class JobReqListener extends JobReqspec_1BaseListener {
    @Override
    public void enterPlugin(JobReqspec_1Parser.PluginContext ctx) {
        System.out.println("Title: " + ctx.ID(0).getText());
        System.out.println("Description: " + ctx.jobReqParams().STRING(0).getText());

        JobReqspec_1Parser.ReqListContext reqListContext = ctx.jobReqParams().reqList();

        // Iterate over reqItems within reqListContext
        for (JobReqspec_1Parser.ReqItemContext reqItemContext : reqListContext.reqItem()) {
            TerminalNode stringToken = reqItemContext.STRING();
            String value = stringToken.getText();
            System.out.println("Requirement: " + value);
        }
    }
}


