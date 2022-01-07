package behavioral_patterns.observer.example2.chat;

import java.util.ArrayList;
import java.util.List;

public class Chat {
    private final List<String> messages = new ArrayList<>();
    private final List<ChatObserver> observers = new ArrayList<>();

    public void addObserver(ChatObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ChatObserver observer) {
        observers.remove(observer);
    }

    public void addMessage(String message) {
        messages.add(message);
        notifyObservers(message);
    }

    private void notifyObservers(String message) {
        for (ChatObserver observer : observers) {
            observer.update(message);
        }
    }
}
