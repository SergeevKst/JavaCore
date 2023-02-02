package intrerface.privatemethod;

import java.io.*;
/*
private method видны только в интерфейсах служат для скрытия логики о
которой даже не узнают
 */
public interface Logger {

    default void writeErrorMessage(String message) {
        File file = new File("recourses", "Error");
        writeToLoggerFile(file, message);
    }

    default void writeWarningMessage(String message) {
        File file = new File("recourses", "Warning");
        writeToLoggerFile(file, message);
    }

    private void writeToLoggerFile(File file, String message) {
        try (var pw = new PrintWriter(new FileWriter(file, true))) {
            pw.print(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
