public class Zad1 {
    public static void main(String[] args) {
        DetektorDymu dd = new DetektorDymu();

        try {
            dd.sprawdz();
            System.out.println("Włączam piec");
            dd.czyJestDym = true;
            dd.sprawdz();
            System.out.println("Piec dalej chodzi");
        } catch (Alarm alarm) {
            System.out.println(alarm.getMessage());
        }
    }
}
