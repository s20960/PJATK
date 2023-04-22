import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idx = in.nextInt();
        int idx1 = in.nextInt();

        int[] tab = new int[10];
        int[] tab1 = new int[10];
        System.out.println("asdsad");

        try {
            int a = tab[idx];
            System.out.println(tab[idx]);
            int b = tab1[idx1];


            System.out.println(a * b);

        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Niepoprawna wartosc: " + exception.getMessage());
        }
        try {

            odejmij(0);
            odejmij(1);
            odejmij(21);
        } catch (MyException ex) {
            System.out.println(ex.getMessage() + " :)");
        }

        System.out.println("Jest ok");
    }

    static int odejmij(int i) throws MyException {
        if (i == 0){
            throw new MyException();

        }
        return i - 1;
    }
}
