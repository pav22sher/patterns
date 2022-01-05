package generating_patterns.abstract_factory.example2;

import generating_patterns.abstract_factory.example2.furniture.ModernFurnitureFactory;
import generating_patterns.abstract_factory.example2.furniture.VictorianFurnitureFactory;

public class Main {
    public static void main(String[] args) {
        House victorianHouse = new House(new VictorianFurnitureFactory());
        victorianHouse.sitOn();
        House modernHouse = new House(new ModernFurnitureFactory());
        modernHouse.sitOn();
    }
}
