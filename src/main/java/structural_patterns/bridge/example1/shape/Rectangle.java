package structural_patterns.bridge.example1.shape;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import structural_patterns.bridge.example1.color.Color;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }
}
