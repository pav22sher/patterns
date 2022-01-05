package structural_patterns.composite.example3.component.field;

public class TextField implements Field{
    private String value;
    @Override
    public boolean check() {
        return value != null;
    }
}
