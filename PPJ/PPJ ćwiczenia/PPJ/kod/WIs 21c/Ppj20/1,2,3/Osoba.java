public class Osoba {
    String imie, nazwisko;
    int rokUrodzenia;

    public Osoba(String imie, String nazwisko, int rokUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public String toString() {
        return imie + " " + nazwisko + " (" + rokUrodzenia + ")";
    }
}
