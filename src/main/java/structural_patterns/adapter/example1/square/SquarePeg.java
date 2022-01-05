package structural_patterns.adapter.example1.square;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Квадратные колышки
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SquarePeg {
    private double width;
    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}
