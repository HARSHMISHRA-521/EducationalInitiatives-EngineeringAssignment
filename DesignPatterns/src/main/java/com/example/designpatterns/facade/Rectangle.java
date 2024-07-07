package main.java.com.example.designpatterns.facade;

public class Rectangle implements Shape {


    /**
     * Draws a rectangle.
     *
     * This method prints a message to the console indicating that    *  a   rectangle is being drawn.
     *
     * @return void
     */
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
