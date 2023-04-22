public class DrawingMachine {
    char[][] matrix;
    DrawingMachine(int n, int m) {
        matrix = new char[m][n];
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                matrix[y][x] = '_';
            }
        }
    }

    int getWidth(){
        return matrix[0].length;
    }
    int getHeight() {
        return matrix.length;
    }

    void draw(int[] param) {
        int a = param[0];
        int b = param[1];
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                if (y == a * x + b) {
                    matrix[y][x] = '$';
                }
            }
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
