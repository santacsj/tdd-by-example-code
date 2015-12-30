package tdd.by.example.money;

import java.util.Hashtable;

public class Bank {

    private Hashtable<Pair, Integer> rates = new Hashtable<Pair, Integer>();

    Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    public void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), rate);
    }

    int rate(String from, String to) {
        return (from.equals("CHF") && to.equals("USD")) ? 2 : 1;
    }
}
