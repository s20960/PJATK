package zad3;

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
        return "czy wiecznie zielone: "+wiecznieZielone+", wysokosc = "+wysokosc+", przekroj: "+przekrojDrzewa;
    }
    public void zerwijOwoc() throws DrzewoBezOwocoweException{
        throw new DrzewoBezOwocoweException();
    }

}
