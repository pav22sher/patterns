package behavioral_patterns.visitor.example2.shape;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Dot implements Shape {
    private int x;
    private int y;

    @Override
    public void draw() {
        System.out.println("Draw dot!");
    }
}
