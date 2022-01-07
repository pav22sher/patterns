package behavioral_patterns.command.example1.light;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Switch {
    private Command flipUpCommand;
    private Command flipDownCommand;
    public void flipUp(){
        flipUpCommand.execute();
    }
    public void flipDown(){
        flipDownCommand.execute();
    }
}
