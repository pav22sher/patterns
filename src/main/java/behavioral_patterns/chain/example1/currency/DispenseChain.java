package behavioral_patterns.chain.example1.currency;

public abstract class DispenseChain {
    protected DispenseChain chain;
    public void setNextChain(DispenseChain chain) {
        this.chain = chain;
    }
    protected void dispense(Currency currency, int limit) {
        int amount = currency.getAmount();
        if (amount >= limit) {
            int num = amount / limit;
            int remainder = amount % limit;
            System.out.println("Dispensing " + num + " " + limit + "$ note");
            if (remainder != 0) {
                chain.dispense(new Currency(remainder));
            }
        } else {
            chain.dispense(currency);
        }
    }
    public abstract void dispense(Currency currency);
}
