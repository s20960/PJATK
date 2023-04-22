import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("P:\\FTP(Public)\\knopers\\PPJ\\PPJ 23\\choinka.ppm");
            readLine(fis); //naglowek
            readLine(fis); //sz x wy
            int sz = 32;
            readLine(fis); //max wartosc
            Pixel[] pixels = new Pixel[32*32];
            int i = 0;
            int b;
            while((b = fis.read()) != -1) {
                Pixel p = new Pixel(b, fis.read(), fis.read());
                pixels[i++] = p;
            }
            for (int j = 0; j < pixels.length; j++) {
                System.out.print(pixels[j]);
                if(j % 32 == 31) System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static String readLine(FileInputStream fis) throws IOException {
        int b;
        StringBuilder sb = new StringBuilder();
        while((b = fis.read()) != '\n') {
            sb.append((char)b);
        }
        return sb.toString();
    }
}
