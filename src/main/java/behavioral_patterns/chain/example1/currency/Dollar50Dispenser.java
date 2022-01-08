package behavioral_patterns.chain.example1.currency;

public class Dollar50Dispenser extends DispenseChain {
    @Override
    public void dispense(Currency currency) {
        dispense(currency, 50);
    }
}
