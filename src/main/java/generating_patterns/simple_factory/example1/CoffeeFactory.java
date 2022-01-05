package generating_patterns.simple_factory.example1;

import generating_patterns.simple_factory.example1.coffee.*;

public class CoffeeFactory {
    public Coffee createCoffee (CoffeeType type) {
        Coffee coffee = null;
        switch (type) {
            case AMERICANO:
                coffee = new Americano();
                break;
            case ESPRESSO:
                coffee = new Espresso();
                break;
            case CAPPUCCINO:
                coffee = new Cappucino();
                break;
        }
        return coffee;
    }
}
