package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String zmienna  = scan.nextLine();
        System.out.println(zmienna);

        if(zmienna.trim() =="tak") {
            System.out.println("mam cie");
        }
        else System.out.println("pudło");
    }
}
