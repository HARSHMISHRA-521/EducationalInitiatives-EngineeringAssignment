package main.java.com.example.designpatterns.singleton;

public class SingletonPatternDemo {

    public static void main(String[] args) {
        // Get the only object available
        Singleton singleton = Singleton.getInstance();

        // Show the message
        singleton.showMessage();
    }   
}
