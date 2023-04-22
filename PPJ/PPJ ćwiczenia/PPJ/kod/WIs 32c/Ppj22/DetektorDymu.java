public class DetektorDymu {
    boolean czyJestdym = false;

    void sprawdz() throws Alarm {
        if (czyJestdym) {
//            Alarm a = new Alarm();
//            throw a;
            throw new Alarm();
        }
    }
}
