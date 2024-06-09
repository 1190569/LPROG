package us2004;

import jobReq.JobReqspec_1BaseListener;
import jobReq.JobReqspec_1Parser;

import java.util.ArrayList;
import java.util.List;

public class JobReqListener extends JobReqspec_1BaseListener {
    private String title;
    private String description;
    private List<String> degreeArea;
    private List<String> degreeLevel;
    private List<String> tools;
    private int yearsOfExperience;

    public JobReqListener() {
        degreeArea = new ArrayList<>();
        degreeLevel = new ArrayList<>();
        tools = new ArrayList<>();
    }

    @Override
    public void enterPlugin(JobReqspec_1Parser.PluginContext ctx) {
        title = ctx.ID().getText();
    }

    @Override
    public void enterJobReqParams(JobReqspec_1Parser.JobReqParamsContext ctx) {
        description = ctx.STRING(0).getText();
    }

    @Override
    public void enterDegreeArea(JobReqspec_1Parser.DegreeAreaContext ctx) {
        for (int i = 0; i < ctx.STRING().size(); i++) {
            degreeArea.add(ctx.STRING(i).getText().replace("\"", ""));
        }
    }

    @Override
    public void enterDegreeLevel(JobReqspec_1Parser.DegreeLevelContext ctx) {
        for (int i = 0; i < ctx.STRING().size(); i++) {
            degreeLevel.add(ctx.STRING(i).getText().replace("\"", ""));
        }
    }

    @Override
    public void enterTools(JobReqspec_1Parser.ToolsContext ctx) {
        for (int i = 0; i < ctx.STRING().size(); i++) {
            tools.add(ctx.STRING(i).getText().replace("\"", ""));
        }
    }

    @Override
    public void enterYearsOfExperience(JobReqspec_1Parser.YearsOfExperienceContext ctx) {
        yearsOfExperience = Integer.parseInt(ctx.INT().getText());
    }

    public JobRequirements getJobRequirements() {
        return new JobRequirements(title, description, degreeArea.toArray(new String[0]),
                degreeLevel.toArray(new String[0]), tools.toArray(new String[0]), yearsOfExperience);
    }
}