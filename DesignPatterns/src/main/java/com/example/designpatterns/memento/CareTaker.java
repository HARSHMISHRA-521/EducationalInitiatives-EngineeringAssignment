package main.java.com.example.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    /**
     * A description of the entire Java function.
     *
     * @param state description of parameter
     * @return description of return value
     */

    public void add(Memento state) {
        mementoList.add(state);
    }

    /**
     * Retrieves the Memento object at the specified index from the mementoList.
     *
     * @param index the index of the Memento object to retrieve
     * @return the Memento object at the specified index
     */

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
