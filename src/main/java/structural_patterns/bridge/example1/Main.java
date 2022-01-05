package structural_patterns.bridge.example1;

import structural_patterns.bridge.example1.color.RedColor;
import structural_patterns.bridge.example1.shape.Rectangle;
import structural_patterns.bridge.example1.shape.Shape;

public class Main {
    public static void main(String[] args) {
        RedColor redColor = new RedColor();
        Shape shape = new Rectangle(redColor, 1, 1);
        shape.applyColor();
    }
}
