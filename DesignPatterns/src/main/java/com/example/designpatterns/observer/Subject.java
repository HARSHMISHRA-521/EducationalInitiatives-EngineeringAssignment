package main.java.com.example.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;


    /**
     * Retrieves the current state of the object.
     *
     * @return the current state of the object
     */

    public int getState() {
        return state;
    }


    /**
     * Sets the state of the object and notifies all observers.
     *
     * @param state the new state of the object
     */


    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }


    /**
     * Attaches an observer to the subject.
     *
     * @param observer the observer to be attached
     */

    public void attach(Observer observer) {
        observers.add(observer);
    }


    /**
     * Notifies all observers by calling their update method.
     *
     * @return void
     */
    
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
