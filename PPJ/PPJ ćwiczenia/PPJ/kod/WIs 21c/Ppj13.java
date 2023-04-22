package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] tab = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 9, 8, 7},
                {6, 5, 4, 3},
        };
        for (int j = 0; j < tab.length / 2; j++) {

            for (int i = 0 + j; i < tab.length - j; i++) {
                System.out.print(tab[i][j] + " ");
            }
            for (int i = 1 + j; i < tab.length - j; i++) {
                System.out.print(tab[tab.length - 1 - j][i] + " ");
            }
            for (int i = 1 + j; i < tab.length - j; i++) {
                System.out.print(tab[tab.length - 1 - i][tab.length - 1 - j] + " ");
            }
            for (int i = 1 + j; i < tab.length - 1 - j; i++) {
                System.out.print(tab[j][tab.length - 1 - j - i] + " ");
            }
        }

        //void x = nazwa();
        int y = nazwa2();
        nazwa2();
        System.out.println(y);
        if (y == 2) {
            System.out.println("Tak");
        } else {
            System.out.println("Nie");
        }

        int[] wrt = {5};
        System.out.println(wrt[0]);
        modifyValue(wrt);
        System.out.println(wrt[0]);

        char[] ala = {'A', 'l', 'a', ' ', 'm', 'a', ' ', 'k', 'o', 't', 'a'};
        policz(ala);
    }
    static void policz(char[] tab) {
        int licznik = 0;
        for (int i = 0; i < tab.length; i++) {
            licznik = 1;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[i] == tab[j]) {
                    licznik++;
                    tab[j] = 0;
                }
            }
            if(tab[i] != 0)
                System.out.println(tab[i] + " wystapilo " + licznik);
            tab[i] = 0;
        }
    }

    static void modifyValue(int[] a) {
        System.out.println(a[0]);
        a[0] *= 5;
        System.out.println(a[0]);
    }

    static void nazwa(){
        System.out.println("hello");
    }

    static int nazwa2(){
        System.out.println("hello2");
        return 2;
    }

}
