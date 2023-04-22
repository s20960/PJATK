public class Main {

    public static void main(String[] args) {
        int x = nazwa(2.0, 3.0);
        System.out.println(x);

        System.out.println(nazwa(2.0, 3.0));
        //void x = metoda();
        metoda();
        int y = metoda(2);


        int[] wrt = {5};
        System.out.println(wrt[0]); //5; 5
        modifyValue(wrt);
        System.out.println(wrt[0]); //5; 5(25)

        int max = findMax(15, 21, 2);
        System.out.println(max);
        char[] napis = {'A', 'l', 'a', ' ', 'm', 'a', ' ', 'k', 'o', 't', 'a'};
        policz(napis);
    }
    static void policz(char[] napis) {
        int licznik;
        for(int i = 0; i < napis.length; i++) {
            licznik = 1;
            for (int j = i + 1; j < napis.length; j++) {
                if (napis[i] == napis[j]) {
                    licznik++;
                    napis[j] = 0;
                }
            }
            if (napis[i] != 0)
                System.out.println(napis[i] + " wystapila " + licznik + " razy");
            napis[i] = 0;
        }
    }
    static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
    static void modifyValue(int[] a) {
        int tmp = a[0];
        a = new int[1];
        a[0] = tmp;

        System.out.println(a[0]); //5; 5
        a[0] = a[0] * 5;
        System.out.println(a[0]); //25; 25
    }



    public static void metoda() {

    }

    public static int metoda(int a) {
        return a;
    }

    public static int nazwa(double wysokosc, double waga) {
        System.out.println(wysokosc * waga);
        return 2;
    }





}
