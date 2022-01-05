package structural_patterns.composite.example2.product;

import java.util.ArrayList;
import java.util.List;

public class ProductBasket implements Product{
    private final List<Product> children = new ArrayList<>();
    public void add(Product child) {
        children.add(child);
    }
    public void remove(Product child){
        children.remove(child);
    }

    @Override
    public double getPrice() {
        double result = 0;
        for(Product child: children) {
            result += child.getPrice();
        }
        return result;
    }
}
