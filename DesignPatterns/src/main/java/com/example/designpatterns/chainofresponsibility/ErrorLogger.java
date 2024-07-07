package main.java.com.example.designpatterns.chainofresponsibility;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    /**
     * Writes the given message to the console with an error prefix.
     *
     * @param message the message to be written
     * @return void
     */

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
