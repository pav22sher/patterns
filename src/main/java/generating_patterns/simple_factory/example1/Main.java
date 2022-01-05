package generating_patterns.simple_factory.example1;

import generating_patterns.simple_factory.example1.coffee.CoffeeType;

public class Main {
    public static void main(String[] args) {
        CoffeeShop shop = new CoffeeShop();
        shop.orderCoffee(CoffeeType.AMERICANO);
        shop.orderCoffee(CoffeeType.ESPRESSO);
        shop.orderCoffee(CoffeeType.CAPPUCCINO);
    }
}
