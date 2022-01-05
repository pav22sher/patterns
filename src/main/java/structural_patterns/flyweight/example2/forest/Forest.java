package structural_patterns.flyweight.example2.forest;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest {
    private final List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, Image image) {
        TreeType type = TreeFactory.getTreeType(name, color, image);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    public void draw() {
        for(Tree tree: trees) {
            tree.draw();
        }
    }
}
