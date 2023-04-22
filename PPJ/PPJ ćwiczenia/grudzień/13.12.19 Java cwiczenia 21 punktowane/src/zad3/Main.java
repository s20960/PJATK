package zad3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Drzewo wierzba=new Drzewo();

        Owoc[] zerwany=new Owoc[100];

        Jablko jabko=new Jablko("a",1);
        Gruszka gruszka=new Gruszka("a",1);

        Owoc[] tmp=new Owoc[2];
        tmp[0]=jabko;
        tmp[1]=gruszka;

        String wrt= Arrays.toString(tmp);

        try {
            FileOutputStream fos=new FileOutputStream("C:\\Users\\mich_\\OneDrive\\Pulpit\\michalino\\PJATK\\PPJ\\PPJ ćwiczenia\\grudzień\\13.12.19 Java cwiczenia 21 punktowane\\dane.txt");
            byte[] nazwa=wrt.getBytes();
            fos.write(nazwa);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int jcounter=0;
        int pcounter=0;
        int gcounter=0;
        double mlaczna=0;

        for (int i = 0; mlaczna <5000&&i<100 ; i++) {
            zerwany[i]=wierzba.zerwijOwoc();
            mlaczna+=zerwany[i].zwrocmasa();
            switch (zerwany[i].zwrocnazwa()){
                case "jablko": jcounter++;
                    break;
                case "gruszka": gcounter++;
                    break;
                case "pomarancza": pcounter++;
                    break;
                default:
            }
        }
        System.out.println("jablka "+jcounter+", guszki "+gcounter+", pomarancze "+pcounter);



    }
}
