public class Student {
    private String imie, nazwisko;
    private int nrIndeksu;
    private double[] punktyCwiczenia;

    public static int maxPunktyCwiczenia;

    public Student(String imie, String nazwisko, int nrIndeksu) {
        punktyCwiczenia = new double[0];
        this.imie = imie;
        this.nazwisko = nazwisko;
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
        return suma/maxPunktyCwiczenia * 0.25;
    }
}
