package zad2;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner in=new java.util.Scanner(System.in);
        double promien=in.nextDouble();

        double wysokosc=in.nextDouble();

        Walec figura=new Walec(promien,wysokosc);

        figura.show();
    }
}
