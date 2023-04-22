package zad1;

public class Main {

    public static void main(String[] args) {
        Osoba osoba = new Osoba("Filip",2000);
        osoba.show();
        System.out.println();

        Student student = new Student("Filip", 2000,20960, 43);
        student.show();
        System.out.println();

//        Dydaktyk dydaktyk = new Dydaktyk("Michal", 1977, "alias");
//        dydaktyk.show();

        Grupa grupa = new Grupa();
        grupa.stworzlListeStudentow();
        grupa.wyswietlListeStudentow();
        grupa.toString();
        System.out.println(grupa.wyliczSrednia());
        System.out.println(grupa.getStudent(20960).imie);
    }
}
