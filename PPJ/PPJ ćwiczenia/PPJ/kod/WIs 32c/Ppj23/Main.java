import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("\u001b[38;2;255;0;0m");
        System.out.println("Knopers");
        try {
            FileInputStream fis = new FileInputStream("P:\\FTP(Public)\\knopers\\PPJ\\PPJ 23\\choinka.ppm");
            System.out.println(getLine(fis));
            System.out.println(getLine(fis));
            System.out.println(getLine(fis));

            int bajt;
            int counter = 0;
            while ((bajt = fis.read()) != -1){
                int red = bajt;
                int green = fis.read();
                int blue = fis.read();
                System.out.print("\u001b[48;2;" + red + ";" + green + ";" + blue + "m  ");
                if(counter++ % 32 == 31) System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nie ma takiego pliku");
        } catch (IOException e) {
            System.out.println("Blad odczytu");
        }
    }
    static String getLine(FileInputStream fis) throws IOException {
        StringBuilder builder = new StringBuilder();
        int bajt;
        while ((bajt = fis.read()) != -1 && bajt != '\n'){
            builder.append((char)bajt);
        }
        return builder.toString();
    }
}
