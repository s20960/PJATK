public class Samochod extends Pojazd {
    int iloscKol;
    public Samochod() {
        super(0);
        iloscKol = 4;
        ladownosc = iloscKol * 100;
    }
    void poruszajSie() {
        //this.poruszajSie();
        System.out.println("Jade");
        super.poruszajSie();
    }
}
