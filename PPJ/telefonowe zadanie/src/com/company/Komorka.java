package com.company;

public class Komorka extends Telefon {

    String[]historiaPoloczen=new String[10];

    public Komorka(String interfejsKomunikacyjny,String color,String[]historiaPoloczen){
        super(interfejsKomunikacyjny,color);
        this.historiaPoloczen=historiaPoloczen;
    }


}
