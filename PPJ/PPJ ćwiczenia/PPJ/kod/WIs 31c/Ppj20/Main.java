public class Main {

    public static void main(String[] args) {
        DrawingMachine dm = new DrawingMachine(40, 40);

        BetterDrawingMachine bdm = new BetterDrawingMachine(40, 40);

        TheBestDrawingMachine tbdm = new TheBestDrawingMachine(40, 40);

        DrawingMachine[] tablica = {dm, bdm, tbdm};
        for (int i = 0; i < tablica.length; i++) {
            tablica[i].draw(new int[]{3, 8, 4, 6});
            System.out.println("---------------------");
            tablica[i].show();
        }


    }
}
