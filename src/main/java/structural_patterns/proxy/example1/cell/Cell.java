package structural_patterns.proxy.example1.cell;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class Cell {
    protected int left;
    protected int top;
    protected String image;

    protected Cell(int left, int top) {
        this.left = left;
        this.top = top;
    }
    public void open() {
        System.out.println("Open Cell " + this.image);
    }
    public abstract int getPoints();
}
