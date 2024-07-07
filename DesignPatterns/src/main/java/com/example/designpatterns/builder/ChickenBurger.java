package main.java.com.example.designpatterns.builder;

public class ChickenBurger extends Burger {

    /**
     * A description of the entire Java function.
     *
     * @return description of return value
     */

    @Override
    public float price() {
        return 50.5f;
    }


    /**
     * Returns the name of the chicken burger.
     *
     * @return the name of the chicken burger
     */ 
    @Override
    public String name() {
        return "Chicken Burger";
    }
}
