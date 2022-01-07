package behavioral_patterns.command.example1;

import behavioral_patterns.command.example1.light.*;

public class Main {
    public static void main(String[] args) {
        Light lightReceiver = new Light();
        Command switchUpCommand = new TurnOnLightCommand(lightReceiver);
        Command switchDownCommand = new TurnOffLightCommand(lightReceiver);
        Switch invokerSwitch = new Switch(switchUpCommand, switchDownCommand);
        invokerSwitch.flipUp();
        invokerSwitch.flipDown();
    }
}
