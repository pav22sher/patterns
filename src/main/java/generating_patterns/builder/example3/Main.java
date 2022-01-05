package generating_patterns.builder.example3;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Pizza pizzaWithCheese = director.getPizzaWithCheese();
        System.out.println(pizzaWithCheese);
        Pizza pizzaWithPepperoni = director.getPizzaWithPepperoni();
        System.out.println(pizzaWithPepperoni);
    }
}
