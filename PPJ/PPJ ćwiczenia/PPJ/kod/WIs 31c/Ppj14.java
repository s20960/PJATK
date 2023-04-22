public class Main {

    public static void main(String[] args) {
        int[][] tab = {
                {3, 2, 1},
                {3, 2},
                {1}
        };
        int[] rez = metoda(tab, 0);
        for (int i = 0; i < rez.length; i++) {
            System.out.print(rez[i] + " ");
        }
        System.out.println();

        System.out.println(charsToNumber(new char[]{'3', '2', '1'}));
    }

    public static int charsToNumber(char[] tab) {
        int rez = 0;
        for (int i = 0; i < tab.length; i++) {
            rez += (int) ((tab[i] - '0') * Math.pow(10, tab.length - 1 - i));
        }
        return rez;
    }

    public static int[] metoda(int[][] tab, int i) {
        int[] rez = new int[3 * tab.length];
        int idx = 0;
        for (int j = 0; j < tab.length; j++) {
            rez[idx++] = tab[j].length;
        }

        for (int j = 0; j < tab.length; j++) {
            int suma = 0;
            for (int k = 0; k < tab[j].length; k++) {
                suma += tab[j][k];
            }
            rez[idx++] = suma;
        }
        for (int j = 0; j < tab.length; j++) {
            int suma = 0;
            int minus = 0;
            for (int k = 0; k < tab.length; k++) {
                if(j < tab[k].length) {
                    suma += tab[k][j];
                    minus = 1;
                }
            }
            rez[idx++] = suma - minus;
        }
        return rez;
    }

}