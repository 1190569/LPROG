package us2004;

import jobAP.JobAplicationBaseListener;
import jobAP.JobAplicationParser;
import us2004.JobApplication;

import java.util.ArrayList;
import java.util.List;

public class JobAplicationListener extends JobAplicationBaseListener {
    private String title;
    private List<String> degreeArea;
    private List<String> degreeLevel;
    private List<String> tools;
    private int yearsOfExperience;

    public JobAplicationListener() {
        degreeArea = new ArrayList<>();
        degreeLevel = new ArrayList<>();
        tools = new ArrayList<>();
    }

    @Override
    public void enterPlugin(JobAplicationParser.PluginContext ctx) {
        title = ctx.ID().getText();
    }

    @Override
    public void enterDegreeArea(JobAplicationParser.DegreeAreaContext ctx) {
        for (int i = 0; i < ctx.STRING().size(); i++) {
            degreeArea.add(ctx.STRING(i).getText().replace("\"", ""));
        }
    }

    @Override
    public void enterDegreeLevel(JobAplicationParser.DegreeLevelContext ctx) {
        for (int i = 0; i < ctx.STRING().size(); i++) {
            degreeLevel.add(ctx.STRING(i).getText().replace("\"", ""));
        }
    }

    @Override
    public void enterTools(JobAplicationParser.ToolsContext ctx) {
        for (int i = 0; i < ctx.STRING().size(); i++) {
            tools.add(ctx.STRING(i).getText().replace("\"", ""));
        }
    }

    @Override
    public void enterYearsOfExperience(JobAplicationParser.YearsOfExperienceContext ctx) {
        yearsOfExperience = Integer.parseInt(ctx.INT().getText());
    }

    public JobApplication getJobApplication() {
        return new JobApplication(title,degreeArea.toArray(new String[0]),
                degreeLevel.toArray(new String[0]), tools.toArray(new String[0]), yearsOfExperience);
    }
}