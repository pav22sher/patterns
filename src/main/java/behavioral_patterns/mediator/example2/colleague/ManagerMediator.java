package behavioral_patterns.mediator.example2.colleague;

import java.util.ArrayList;
import java.util.List;

public class ManagerMediator extends Mediator {
    private final List<Colleague> colleagues = new ArrayList<>();

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void send(String msg, Colleague clg) {
        for (Colleague colleague : colleagues) {
            if (colleague != clg) {
                colleague.notify(msg);
            }
        }
    }
}
