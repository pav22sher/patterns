package structural_patterns.composite.example2;

import structural_patterns.composite.example2.product.Bread;
import structural_patterns.composite.example2.product.Butter;
import structural_patterns.composite.example2.product.ProductBasket;

public class Main {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();
        basket.add(new Bread());
        basket.add(new Butter());
        ProductBasket child = new ProductBasket();
        child.add(new Bread());
        child.add(new Butter());
        basket.add(child);
        System.out.println(basket.getPrice());
    }
}
