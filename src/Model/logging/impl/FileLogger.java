package Model.logging.impl;

import Model.calculate.impl.ComplexNumber;
import Model.logging.Loggerable;
import util.connector.impl.FileConnector;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileLogger implements Loggerable<ComplexNumber> {

    private final File logFile;

    public FileLogger() {
        logFile = new File(FileConnector.LOGFILE_PATH);
    }

    @Override
    public void addLog(LocalDateTime time, String msg, ComplexNumber result) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) {
            writer.write(time + " ");
            writer.write(msg + " ");
            writer.write(result + " " + "\n");
            writer.flush();
        } catch (IOException e) {
            System.out.println("Log not added");
        }
    }
}
