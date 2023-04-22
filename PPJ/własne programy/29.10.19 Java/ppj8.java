public class ppj8 {
    public static void main(String[] args) {
        char znakGwiazdki = '*';
        java.util.Scanner in = new java.util.Scanner(System.in);;

        int poziomy = in.nextInt();

        for (int i = 0; i < poziomy; i++) {
            for (int j = 0; j < poziomy * 2; j++) {
                if (j < (poziomy - i) || j > (poziomy + i)) {
                    System.out.print(" ");
                } else {
                    System.out.print(znakGwiazdki);
                }
            }
            System.out.println();
        }
    }
}