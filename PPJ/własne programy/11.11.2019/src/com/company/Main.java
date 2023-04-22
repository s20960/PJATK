package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        java.util.Scanner in=new java.util.Scanner(System.in) ;
    //ppj10
	/*
        //zad1
        double [] tab1=new double [10];
	    for(int i=0;i<10;i++) tab1[i]=(Math.random()*10);
	    for(int i=0;i<10;i++) System.out.print(tab1[i]+" ");
        System.out.println(" ");
        for(int i=0;i<10;i++) {
	        if(i%2==0) System.out.print(tab1[i]+" ");
        };
        for(int i=0;i<10;i++){
            if(((int)tab1[i])%2==1) System.out.println(tab1[i]+" ");
        }
    */
	/*
	//zad2
        char [] tab2=new char [3];
        tab2[0]='g';
        tab2[1]='h';
        tab2[2]='d';
        int min=tab2[0];
        for(int i=0;i<3;i++){
            if(tab2[i]<min) min=tab2[i];
        }
        System.out.println((char)min);
    */
    /*
	//zad3
        //System.out.println((int)'a'-(int)'z');
        //System.out.println((int)'a'+" "+(int)'z');

        char [] tab3=new char[5];

        for (int i = 0; i < 5; i++) tab3[i] = (char) ((Math.random() * 25) + 97);
        for (int i = 0; i < 5; i++) System.out.print(tab3[i] + " ");

        for(int j=0;j<5;j++) {
            char znak = in.next() .charAt(0) ;
            int ilosc = 0;
            for (int i = 0; i < 5; i++) {
                if (tab3[i] == znak) {
                    tab3[i] = '0';
                    ilosc++;
                }
            }
            System.out.println(ilosc);
            System.out.print(tab3[0] + " ");
            System.out.print(tab3[1] + " ");
            System.out.print(tab3[2] + " ");
            System.out.print(tab3[3] + " ");
            System.out.print(tab3[4] + " ");
        }
    */

    //zad4
        int x=(int)((Math.random()*5)+5);
        int []tab4=new int[x];
        int []tab5=new int[x];
        for(int i=0;i<tab4.length;i++) tab4[i]=i;
        for(int i=0;i<tab5.length;i++) tab5[i]=i;
        for(int i=0;i<tab4.length;i++) System.out.print(tab4[i]+" ");
        System.out.println(" ");
        for(int j=0;j<tab4.length;j++){
            tab4[j]=tab5[(int)((Math.random()*x))];
        }
        for(int i=0;i<tab4.length;i++) System.out.print(tab4[i]+" ");
        System.out.println(" ");
        for(int i=0;i<tab4.length;i++) {
            for (int j = 0; j<tab4.length; j++){
                if(i==tab4[j]) System.out.print("*"+" ");
                else  System.out.print(". ");
            }
            System.out.println("");
        }

    /*
    //ppj10
        int[][] arr = {
                {1,3},
                {3,4,5,8},
                {6,8},
                {1,9,6} };
        int [] arr2=new int [arr.length];
        for(int i=0;i<arr.length;i++) arr2[i]=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++)
                if(arr2[i]<arr[i][j]){
                    arr2[i]=arr[i][j];
                }
            System.out.println(arr[i]);
        }
    */
    /*
            char[][] arr = {
                    {'a', 'b', 'c'},
                    {'d', 'e', 'f'},
                    {'g', 'h', 'i'},
            };
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(
                            arr[i % 2 == 0 ? j : arr.length - 1 - j][i] + " "
                    );
                }
            }
    */


    }
}

