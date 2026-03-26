package seedu.duke.storage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.logging.Level;
import java.util.logging.Logger;


import seedu.duke.module.Module;

public class Storage {
    private static final Logger logger = Logger.getLogger(Storage.class.getName());
    private static final String filePath = "data/duke.txt";

    public List<Module> load() throws IOException {

        File file = new File(filePath);

        logger.info("Loading modules from file: " + filePath);

        file.getParentFile().mkdirs();

        if (!file.exists()) {
            file.createNewFile();
            logger.warning("Save file not found. Created new file at " + filePath);
        }

        List<Module> modules = new ArrayList<>();

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            String[] parts = line.split("\\|");
            logger.log(Level.FINE, "Reading line: {0}", line);


            String code = parts[0];
            int mc = Integer.parseInt(parts[1]);

            Module module = new Module(code, mc);
            module.markCompleted();

            modules.add(module);
        }
        scanner.close();
        return modules;
    }
    public static void save(List<Module> modules) throws IOException {

        FileWriter writer = new FileWriter(filePath);

        for (Module module : modules) {
            writer.write(module.getModuleCode() + "|" +
                    module.getModularCredits());
            writer.write("\n");
        }

        writer.close();
    }
}
