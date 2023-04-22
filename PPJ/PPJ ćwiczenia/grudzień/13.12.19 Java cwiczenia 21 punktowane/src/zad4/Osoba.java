package zad4;

public class Osoba {
    private String imie;
    private int rokUrodzenia;

    public Osoba(String imie, int rokUrodzenia){
        this.imie=imie;
        this.rokUrodzenia = rokUrodzenia;
    }
    public int rok(){
        return rokUrodzenia;
    }
    public String imie(){
        return imie;
    }
    public void wyliczDeputat(){
        System.out.println("Brak deputatu");

    }

}
