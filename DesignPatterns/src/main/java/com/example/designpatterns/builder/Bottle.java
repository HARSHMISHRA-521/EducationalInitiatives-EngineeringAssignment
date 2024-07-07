package main.java.com.example.designpatterns.builder;

public class Bottle implements Packing {

    /**
     * Returns a string representation of the packing type for the Bottle class.
     *
     * @return a string representation of the packing type for the Bottle class
     */

    @Override
    public String pack() {
        return "Bottle";
    }
}
