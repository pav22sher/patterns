package structural_patterns.composite.example1.graph;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Dot implements Graphic{
    private int x;
    private int y;
    @Override
    public void draw() {
        System.out.println("Draw point!");
    }
}
