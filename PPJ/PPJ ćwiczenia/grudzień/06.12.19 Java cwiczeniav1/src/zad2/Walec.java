package zad2;

public class Walec {

    private double promien;
    private double wysokosc;

    public Walec(double promien,double wysokosc){
        this.promien=promien;
        this.wysokosc=wysokosc;
    }

    void show(){
        double pole =Math.PI*promien*promien;
        System.out.println("Pole powierzchni podstawy: "+pole);
        System.out.println("Objetosc walca= "+pole*wysokosc);
    }

}
