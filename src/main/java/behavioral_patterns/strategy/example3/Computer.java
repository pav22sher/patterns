package behavioral_patterns.strategy.example3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Computer {
    private ComputerStrategy strategy;
    public void runTask() {
        if(strategy == null) {
            throw new RuntimeException("Not select strategy!");
        }
        this.strategy.execute();
    }
}
