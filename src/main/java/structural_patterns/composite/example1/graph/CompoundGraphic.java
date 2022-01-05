package structural_patterns.composite.example1.graph;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic{
    private final List<Graphic> children = new ArrayList<>();
    public void add(Graphic child){
        children.add(child);
    }
    public void remove(Graphic child) {
        children.remove(child);
    }
    @Override
    public void draw() {
        for(Graphic child: children) {
            child.draw();
        }
    }
}
