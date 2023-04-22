public class Telefon {
    String interfejsKomunikacyjny, kolor;
    Telefon(String interfejsKomunikacyjny, String kolor) {
        this.interfejsKomunikacyjny = interfejsKomunikacyjny;
        this.kolor = kolor;
    }

    void zadzwon(String numer) {
        System.out.println("Dzwonię pod numer: " + numer);
    }

    void wypiszHistorie() {
        System.out.println("Historia połaczeń:");
        System.out.println("brak historii");
    }
}
