package us1015;

import java.util.List;

public class JobApplication {
    private List<String> skills;
    private int experience; // in years
    private String degree;
    private String degreeLevel;

    public JobApplication(List<String> skills, int experience, String degree, String degreeLevel) {
        this.skills = skills;
        this.experience = experience;
        this.degree = degree;
        this.degreeLevel = degreeLevel;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDegreeLevel() {
        return degreeLevel;
    }

    public void setDegreeLevel(String degreeLevel) {
        this.degreeLevel = degreeLevel;
    }
}
