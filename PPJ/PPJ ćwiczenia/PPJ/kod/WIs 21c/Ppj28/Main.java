

public class Main {

    private static Main obj;
    private Main() {}
    public static Main getInstance() {
        if (obj == null) {
            obj = new Main();
        }
        return obj;
    }
}
