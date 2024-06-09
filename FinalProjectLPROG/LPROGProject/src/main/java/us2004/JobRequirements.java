package us2004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class JobRequirements {
    private String title;
    private String description;
    private String[] degreeArea;
    private String[] degreeLevel;
    private String[] tools;
    private int yearsOfExperience;
    private List<JobApplication> jobApplications; // List to store job applications

    // Constructor
    public JobRequirements(String title, String description, String[] degreeArea, String[] degreeLevel, String[] tools, int yearsOfExperience) {
        this.title = title;
        this.description = description;
        this.degreeArea = degreeArea;
        this.degreeLevel = degreeLevel;
        this.tools = tools;
        this.yearsOfExperience = yearsOfExperience;
        this.jobApplications = new ArrayList<>(); // Initialize the list
    }

    // Getters and setters
    // For brevity, I'm omitting the setters. You can add them if needed.

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String[] getDegreeArea() {
        return degreeArea;
    }

    public String[] getDegreeLevel() {
        return degreeLevel;
    }

    public String[] getTools() {
        return tools;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public List<JobApplication> getJobApplications() {
        return jobApplications;
    }

    // Method to add a job application to the list
    public void addJobApplication(JobApplication application) {
        jobApplications.add(application);
    }

    // Other methods (if needed)

    @Override
    public String toString() {
        return "JobRequirements{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", degreeArea=" + Arrays.toString(degreeArea) +
                ", degreeLevel=" + Arrays.toString(degreeLevel) +
                ", tools=" + Arrays.toString(tools) +
                ", yearsOfExperience=" + yearsOfExperience +
                ", jobApplications=" + jobApplications +
                '}';
    }
}