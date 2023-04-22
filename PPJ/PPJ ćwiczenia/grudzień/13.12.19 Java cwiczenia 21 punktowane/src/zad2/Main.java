package zad2;

public class Main {
    public static void main(String[] args) {

        Osoba osoba=new Osoba("Jan");
        Spawacz spawacz=new Spawacz("Tomek", 15);

        System.out.println(osoba.wyswietl());
        System.out.println(spawacz.wyswietl());
    }

}
