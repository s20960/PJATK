import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //System.out.println("\u001b[38;2;255;0;0mKnopers");
        try {
            FileInputStream fis = new FileInputStream(
                    "P:\\FTP(Public)\\knopers\\PPJ\\PPJ 23\\choinka.ppm");
            String header = read(fis, '\n');
            System.out.println(header);

            String wysSzer = read(fis, '\n');
            System.out.println(wysSzer);

            String max = read(fis, '\n');
            System.out.println(max);

            int bajt = fis.read();
            Pixel[] pixels = new Pixel[32*32];
            int i = 0;
            while (bajt != -1) {
                Pixel p = new Pixel(bajt, fis.read(), fis.read());
                pixels[i++] = p;
                bajt = fis.read();
            }


            for (int j = 0; j < pixels.length; j++) {
                System.out.print(pixels[j]);
                if (j % 32 == 31) System.out.println();
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("File read error: " + e.getMessage());
        }
    }

    static String read(FileInputStream fis, char znak) throws IOException {
        int bajt = fis.read();
        StringBuilder sb = new StringBuilder();
        while (bajt != -1 && bajt != znak) {
            sb.append((char)bajt);
            bajt = fis.read();
        }
        return sb.toString();
    }
}
