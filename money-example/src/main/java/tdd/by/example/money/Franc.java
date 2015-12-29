package tdd.by.example.money;

public class Franc extends Money {

    public Franc(int amount, String currency) {
        this.amount = amount;
        currency = "CHF";
    }

    public Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }
}
