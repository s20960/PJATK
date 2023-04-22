package com.company;

import java.io.*;


public class Main {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\mich_\\OneDrive\\Pulpit\\michalino\\PJATK\\PPJ\\własne programy\\zapis_odczyt\\witam.txt");
            int wrt;
            while((wrt=fis.read())!=-1)
                System.out.print((char)wrt);
            fis.close();

            FileOutputStream fos=new FileOutputStream("C:\\Users\\mich_\\OneDrive\\Pulpit\\michalino\\PJATK\\PPJ\\własne programy\\zapis_odczyt\\zegnam.txt");
            String napis="no elo";
            fos.write((char)65);
            fis.close();

            System.out.println();

            FileInputStream fis2 = new FileInputStream("C:\\Users\\mich_\\OneDrive\\Pulpit\\michalino\\PJATK\\PPJ\\własne programy\\zapis_odczyt\\zegnam.txt");
            int wrt2;
            while((wrt2=fis2.read())!=-1)
                System.out.print((char)wrt2);
            fis.close();




        }catch(FileNotFoundException e){
            System.out.println("Nie ma takiego pliku");
        }catch(IOException a){
            a.printStackTrace();
        }


    }
}
