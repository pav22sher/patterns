package behavioral_patterns.template.example2;

import behavioral_patterns.template.example2.house.GlassHouse;
import behavioral_patterns.template.example2.house.HouseTemplate;
import behavioral_patterns.template.example2.house.WoodenHouse;

public class Main {
    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();
        houseType.buildHouse();
        System.out.println();
        houseType = new GlassHouse();
        houseType.buildHouse();
    }
}
