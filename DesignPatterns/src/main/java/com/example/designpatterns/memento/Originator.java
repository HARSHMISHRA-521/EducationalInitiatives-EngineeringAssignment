package main.java.com.example.designpatterns.memento;

public class Originator {

    private String state;

    /**
     * A description of the entire Java function.
     *
     * @param state	description of parameter
     * @return description of return value
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * Retrieves the current state of the object.
     *
     * @return the current state of the object as a string
     */

    public String getState() {
        return state;
    }


    /**
     * Saves the current state of the object to a Memento object.
     *
     * @return a Memento object containing the current state of the object
     */

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    /**
     * Sets the state of the object from the provided Memento object.
     *
     * @param memento the Memento object containing the state to be set
     */

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
