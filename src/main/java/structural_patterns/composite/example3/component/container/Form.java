package structural_patterns.composite.example3.component.container;

import structural_patterns.composite.example3.component.field.Field;

import java.util.ArrayList;
import java.util.List;

public class Form implements Container{
    private final List<Field> children = new ArrayList<>();
    public void add(Field child) {
        children.add(child);
    }
    public void remove(Field child) {
        children.remove(child);
    }
    @Override
    public boolean check() {
        for(Field child: children) {
            if(!child.check()){
                return false;
            }
        }
        return true;
    }
}
