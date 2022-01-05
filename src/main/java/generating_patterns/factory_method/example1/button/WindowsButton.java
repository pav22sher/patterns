package generating_patterns.factory_method.example1.button;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Render windows button!");
    }
}
