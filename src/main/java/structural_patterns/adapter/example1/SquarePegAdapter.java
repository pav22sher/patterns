package structural_patterns.adapter.example1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import structural_patterns.adapter.example1.round.RoundPeg;
import structural_patterns.adapter.example1.square.SquarePeg;

/**
 * Адаптер позволяет использовать Квадратные колышки и круглые отверстия.
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;
    @Override
    public double getRadius() {
        double result;
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
