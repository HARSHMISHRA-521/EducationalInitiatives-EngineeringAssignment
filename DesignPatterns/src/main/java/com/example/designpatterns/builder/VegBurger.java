package main.java.com.example.designpatterns.builder;

public class VegBurger extends Burger {

    /**
     * Returns the price of the Veg Burger.
     *
     * @return the price of the Veg Burger
     */

    @Override
    public float price() {
        return 25.0f;
    }


    /**
     * Returns the name of the Veg Burger.
     *
     * @return the name of the Veg Burger as a string
     */
    
    @Override
    public String name() {
        return "Veg Burger";
    }
}
