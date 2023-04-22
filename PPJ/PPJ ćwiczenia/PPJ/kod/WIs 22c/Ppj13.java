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

            for (int i = j; i < tab.length - j; i++) {
                System.out.print(tab[j][i]);
            }
            for (int i = j + 1; i < tab.length - j; i++) {
                System.out.print(tab[i][tab.length - 1 - j]);
            }
            for (int i = j + 1; i < tab.length - j; i++) {
                System.out.print(tab[tab.length - 1 - j][tab.length - 1 - i - j]);
            }
            for (int i = j + 1; i < tab.length - 1 - j; i++) {
                System.out.print(tab[tab.length - 1 - i - j][j]);
            }
        }

        show(12);

        int[] wrt = {5};
        System.out.println(wrt[0]);
        modifyValue(wrt);
        System.out.println(wrt[0]);

        if(m1() && m2());
        if(m1() & m2());

    }
    static boolean m1() {
        System.out.println("M1");
        return false;
    }
    static boolean m2() {
        System.out.println("M2");
        return true;
    }
    static void show(int a) {
        System.out.println(a);
    }
    static void modifyValue(int[] a) {
        //a = new int[]{a[0]};
        System.out.println(a[0]);
        a[0] *= 5;
        System.out.println(a[0]);
    }
}
