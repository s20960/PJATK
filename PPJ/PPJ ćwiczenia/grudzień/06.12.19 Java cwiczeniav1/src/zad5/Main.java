package zad5;

public class Main {
    public static void main(String[] args) {

        Osoba michalek = new Osoba("michal",2000);

        System.out.println(michalek.zwrocImie());
        System.out.println(michalek.zwrocWiek());

        Osoba[]ludzie=new Osoba[10];

        for (int i = 0; i <ludzie.length ; i++) {
            int data=(int)(Math.random()*50)+1950;
            ludzie[i]=new Osoba("michal",data);
        }
        System.out.println((Osoba.zwrocNajstarszaOsobe(ludzie)).zwrocWiek());
    }
}
