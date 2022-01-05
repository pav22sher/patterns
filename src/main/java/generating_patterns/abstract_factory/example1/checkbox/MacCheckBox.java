package generating_patterns.abstract_factory.example1.checkbox;

public class MacCheckBox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Paint mac checkbox!");
    }
}
