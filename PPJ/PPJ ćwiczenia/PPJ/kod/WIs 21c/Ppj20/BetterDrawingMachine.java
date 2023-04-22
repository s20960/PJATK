public class BetterDrawingMachine extends DrawingMachine{

    BetterDrawingMachine(int n, int m) {
        super(n, m);
    }

    void draw(int[] param) {
        int x0 = param[0];
        int y0 = param[1];
        int w = param[2];
        int h = param[3];

        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                if(x >= x0 && y >= y0 && y < y0 + h && x < x0 + w) {
                    matrix[y][x] = '@';
                }
            }
        }

    }
}
