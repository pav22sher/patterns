package structural_patterns.bridge.example1.color;

public class GreenColor implements Color{
    @Override
    public void applyColor(){
        System.out.println("green color");
    }
}
