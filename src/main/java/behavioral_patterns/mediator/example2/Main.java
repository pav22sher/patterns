package behavioral_patterns.mediator.example2;

import behavioral_patterns.mediator.example2.colleague.ManagerMediator;
import behavioral_patterns.mediator.example2.colleague.ProgrammerColleague;
import behavioral_patterns.mediator.example2.colleague.TesterColleague;

public class Main {
    public static void main(String[] args) {
        ManagerMediator mediator = new ManagerMediator();
        ProgrammerColleague programmer = new ProgrammerColleague(mediator);
        TesterColleague tester = new TesterColleague(mediator);
        mediator.addColleague(programmer);
        mediator.addColleague(tester);
        programmer.send("Hello world!");
        tester.send("Hello world too!");
    }
}
