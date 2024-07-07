package main.java.com.example.designpatterns.factory;

public class Circle implements Shape {

    /**
     * Draws the circle by printing a message to the console.
     *
     * This method overrides the draw() method from the Shape interface. It
     * prints a message to the console indicating that the draw() method of the
     * Circle class is being called.
     */
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
