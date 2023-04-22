package com.company;

import javafx.css.CssParser;

public class Drzewo {
    boolean wiecznieZielone;
    int wysokosc;
    String przekrojDrzewa;

    public Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa){
        this.wiecznieZielone=wiecznieZielone;
        this.wysokosc=wysokosc;
        this.przekrojDrzewa=przekrojDrzewa;
    }

    public String toString(){
        return "wiecznie zielone: "+wiecznieZielone+", wysokosc: "+wysokosc+", przekroj drzewa"+ przekrojDrzewa;
    }
    public void zerwijOwoc() throws DrzewoBezOwocoweException {
        throw new DrzewoBezOwocoweException();
    }
}
