package zad9;

public class Komorka extends Telefon {

    String [] historiaPoloczen;

    public Komorka(String iK, String color) {
        super(iK, color);
        historiaPoloczen=new String [10];
    }
    void zadzwon(String numer){
        super.zadzwon(numer);
        for (int i = 8; i >=0; i--) {
            historiaPoloczen[i+1]=historiaPoloczen[i];
        }
        historiaPoloczen[0]=numer;
    }

    void wyswietlHistoriePolaczen(){
        for(int i=0;i<10;i++){
            System.out.println(historiaPoloczen[i]);
        }
    }
}
