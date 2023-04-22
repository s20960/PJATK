public class WrongValueException extends Exception {
    public WrongValueException(String elements) {
        super("Tablica nie spelnia wymagan , bledy na pozycjach " + elements);
    }
}
