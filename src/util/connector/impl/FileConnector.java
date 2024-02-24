package util.connector.impl;

import util.connector.Connectable;

import java.io.File;

public class FileConnector implements Connectable {
    public static final String LOGFILE_PATH = "log.txt";
    public static void createLogFile() {
        try {
            File logFile = new File(LOGFILE_PATH);
            if (logFile.createNewFile()) {
                System.out.println("Log file created");
            }
            else {
                System.out.println("Log file already exists");
            }
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}
