package com.company;

import java.rmi.StubNotFoundException;

public class Student extends Osoba{
    int ska;
    String imie;

    public Student(String imie, int rokUrodzenia, int ska) {
        super(imie, rokUrodzenia);
        this.ska = ska;
    }

    public Student(Osoba o)
    {
        super(o.imie, o.rokUrodzenia);
    }

    public void show() {
        System.out.println(
                "Student: " + super.imie + " " + rokUrodzenia + " " + ska
        );
        super.show();
    }

    public String toString(){
        return "Student toString: "+super.imie+" "+rokUrodzenia+" "+ska;
    }
}



