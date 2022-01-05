package structural_patterns.adapter.example1;

import structural_patterns.adapter.example1.round.RoundHole;
import structural_patterns.adapter.example1.round.RoundPeg;
import structural_patterns.adapter.example1.square.SquarePeg;

public class Main {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        SquarePeg squarePeg = new SquarePeg(2);
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(squarePeg);
        if (roundHole.isFit(roundPeg)) {
            System.out.println("Round peg fits round hole.");
        }
        if (roundHole.isFit(smallSqPegAdapter)) {
            System.out.println("Square peg fits round hole.");
        }
    }
}
