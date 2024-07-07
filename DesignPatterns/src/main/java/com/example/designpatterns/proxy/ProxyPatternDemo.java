package main.java.com.example.designpatterns.proxy;

public class ProxyPatternDemo {

    /**
     * Entry point for the Java application.
     *
     * @param args	Command line arguments
     * @return void
     */

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // image will be loaded from disk
        image.display();
        System.out.println("");

        // image will not be loaded from disk
        image.display();
    }
}
