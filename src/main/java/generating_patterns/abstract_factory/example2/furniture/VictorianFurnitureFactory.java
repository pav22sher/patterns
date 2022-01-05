package generating_patterns.abstract_factory.example2.furniture;

import generating_patterns.abstract_factory.example2.chair.Chair;
import generating_patterns.abstract_factory.example2.chair.VictorianChair;
import generating_patterns.abstract_factory.example2.sofa.Sofa;
import generating_patterns.abstract_factory.example2.sofa.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
