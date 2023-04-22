package zad2;

public class TheBestDrawingMachine extends DrawingMachine {
    public TheBestDrawingMachine(char tmp[][]) {
        super(tmp);
    }

    public void draw(int param[]) {
        for (int y = 0; y < tmp.length; y++) {        //param[0]=5
            for (int x = 0; x < tmp[y].length; x++) { //param[1]=5
                    if(Math.pow(param[2],2)>=Math.pow(x-param[1],2)+Math.pow(y-param[0],2))
                        tmp[x][y]='*';
            }
        }
    }
}