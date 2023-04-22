package zad1;

import java.rmi.StubNotFoundException;

public class Student extends Osoba{
    int ska;
    double iloscPunktow;

    public Student(String imie, int rokUrodzenia,int ska, double iloscPunktow) {
        super(imie, rokUrodzenia);
        this.ska=ska;
        this.iloscPunktow = iloscPunktow;
    }

    public void show() {
        System.out.print(
                "student: " +imie + " " + rokUrodzenia + " ilosc punktów w % = "
        );
        System.out.format("%.2f%n" , iloscPunktow/51 );

    }
}



