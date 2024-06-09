package us1017;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import us1017.grammar.InterviewResponsesLexer;
import us1017.grammar.InterviewResponsesParser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\jerem\\OneDrive - bwedu\\Studium\\7tes Semester\\LPROG\\05_SprintC\\Ursprung Text_3 - Kopie.txt";
        ErrorFlag errorFlag = new ErrorFlag(false);  // Using the wrapper class

        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            ANTLRInputStream input = new ANTLRInputStream(content);
            InterviewResponsesLexer lexer = new InterviewResponsesLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            InterviewResponsesParser parser = new InterviewResponsesParser(tokens);

            parser.removeErrorListeners();

            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                    System.err.println("line " + line + ":" + charPositionInLine + " " + msg);
                    errorFlag.hasErrors = true;  // Modify the wrapper
                }
            });

            ParseTree tree = parser.plugin();
            ParseTreeWalker walker = new ParseTreeWalker();
            InterviewResponseListener listener = new InterviewResponseListener();
            walker.walk(listener, tree);

            if (!errorFlag.hasErrors&&!listener.errormsg) {
                // Keine Fehler, Datei speichern
                saveFile(content, "C:\\Users\\jerem\\OneDrive - bwedu\\Studium\\7tes Semester\\LPROG\\05_SprintC\\LPROG\\FinalProjectLPROG\\LPROGProject\\src\\main\\resources\\Saved_InterviewModel");
                System.out.println("File saved successfully.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void saveFile(String content, String newPath) throws IOException {
        Path path = Paths.get(newPath);
        Files.write(path, content.getBytes());
        System.out.println("File saved at: " + path.toString());
    }
}