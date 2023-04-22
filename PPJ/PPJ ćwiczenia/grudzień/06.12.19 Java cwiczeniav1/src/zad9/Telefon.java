package zad9;

public class Telefon {

    String interfejsKomunikacyjny;
    String color;

    public Telefon(String iK, String color){
        this.interfejsKomunikacyjny=iK;
        this.color=color;
    }

    void zadzwon(String numer){
        System.out.println("Dzwonisz pod numer: "+numer);
    }

    void wyswietlHistoriePolaczen(){
        System.out.println("Brak historii");
    }
}
