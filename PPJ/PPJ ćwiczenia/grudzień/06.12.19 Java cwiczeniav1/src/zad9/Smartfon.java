package zad9;

public class Smartfon extends Komorka {

    Osoba[] znajomi=new Osoba[10];

    public Smartfon(String iK, String color) {
        super(iK, color);
    }

    public void dodajznaj(Osoba nowa){
        int n = 0;
        while(n < 10 && znajomi[n] != null) {
            n++;
        }
        if(n < 10) znajomi[n] = nowa;
    }

    void wyswietlHistoriePolaczen(){
        for(int i=0;i<10 && historiaPoloczen[i] != null;i++){
            for (int j = 0; j <10 ; j++) {
                if(znajomi[j] != null && znajomi[j].numer==historiaPoloczen[i]){
                    System.out.print(znajomi[j].imie+" "+znajomi[j].nazwisko+": ");
                }
            }
            System.out.println(historiaPoloczen[i]);
        }

    }
}
