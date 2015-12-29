package tdd.by.example.money;

public abstract class Money {

    static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    protected int amount;

    abstract Money times(int multiplier);

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount && getClass().equals(money.getClass());
    }

}
