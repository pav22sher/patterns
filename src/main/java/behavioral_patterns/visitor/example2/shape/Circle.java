package behavioral_patterns.visitor.example2.shape;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Circle extends Dot implements VisitShape{
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw circle!");
    }

    @Override
    public String accept(XMLVisitor visitor) {
        return visitor.visit(this);
    }
}
