public class Komorka extends Telefon{
    String[] rejestr;
    Komorka(String col) {
        super("Siec GSM", col);
        rejestr = new String[10];
    }

    void zadzwon(String numer) {
        super.zadzwon(numer);
        for (int i = 1; i < rejestr.length; i++) {
            rejestr[i - 1] = rejestr[i];
        }
        rejestr[rejestr.length - 1] = numer;
    }

    void wyswietlHistorie() {
        for (int i = 0; i < rejestr.length; i++) {
            if (rejestr[i] != null)
                System.out.println(rejestr[i]);
        }
    }
}
