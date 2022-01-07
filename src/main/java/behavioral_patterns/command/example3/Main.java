package behavioral_patterns.command.example3;

import behavioral_patterns.command.example3.remote.*;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Engine engine = new Engine();
        GPS gps = new GPS();
        StartEngineCommand startEngineCommand = new StartEngineCommand(engine);
        StartGPSCommand startGPSCommand = new StartGPSCommand(gps);
        remoteControl.addCommand(0, startEngineCommand);
        remoteControl.addCommand(1, startGPSCommand);
        remoteControl.buttonPress(1);
        remoteControl.buttonPress(0);
    }
}
