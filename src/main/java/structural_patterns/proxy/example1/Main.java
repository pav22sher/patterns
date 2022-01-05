package structural_patterns.proxy.example1;

import structural_patterns.proxy.example1.cell.Cell;
import structural_patterns.proxy.example1.cell.EmptyProxy;
import structural_patterns.proxy.example1.cell.MineProxy;

public class Main {
    public static void main(String[] args) {
        final int CELL_SIZE = 3;
        Cell[][] cells = new Cell[CELL_SIZE][CELL_SIZE];
        for (int i = 0; i < CELL_SIZE; i++) {
            for (int j = 0; j < CELL_SIZE; j++) {
                if (Math.random() > 0.5) {
                    cells[i][j] = new MineProxy(i, j);
                } else {
                    cells[i][j] = new EmptyProxy(i, j);
                }
            }
        }
        for (int i = 0; i < CELL_SIZE; i++) {
            for (int j = 0; j < CELL_SIZE; j++) {
                cells[i][j].open();
            }
        }
    }
}
