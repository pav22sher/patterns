package structural_patterns.flyweight.example2.forest;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Tree {
    private int x;
    private int y;
    private TreeType type;

    public void draw() {
        System.out.println(
                "Draw tree:" +
                " x = " + x +
                " y = " + y +
                " type: " + type.getName()
        );
    }
}
