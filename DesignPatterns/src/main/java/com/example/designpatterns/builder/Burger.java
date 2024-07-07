package main.java.com.example.designpatterns.builder;

public abstract class Burger implements Item {

    /**
     * A description of the entire Java function.
     *
     * @return description of return value
     */

    @Override
    public Packing packing() {
        return new Wrapper();
    }


    /**
     * A description of the entire Java function.
     *
     * @return description of return value
     */
    
    @Override
    public abstract float price();
}
