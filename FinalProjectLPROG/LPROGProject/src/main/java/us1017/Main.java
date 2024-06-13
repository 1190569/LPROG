package us1017;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import us1017.grammar.InterviewResponsesLexer;
import us1017.grammar.InterviewResponsesParser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * The Main class reads an interview responses text file, parses it using ANTLR,
 * checks for syntax errors, and saves the content to a new file if no errors are found.
 */
public class Main {

    /**
     * The main method of the application. Reads a file, parses its content, checks for syntax errors,
     * and saves the file if no errors are found.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        //TODO - Path needs to be changed
        String filePath = "C:\\Users\\jerem\\OneDrive - bwedu\\Studium\\7tes Semester\\LPROG\\05_SprintC\\LPROG\\FinalProjectLPROG\\LPROGProject\\src\\main\\resources\\Test_3_InterviewModel_with_answers";
        ErrorFlag errorFlag = new ErrorFlag(false);  // Using the wrapper class

        try {
            // Read file content
            String content = new String(Files.readAllBytes(Paths.get(filePath)));

            ANTLRInputStream input = new ANTLRInputStream(content);
            InterviewResponsesLexer lexer = new InterviewResponsesLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            InterviewResponsesParser parser = new InterviewResponsesParser(tokens);

            // Remove default error listeners
            parser.removeErrorListeners();
            // Add my error listener to catch syntax errors
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                    System.err.println("line " + line + ":" + charPositionInLine + " " + msg);
                    errorFlag.hasErrors = true;  // Modify the wrapper
                }
            });

            // Parse the content and walk the parse tree
            ParseTree tree = parser.plugin();
            ParseTreeWalker walker = new ParseTreeWalker();
            InterviewResponseListener listener = new InterviewResponseListener();
            walker.walk(listener, tree);

            // Save file if no errors are found
            if (!errorFlag.hasErrors&&!listener.errormsg) {
                // No errors, save data
                //TODO - Path needs to be changed
                saveFile(content, filePath);
                System.out.println("\nFile saved successfully.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Saves the given content to the specified file path.
     *
     * @param content The content to be saved.
     * @param newPath The path of the file where the content will be saved.
     * @throws IOException If an I/O error occurs.
     */
    private static void saveFile(String content, String newPath) throws IOException {
        Path path = Paths.get(newPath);
        Files.write(path, content.getBytes());
        System.out.println("File saved at: " + path + "as" + extractFilename(newPath));
        System.out.println("Saved as: " + extractFilename(newPath));
    }

    /**
     * Extracts the file name from the given file path.
     *
     * @param pathname The file path from which to extract the file name.
     * @return The file name extracted from the file path.
     */
    private static String extractFilename(String pathname) {
        Path path = Paths.get(pathname);
        return path.getFileName().toString();
    }
}