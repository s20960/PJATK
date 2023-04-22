public class Main {

    public static void main(String[] args) {


        Student[] stud = {
                new Student("Adam", "Abacki", 1997, 17000),
                new Student("Bartłomiej", "Babacki", 1999, 17101),
                new Student("Cycylia", "Cabacka", 1998, 15110),
                new Student("Dominik", "Dabacki", 2000, 21011),
        };

        Dydaktyk d = new Dydaktyk("Elwira", "Ecka", 1988, "ela");
        Student.maxPunktyCwiczenia = 10;
        Grupa g1 = new Grupa(15, d);

        for (int i = 0; i < stud.length; i++) {
            for (int j = 0; j < Student.maxPunktyCwiczenia; j++) {
                stud[i].dodajPunkt(Math.random() > 0.3 ? 1 : 0);
            }
            g1.dodajStudenta(stud[i]);
        }

        g1.wyswietlListeStudentow();
        System.out.println(g1);

        System.out.println(g1.getStudent(17101));
        System.out.println("Srednia: " + g1.wyliczSrednia());
    }
}
