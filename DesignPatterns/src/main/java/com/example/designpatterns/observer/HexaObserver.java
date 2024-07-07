package main.java.com.example.designpatterns.observer;

public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }


    /**
     * Updates the observer with the current state of the subject in hexadecimal
     * format.
     *
     * This method is called when the subject notifies its observers of a
     * change. It retrieves the current state of the subject using the
     * `getState()` method and converts it to a hexadecimal string. The
     * resulting string is then printed to the console with the prefix "Hex
     * String: ".
     *
     * @see Subject#getState()
     * @see Integer#toHexString(int)
     */

     
    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
