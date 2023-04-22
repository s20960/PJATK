package zad1;

public class Osoba extends Object{
    String imie;
    int rokUrodzenia;

    public Osoba(String imie, int rokUrodzenia){
        this.imie=imie;
        this.rokUrodzenia=rokUrodzenia;
    }

    public void show(){
        System.out.println(
                "osoba: "+imie+" " +rokUrodzenia
        );
    }




}
