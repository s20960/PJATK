public class Main {

    public static void main(String[] args) {
        //zad 1
        {
            java.util.Scanner in = new java.util.Scanner(System.in);
            byte wrt = in.nextByte();
            int maska = 0b10000000;

            for (int x = 0; x <= 7; x++) {
                System.out.println(wrt & (maska >>> x));
            }
        }
        //zad 3
        {
            int wrt = 12;
            for (int i = 1; i <= 10; i++) {
                System.out.println(wrt * i);
            }
        }
        //zad 4
        {
            int a = 2;
            while (a < 2) {
                System.out.println(a);
                a++;
            }

            a = 2;
            do {
                System.out.println(a);
                a++;
            } while (a < 2);
        }

        //zad 5
        {
            double szereg = 0;
            for (int n = 0; n < 10; n++) {
                double power = 1;
                for (int i = 1; i <= n; i++) {
                    power *= 2;
                }
                //szereg += 1 / power;
                szereg += 1.0 / (1 << n);

//                szereg += 1 / Math.pow(2, n);
            }
            System.out.println(szereg);
        }
    }
}
