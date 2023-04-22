package zad5;

import java.util.Calendar;

public class Osoba {
    String imie;
     int rokUrodzenia;

    Calendar cal = Calendar.getInstance();
    int year = cal.get(Calendar.YEAR);

    public Osoba(String imie, int rokUrodzenia){
        this.imie=imie;
        this.rokUrodzenia=rokUrodzenia;
    }

    public String zwrocImie(){
        return imie;
    }
    public int zwrocWiek(){
        return year-rokUrodzenia;
    }

    public static Osoba zwrocStarszaOsobe(Osoba a, Osoba b){
        if(a.zwrocWiek()>b.zwrocWiek()) return a;
        else if(a.zwrocWiek()<b.zwrocWiek()) return b;
        else return a;         //zadanie nie jest dopracowane
    }

    public static Osoba zwrocNajstarszaOsobe(Osoba [] ludzie){
        int naj=ludzie[0].zwrocWiek();
        Osoba stara=ludzie[0];
        for (int i = 1; i <ludzie.length ; i++) {
            if(ludzie[i].zwrocWiek()>naj){
                naj=ludzie[i].zwrocWiek();
                stara=ludzie[i];
            }
        }
        return stara;
    }
}
