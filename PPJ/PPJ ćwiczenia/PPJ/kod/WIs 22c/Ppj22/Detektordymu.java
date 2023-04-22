public class Detektordymu {
    boolean czyDym = false;

    void sprawdz() throws AlarmException {
        if (czyDym) throw new AlarmException();
    }

    public static void main(String[] args) {
        Detektordymu dd = new Detektordymu();
        try {
            dd.sprawdz();
//            System.out.close();
            System.out.println("Nie ma dymu");
            dd.czyDym = true;
            dd.sprawdz();
            System.out.println("Nie ma dymu");

        } catch (AlarmException e) {
            System.err.println(e.getMessage());
        }
    }

}
