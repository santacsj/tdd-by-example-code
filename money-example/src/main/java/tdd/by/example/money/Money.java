package tdd.by.example.money;

public class Money {

    static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    protected int amount;

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount && getClass().equals(money.getClass());
    }

}
