package main.java.com.example.designpatterns.factory;

public class Rectangle implements Shape {


    /**
     * Draws the rectangle by printing a message to the console indicating that
     * the rectangle is being drawn.
     *
     * @return void
     */

     
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
