public class Telefon {
    String intefejsKomunikacyjny, kolor;
    Telefon(String ik, String kolor) {
        this.intefejsKomunikacyjny = ik;
        this.kolor = kolor;
    }

    void zadzwon(String numer) {
        System.out.println("Dzwonie pod numer " + numer);
    }
    void wyswietlHistoriePolaczen() {
        System.out.println("brak historii");
    }
}
