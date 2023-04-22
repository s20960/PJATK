public class Main {

    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);

        byte wrt = in.nextByte();
        for (int i = 7; i >= 0; i--) {
            System.out.println(wrt & (1 << i));
        }
//        System.out.println(wrt & (1 << 7)); //0b10000000
//        System.out.println(wrt & (1 << 6)); //0b10000000
//        System.out.println(wrt & (1 << 5)); //0b10000000
//        System.out.println(wrt & (1 << 4)); //0b10000000
//        System.out.println(wrt & (1 << 3)); //0b10000000
//        System.out.println(wrt & (1 << 2)); //0b10000000
//        System.out.println(wrt & (1 << 1)); //0b10000000
//        System.out.println(wrt & (1 << 0)); //0b10000000

        //zad 2
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //zad 4
        int a = 2;
        while (a < 1) {
            System.out.println("While");
        }

        do {
            System.out.println("Do while");
        } while (a < 1);

        //zad 5
        double series = 0;
        for (int n = 0; n < 10; n++) {
            double potega = 1;
            for (int i = 1; i <= n; i++) {
                potega *= 2;
            }

//            series += 1 / Math.pow(2, n);
            //series += 1 / potega;
            series += 1d / (1 << n);
        }
        System.out.println(series);
    }
}
