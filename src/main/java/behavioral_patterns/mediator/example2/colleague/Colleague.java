package behavioral_patterns.mediator.example2.colleague;

public abstract class Colleague {
    private final Mediator mediator;
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(String message) {
        System.out.println("Send message: " + message);
        mediator.send(message, this);
    }
    public abstract void notify(String message);
}
