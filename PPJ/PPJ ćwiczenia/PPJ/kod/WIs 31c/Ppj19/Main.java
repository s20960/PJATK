public class Main {


    public static void main(String[] args) {
        /*B b = new B();
        b.kot = 0;
        b.pies = 0;
        b.show();
        */
        Telefon stacjonarny = new Telefon("Kabel Telefonicznny", "Biały");
        stacjonarny.zadzwon(genNumber());

        Komorka komorka = new Komorka("Czarny");
        komorka.zadzwon(genNumber());

        Osoba znajomy = new Osoba(
                "Michał", "Tomaszewski", "666-666-666"
        );

        Smartfon s = new Smartfon("Czarny");
        s.dodajZnajomego(znajomy);

        s.zadzwon(znajomy.numer);
        s.zadzwon(genNumber());

        stacjonarny.wypiszHistorie();
        komorka.wypiszHistorie();
        s.wypiszHistorie();

        Telefon[] telefony = {stacjonarny, komorka, s};
        for (int i = 0; i < telefony.length; i++) {
            for (int j = 0; j < 10; j++) {
                telefony[i].zadzwon(j % 2 == 0 ? genNumber() : znajomy.numer);
            }
            telefony[i].wypiszHistorie();
        }


    }
    static String genNumber() {
        int[] tab = new int[3];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * 899 + 100);
        }
        return tab[0] + "-" + tab[1] + "-" + tab[2];
    }

}
