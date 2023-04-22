public class Main {

    public static void main(String[] args) {
        int wartosc = 24;
        for (int i = 30; i >= 0; i -= 3)
            System.out.print((wartosc >> i) & 7);
        System.out.println();

        java.util.Scanner in = new java.util.Scanner(System.in);
        char[] znaki = new char[5];
        for (int i = 0; i < znaki.length; i++) {
            znaki[i] = (char) (Math.random() * ('Z' - 'A' + 1) + 'A');
            System.out.print(znaki[i]);
        }
        System.out.println();
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
