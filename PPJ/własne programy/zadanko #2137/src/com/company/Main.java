package com.company;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String zmienna=scan.nextLine();
        System.out.println(zmienna);


        System.out.println(zmienna.equals("tak"));
        if(zmienna.equals("tak")){
            System.out.println("mam Cie");
        }
        else System.out.println("pudło");
    }
}






















