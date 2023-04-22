public class DrawingMachine {
    int n, m;
    char[][] matrix;
    DrawingMachine(int n, int m) {
        this.n = n;
        this.m = m;
        matrix = new char[m][n];
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                matrix[y][x] = '_';
            }
        }
    }
    int getWidth() {
        return n;
    }
    int getHeight() {
        return m;
    }
    void draw(int[] param) {
        int a = param[0];
        int b = param[1];
        for (int x = 0; x < n; x++) {
            int y = a * x + b;
            if (y >= 0 && y < m)
                matrix[y][x] = '@';
        }
    }

    void show() {
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                System.out.print(matrix[y][x]);
            }
            System.out.println();
        }
    }
}
