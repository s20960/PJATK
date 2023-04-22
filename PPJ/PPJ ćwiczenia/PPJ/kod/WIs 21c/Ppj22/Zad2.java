public class Zad2 {
    public static void main(String[] args) {
        int n = 3;
        int[][] tab = new int[n][n];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = (int) (Math.random() + 6);
            }
        }
        int[][] tab1 = {
                {0, 0, 1},
                {0, 1, 0},
                {0, 1, 0}
        };

        try {
            sprawdz(tab1);
        } catch (WrongValueException e) {
            System.out.println(e.getMessage());
        }

    }

    static void sprawdz(int[][] tab) throws WrongValueException {
        boolean czyException = false;
        String wrong = "";
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (i != j && tab[i][j] != 0) {
                    wrong += "[" + i + ", " + j + "],";
                    czyException = true;
                }
            }
        }
        if (czyException) {
            throw new WrongValueException(wrong);
        }
    }
}
