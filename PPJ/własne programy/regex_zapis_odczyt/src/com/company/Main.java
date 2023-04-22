package com.company;

import java.io.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\mich_\\OneDrive\\Pulpit\\michalino\\PJATK\\PPJ\\własne programy\\regex_zapis_odczyt\\dane.txt");

            StringBuilder sb = new StringBuilder();
            int wrt;
            while((wrt=fis.read())!=-1)
                sb.append((char)wrt);
//            System.out.println(sb);

            Pattern p =Pattern.compile("s\\d{3,5}@((pjwstk)|(pja)).edu.pl");
            Matcher m =p.matcher(sb);
            while(m.find()){
                System.out.println(m.group(0));
            }
        }catch(FileNotFoundException e){
            System.out.println("nie ma pliku");
        }catch(IOException e){
            System.out.println("nastalpi blad");
        }


    }
}
