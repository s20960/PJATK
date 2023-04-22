public class Produkt {
    String nazwa;
    double cena;
    int iloscSztuk;

    public Produkt(String nazwa, double cena, int iloscSztuk) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscSztuk = iloscSztuk;
    }

    @Override
    public String toString() {
        return nazwa + "\t\t\t" + iloscSztuk + "x " + cena + "zł\t" + iloscSztuk*cena + "zł";
    }
}
