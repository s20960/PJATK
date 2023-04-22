package com.company;

public class Osoba extends Object{
    String imie;
    int rokUrodzenia;

    public Osoba(String imie, int rokUrodzenia){
        this.imie=imie;
        this.rokUrodzenia=rokUrodzenia;
    }

    public Osoba(){
        super();
    }

    public Osoba(String imie){
        this(imie, 0000);
    }

    public void show(){
        System.out.println(
                "osoba: "+imie+" "+rokUrodzenia
        );
    }




}
