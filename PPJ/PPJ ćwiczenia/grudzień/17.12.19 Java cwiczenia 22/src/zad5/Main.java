package zad5;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        int[] cyfry = new int['z' - 'a' + 1];
        int pomoc1=0;

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\mich_\\OneDrive\\Pulpit\\michalino\\PJATK\\PPJ\\PPJ ćwiczenia\\grudzień\\17.12.19 Java cwiczenia 22\\src\\zad5\\dane.txt");
            int wrt;
            while ((wrt = fis.read()) != -1) {
                System.out.print((char) wrt);
                if (wrt>='a'&&wrt<='z')cyfry[wrt-'a']++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        for (int j = 0; j < cyfry.length; j++) {
            if(cyfry[j]>0){
                System.out.print((char)(j+'a')+" "+cyfry[j]+"   ");
            }
        }
    }
}
