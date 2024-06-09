package us2004;

import java.io.FileInputStream;
import java.io.IOException;

import jobAP.JobAplicationLexer;
import jobAP.JobAplicationParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class JobAplicationVerifier {
    public JobApplication verifyJobApplication(String filePath) throws IOException {
        CharStream input = CharStreams.fromStream(new FileInputStream(filePath));
        JobAplicationLexer lexer = new JobAplicationLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JobAplicationParser parser = new JobAplicationParser(tokens);

        JobAplicationParser.PluginContext tree = parser.plugin();
        ParseTreeWalker walker = new ParseTreeWalker();
        JobAplicationListener listener = new JobAplicationListener();
        walker.walk(listener, tree);

        return listener.getJobApplication();
    }
}