package generating_patterns.simple_factory.example1.coffee;

public class Espresso implements Coffee{
    @Override
    public void make() {
        System.out.println("Make Espresso!");
    }
}
