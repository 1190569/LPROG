package us1015;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultRequirementVerifier implements RequirementVerifier {

    private List<String> requiredSkills;
    private int minimumExperience; // in years
    private List<String> requiredDegrees;
    private List<String> requiredDegreeLevels;

    public DefaultRequirementVerifier(List<String> requiredSkills, int minimumExperience, List<String> requiredDegrees, List<String> requiredDegreeLevels) {
        this.requiredSkills = requiredSkills.stream().map(String::toLowerCase).collect(Collectors.toList());
        this.minimumExperience = minimumExperience;
        this.requiredDegrees = requiredDegrees.stream().map(String::toLowerCase).collect(Collectors.toList());
        this.requiredDegreeLevels = requiredDegreeLevels.stream().map(String::toLowerCase).collect(Collectors.toList());
    }

    @Override
    public boolean verifyRequirements(JobApplication application) {
        System.out.println("Verifying application with skills: " + application.getSkills() + ", experience: " + application.getExperience() + ", degree: " + application.getDegree() + ", degree level: " + application.getDegreeLevel());
        System.out.println("Required skills: " + requiredSkills + ", minimum experience: " + minimumExperience + ", required degrees: " + requiredDegrees + ", required degree levels: " + requiredDegreeLevels);

        boolean hasSkills = hasRequiredSkills(application.getSkills());
        boolean hasExperience = hasRequiredExperience(application.getExperience());
        boolean hasDegree = hasRequiredDegree(application.getDegree());
        boolean hasDegreeLevel = hasRequiredDegreeLevel(application.getDegreeLevel());

        System.out.println("Has required skills: " + hasSkills);
        System.out.println("Has required experience: " + hasExperience);
        System.out.println("Has required degree: " + hasDegree);
        System.out.println("Has required degree level: " + hasDegreeLevel);

        return hasSkills && hasExperience && hasDegree && hasDegreeLevel;
    }

    private boolean hasRequiredSkills(List<String> applicantSkills) {
        List<String> applicantSkillsLower = applicantSkills.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println("Applicant skills: " + applicantSkillsLower);
        return applicantSkillsLower.containsAll(requiredSkills);
    }

    private boolean hasRequiredExperience(int applicantExperience) {
        return applicantExperience >= minimumExperience;
    }

    private boolean hasRequiredDegree(String applicantDegree) {
        List<String> applicantDegrees = Arrays.asList(applicantDegree.toLowerCase().split(",")).stream().map(String::trim).collect(Collectors.toList());
        System.out.println("Applicant degrees: " + applicantDegrees);
        boolean result = requiredDegrees.stream().anyMatch(applicantDegrees::contains);
        return result;
    }

    private boolean hasRequiredDegreeLevel(String applicantDegreeLevel) {
        List<String> applicantDegreeLevels = Arrays.asList(applicantDegreeLevel.toLowerCase().split(",")).stream().map(String::trim).collect(Collectors.toList());
        System.out.println("Applicant degree levels: " + applicantDegreeLevels);
        boolean result = requiredDegreeLevels.stream().anyMatch(applicantDegreeLevels::contains);
        return result;
    }
}
