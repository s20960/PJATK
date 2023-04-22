package com.company;

public class Main {
    static int[] expand(int tabm1[], int valuem){
        int pomoc=0;
        for(int i=0;i<(tabm1.length+valuem);i++){
            pomoc++;
        }

        int[]tabm2=new int[pomoc];

        for(int i=0;i<tabm1.length;i++){
            tabm2[i]=tabm1[i];
        }

        for(int i=0;i<tabm2.length;i++){
            System.out.println(tabm2[i]);
        }
        return tabm2;
    }

    public static void main(String[] args) {
        java.util.Scanner in =new java.util.Scanner(System.in);
        int[]tab1={1,2,3};
        int value= in.nextInt();
        expand(tab1,value);



    }
}
