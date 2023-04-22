public class Main {

    public static void main(String[] args) {
//        Klasa k1 = new Klasa(2);
//        k1.pole = 2;
        Student ja = new Student("Mateusz", "Knop", 12690);
        Student s2 = new Student("Michał", "Tomaszewski", 534);
        Student.maxPunktyCwiczenia = 24;

        ja.dodajPunkt(1.0);
        ja.dodajPunkt(1.0);
        ja.dodajPunkt(0.50);
        System.out.println(ja.wyliczProcent());
    }
}
