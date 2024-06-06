package us2004;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the path to the input directory:");
        String directoryPath = scanner.nextLine();
        scanner.close(); // Close the scanner to prevent resource leaks

        JobRequirementVerifier verifier = new JobRequirementVerifier();
        verifier.verifyJobRequirements(directoryPath);
    }
}