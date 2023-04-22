package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(Biurko.material);
        Biurko b1=new Biurko();
        b1.szuflady[0]=1;
        System.out.println(b1.szuflady[0]);
        System.out.println(b1.material);
        b1.material = "Metal";

        Biurko b2 = new Biurko();
        b2.szuflady[0]=2;
        System.out.println(b2.szuflady[0]);
        System.out.println(b2.material);

        System.out.println(b1.szuflady[0]);

        Biurko.pokaz();
        Biurko.pokaz2();
        b2.pokaz2();



    }
}
