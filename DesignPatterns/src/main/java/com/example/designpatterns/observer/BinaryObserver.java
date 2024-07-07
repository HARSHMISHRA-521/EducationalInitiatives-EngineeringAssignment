package main.java.com.example.designpatterns.observer;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }


    /**
     * Prints the binary representation of the current state of the subject.
     *
     * @return void
     */

     
    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
