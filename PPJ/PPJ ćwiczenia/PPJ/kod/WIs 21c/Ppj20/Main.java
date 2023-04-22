public class Main {

    public static void main(String[] args) {
//        DrawingMachine dm = new DrawingMachine(20, 20);
//        dm.draw(new int[]{3, 8});
//        dm.show();

        BetterDrawingMachine bdm = new BetterDrawingMachine(20, 20);
        bdm.draw(new int[]{2, 4, 5, 3});
        bdm.show();

    }


}
