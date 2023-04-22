package com.company;

public class Student {
    String imie;
    String nazwisko;
    int nrIndeksu;
    double[] punktyCwiczenia;

    public static int maxPunktowCwiczenia;

    Student(String tak, String nazwisko, int nrIndeksu){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.nrIndeksu=nrIndeksu;
        this.punktyCwiczenia=new double[0];
    }
    public void show(){
        System.out.println(imie);
        System.out.println(nazwisko);
        System.out.println(nrIndeksu);
    }

}
