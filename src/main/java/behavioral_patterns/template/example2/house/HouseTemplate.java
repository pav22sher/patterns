package behavioral_patterns.template.example2.house;

public abstract class HouseTemplate {
    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built.");
    }
    void buildWindows() {
        System.out.println("Building windows...");
    }
    private void buildFoundation() {
        System.out.println("Building foundation...");
    }
    public abstract void buildWalls();
    public abstract void buildPillars();
}
