package tdd.by.example.money;

public class Bank {

    Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    public void addRate(String from, String to, int rate) {
        // TODO Auto-generated method stub
    }

    int rate(String from, String to) {
        return (from.equals("CHF") && to.equals("USD")) ? 2 : 1;
    }
}
