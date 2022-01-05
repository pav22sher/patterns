package structural_patterns.proxy.example1.cell;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class EmptyCell extends Cell{
    @Override
    public int getPoints() {
        return 10;
    }
    public EmptyCell(int left, int top) {
        super(left, top);
    }
    @Override
    public void open() {
        this.image = "Empty!";
        super.open();
    }
}
