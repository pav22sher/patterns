package behavioral_patterns.template.example1.flag;

public class NetherlandsFlag extends ThreeRowsFlag{
    @Override
    void drawUpperLevel() {
        Colors.paintRedColor();
    }

    @Override
    void drawMiddleLevel() {
        Colors.paintWhiteColor();
    }

    @Override
    void drawBottomLevel() {
        Colors.paintBlueColor();
    }
}
