package tdd.by.example.money;

public class Dollar extends Money {

    Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier, currency);
    }
}
