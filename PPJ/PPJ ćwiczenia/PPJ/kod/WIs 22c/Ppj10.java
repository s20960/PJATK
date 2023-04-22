public class Main {

    public static void main(String[] args) {
        int liczba = 10;
        for(int i = 30; i >= 0; i -= 2) {
            System.out.print((liczba >> i) & 0b11);
        }
        System.out.println();
        int size = 2;
        int n = 2 * size + 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (((i <= n / 2 + 1) && (j <= i  || j >= n - i + 1)) ||
                        (i > n / 2 + 1) && (j >= i  || j <= n - i + 1) )
                    System.out.print("*");
                else
                    System.out.print(".");
            }
            System.out.println();
        }





    }
}
