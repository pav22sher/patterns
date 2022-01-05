package generating_patterns.abstract_factory.example1.checkbox;

public class WinCheckBox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Paint win checkbox!");
    }
}
