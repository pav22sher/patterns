package behavioral_patterns.template.example1.flag;

public abstract class ThreeRowsFlag {
    abstract void drawUpperLevel();
    abstract void drawMiddleLevel();
    abstract void drawBottomLevel();
    private void drawFlagpole() {
        System.out.println("Флагшток нарисован");
    }
    public final void drawFlag() {
        drawFlagpole();
        drawUpperLevel();
        drawMiddleLevel();
        drawBottomLevel();
    }
}