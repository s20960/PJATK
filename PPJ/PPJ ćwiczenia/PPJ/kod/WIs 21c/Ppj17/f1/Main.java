package f1;

public class Main {

    static int a;
    private static int b;
    public static int c;

    public int d;

    public static void main(String[] args) {
        Main.a = 0;
        a = 1;

        Main.b = 1;
        b = 2;

        Main.c = 3;
        c = 3;

        Main m = new Main();
        m.d = 1;
        d = 0;
    }
}
