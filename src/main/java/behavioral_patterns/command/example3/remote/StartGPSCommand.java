package behavioral_patterns.command.example3.remote;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StartGPSCommand implements Command{
    private GPS gps;
    @Override
    public void execute() {
        gps.start();
    }
}
