public class Student {
    private String imie;// , nazwisko;
    private String nazwisko;
    private int nrIndeksu;
    private double[] punktyCwiczenia;

    public static double maxPunktyCwiczenia;

    public Student(String imie, String n, int nrIndeksu) {
        this.imie = imie;
        nazwisko = n;
        this.nrIndeksu = nrIndeksu;
        punktyCwiczenia = new double[0];
    }

}
