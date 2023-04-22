public class Smartfon extends Komorka {
    Osoba[] znajomi;
    Smartfon(String kolor, Osoba[] znajomi) {
        super(kolor);
        this.znajomi = znajomi;
    }
    void wyswietlHistoriePolaczen() {
        for (int i = 0; i < rejestr.length; i++) {
            boolean czyZnajomy = false;
            for (int j = 0; j < znajomi.length; j++) {
                if (znajomi[j].numer.equals(rejestr[i])) {
                    znajomi[j].wyswietl();
                    czyZnajomy = true;
                    break;
                }
            }
            if (!czyZnajomy)
                System.out.println(rejestr[i]);
        }
    }
}
