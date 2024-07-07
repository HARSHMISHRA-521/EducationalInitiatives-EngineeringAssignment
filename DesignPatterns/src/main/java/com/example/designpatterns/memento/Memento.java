package main.java.com.example.designpatterns.memento;

public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }


    /**
     * Returns the current state of the Memento object.
     *
     * @return the state of the Memento object
     */
    
    public String getState() {
        return state;
    }
}
