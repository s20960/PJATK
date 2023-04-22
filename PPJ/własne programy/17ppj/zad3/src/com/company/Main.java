package com.company;

public class Main {

    public static void main(String[] args) {
        double trojkat=256;
        Angle kat=new Angle(trojkat);

        System.out.println(kat.radian());
        System.out.println(kat.degree());

        float kawdrat =4;
        Angle kat2=new Angle(kawdrat);
        System.out.println(kat2.degree());


        Angle kat3=Angle.getComplement(kat);
        System.out.println(kat3.degree());

    }
}
