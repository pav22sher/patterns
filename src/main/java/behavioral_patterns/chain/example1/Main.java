package behavioral_patterns.chain.example1;

import behavioral_patterns.chain.example1.currency.*;

public class Main {
    public static void main(String[] args) {
        DispenseChain c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();
        c1.setNextChain(c2);
        c2.setNextChain(c3);
        c1.dispense(new Currency(130));
    }
}
