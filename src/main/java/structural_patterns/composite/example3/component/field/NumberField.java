package structural_patterns.composite.example3.component.field;

public class NumberField implements Field{
    private Number value;
    @Override
    public boolean check() {
        return value != null;
    }
}
