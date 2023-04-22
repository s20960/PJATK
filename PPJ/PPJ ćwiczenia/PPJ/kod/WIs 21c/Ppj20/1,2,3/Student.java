public class Student extends Osoba{
    int nrIndeksu;
    double[] punktyCwiczenia;

    public static int maxPunktyCwiczenia;

    public Student(String imie, String nazwisko, int rokUrodzenia, int nrIndeksu) {
        super(imie, nazwisko, rokUrodzenia);
        this.punktyCwiczenia = new double[0];
        this.nrIndeksu = nrIndeksu;
    }

    public void dodajPunkt(double ilosc) {
        double[] tmp = new double[punktyCwiczenia.length + 1];
        for (int i = 0; i < punktyCwiczenia.length; i++) {
            tmp[i] = punktyCwiczenia[i];
        }
        tmp[tmp.length - 1] = ilosc;
        punktyCwiczenia = tmp;
    }
    public double wyliczProcent() {
        double suma = 0;
        for (int i = 0; i < punktyCwiczenia.length; i++) {
            suma += punktyCwiczenia[i];
        }
        return suma / maxPunktyCwiczenia * 0.25;
    }

    public String toString() {
        return nrIndeksu + " - " + super.toString() + ": " + (wyliczProcent() * 100) + "%";
    }
}
