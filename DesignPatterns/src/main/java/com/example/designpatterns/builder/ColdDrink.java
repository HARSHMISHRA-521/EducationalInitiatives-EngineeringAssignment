package main.java.com.example.designpatterns.builder;

public abstract class ColdDrink implements Item {

    /**
     * Returns a new instance of the `Bottle` class, which implements the
     * `Packing` interface.
     *
     * @return a new `Bottle` instance
     */
    @Override
    public Packing packing() {
        return new Bottle();
    }


    /**
     * Returns the price of the ColdDrink.
     *
     * @return the price of the ColdDrink
     */
    @Override
    public abstract float price();
}

