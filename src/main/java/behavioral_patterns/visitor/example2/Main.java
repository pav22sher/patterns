package behavioral_patterns.visitor.example2;

import behavioral_patterns.visitor.example2.shape.Circle;
import behavioral_patterns.visitor.example2.shape.Rectangle;
import behavioral_patterns.visitor.example2.shape.VisitShape;
import behavioral_patterns.visitor.example2.shape.XMLVisitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        XMLVisitor xmlVisitor = new XMLVisitor();
        List<VisitShape> shapes = new ArrayList<>();
        shapes.add(new Circle(1, 1, 1));
        shapes.add(new Circle(2, 2, 2));
        shapes.add(new Rectangle(1, 1, 1, 1));
        shapes.add(new Rectangle(2, 2, 2, 2));
        for(VisitShape shape: shapes) {
            System.out.println(shape.accept(xmlVisitor));
        }
    }
}
