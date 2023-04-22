public class NoMoney extends Exception {
    public NoMoney(double value) {
        super("Brakuje ci jeszcze " + value + "zł");
    }
}
