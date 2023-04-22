import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream(
                    "P:\\FTP(Public)\\knopers\\PPJ\\PPJ 23\\choinka.ppm");

            System.out.println(getLine(fileInputStream));
            System.out.println(getLine(fileInputStream));
            System.out.println(getLine(fileInputStream));

            int bajt;
            int licznik = 0;
            while ((bajt = fileInputStream.read()) != -1){
                int red = bajt;
                int green = fileInputStream.read();
                int blue = fileInputStream.read();
                System.out.print("\u001b[48;2;"+red+";"+green+";"+blue+"m  ");
                if (licznik++ % 32 == 31) System.out.println();
            }


        } catch (FileNotFoundException e) {
            System.out.println("Pliku nie ma, sprawdz ścieżkę");
        } catch (IOException e) {
            System.out.println("Błąd odczytu");
        }
        System.out.println("\u001b[0m");
    }
    static String getLine(FileInputStream fileInputStream) throws IOException {
        int bajt;
        StringBuilder sb = new StringBuilder();
        while ((bajt = fileInputStream.read()) != -1 && bajt != '\n'){
            sb.append((char) bajt);
        }
        return sb.toString();
    }
}
