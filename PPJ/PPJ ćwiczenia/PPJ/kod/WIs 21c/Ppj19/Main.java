package p1;

public class Main {

    public static void main(String[] args) {
        Telefon stacjonarny = new Telefon("Kabel", "żółty");
        stacjonarny.zadzwon(genNumber());
        stacjonarny.wyswietlHistorie();

        Komorka komorka = new Komorka("Czarny");
        komorka.zadzwon(genNumber());
        komorka.wyswietlHistorie();

        Osoba[] znajomi = {
                new Osoba("Michał", "Tomaszewski", "666-666-666")
        };
        Smartfon smarfon = new Smartfon("Żółty", znajomi);
        smarfon.zadzwon(znajomi[0].numer);
        smarfon.zadzwon(genNumber());
        smarfon.wyswietlHistorie();

        Telefon[] telefons = {
                stacjonarny,
                komorka,
                smarfon
        };
        for (int i = 0; i < telefons.length; i++) {
            for (int j = 0; j < 10; j++) {
                telefons[i].zadzwon(
                       j % 2 == 0 ? genNumber() :
                       znajomi[0].numer
                );
            }
            telefons[i].wyswietlHistorie();
        }



    }
    static String genNumber() {
        int el1 = (int) (Math.random() * 899 + 100);
        int el2 = (int) (Math.random() * 899 + 100);
        int el3 = (int) (Math.random() * 899 + 100);
        return el1 + "-" + el2 + "-" + el3;
    }
}
