package seedu.duke.command;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import seedu.duke.module.ModuleList;

public class ListNeededCommandTest {
    @Test
    public void execute_returnsAllRequiredModules() {
        ModuleList modules = new ModuleList();
        ListNeededCommand command = new ListNeededCommand();
        String result = command.execute(modules);
        assertTrue(result.contains("Modules required for graduation:"));
        assertTrue(result.contains("CS2113"));
        assertTrue(result.contains("MA1511"));
        assertTrue(result.contains("CG4002"));
        assertTrue(result.contains("CS1010"));
    }
}
