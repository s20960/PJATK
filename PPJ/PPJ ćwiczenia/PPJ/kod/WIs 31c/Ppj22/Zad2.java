public class Zad2 {
    public static void main(String[] args) {
        int[][] tab = new int[3][3];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = (int) (Math.random() * 6);
            }
        }

        int[][] tab1 = {
                {0, 0, 1},
                {0, 1, 0},
                {0, 1, 0}
        };


        try {
            sprawdz(tab1);
        } catch (ZlaTablicaException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void sprawdz(int[][] tab) throws ZlaTablicaException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (i != j && tab[i][j] != 0) {
                    sb.append("[").append(i).append(", ").append(j).append("], ");
                }
            }
        }
        if (sb.length() > 0) {
            throw new ZlaTablicaException(sb.toString());
        }
    }
}
