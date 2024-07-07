package main.java.com.example.designpatterns.chainofresponsibility;

public class ChainPatternDemo {


    /**
     * Returns a chain of loggers starting with an ErrorLogger, followed by a
     * FileLogger, and ending with a ConsoleLogger. The chain is set up such
     * that the log messages are first passed to the ErrorLogger, then to the
     * FileLogger, and finally to the ConsoleLogger. This allows for flexible
     * logging configurations.
     *
     * @return the chain of loggers starting with an ErrorLogger, followed by a
     * FileLogger, and ending with a ConsoleLogger.
     */

    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }



    /**
     * Main function to initialize a logger chain and log messages with
     * different levels of severity.
     *
     * @param args the command line arguments
     * @return void
     */
    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }
}
