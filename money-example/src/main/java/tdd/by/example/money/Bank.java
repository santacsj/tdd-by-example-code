package tdd.by.example.money;

public class Bank {

    Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    public void addRate(String from, String to, int rate) {
        // TODO Auto-generated method stub
    }
}
