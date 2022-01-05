package structural_patterns.flyweight.example1;

import structural_patterns.flyweight.example1.house.House;
import structural_patterns.flyweight.example1.house.HouseFactory;

public class Main {
    public static void main(String[] args) {
        double longitude = 35.5;
        double latitude = 24.4;
        HouseFactory houseFactory = new HouseFactory();
        for (int i = 0; i < 4;i++)
        {
            House panelHouse = houseFactory.getHouse("Panel");
            panelHouse.build(longitude, latitude);
            longitude += 1;
            latitude += 1;
        }
        System.out.println();
        for (int i = 0; i < 4; i++)
        {
            House brickHouse = houseFactory.getHouse("Brick");
            brickHouse.build(longitude, latitude);
            longitude += 1;
            latitude += 1;
        }
    }
}
