package behavioral_patterns.chain.example1.currency;

public class Dollar10Dispenser extends DispenseChain{
    @Override
    public void dispense(Currency currency) {
        dispense(currency, 10);
    }
}
