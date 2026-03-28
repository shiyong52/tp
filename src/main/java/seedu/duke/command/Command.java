package seedu.duke.command;

import seedu.duke.appState.AppState;

public abstract class Command {
    public abstract String execute(AppState appState);
}
