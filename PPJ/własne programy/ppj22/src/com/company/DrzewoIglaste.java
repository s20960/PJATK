package com.company;

import java.util.zip.DataFormatException;

public class DrzewoIglaste extends Drzewo {
    int iloscIgiel;
    double dlugoscSzyszki;

    public DrzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, double dlugoscSzyszki, int iloscIgiel) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.dlugoscSzyszki=dlugoscSzyszki;
        this.iloscIgiel=iloscIgiel;
    }

    public String toString(){
        return super.toString()+", dlugosc szyszki: "+dlugoscSzyszki+", ilosc igiel: "+iloscIgiel;
    }

}
