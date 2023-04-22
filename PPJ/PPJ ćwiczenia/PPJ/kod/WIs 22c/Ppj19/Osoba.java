public class Osoba {
    String imie, nazwisko, numer;
    Osoba(String imie, String nazwisko, String numer) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer = numer;
    }
    void wypisz() {
        System.out.println(imie + " " + nazwisko +
                "[" + numer + "]");
    }
}
