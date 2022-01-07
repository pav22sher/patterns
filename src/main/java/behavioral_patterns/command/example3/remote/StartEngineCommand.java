package behavioral_patterns.command.example3.remote;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StartEngineCommand implements Command{
    private Engine engine;
    @Override
    public void execute(){
        engine.start();
    }
}
