package generating_patterns.abstract_factory.example2.furniture;

import generating_patterns.abstract_factory.example2.chair.Chair;
import generating_patterns.abstract_factory.example2.sofa.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}
