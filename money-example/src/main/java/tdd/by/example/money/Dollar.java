package tdd.by.example.money;

public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        Money dollar = (Dollar) obj;
        return amount == dollar.amount;
    }
}
