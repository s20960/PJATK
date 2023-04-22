package com.company;

public class Main {

    public static void main(String[] args) {
        char [] tab={'a','b','c'};
        charsToNumber(tab);

    }
    public static char charsToNumber (char znaki[]){
        for(int i=0;i<znaki.length;i++){
            System.out.println((int)znaki[i]);

        }
        return 0;
    }



}