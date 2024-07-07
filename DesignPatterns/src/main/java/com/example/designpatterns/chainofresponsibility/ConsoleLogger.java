package main.java.com.example.designpatterns.chainofresponsibility;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }


    /**
     * A description of the entire Java function.
     *
     * @param message	description of parameter
     * @return description of return value
     */
    
    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
