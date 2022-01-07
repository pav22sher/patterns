package behavioral_patterns.visitor.example1.shop;

public interface Product {
    int accept(ShopVisitor visitor);
}
