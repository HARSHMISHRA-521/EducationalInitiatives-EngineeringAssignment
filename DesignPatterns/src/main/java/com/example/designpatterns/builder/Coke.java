package main.java.com.example.designpatterns.builder;

public class Coke extends ColdDrink {

    /**
     * Returns the price of a Coke drink.
     *
     * @return the price of a Coke drink as a float value
     */

    @Override
    public float price() {
        return 30.0f;
    }


    /**
     * Returns the name of the Coke drink.
     *
     * @return the name of the Coke drink as a string
     */
    
    @Override
    public String name() {
        return "Coke";
    }
}
