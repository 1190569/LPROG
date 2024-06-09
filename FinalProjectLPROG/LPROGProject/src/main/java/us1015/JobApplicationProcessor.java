package us1015;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JobApplicationProcessor {

    private RequirementVerifier verifier;

    public JobApplicationProcessor(RequirementVerifier verifier) {
        this.verifier = verifier;
    }

    public void processApplication(JobApplication application) {
        if (verifier.verifyRequirements(application)) {
            System.out.println("Application meets the requirements.");
        } else {
            System.out.println("Application does not meet the requirements.");
        }
    }

    public static List<JobApplication> readApplicationsFromFile(String filename) {
        List<JobApplication> applications = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("JobRequirementSpec")) {
                    List<String> skills = new ArrayList<>();
                    int experience = 0;
                    List<String> degrees = new ArrayList<>();
                    List<String> degreeLevels = new ArrayList<>();
                    while ((line = br.readLine()) != null && !line.trim().equals(")")) {
                        if (line.trim().startsWith("Tools:")) {
                            skills = Arrays.asList(line.split(":")[1].trim().replace("\"", "").split(","));
                            skills = skills.stream().map(String::trim).collect(Collectors.toList());
                        } else if (line.trim().startsWith("Years of experience:")) {
                            experience = Integer.parseInt(line.split(":")[1].trim());
                        } else if (line.trim().startsWith("Degree area:")) {
                            degrees = Arrays.asList(line.split(":")[1].trim().replace("\"", "").split(","));
                            degrees = degrees.stream().map(String::trim).collect(Collectors.toList());
                        } else if (line.trim().startsWith("Degree level:")) {
                            degreeLevels = Arrays.asList(line.split(":")[1].trim().replace("\"", "").split(","));
                            degreeLevels = degreeLevels.stream().map(String::trim).collect(Collectors.toList());
                        }
                    }
                    String degree = String.join(", ", degrees); // Combine multiple degrees into a single string
                    String degreeLevel = String.join(", ", degreeLevels); // Combine multiple degree levels into a single string
                    applications.add(new JobApplication(skills, experience, degree, degreeLevel));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return applications;
    }

    public static void main(String[] args) {
        // Define the job requirements
        RequirementVerifier verifier = new DefaultRequirementVerifier(
                Arrays.asList("Java", "Git", "Python"), // required skills
                2, // minimum experience in years
                Arrays.asList("computer science", "software engineering"), // required degrees
                Arrays.asList("bachelor's", "master's") // required degree levels
        );

        JobApplicationProcessor processor = new JobApplicationProcessor(verifier);

        // Read applications from the file
        List<JobApplication> applications = readApplicationsFromFile("Test_4JobApplication.txt"); //TODO you need to change this file path

        // Debug: print the applications read
        for (JobApplication application : applications) {
            System.out.println("Read application: " + application.getSkills() + ", " + application.getExperience() + ", " + application.getDegree() + ", " + application.getDegreeLevel());
        }

        // Process each application
        for (JobApplication application : applications) {
            processor.processApplication(application);
        }
    }
}
