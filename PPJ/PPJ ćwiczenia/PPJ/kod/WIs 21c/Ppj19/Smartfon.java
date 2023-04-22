public class Smartfon extends Komorka {
    Osoba[] zanjomi;

    Smartfon(String kolor, Osoba[] znajomi) {
        super(kolor);
        this.zanjomi = znajomi;
    }

    void wyswietlHistorie() {
        for (int i = 0; i < rejestr.length; i++) {
            if (rejestr[i] != null) {
                boolean czyZnajomy = false;
                for (int j = 0; j < zanjomi.length; j++) {
                    if (zanjomi[j].numer.equals(rejestr[i])) {
                        System.out.println(zanjomi[j].nazwisko);
                        czyZnajomy = true;
                        break;
                    }
                }
                if (!czyZnajomy) {
                    System.out.println(rejestr[i]);
                }
            }
        }

    }
}
