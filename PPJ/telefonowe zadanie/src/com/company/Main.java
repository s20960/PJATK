package com.company;

public class Main {

    public static void main(String[] args) {

        String[]poloczenia=new String[10];

        Telefon stacjonarny=new Telefon("upc","bialy");
        Komorka lgcookie=new Komorka("android","czarny",poloczenia);

        for (int i = 0; i <10 ; i++) {
            int num1 = (int) ((Math.random() * 899) + 100);
            int num2 = (int) ((Math.random() * 899) + 100);
            int num3 = (int) ((Math.random() * 899) + 100);
            String numer = num1 + "-" + num2 + "-" + num3;
            lgcookie.historiaPoloczen[i]=stacjonarny.zadzwon(numer);
        }
        for (int i = 0; i <10 ; i++) {
            System.out.println(lgcookie.historiaPoloczen[i]);
        }


    }
}
