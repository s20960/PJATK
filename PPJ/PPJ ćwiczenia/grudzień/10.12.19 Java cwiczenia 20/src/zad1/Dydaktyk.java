package zad1;

public class Dydaktyk extends Osoba {
    String alias;

    public Dydaktyk(String imie, int rokUrodzenia, String alias){
        super(imie, rokUrodzenia);
        this.alias=alias;
    }

    public void show(){
        System.out.println(
                "dydaktyk "+ imie+ " " + rokUrodzenia + " " + alias
        );
    }


}
