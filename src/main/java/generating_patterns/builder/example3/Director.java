package generating_patterns.builder.example3;

public class Director {
    public Pizza getPizzaWithCheese(){
        return new Pizza()
                .withSize(5)
                .withCheese(true);
    }
    public Pizza getPizzaWithPepperoni(){
        return new Pizza()
                .withSize(10)
                .withPepperoni(true);
    }
}
