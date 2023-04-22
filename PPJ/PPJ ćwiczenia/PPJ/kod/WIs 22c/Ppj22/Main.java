import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        try {
            Scanner sc = new Scanner(System.in);
            System.out.println(sc.nextInt() / sc.nextInt());
//
//            System.out.println("asdsad");
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            System.out.println(e.toString());
//        }
//
//        try {
//            policz(1);
//
//            policz(0);
//        } catch(Exception e) {
//            System.out.println(e.getMessage());
//        }

        try {
            FileInputStream fis = new FileInputStream("plik.txt");

            int aByte = fis.read();
            while(aByte != -1) {
                if(aByte > 127) {
                    aByte = fis.read() << 8 | aByte;
                }
                System.out.println((char) aByte);
                aByte = fis.read();
            }

        } catch (FileNotFoundException e) {
            System.out.println("plik.txt nie istnieje");
        } catch (IOException e) {
            System.out.println("blad odczytu " + e.getMessage());
        }


//        char[] tab = {'a', 'b', 'c'};
//        int[] tab1 = {1, 2, 3};
//        System.out.println(tab);
//        System.out.println(tab1);


        System.out.println("JVM");
    }
    static int policz(int a) throws Exception{
        if (a == 0) {
            throw new Exception("niepoprawna wartosc");
        }
        return a - 1;
    }
}
