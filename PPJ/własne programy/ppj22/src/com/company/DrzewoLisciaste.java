package com.company;

public class DrzewoLisciaste extends Drzewo{
    int ksztaltLiscia;

    public DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.ksztaltLiscia=ksztaltLiscia;
    }

    public String toString(){
        return super.toString()+", ksztalt liscia: "+ksztaltLiscia;
    }

}
