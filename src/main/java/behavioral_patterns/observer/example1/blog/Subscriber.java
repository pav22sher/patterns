package behavioral_patterns.observer.example1.blog;

import java.util.Observable;
import java.util.Observer;

public class Subscriber implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("New article is been created " + arg);
    }
}