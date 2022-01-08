package behavioral_patterns.chain.example1.currency;

public class Dollar20Dispenser extends DispenseChain{
    @Override
    public void dispense(Currency currency) {
        dispense(currency, 20);
    }
}
