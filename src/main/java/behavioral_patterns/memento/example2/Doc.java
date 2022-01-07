package behavioral_patterns.memento.example2;

import lombok.*;

import java.awt.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Doc {
    private String text;
    private Color color;
    public DocMemento saveState() {
        return new DocMemento(text, color);
    }
    public void restoreState(DocMemento memento) {
        text = memento.getText();
        color = memento.getColor();
    }
}
