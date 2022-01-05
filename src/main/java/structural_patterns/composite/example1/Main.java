package structural_patterns.composite.example1;

import structural_patterns.composite.example1.graph.Circle;
import structural_patterns.composite.example1.graph.CompoundGraphic;
import structural_patterns.composite.example1.graph.Dot;

public class Main {
    public static void main(String[] args) {
        CompoundGraphic graphic = new CompoundGraphic();
        graphic.add(new Dot(1, 1));
        graphic.add(new Circle(1, 1, 10));
        CompoundGraphic childGraphic = new CompoundGraphic();
        childGraphic.add(new Dot(2, 2));
        childGraphic.add(new Circle(2, 2, 20));
        graphic.add(childGraphic);
        graphic.draw();
    }
}
