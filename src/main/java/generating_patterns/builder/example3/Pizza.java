package generating_patterns.builder.example3;

public class Pizza {
    private int size;
    private boolean cheese;
    private boolean pepperoni;

    public Pizza() {}

    public Pizza withSize(int size) {
        this.size = size;
        return this;
    }
    public Pizza withCheese(boolean cheese) {
        this.cheese = cheese;
        return this;
    }
    public Pizza withPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
        return this;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                '}';
    }
}
