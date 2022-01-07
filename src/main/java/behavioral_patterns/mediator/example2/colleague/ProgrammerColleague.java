package behavioral_patterns.mediator.example2.colleague;

public class ProgrammerColleague extends Colleague{
    public ProgrammerColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Сообщение программисту: " + message);
    }
}
