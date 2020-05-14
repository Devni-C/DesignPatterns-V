package logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;

public class MyLogger {
    private static volatile MyLogger instance;

    //Retrieve the execution directory
    private String fileName = "mylog";
    protected String path = System.getProperty("user.dir");
    private static File logFile;

    private MyLogger() {
        if (instance != null) {
            throw new IllegalStateException("Cannot instantiate a new singleton instance of log");
        }
        this.createLogFile();
    }

    public static MyLogger getInstance() {
        if (instance == null) {
            synchronized (MyLogger.class) {
                if (instance == null) {
                    instance = new MyLogger();
                }
            }
        }
        return instance;
    }

    public void createLogFile() {
        File logsFolder = new File(path + '/' + "logs");
        if (!logsFolder.exists()) {
            System.err.println("INFO: Creating new logs directory in " + path);
            logsFolder.mkdir();
        }

        Instant datetime = Instant.now();
        String date = datetime.toString().substring(0, 10);

        //Create the name of the log file from path and date
        fileName = fileName + '-' + date + ".log";
        MyLogger.logFile = new File(logsFolder.getName(), fileName);
        try {
            if (logFile.createNewFile()) {
                System.err.println("INFO: Creating new log file");
            }
        } catch (IOException e) {
            System.err.println("ERROR: Cannot create log file");
            System.exit(1);
        }
    }

    public static void log(String message) {
        try {
            FileWriter out = new FileWriter(MyLogger.logFile, true);
            out.write(message.toCharArray());
            out.close();
        } catch (IOException e) {
            System.err.println("ERROR: Could not write to log file");
        }
    }
}
