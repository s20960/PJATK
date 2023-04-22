package zad3;

public class Owoc {
     String nazwa;
     double masa;
    public Owoc(String nazwa, double masa){
        this.masa=masa;
        this.nazwa=nazwa;
    }

    public double zwrocmasa(){
        return masa;
    }
    public String zwrocnazwa(){
        return nazwa;
    }

//    public String toString(){
//        return ""+masa;
//    }
}
