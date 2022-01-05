package structural_patterns.decorator.example1.car;

public class AudiA5 extends Car{
    public AudiA5(){
        name = "Audi A5";
    }
    @Override
    public int getPrice() {
        return 10_000;
    }
}
