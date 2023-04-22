public class Main {

    public static void main(String[] args) {
        //zad 1
        java.util.Scanner in = new java.util.Scanner(System.in);
        {

            byte wrt = in.nextByte();
            for (int i = 7; i >= 0; i--) {
//            System.out.println(wrt & (1 << 7)); //0b10000000
//            System.out.println(wrt & (1 << 6));
//            System.out.println(wrt & (1 << 5));
//            System.out.println(wrt & (1 << 4));
//            System.out.println(wrt & (1 << 3));
//            System.out.println(wrt & (1 << 2));
//            System.out.println(wrt & (1 << 1));
//            System.out.println(wrt & 1);
                System.out.println(wrt & (1 << i));
            }
        }
        //zad 2 i 3
        int wrt = 10;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * wrt);
        }
        //zad 4
        boolean warunek = in.nextBoolean();
        while(warunek) {
            System.out.println("Działa while");
        }

        do {
            System.out.println("Działa do while");
        } while(warunek);

        //zad 5
        double pow = 0;
        for(int n = 0; n < 10; n++) {
            double p = 1;
            for (int i = 1; i <= n; i++) {
                p *= 2;
            }

            pow += 1 / p;
            //pow += 1 / Math.pow(2, n);
            //pow += 1.0 / (1 << n);
        }
        System.out.println(pow);

    }
}
