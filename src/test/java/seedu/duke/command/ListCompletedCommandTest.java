package seedu.duke.command;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import seedu.duke.exception.DuplicateException;
import seedu.duke.module.Module;
import seedu.duke.module.ModuleList;

public class ListCompletedCommandTest {
    @Test
    public void execute_noCompletedModules_returnsEmptyMessage() {
        ModuleList modules = new ModuleList();
        ListCompletedCommand command = new ListCompletedCommand();
        String result = command.execute(modules);
        assertEquals("No modules completed yet.", result);
    }

    @Test
    public void execute_withCompletedModules_returnsCompletedList() throws DuplicateException {
        ModuleList modules = new ModuleList();
        modules.addModule(new Module("CS2113",4));
        modules.addModule(new Module("CS1231",4));
        ListCompletedCommand command = new ListCompletedCommand();
        String result = command.execute(modules);
        assertTrue(result.contains("CS2113"));
        assertTrue(result.contains("CS1231"));
    }
}
