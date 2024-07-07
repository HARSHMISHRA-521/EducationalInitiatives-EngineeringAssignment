package main.java.com.example.designpatterns.observer;



public class ObserverPatternDemo {
    /**
     * This is the main method of the ObserverPatternDemo class. It creates a
     * Subject object and registers three Observer objects (HexaObserver,
     * OctalObserver, and BinaryObserver) to observe the state changes of the
     * Subject. It then sets the state of the Subject to 15 and 10, triggering
     * state change notifications to the registered Observers.
     *
     * @param args the command line arguments
     */



        public static void main(String[] args) {
            Subject subject = new Subject();

            new HexaObserver(subject);
            new OctalObserver(subject);
            new BinaryObserver(subject);

            System.out.println("First state change: 15");
            subject.setState(15);
            System.out.println("Second state change: 10");
            subject.setState(10);
        }
    }

