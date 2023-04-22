public class Dydaktyk extends Osoba {
    private String alias;
    public Dydaktyk(String imie, String nazwisko, int rokUrodzenia, String alias) {
        super(imie, nazwisko, rokUrodzenia);
        this.alias = alias;
    }

    public String toString() {
        return super.toString() + " - " + alias;
    }
}
