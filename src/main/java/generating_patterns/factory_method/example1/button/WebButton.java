package generating_patterns.factory_method.example1.button;

public class WebButton implements Button{
    @Override
    public void render() {
        System.out.println("Render web button!");
    }
}
