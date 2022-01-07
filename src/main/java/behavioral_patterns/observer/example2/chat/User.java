package behavioral_patterns.observer.example2.chat;

public class User implements ChatObserver{
    @Override
    public void update(String message) {
        System.out.println("User read message:" + message);
    }
}
