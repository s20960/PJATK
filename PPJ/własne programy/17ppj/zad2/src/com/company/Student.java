package com.company;

public class Student {
    String imie;
    String nazwisko;
    int nrIndeksu;
    double[] punktyCwiczenia;

    public static int maxPunktowCwiczenia;

    Student(String imie, String nazwisko, int nrIndeksu){
        this.imie=imie;
        this.nazwisko=imie;
        this.nrIndeksu=nrIndeksu;
        this.punktyCwiczenia=new double[0];
    }

    public void dodajPunkt(double ilosc){
        double[]tab2=new double[punktyCwiczenia.length+1];
        for(int i=0;i<punktyCwiczenia.length;i++){
            tab2[i]=punktyCwiczenia[i];
        }
        tab2[punktyCwiczenia.length]=ilosc;
        punktyCwiczenia=tab2;
    }

    public double wyliczProcent(){
        double suma=0;
        for(int i=0;i<punktyCwiczenia.length;i++){
            suma+=punktyCwiczenia[i];
        }
        return (suma/maxPunktowCwiczenia);
    }

    public void show(){
        System.out.println(imie);
        System.out.println(nazwisko);
        System.out.println(nrIndeksu);
    }

}
