public class TheBestDrawingMachine extends DrawingMachine {
    TheBestDrawingMachine(int n, int m) {
        super(n, m);
    }
    void draw(int[] param) {
        int x0 = param[0];
        int y0 = param[1];
        int r = param[2];

        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                if (Math.pow(x - x0, 2) + Math.pow(y - y0, 2) <= Math.pow(r, 2)) {
                    matrix[y][x] = '$';
                }
            }
        }

    }
}
