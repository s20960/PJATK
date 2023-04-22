package zad1;

public class NotEnouhgFounds extends Exception {
    public NotEnouhgFounds(double zamalokasy){
        super("za malo kasy o wartosc "+zamalokasy);
    }
}
