package structural_patterns.flyweight.example1.house;

import java.util.HashMap;
import java.util.Map;

public class HouseFactory {
    private final Map<String, House> houses = new HashMap<>();
    public HouseFactory() {
        houses.put("Panel", new PanelHouse());
        houses.put("Brick", new BrickHouse());
    }

    public House getHouse(String key) {
        return houses.getOrDefault(key, null);
    }
}
