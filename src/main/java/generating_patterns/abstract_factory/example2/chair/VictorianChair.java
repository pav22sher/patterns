package generating_patterns.abstract_factory.example2.chair;

public class VictorianChair implements Chair{
    @Override
    public void sitOn() {
        System.out.println("Sit on victorian chair!");
    }
}
