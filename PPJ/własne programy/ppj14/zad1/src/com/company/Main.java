package com.company;

public class Main {

    static void CharsToNumbrer(int tabm[]){
        int liczba=0;
        int mnoznik=1;
        for(int i=tabm.length-1;i>=0;i--){
            liczba=liczba+(tabm[i]*mnoznik);
            mnoznik=mnoznik*10;
        }
        System.out.println(liczba);
    }
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.println("Ile cyfr chcesz wprowadzić: ");
        int x = in.nextInt();
        System.out.println();
        int[]tab1=new int[x];
        for(int i=0;i<tab1.length;i++){
            tab1[i]= in.nextInt();
        }
        CharsToNumbrer(tab1);








    }
}
