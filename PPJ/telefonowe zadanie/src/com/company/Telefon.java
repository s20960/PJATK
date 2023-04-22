package com.company;

public class Telefon {
    String interfejsKomunikacyjny;
    String color;

    public Telefon(String interfejsKomunikacyjny, String color){
        this.interfejsKomunikacyjny=interfejsKomunikacyjny;
        this.color=color;
    }

    public String zadzwon(String numer){
        return numer;
    }
}
