package behavioral_patterns.mediator.example2.colleague;

public class TesterColleague extends Colleague{
    public TesterColleague(Mediator mediator) {
        super(mediator);
    }
    @Override
    public void notify(String message) {
        System.out.println("Сообщение тестеру: " + message);
    }
}
