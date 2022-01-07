package behavioral_patterns.visitor.example1.shop;

public class ShopVisitor {
    public int visit(Book book) {
        String name = book.getName();
        int cost = book.getPrice();
        System.out.println("Book Name: "+ name + " cost = "+ cost);
        return cost;
    }
    public int visit(Fruit fruit) {
        String name = fruit.getName();
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println("Fruit Name: "+ name + " cost = "+ cost);
        return cost;
    }
}
