public class Zad2 {
    public static void main(String[] args) {
        int[][] tab = new int[3][3];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = (int) (Math.random() * 6);
            }
        }

        int[][] tab2 = {
                {0, 0, 1},
                {0, 1, 0},
                {0, 1, 0}
        };

        try {
            sprawdz(tab2);
        } catch (ZlaTablicaException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void sprawdz(int[][] tab) throws ZlaTablicaException {
        ZlaTablicaException ex = new ZlaTablicaException();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (i != j && tab[i][j] != 0) {
                    ex.dodajKoordynaty(new int[]{i, j});
                }
            }
        }
        if (ex.czyZla())
            throw ex;
    }
}
