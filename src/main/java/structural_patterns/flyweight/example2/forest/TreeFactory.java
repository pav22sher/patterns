package structural_patterns.flyweight.example2.forest;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, TreeType> treeTypes = new HashMap<>();
    public static TreeType getTreeType(String name, Color color, Image image) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color, image);
            treeTypes.put(name, result);
        }
        return result;
    }
}
