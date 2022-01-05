package structural_patterns.proxy.example1.cell;

public class MineCell extends Cell{
    @Override
    public int getPoints() {
        return 100;
    }
    public MineCell(int left, int top) {
        super(left, top);
    }

    @Override
    public void open() {
        this.image = "Mine!";
        super.open();
    }
}
