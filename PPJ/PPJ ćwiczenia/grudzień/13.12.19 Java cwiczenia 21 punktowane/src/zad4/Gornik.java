package zad4;

public class Gornik extends Osoba{
    private int rokPoczatku;

    public Gornik(String imie, int rokUrodzenia, int rokPoczatku) {
        super(imie, rokUrodzenia);
        this.rokPoczatku=rokPoczatku;
    }

    public void wyliczDeputat(){
        System.out.print("Ilosc węgla dla górnika ");
        System.out.print(super.imie());
        System.out.print(" wynosi: ");
        System.out.print((rokPoczatku-super.rok())*10);
        System.out.print(" kg.");
    }
}
