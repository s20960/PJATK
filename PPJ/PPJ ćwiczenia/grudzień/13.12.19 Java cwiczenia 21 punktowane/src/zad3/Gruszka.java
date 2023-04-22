package zad3;

public class Gruszka extends Owoc {
    public Gruszka(String nazwa, double masa) {
        super(nazwa="gruszka", masa=(Math.random()*150)+100);
    }

    public String toString(){
        return nazwa +" "+masa;
    }
}
