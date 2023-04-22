package zad1;

import javax.print.DocFlavor;
import javax.swing.*;

public class Grupa {

    int pomocNr=(int)(Math.random()*34)+11;
    int pomocStu=(int)(Math.random()*6)+10;
    int nrGrupy =pomocNr;



    Student[] w39= new Student[pomocStu];
    Dydaktyk dydaktyk2=new Dydaktyk("Knop",1989, "Knopers");



    public void stworzlListeStudentow(){
        for (int i = 0; i <pomocStu ; i++) {
            w39[i]=new Student("Michal",2000,20960,Math.random()*50);
        }
    }

    public void wyswietlListeStudentow(){
        for (int i = 0; i <pomocStu ; i++) {
            System.out.print(
                i+". "+w39[i].imie+" "+w39[i].ska+" "
            );
            System.out.format("%.2f%n" , w39[i].iloscPunktow);

        }
    }
    public String toString(){
        return "Numer grupy: "+nrGrupy+"w"+" | Imie dydaktyka: "+dydaktyk2.imie+" |"+
                " Iliosc studentow: "+pomocStu;
    }

    public Student getStudent(int nrIndeksu){
        Student znaleziony=new Student("", 0, 0,0);
        for (int i = 0; i <pomocStu ; i++) {
            if (w39[i].ska==nrIndeksu)
                znaleziony=w39[i];
        }
        return znaleziony;
    }

    public double wyliczSrednia(){
        double sumaPkt=0;
        for (int i = 0; i <pomocStu ; i++) {
            sumaPkt+=w39[i].iloscPunktow;
        }
        sumaPkt=sumaPkt/pomocStu;

        return sumaPkt;
    }







}
