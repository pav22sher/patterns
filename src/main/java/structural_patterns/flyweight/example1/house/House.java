package structural_patterns.flyweight.example1.house;

public abstract class House {
    protected int stages;
    public abstract void build(double longitude, double latitude);
}