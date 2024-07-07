package main.java.com.example.designpatterns.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        // private constructor to prevent instantiation
    }   


    /**
     * Returns the singleton instance of the Singleton class. If no instance
     * exists, a new instance is created and returned.
     *
     * @return the singleton instance of the Singleton class
     */

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }



    /**
     * Prints the message "Hello World!" to the console.
     *
     * @return void
     */
    public void showMessage() {
        System.out.println("Hello World!");
    }
}
