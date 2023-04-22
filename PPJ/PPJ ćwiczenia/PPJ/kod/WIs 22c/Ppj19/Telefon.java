public class Telefon {
    private String interfejsKomunikacyjny;
    private String color;

    Telefon(String ik, String col) {
        interfejsKomunikacyjny = ik;
        color = col;
    }

    void zadzwon(String numer) {
        System.out.println("Dzwonie - " + numer);
    }
    void wyswietlHistorie() {
        System.out.println("brak historii");
    }
}
