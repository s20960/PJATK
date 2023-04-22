public class DetektorDymu {
    boolean czyJestDym = false;
    public void sprawdz() throws Alarm {
        if (czyJestDym) {
            throw new Alarm();
        }
    }
}
