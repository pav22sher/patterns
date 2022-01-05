package generating_patterns.abstract_factory.example2;

import generating_patterns.abstract_factory.example2.chair.Chair;
import generating_patterns.abstract_factory.example2.furniture.FurnitureFactory;
import generating_patterns.abstract_factory.example2.sofa.Sofa;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class House {
    private FurnitureFactory furnitureFactory;
    private Chair chair;
    private Sofa sofa;

    public House(FurnitureFactory furnitureFactory) {
        this.furnitureFactory = furnitureFactory;
        this.chair = furnitureFactory.createChair();
        this.sofa = furnitureFactory.createSofa();
    }

    public void sitOn(){
        chair.sitOn();
        sofa.sitOn();
    }

}
