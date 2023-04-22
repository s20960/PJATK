package com.company;

public class Main {

    public static void main(String[] args) {

        Przyklad a=new Przyklad();

        int x=metoda(4,5);
        System.out.println(x);

        double y=Przyklad.iloczyn(6,3);
        System.out.println(y);
    }

    static int metoda(int a, int b){
        return a+b;
    }
}
