package behavioral_patterns.command.example3.remote;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private final List<Command> buttons = new ArrayList<>();
    public void addCommand(int numButton, Command command){
        buttons.add(numButton, command);
    }
    public void buttonPress(int numButton){
        buttons.get(numButton).execute();
    }
}
