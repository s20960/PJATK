public class Main {

    public static void main(String[] args) {
        Smartfon iphone = new Smartfon("Biały");
        Osoba tomaszew = new Osoba("Michal", "Tomaszewski", "666-666-666");
        iphone.dodajZnajomego(tomaszew);

        Telefon[] telefony = {
                new Telefon("Kabel telefoniczny", "Zółty"),
                new Komorka("Czarny"),
                iphone
        };

        for (int i = 0; i < telefony.length; i++) {
            for (int j = 0; j < 10; j++) {
                if(j % 2 == 0) {
                    telefony[i].zadzwon(
                            (int) (Math.random() * 999) + "-" +
                                    (int) (Math.random() * 999) + "-" +
                                    (int) (Math.random() * 999)
                    );
                } else {
                    telefony[i].zadzwon(tomaszew.numer);
                }
            }
        }

        for (int i = 0; i < telefony.length; i++) {
            System.out.println("Rejestr telefonu " + i);
            telefony[i].wyswietlHistorie();
        }


    }
}
