package behavioral_patterns.visitor.example2.shape;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rectangle extends Dot implements VisitShape{
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Draw rectangle!");
    }

    @Override
    public String accept(XMLVisitor visitor) {
        return visitor.visit(this);
    }
}
