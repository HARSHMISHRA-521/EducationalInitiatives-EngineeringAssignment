package main.java.com.example.designpatterns.facade;

        
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }


    /**
     * Draws a circle using the ShapeMaker's circle object.
     *
     * This method calls the draw() method of the circle object, which is
     * responsible for rendering the circle on the screen.
     *
     * @throws NullPointerException if the circle object is null
     */
    public void drawCircle() {
        circle.draw();
    }



    /**
     * Draws a rectangle using the ShapeMaker's rectangle object.
     *
     * This method calls the draw() method of the rectangle object, which is
     * responsible for rendering the rectangle on the screen.
     *
     * @throws NullPointerException if the rectangle object is null
     */
    public void drawRectangle() {
        rectangle.draw();
    }



    /**
     * Draws a square using the ShapeMaker's square object.
     *
     * This method calls the draw() method of the square object, which is
     * responsible for rendering the square on the screen.
     *
     * @throws NullPointerException if the square object is null
     */
    public void drawSquare() {
        square.draw();
    }
}
