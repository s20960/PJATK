
public class Main {
    public static void main(String[] args) {
        DetektorDymu dd = new DetektorDymu();
        try {
            dd.sprawdz();
            System.out.println("Włączam ogrzewanie");
            dd.czyJestdym = true;
            dd.sprawdz();
            System.out.println("Wyłączam ogrzewanie");
        } catch (Alarm a) {
            System.out.println(a.getMessage());
        }
    }
}
