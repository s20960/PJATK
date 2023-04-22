public class Main {
    public static void main(String[] args) {

        int[] tab = new int[10];


        try {
            System.out.println(tab[1]);
            System.out.println("coś sensowniejszego");

        } catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("podałeś zły indeks " + ex.getMessage());
        }

        System.out.println("asdsda");

        try {
            System.out.println(policz(0));
        } catch (ValueOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }

    static int policz(int i) throws ValueOutOfBoundsException {
        if (i == 0) {
            throw new ValueOutOfBoundsException(i);
        }
        return i - 1;
    }
}
