package zad3;

public class DrzewoOwocowe extends DrzewoLisciaste {

    String nazwaOwoca;

    public DrzewoOwocowe(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, String ksztaltLiscia, String nazwaOwoca) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa, ksztaltLiscia);
        this.nazwaOwoca=nazwaOwoca;
    }

    public String toString(){
        return super.toString()+" nazwa owoca: "+nazwaOwoca;
    }

    public void zerwijOwoc() {
        System.out.println("zerwano owoc: "+this.nazwaOwoca);

    }
}
