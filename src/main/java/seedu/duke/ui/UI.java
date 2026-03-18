package seedu.duke.ui;

public class UI {
    public static String logo = """
                                      ,,                                              \s
            `7MM""\"Mq.         mm   `7MM        `7MMF'                       `7MM     \s
              MM   `MM.        MM     MM          MM                           MM     \s
              MM   ,M9 ,6"Yb.mmMMmm   MMpMMMb.    MM         ,pW"Wq.   ,p6"bo  MM  ,MP'
              MMmmdM9 8)   MM  MM     MM    MM    MM        6W'   `Wb 6M'  OO  MM ;Y  \s
              MM       ,pm9MM  MM     MM    MM    MM      , 8M     M8 8M       MM;Mm  \s
              MM      8M   MM  MM     MM    MM    MM     ,M YA.   ,A9 YM.    , MM `Mb.\s
            .JMML.    `Moo9^Yo.`Mbmo.JMML  JMML..JMMmmmmMMM  `Ybmd9'   YMbmd'.JMML. YA.
            
            """;

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
