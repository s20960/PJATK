package zad2;

public class DrawingMachine {
    char tmp[][];

    public DrawingMachine(char tmp[][]){
        this.tmp=tmp;
        for (int i = 0; i <tmp.length ; i++) {
            for (int j = 0; j <tmp[i].length ; j++) {
                tmp[i][j]='_';
            }
        }
    }
    public int getWidth(){
        return tmp[1].length;
    }
    public int getHeight(){
        return tmp.length;
    }
    public void draw(int param[]){
        for (int y = 0; y <tmp.length ; y++) {
            for (int x = 0; x <tmp[y].length ; x++) {
                if(y==param[0]*x+param[1])
                    tmp[y][x]='*';
            }
        }
    }
    public void show(){
        for (int i = 0; i <tmp.length ; i++) {
            for (int j = 0; j <tmp[i].length ; j++) {
                System.out.print(tmp[i][j]);
            }
            System.out.println();
        }
    }
}
