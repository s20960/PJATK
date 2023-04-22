package zad2;

public class Main {
    public static void main(String[] args) {
        char tmp[][]=new char[10][20];
        DrawingMachine machine=new DrawingMachine(tmp);
        BetterDrawingMachine mmachine=new BetterDrawingMachine(tmp);
        TheBestDrawingMachine mmmachine=new TheBestDrawingMachine(tmp);
//        machine.show();
        System.out.println();
        int[]param1=new int[2];
        param1[0]=7;   //a
        param1[1]=3;   //b
//        machine.draw(param1);
//        machine.show();
        System.out.println();
        int[]param2=new int[4];
        param2[0]=5;   //start y
        param2[1]=5;   //start x
        param2[2]=4;
        param2[3]=4;
        mmachine.draw(param2);
        mmachine.show();
        System.out.println();
        int[]param3=new int[3];
        param3[0]=5;
        param3[1]=5;
        param3[2]=3;
//        mmmachine.draw(param3);
//        mmmachine.show();

    }
}
