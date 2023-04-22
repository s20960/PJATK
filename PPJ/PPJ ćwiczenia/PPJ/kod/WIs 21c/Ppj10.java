public class Main {

    public static void main(String[] args) {
        int size = 5;
        int n = 2 * size + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (((j <= i || j >= n - i + 1) && i <= n / 2 + 1) ||
                        (i > n / 2 + 1) && (j >= i || j <= n - i + 1))
                    System.out.print("*");
                else
                    System.out.print(".");
            }
            System.out.println();
        }

        double zad1[] = new double[10];
        for (int i = 0; i < zad1.length; i++) {
            zad1[i] = Math.random() * 10;
        }

        for (int i = 0; i < zad1.length; i++) {
            System.out.print(zad1[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < zad1.length; i += 2) {
            System.out.print(zad1[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < zad1.length; i++) {
            if ((int) zad1[i] % 2 == 1)
                System.out.print(zad1[i] + ", ");
        }
        System.out.println();


        java.util.Scanner in = new java.util.Scanner(System.in);
        char znaki[] = new char[5];
        for (int i = 0; i < znaki.length; i++) {
            znaki[i] = (char) (Math.random()* ('Z' - 'A' + 1) + 'A');
        }
        for (int i = 0; i < znaki.length; i++) {
            System.out.print(znaki[i] + ", ");
        }
        System.out.println();
        int ileZer = 0;
        do {
            char c = in.next().charAt(0); //in.nextChar()
            for (int i = 0; i < znaki.length; i++) {
                if (znaki[i] == c) znaki[i] = 0;
            }
            ileZer = 0;
            for (int i = 0; i < znaki.length; i++) {
                System.out.print(znaki[i] + ", ");
                if (znaki[i] == 0) ileZer++;
            }
            System.out.println();
        } while(ileZer < 5);


    }
}
