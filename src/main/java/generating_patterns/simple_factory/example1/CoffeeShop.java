package generating_patterns.simple_factory.example1;

import generating_patterns.simple_factory.example1.coffee.Coffee;
import generating_patterns.simple_factory.example1.coffee.CoffeeType;

public class CoffeeShop {
    private final CoffeeFactory coffeeFactory = new CoffeeFactory();
    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = coffeeFactory.createCoffee(type);
        coffee.make();
        System.out.println("Вот ваш кофе! Спасибо, приходите еще!");
        return coffee;
    }
}
