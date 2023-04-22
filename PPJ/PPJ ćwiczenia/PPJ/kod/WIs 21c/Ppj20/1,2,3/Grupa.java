public class Grupa {
    private int nr;
    private Student[] studenci;
    private Dydaktyk dydaktyk;

    public Grupa(int nr, Dydaktyk dydaktyk){
        if (nr < 11 || nr > 45)
            this.nr = 11;
        else
            this.nr = nr;

        this.dydaktyk = dydaktyk;
        this.studenci = new Student[16];
    }

    void dodajStudenta(Student student) {
        for (int i = 0; i < studenci.length; i++) {
            if (studenci[i] == null) {
                studenci[i] = student;
                break;
            }
        }
    }

    void wyswietlListeStudentow() {
        System.out.println("Lista:");
        for (int i = 0; i < studenci.length; i++) {
            if (studenci[i] == null) break;
            System.out.println(studenci[i]);
        }
        System.out.println();
    }

    Student getStudent(int nrIndeksu) {
        for (int i = 0; i < studenci.length; i++) {
            if (studenci[i] == null) break;
            if (studenci[i].nrIndeksu == nrIndeksu) return studenci[i];
        }
        return null;
    }

    double wyliczSrednia() {
        double suma = 0;
        double ilosc = 0;
        for (int i = 0; i < studenci.length; i++) {
            if (studenci[i] == null) break;
            double[] pkt = studenci[i].punktyCwiczenia;
            for (int j = 0; j < pkt.length; j++) {
                suma += pkt[i];
            }
            ilosc += pkt.length;
        }
        return suma / ilosc;
    }

    public String toString() {
        return "Grupa nr " + nr + ", Dydaktyk: " + dydaktyk + getIloscStudentow();
    }

    private int getIloscStudentow() {
        int i;
        for (i = 0; i < studenci.length; i++) {
            if (studenci[i] == null) break;
        }
        return i;
    }
}
