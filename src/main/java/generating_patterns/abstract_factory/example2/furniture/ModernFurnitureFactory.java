package generating_patterns.abstract_factory.example2.furniture;

import generating_patterns.abstract_factory.example2.chair.Chair;
import generating_patterns.abstract_factory.example2.chair.ModernChair;
import generating_patterns.abstract_factory.example2.sofa.ModernSofa;
import generating_patterns.abstract_factory.example2.sofa.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
