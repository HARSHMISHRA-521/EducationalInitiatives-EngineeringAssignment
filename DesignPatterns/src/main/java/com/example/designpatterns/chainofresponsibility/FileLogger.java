package main.java.com.example.designpatterns.chainofresponsibility;

public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    /**
     * Writes the given message to the file logger.
     *
     * @param message the message to be logged
     */
    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
