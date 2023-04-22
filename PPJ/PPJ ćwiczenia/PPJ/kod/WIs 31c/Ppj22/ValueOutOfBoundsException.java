public class ValueOutOfBoundsException extends Exception {

    public ValueOutOfBoundsException(int value) {
        super("Podałeś złą wartość " + value);
    }
}
