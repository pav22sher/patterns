package structural_patterns.bridge.example1.shape;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import structural_patterns.bridge.example1.color.Color;

@AllArgsConstructor
@NoArgsConstructor
public abstract class Shape {
    protected Color color;
    public void applyColor(){
        color.applyColor();
    }
}
