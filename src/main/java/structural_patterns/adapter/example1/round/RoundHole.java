package structural_patterns.adapter.example1.round;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Круглое отверстие
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RoundHole {
    private double radius;

    public boolean isFit(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}
