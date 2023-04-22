package zad3;

public class DrzewoIglaste extends Drzewo {

    int iloscIgiel;
    double dlugoscSzyszki;

    public DrzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int iloscIgiel, double dlugoscSzyszki) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.dlugoscSzyszki=dlugoscSzyszki;
        this.iloscIgiel=iloscIgiel;
    }

    public String toString(){
        return super.toString()+", ilosc igiel= "+iloscIgiel+", dlugosc szyszki= "+dlugoscSzyszki;
    }



}
