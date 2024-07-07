package main.java.com.example.designpatterns.observer;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * Updates the state of the observer by printing the octal representation of
     * the subject's state.
     *
     * @return void
     */

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
