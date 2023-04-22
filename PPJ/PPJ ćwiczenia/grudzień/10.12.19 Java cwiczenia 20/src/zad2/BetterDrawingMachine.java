package zad2;

public class BetterDrawingMachine extends DrawingMachine {
    public BetterDrawingMachine(char[][] tmp) {
        super(tmp);
        for (int i = 0; i < tmp.length; i++) {
            for (int j = 0; j < tmp[i].length; j++) {
                tmp[i][j] = '_';
            }
        }
    }
        public void draw(int param[]){
            for (int y = param[0]; y <tmp.length ; y++) {        //param[0]=1
                for (int x =param[1]; x <tmp[y].length ; x++) {  //param[1]=1
                    if(x >= param[0] && y >= param[1] && x < param[0] + param[2] && y < param[1] + param[3]){
                        tmp[y][x]='W';
                    }
                }
            }
        }




}
