package behavioral_patterns.command.example1.light;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TurnOnLightCommand implements Command{
    private Light light;
    public void execute(){
        light.turnOn();
    }
}
