package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        java.util.Scanner in = new java.util.Scanner(System.in);

        String zdanie = scan.nextLine();
        int przesuniecie = in.nextInt();

        String zdanie2="";

        for(int i=0;i<zdanie.length();i++){
            if(zdanie.charAt(i)==' ') zdanie2+=' ';
            else if(zdanie.charAt(i)=='z') zdanie2+='a';
            else if(zdanie.charAt(i)=='Z') zdanie2+='A';
            else if(zdanie.charAt(i)=='ą') zdanie2+='b';
            else if(zdanie.charAt(i)=='ż') zdanie2+='a';
            else if(zdanie.charAt(i)=='ź') zdanie2+='a';
            else if(zdanie.charAt(i)=='ś') zdanie2+='t';
            else if(zdanie.charAt(i)=='ć') zdanie2+='d';
            else if(zdanie.charAt(i)=='ę') zdanie2+='f';
            else if(zdanie.charAt(i)=='ó') zdanie2+='p';
            else if(zdanie.charAt(i)=='ń') zdanie2+='o';
            else if(zdanie.charAt(i)=='ł') zdanie2+='m';
            else if(zdanie.charAt(i)=='Ą') zdanie2+='B';
            else if(zdanie.charAt(i)=='Ż') zdanie2+='A';
            else if(zdanie.charAt(i)=='Ź') zdanie2+='A';
            else if(zdanie.charAt(i)=='Ć') zdanie2+='D';
            else if(zdanie.charAt(i)=='Ę') zdanie2+='F';
            else if(zdanie.charAt(i)=='Ó') zdanie2+='P';
            else if(zdanie.charAt(i)=='Ś') zdanie2+='T';
            else if(zdanie.charAt(i)=='Ł') zdanie2+='M';
            else if(zdanie.charAt(i)=='Ń') zdanie2+='O';
            else if(zdanie.charAt(i)=='.') zdanie2+='.';
            else {
                zdanie2 +=(char)(zdanie.charAt(i)+przesuniecie);
            }
        }
        for (int i =0; i < zdanie2.length(); i++) {
            System.out.print(zdanie2.charAt(i));
        }

    }
}
