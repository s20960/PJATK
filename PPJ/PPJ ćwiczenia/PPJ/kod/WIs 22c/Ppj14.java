public class Main {
    public static void main(String[] args) {
        int[][] mac = new int[25][25];
        for (int i = 0; i < mac.length; i++) {
            for (int j = 0; j < mac[i].length; j++) {
                mac[i][j] = (int) (Math.random() * 2);
            }
        }
        System.out.println(szukaj(mac, 3));
    }
    static boolean szukaj(int[][] mac, int n) {
        for (int i = 0; i < mac.length - n; i++) {
            for (int j = 0; j < mac[i].length - n; j++) {
                int[][] tmp = new int[n][n];
                for (int m = 0; m < tmp.length; m++) {
                    for (int k = 0; k < tmp[m].length; k++) {
                        tmp[m][k] = mac[i + m][j + k];
                    }
                }
                if(sprawdz(tmp)) return true;
            }
        }
        return false;
    }

    static boolean sprawdz(int[][] mac) {

        for (int i = 0; i < mac.length; i++) {
            for (int j = 0; j < mac[i].length; j++) {
                if (j > i && mac[i][j] != 1) {
                    return false;
                }
                if (j < i && mac[i][j] != 0) {
                    return false;
                }
                //dla drugiej przekątnej
                //if (j < mac.length - 1 - i && mac[i][j] != 1) {
                //    return false;
                //}
                //if (j > mac.length - 1 - i && mac[i][j] != 0) {
                //    return false;
               // }
            }
        }
        return true;
    }
}