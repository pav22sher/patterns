package structural_patterns.decorator.example2.decorator;

public class DefaultNotifier implements Notifier{
    @Override
    public void send(String message) {
        System.out.println("Send msg:" + message);
    }
}
