package seedu.duke.command;

import seedu.duke.appState.AppState;
import seedu.duke.module.ModuleList;
import seedu.duke.module.Module;
import seedu.duke.planner.PlannerList;
import seedu.duke.profile.UserProfile;

public class AddToPlannerCommand extends Command {
    private static final int MINIMUM_WORKLOAD = 18;

    private final String moduleCode;
    private final String semester;

    public AddToPlannerCommand(String moduleCode, String semester) {
        this.moduleCode = moduleCode.toUpperCase();
        this.semester = semester;
    }

    @Override
    public String execute(AppState appState) {
        ModuleList moduleList = appState.getModule();
        PlannerList planner = appState.getPlanner();
        UserProfile profile = appState.getProfile();

        Module module = moduleList.getModule(moduleCode);
        if (module == null) {
            return moduleCode + " is not a recognised module.";
        }

        if (planner.containsModule(moduleCode)) {
            String existingSemester = planner.findSemesterOfModule(moduleCode);
            return moduleCode + " is already planned in " + existingSemester + ".";
        }

        module.setSemester(semester);
        planner.addModule(module);

        int currentWorkload = planner.getSemesterWorkload(semester);
        int recommendedMax = profile.getRecommendedMaxWorkload();

        StringBuilder sb = new StringBuilder();
        sb.append("Module ").append(module.getModuleCode())
                .append(" added to ").append(semester).append(".\n");
        sb.append("Current workload for ").append(semester)
                .append(": ").append(currentWorkload).append(" MCs\n");
        sb.append("[INFO] Maximum workload based on GPA ")
                .append(String.format("%.2f", profile.getGpa()))
                .append(": ").append(recommendedMax).append(" MCs");

        if (currentWorkload > recommendedMax) {
            sb.append("\n[WARNING] You are exceeding the maximum semester workload.");
        }

        if (currentWorkload < MINIMUM_WORKLOAD) {
            sb.append("\n[WARNING] You are below the minimum workload of ")
                    .append(MINIMUM_WORKLOAD)
                    .append(" MCs for this semester.");
        }

        return sb.toString();
    }
}
