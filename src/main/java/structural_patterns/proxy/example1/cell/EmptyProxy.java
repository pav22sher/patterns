package structural_patterns.proxy.example1.cell;

public class EmptyProxy extends Cell {
    private EmptyCell proxy;

    public EmptyProxy(int left, int top) {
        super(left, top);
        this.proxy = null;
    }

    @Override
    public void open() {
        if (proxy == null) {
            proxy = new EmptyCell(left, top);
        }
        proxy.open();
    }

    @Override
    public int getLeft() {
        return proxy == null ? left : proxy.getLeft();
    }

    @Override
    public int getTop() {
        return proxy == null ? top : proxy.getTop();
    }

    @Override
    public int getPoints() {
        return proxy == null ? 10 : proxy.getPoints();
    }
}
