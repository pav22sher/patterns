package structural_patterns.decorator.example1.car;

public abstract class Car {
    String name = "Unnamed Car";
    public String getInfo(){
        return name;
    }
    public abstract int getPrice();
}
