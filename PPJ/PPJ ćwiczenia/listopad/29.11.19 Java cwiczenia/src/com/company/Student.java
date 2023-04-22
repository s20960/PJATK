package com.company;

public class Student {

    Student(String imie,String nazwisko,int nrIndeksu,double[]punktyCwiczenia){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.nrIndeksu=nrIndeksu;
        this.punktyCwiczenia=punktyCwiczenia;
    }
    String imie;
    String nazwisko;
    int nrIndeksu;
    double[] punktyCwiczenia;

    public static double maxPunktowCwiczenia;

    public void dodajPunkt(double ilosc){
        double [] tab=new double[punktyCwiczenia.length+1];
        for(int i=0;i<punktyCwiczenia.length;i++){
            tab[i]=punktyCwiczenia[i];
        }
        tab[punktyCwiczenia.length]=ilosc;
        punktyCwiczenia=tab;
    }
}
