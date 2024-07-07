package main.java.com.example.designpatterns.factory;

public class Square implements Shape {

    /**
     * Draws a square by printing a message indicating that the Square::draw()
     * method is being executed.
     *
     * @return void
     */

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
