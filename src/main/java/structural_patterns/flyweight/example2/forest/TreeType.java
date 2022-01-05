package structural_patterns.flyweight.example2.forest;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.awt.*;

@AllArgsConstructor
@Getter
public class TreeType {
    private String name;
    private Color color;
    private Image image;
}
