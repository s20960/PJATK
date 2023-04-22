package com.company;

public class Osoba {
    public String imie;
    public String nazwisko;
    public int rokUrodzenia;

    Osoba(String imie, String nazwisko, int rokUrodzenia){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.rokUrodzenia=rokUrodzenia;
    }
    public void show(){
        System.out.println(this.imie);
        System.out.println(this.nazwisko);
        System.out.println(this.rokUrodzenia);
    }
}

