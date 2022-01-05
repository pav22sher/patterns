package structural_patterns.flyweight.example1.house;

public class PanelHouse extends House {
    public PanelHouse() {
        stages = 16;
    }
    @Override
    public void build(double longitude, double latitude) {
        System.out.printf("Build Panel House %s:%s \n", longitude, latitude);
    }
}
