package com.company;

import java.io.*;

public class Main {
    public static void main(String[] args) {

/*
        Scanner sc=new Scanner(System.in);
        double d=sc.nextDouble();
        System.out.println("d: "+d);

        try{
            System.in.read( );
        }catch(IOException e){
            e.printStackTrace();
        }catch(Exception ex){

        }
*/
/*
        Owoc owoc =new Owoc();
        Osoba osoba =new Osoba();
        for (int i = 0; i <40 ; i++) {
            osoba.zjedz(owoc);
        }
*/

        try {
            FileInputStream fis = new FileInputStream("C:\\usunac\\1.txt");
/*
            int wrt =fis.read();
            while (true){
                System.out.print((char)wrt);
                wrt=fis.read();
                if(wrt==-1) break;
            }
*/

            int wrt;
            while((wrt=fis.read())!=-1)
                System.out.print((char)wrt);
            fis.close();

            int out=0xff0080;
            FileOutputStream fos =new FileOutputStream("C:\\usunac\\3.txt");
            fos.write(out);
            fos.write(out>>8);
            fos.write(out>>16);
            fos.flush();
            fos.close();

            fis=new FileInputStream("C:\\usunac\\3.txt");
            System.out.println();
            int res = fis.read();
            res |= fis.read()<<8;
            res |= fis.read()<<16;
            System.out.println(res);



            ObjectOutputStream oos = new ObjectOutputStream(
              new FileOutputStream("C:\\usunac\\4.txt")
            );

            oos.write(out);
            oos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
