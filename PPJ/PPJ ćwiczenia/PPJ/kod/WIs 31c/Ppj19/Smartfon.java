public class Smartfon extends Komorka {
    Osoba[] znajomi;

    Smartfon(String kolor) {
        super(kolor);
        znajomi = new Osoba[0];
    }

    void dodajZnajomego(Osoba znajomy) {
        Osoba[] tmp = new Osoba[znajomi.length + 1];
        for (int i = 0; i < znajomi.length; i++) {
            tmp[i] = znajomi[i];
        }
        tmp[tmp.length - 1] = znajomy;
        znajomi = tmp;
    }

    void wypiszHistorie() {
        System.out.println("Historia połaczeń:");
        for (int i = 0; i < historia.length; i++) {
            if (historia[i] != null) {
                int indeks = czyZnajomy(historia[i]);
                if(indeks == -1) {
                    System.out.println(historia[i]);
                } else {
                    znajomi[indeks].wypisz();
                }
            }
        }
    }
    int czyZnajomy(String numer) {
        for (int i = 0; i < znajomi.length; i++) {
            if(numer.equals(znajomi[i].numer))
                return i;
        }
        return -1;
    }


}
