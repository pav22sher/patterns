package behavioral_patterns.template.example2.house;

public class GlassHouse extends HouseTemplate{
    @Override
    public void buildWalls() {
        System.out.println("Building glass walls...");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building glass pillars...");
    }
}
