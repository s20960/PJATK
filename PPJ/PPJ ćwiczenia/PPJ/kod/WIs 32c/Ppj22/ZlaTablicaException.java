public class ZlaTablicaException extends Exception {
    int[][] koordynaty;

    public ZlaTablicaException() {
        koordynaty = new int[0][2];
    }

    void dodajKoordynaty(int[] ij) {
        int[][] tmp = new int[koordynaty.length + 1][2];
        for (int i = 0; i < koordynaty.length; i++) {
            tmp[i] = koordynaty[i];
        }
        tmp[tmp.length - 1] = ij;
        koordynaty = tmp;
    }

    public String getMessage(){
        StringBuilder sb = new StringBuilder();
        sb.append("Tablica nie spelnia wymagan , bledy na pozycjach ");
        for (int i = 0; i < koordynaty.length; i++) {
            sb.append("[").append(koordynaty[i][0]).append(", ").append(koordynaty[i][1])
                    .append("]");
            if(i != koordynaty.length - 1)
                sb.append(", ");
        }
//        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    public boolean czyZla() {
        return koordynaty.length > 0;
    }

}
