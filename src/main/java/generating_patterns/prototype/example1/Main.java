package generating_patterns.prototype.example1;

import generating_patterns.prototype.example1.shape.Circle;
import generating_patterns.prototype.example1.shape.Rectangle;
import generating_patterns.prototype.example1.shape.Shape;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        Shape circleClone = circle.clone();

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        Shape rectangleClone = rectangle.clone();
    }
}
