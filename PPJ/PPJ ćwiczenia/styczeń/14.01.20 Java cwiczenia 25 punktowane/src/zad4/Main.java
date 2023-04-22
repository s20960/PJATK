package zad4;

import java.io.*;

public class Main{
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder();

        try{
            FileInputStream fis = new FileInputStream("dane.txt");
            int wrt;
            while((wrt=fis.read())!=-1){
                sb.append((char)wrt);
            }
            sb.reverse();
            System.out.println();
            String napis=sb.toString();
            PrintWriter fos = new PrintWriter("odczyt.txt");

                fos.println(napis);


            fos.close();


        }catch(FileNotFoundException a){
            a.printStackTrace();
        }catch(IOException a){
            a.printStackTrace();
        }


    }
}
