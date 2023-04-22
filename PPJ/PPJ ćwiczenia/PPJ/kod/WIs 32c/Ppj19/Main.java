public class Main {
    static String genNumber() {
        int e1 = (int) (Math.random() * 899 + 100);
        int e2 = (int) (Math.random() * 899 + 100);
        int e3 = (int) (Math.random() * 899 + 100);
        return e1 + "-" + e2 + "-" + e3;
    }


    public static void main(String[] args) {

        Telefon stacjonarny = new Telefon("Kabel telefoniczny", "zielony");

        Komorka kom = new Komorka("Czerwony");


        Osoba[] znajomi = {
                new Osoba("Michał", "Tomaszewski", "666-666-666")
        };
        Smartfon smartfon = new Smartfon("Czarny", znajomi);

        Telefon[] telefony = {
                smartfon,
                stacjonarny,
                kom
        };
        for (int i = 0; i < telefony.length; i++) {
            System.out.println("---------- " + telefony[i].kolor);
            for (int j = 0; j < 10; j++) {
                telefony[i].zadzwon(j % 2 == 0 ? znajomi[0].numer : genNumber());
            }
            System.out.println("Historia:");
            telefony[i].wyswietlHistoriePolaczen();
        }




        /*A a = new A(12);
        B b = new B();

        a.show();
        b.show();

        A a1 = new B();
        ((B)a1).number3 = 0;

        A[] tab = new A[] {
                new A(),
                new B()
        };
        for (int i = 0; i < tab.length; i++) {
            tab[i].show();
        }*/

    }
}
