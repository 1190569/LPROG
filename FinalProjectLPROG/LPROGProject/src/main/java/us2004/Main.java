package us2004;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<JobRequirements> jobRequirements = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Menu:");
            System.out.println("1. Upload Job Requirement");
            System.out.println("2. Upload Job Application");
            System.out.println("3. Print Job Requirements");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Please provide the path to the job requirement file:");
                    String jobReqFilePath = scanner.nextLine();
                    try {
                        JobRequirementVerifier verifier = new JobRequirementVerifier();
                        jobRequirements.add(verifier.verifyJobRequirements(jobReqFilePath));
                        System.out.println("Job requirement uploaded successfully.");
                    } catch (IOException e) {
                        System.err.println("Error reading file: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Please provide the path to the job application file:");
                    String jobAppFilePath = scanner.nextLine();
                    try {
                        JobAplicationVerifier verifier = new JobAplicationVerifier();
                        JobApplication jobApplication = verifier.verifyJobApplication(jobAppFilePath);
                        String title = jobApplication.getTitle();
                        JobRequirements matchingRequirement = findMatchingRequirement(title);
                        if (matchingRequirement != null) {
                            matchingRequirement.addJobApplication(jobApplication);
                            System.out.println("Job application uploaded successfully.");
                        } else {
                            System.err.println("Error: No matching job requirement found for this application. Please try again.");
                        }
                    } catch (IOException e) {
                        System.err.println("Error reading file: " + e.getMessage());
                    }
                    break;
                case 3:
                    // Print Job Requirements
                    printJobRequirements();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static JobRequirements findMatchingRequirement(String title) {
        for (JobRequirements requirement : jobRequirements) {
            if (requirement.getTitle().equals(title)) {
                return requirement;
            }
        }
        return null;
    }

    private static void printJobRequirements() {
        if (jobRequirements.isEmpty()) {
            System.out.println("No job requirements uploaded.");
        } else {
            System.out.println("List of Job Requirements:");
            for (JobRequirements requirement : jobRequirements) {
                System.out.println(requirement);
            }
        }
    }
}