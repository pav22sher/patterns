package structural_patterns.flyweight.example1.house;

public class BrickHouse extends House{
    public BrickHouse() {
        stages = 5;
    }
    @Override
    public void build(double longitude, double latitude) {
        System.out.printf("Build Brick House %s:%s \n", longitude, latitude);
    }
}
