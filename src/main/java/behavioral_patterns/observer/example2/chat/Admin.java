package behavioral_patterns.observer.example2.chat;

public class Admin implements ChatObserver{
    @Override
    public void update(String message) {
        System.out.println("Admin read message:" + message);
    }
}
