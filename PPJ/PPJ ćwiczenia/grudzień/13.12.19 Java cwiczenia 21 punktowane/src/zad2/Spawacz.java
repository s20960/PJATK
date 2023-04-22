package zad2;

public class Spawacz extends Osoba{
    int stazpracy;
    public Spawacz(String imie,int stazpracy){
        super(imie);
        this.stazpracy=stazpracy;
    }
    public String wyswietl(){
        return super.wyswietl()+" "+stazpracy;
    }
}
