package generating_patterns.abstract_factory.example1.button;

public class WinButton implements Button{
    @Override
    public void paint() {
        System.out.println("Paint win button!");
    }
}
