public class Main {

    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        {
            byte wrt = in.nextByte();
            for (int i = 7; i >= 0; i--) {
                System.out.println(wrt & (1 << i)); //0b10000000
//            System.out.println(wrt & (1 << 6));
//            System.out.println(wrt & (1 << 5));
//            System.out.println(wrt & (1 << 4));
//            System.out.println(wrt & (1 << 3));
//            System.out.println(wrt & (1 << 2));
//            System.out.println(wrt & (1 << 1));
//            System.out.println(wrt & (1 << 0));
            }
        } //wrt przestało istnieć

        int wrt = 10;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * wrt + " ");
        }
        System.out.println();

        int a = 0;
        while (a < 0) {
            System.out.println("Jestem while");
        }

        do {
            System.out.println("Jestem do while");
        } while (a < 0);


        double series = 0;
        for (int n = 0; n < 10; n++) {
            double power = 1;
            for (int i = 1; i <= n; i++) {
                power *= 2;
            }

            //series += 1 / Math.pow(2, n);
            //series += 1 / power;
            series += 1d / (1 << n);
        }
        System.out.println(series);

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int x = 3;

        double taylor = x;
        boolean czyMinus = true;
        for (int i = 3; i < 20; i += 2) {
            long silnia = 1L;
            for (int j = 1; j <= i; j++) {
                silnia *= j;
            }
            taylor += (czyMinus ? -1 : 1) * (Math.pow(x, i) / silnia);
            czyMinus = !czyMinus;
        }
        System.out.println(taylor);
        System.out.println(Math.sin(3));

    }
}
