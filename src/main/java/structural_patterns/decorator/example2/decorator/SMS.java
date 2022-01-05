package structural_patterns.decorator.example2.decorator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SMS implements Decorator{
    private Notifier notifier;
    @Override
    public void send(String message) {
        notifier.send(message);
        System.out.println("SMS: " + message);
    }
}
