package main.java.com.example.designpatterns.facade;

public class FacadePatternDemo {


    /**
     * The main method of the program. It creates a new instance of the
     * ShapeMaker class and calls its drawCircle, drawRectangle, and drawSquare
     * methods to draw shapes.
     *
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle(); 
        shapeMaker.drawSquare();
    }
}
