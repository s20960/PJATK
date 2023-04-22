package com.company;

public class Biurko {
    int [] szuflady;
    static String material = "Plastik";

    Biurko(int a){
        szuflady= new int[3];
    }

    Biurko(){
        this(3);
    }


    static void pokaz(){
        System.out.println(material);
        System.out.println(szuflady[0]);

    }

    void pokaz2(){
        System.out.println(szuflady[0]);
    }





}
