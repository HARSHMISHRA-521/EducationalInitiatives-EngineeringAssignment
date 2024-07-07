package main.java.com.example.designpatterns.builder;

public class Pepsi extends ColdDrink {

    /**
     * A description of the entire Java function.
     *
     * @return description of return value
     */

    @Override
    public float price() {
        return 35.0f;
    }


    /**
     * Returns the name of the Pepsi object.
     *
     * @return a string representing the name of the Pepsi object
     */
    @Override
    public String name() {
        return "Pepsi";
    }
}
