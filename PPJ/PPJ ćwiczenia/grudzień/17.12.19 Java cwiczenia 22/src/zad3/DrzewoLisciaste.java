package zad3;

public class DrzewoLisciaste extends Drzewo {

    String ksztaltLiscia;

    public DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, String ksztaltLiscia) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.ksztaltLiscia=ksztaltLiscia;
    }

    public String toString(){
        return super.toString()+", kształt liscia: "+ksztaltLiscia;
    }


}
