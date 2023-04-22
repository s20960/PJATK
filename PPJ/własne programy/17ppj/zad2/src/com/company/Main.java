package com.company;

public class Main {

    public static void main(String[] args) {

        Student biedak=new Student("Jan","Lomanski",20960);
        Student.maxPunktowCwiczenia=100;
        biedak.show();


        biedak.dodajPunkt(5);
        biedak.dodajPunkt(5);
        biedak.dodajPunkt(5);
        biedak.dodajPunkt(5);
        System.out.println(biedak.wyliczProcent());


    }
}
