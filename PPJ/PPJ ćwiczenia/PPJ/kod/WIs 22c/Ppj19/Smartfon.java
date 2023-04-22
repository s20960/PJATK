public class Smartfon extends Komorka {
    private Osoba[] znajomi;

    Smartfon(String color) {
        super(color);
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

    void wyswietlHistorie() {
        for (int i = 0; i < rejestr.length; i++) {
            if (rejestr[i] != null) {
                boolean znaleziony = false;
                for (int j = 0; j < znajomi.length; j++) {
                    if(znajomi[j].numer.equals(rejestr[i])) {
                        znajomi[j].wypisz();
                        znaleziony = true;
                        break;
                    }
                }
                if (!znaleziony) {
                    System.out.println(rejestr[i]);
                }
            }
        }
    }

}
