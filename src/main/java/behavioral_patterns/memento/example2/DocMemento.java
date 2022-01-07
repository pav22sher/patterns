package behavioral_patterns.memento.example2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.awt.*;

@Getter
@AllArgsConstructor
public class DocMemento {
    private String text;
    private Color color;
}
