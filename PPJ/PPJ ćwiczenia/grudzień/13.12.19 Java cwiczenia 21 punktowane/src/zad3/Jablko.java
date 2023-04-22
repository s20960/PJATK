package zad3;

public class Jablko extends Owoc {

    public Jablko(String nazwa, double masa) {
        super(nazwa="jablko", masa=(Math.random()*150)+100);
    }
    public String toString(){
        return nazwa +" "+masa;
    }
}
