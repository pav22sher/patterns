package structural_patterns.flyweight.example2;

import structural_patterns.flyweight.example2.forest.Forest;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();
        for (int i = 0; i < 3; i++) {
            forest.plantTree(i,i,"Oak", Color.GREEN, new BufferedImage(1,1,1));
        }
        for (int i = 5; i < 8; i++) {
            forest.plantTree(i,i,"Pine", Color.GREEN, new BufferedImage(2,2,2));
        }
        forest.draw();
    }
}
