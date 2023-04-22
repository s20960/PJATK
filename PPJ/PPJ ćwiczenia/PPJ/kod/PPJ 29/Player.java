import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Don't let the machines win. You are humanity's last hope...
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt(); // the number of cells on the X axis
        int height = in.nextInt(); // the number of cells on the Y axis
        boolean[][] grid = new boolean[height][width];
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < height; i++) {
            String line = in.nextLine(); // width characters, each either 0 or .
            for (int j = 0; j < line.length(); j++) {
                grid[i][j] = line.charAt(j) == '0';
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (grid[i][j]) {
                    String result = j + " " + i + " ";
                    int down = i + 1;
                    int right = j + 1;
                    while(down < height && !grid[down][j]) down++;
                    while(right < width && !grid[i][right]) right++;
                    
                    if (right >= width) {
                        result = result + "-1 -1 ";
                    } else {
                        result = result + right + " " + i + " ";
                    }
                    
                    if (down >= height) {
                        result = result + "-1 -1";
                    } else {
                        result = result + j + " " + down;
                    }
                    
                    System.out.println(result);
                }
            }
        }
    }

}