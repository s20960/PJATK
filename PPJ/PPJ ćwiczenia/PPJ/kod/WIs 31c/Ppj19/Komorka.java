public class Komorka extends Telefon {
    String[] historia;
    Komorka(String kolor) {
        super("Sieć komórkowa", kolor);
        historia = new String[10];
    }

    void zadzwon(String numer) {
        super.zadzwon(numer);
        for (int i = historia.length - 1; i > 0; i--) {
            historia[i] = historia[i - 1];
        }
        historia[0] = numer;
    }

    void wypiszHistorie() {
        System.out.println("Historia połaczeń:");
        for (int i = 0; i < historia.length; i++) {
            if (historia[i] != null)
                System.out.println(historia[i]);
        }
    }
}
