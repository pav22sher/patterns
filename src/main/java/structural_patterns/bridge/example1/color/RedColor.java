package structural_patterns.bridge.example1.color;

public class RedColor implements Color{
    @Override
    public void applyColor() {
        System.out.println("red color");
    }
}
