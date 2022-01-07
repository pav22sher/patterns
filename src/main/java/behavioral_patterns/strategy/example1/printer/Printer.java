package behavioral_patterns.strategy.example1.printer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Printer {
    private PrintingStrategy strategy;
    public void print(Document document) {
        this.strategy.print(document);
    }
}
