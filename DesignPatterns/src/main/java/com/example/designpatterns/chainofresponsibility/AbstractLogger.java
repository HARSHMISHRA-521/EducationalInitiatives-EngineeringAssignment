package main.java.com.example.designpatterns.chainofresponsibility;

public abstract class AbstractLogger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    //next element in chain or responsibility
    protected AbstractLogger nextLogger;


    /**
     * Set the next logger in the chain of responsibility.
     *
     * @param nextLogger the next logger to set
     * @return void
     */


    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }


    /**
     * Logs a message with the specified level if the current logger's level is
     * less than or equal to the given level. If the next logger in the chain of
     * responsibility is not null, it calls the logMessage method on the next
     * logger.
     *
     * @param level the level of the message
     * @param message the message to be logged
     * @return void
     */

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);
}
