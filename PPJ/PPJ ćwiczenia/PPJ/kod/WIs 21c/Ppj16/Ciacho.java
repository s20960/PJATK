public class Ciacho {
    public float waga;
    public static float cenaZaKilogram;

    public Ciacho() {
        System.out.println(waga);
        waga = 5;
    }

    public Ciacho(int waga) {
        this();
        this.waga = waga;
    }

    public static void shows() {
        System.out.println(cenaZaKilogram);
    }
    public void showns() {
        System.out.println(cenaZaKilogram);
        System.out.println(this.waga);
    }
}
