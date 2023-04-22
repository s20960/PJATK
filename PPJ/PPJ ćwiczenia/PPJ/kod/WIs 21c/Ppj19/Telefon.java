public class Telefon {
    String interfrjsKomunikacyjny, kolor;
    Telefon(String ik, String kolor) {
        this.interfrjsKomunikacyjny = ik;
        this.kolor = kolor;
    }

    void zadzwon(String numer) {
        System.out.println("Dzwonie na " + numer);
    }

    void wyswietlHistorie() {
        System.out.println("brak");
    }
}
