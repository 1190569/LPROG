package us2004;

import java.util.Arrays;

public class JobApplication {
    private String title;
    private String[] degreeArea;
    private String[] degreeLevel;
    private String[] tools;
    private int yearsOfExperience;

    // Constructor
    public JobApplication(String title, String[] degreeArea, String[] degreeLevel, String[] tools, int yearsOfExperience) {
        this.title = title;
        this.degreeArea = degreeArea;
        this.degreeLevel = degreeLevel;
        this.tools = tools;
        this.yearsOfExperience = yearsOfExperience;
    }

    // Getters
    public String getTitle() {
        return title;
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

    @Override
    public String toString() {
        return "JobApplication{" +
                "title='" + title + '\'' +
                ", degreeArea=" + Arrays.toString(degreeArea) +
                ", degreeLevel=" + Arrays.toString(degreeLevel) +
                ", tools=" + Arrays.toString(tools) +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }
}