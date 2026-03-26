package seedu.duke.module;

import java.util.List;

public class Module {
    private final String code;
    private final int mc;
    private final String type;
    private final String orGroup;
    private final List<String> prerequisites;
    private final List<String> preclusions;
    private ModuleStatus status;

    public Module(String code, int mc, String type, String orGroup,
                  List<String> prerequisites, List<String> preclusions) {
        this.code = code;
        this.mc = mc;
        this.type = type;
        this.orGroup = orGroup;
        this.prerequisites = prerequisites;
        this.preclusions = preclusions;
        this.status = ModuleStatus.INCOMPLETE;
    }

    public Module(String code, int mc) {
        this(code, mc, null, null, List.of(), List.of());
    }

    public String getModuleCode() {
        return code;
    }

    public int getModularCredits() {
        return mc;
    }

    public String getType() {
        return type;
    }

    public String getOrGroup() {
        return orGroup;
    }

    public List<String> getPrerequisites() {
        return prerequisites;
    }

    public List<String> getPreclusions() {
        return preclusions;
    }

    public ModuleStatus getStatus() {
        return status;
    }

    public void setStatus(ModuleStatus status) {
        this.status = status;
    }

    public boolean isCompleted() {
        return status == ModuleStatus.COMPLETED;
    }

    public void markCompleted() {
        this.status = ModuleStatus.COMPLETED;
    }

    public void markIncompleted() {
        this.status = ModuleStatus.INCOMPLETE;
    }

    @Override
    public String toString() {
        return code;
    }
}
