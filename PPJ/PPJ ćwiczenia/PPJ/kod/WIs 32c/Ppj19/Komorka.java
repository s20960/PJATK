public class Komorka extends Telefon {
    String[] rejestr;

    Komorka(String kolor) {
        super("Siec GSM", kolor);
        rejestr = new String[10];
    }

    void zadzwon(String numer) {
        super.zadzwon(numer);
        for (int i = rejestr.length - 1; i > 0 ; i--) {
            rejestr[i] = rejestr[i - 1];
        }
        rejestr[0] = numer;
    }

    void wyswietlHistoriePolaczen() {
        for (int i = 0; i < rejestr.length; i++) {
            System.out.println(rejestr[i]);
        }
    }

}
