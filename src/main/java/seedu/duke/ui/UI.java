package seedu.duke.ui;

public class UI {
    public static String logo;

    static {
        logo = """
                 ________  ________  _________  ___  ___  ___       ________  ________  ___  __      \s
                |\\   __  \\|\\   __  \\|\\___   ___\\\\  \\|\\  \\|\\  \\     |\\   __  \\|\\   ____\\|\\  \\|\\  \\    \s
                \\ \\  \\|\\  \\ \\  \\|\\  \\|___ \\  \\_\\ \\  \\\\\\  \\ \\  \\    \\ \\  \\|\\  \\ \\  \\___|\\ \\  \\/  /|_  \s
                 \\ \\   ____\\ \\   __  \\   \\ \\  \\ \\ \\   __  \\ \\  \\    \\ \\  \\\\\\  \\ \\  \\    \\ \\   ___  \\ \s
                  \\ \\  \\___|\\ \\  \\ \\  \\   \\ \\  \\ \\ \\  \\ \\  \\ \\  \\____\\ \\  \\\\\\  \\ \\  \\____\\ \\  \\\\ \\  \\\s
                   \\ \\__\\    \\ \\__\\ \\__\\   \\ \\__\\ \\ \\__\\ \\__\\ \\_______\\ \\_______\\ \\_______\\ \\__\\\\ \\__\\
                    \\|__|     \\|__|\\|__|    \\|__|  \\|__|\\|__|\\|_______|\\|_______|\\|_______|\\|__| \\|__|
      
                """;
    }

    public static void dash() {
        System.out.println("=======================================================================");
    }

    public static void userPrompt() {
        System.out.print("Pathlock awaits: ");
    }
    public static void opening() {
        System.out.println("WELCOME TO");
        System.out.println();
        System.out.println(logo);
        System.out.println("A CEG mod planner");
        dash();
    }

    public static void closing() {
        dash();
        System.out.println("Pathlock Closing");
        dash();
    }

    public static void unknownCommand() {
        dash();
        System.out.println("Unknown command, please refer to 'help' for list of commands");
        dash();
    }

    public static void help() {
        dash();
        System.out.println("fam idk the commands either rn xd");
        System.out.println("theres uhh 'help' !! and oh oh 'exit'");
        dash();
    }
}
