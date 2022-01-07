package behavioral_patterns.visitor.example1;

import behavioral_patterns.visitor.example1.shop.Book;
import behavioral_patterns.visitor.example1.shop.Fruit;
import behavioral_patterns.visitor.example1.shop.Product;
import behavioral_patterns.visitor.example1.shop.ShopVisitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShopVisitor visitor = new ShopVisitor();
        List<Product> products = new ArrayList<>();
        products.add(new Book("1408", 250));
        products.add(new Book("Shining", 250));
        products.add(new Fruit("Banana", 100, 2));
        products.add(new Fruit("Apple", 80, 1));
        int sum=0;
        for (Product product: products) {
            sum = sum + product.accept(visitor);
        }
        System.out.println("Total sum: " + sum);
    }
}
