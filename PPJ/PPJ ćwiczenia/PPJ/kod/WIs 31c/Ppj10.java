public class Main {

    public static void main(String[] args) {

        int size = 2;
        int n = 2 * size + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || j == n - i + 1)
                    System.out.print("*");
                else
                    System.out.print(".");
            }
            System.out.println();
        }

        int x = 21;
        for (int i = 30; i >= 0; i -= 3) {
            System.out.print((x >> i) & 7);
        }
        System.out.println();

        //int nazwa[];

        int[] nazwa = new int[10]; // 320bit == 40B
        System.out.println(nazwa[0]);
        nazwa[1] = 5;
        System.out.println(nazwa.length);

        int[][] matrix = new int[2][];
        matrix[0] = new int[10];
        matrix[1] = new int[5];

        System.out.println(matrix[1].length);

        int[] nazwa2 = {1, 2, 3};
        nazwa = new int[]{1, 2, 3};

        char[] tab = {'T', 'O', 'K'};
        int najmniejsza = 0;
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < tab[najmniejsza])
                najmniejsza = i;
        }
        System.out.println(najmniejsza);
        System.out.println(tab[najmniejsza]);

        char[] znaki = new char[10];
        for (int i = 0; i < znaki.length; i++) {
            znaki[i] = (char) (Math.random() * ('Z' - 'A' + 1) + 'A');
            System.out.print(znaki[i]);
        }
        System.out.println();
        java.util.Scanner in = new java.util.Scanner(System.in);
        int zera = 0;

        do {
            char c = in.next().charAt(0);
            for (int i = 0; i < znaki.length; i++) {
                if (znaki[i] == c) {
                    znaki[i] = 0;
                    zera++;
                }
                System.out.print(znaki[i]);
            }
            System.out.println();
        } while(zera < znaki.length);
    }
}
