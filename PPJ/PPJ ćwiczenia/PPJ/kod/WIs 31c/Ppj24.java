import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("([a-zA-Z_0-9+.-]{9,})@pja\\.edu\\.pl");
        Matcher m = p.matcher("Mój mail to: knopers+12@pja.edu.pl");
        boolean b = m.matches();
        System.out.println(b);
        if (m.find()) {
            System.out.println(m.group(0));
            System.out.println(m.group(1));
        }

        StringBuilder sb = new StringBuilder();
        try {
            FileReader fileReader = new FileReader("wiki.txt");
            int znak;
            while((znak = fileReader.read()) != -1) {
                sb.append((char)znak);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Oddaj plik użytkowniku!");
        } catch (IOException e) {
            System.out.println("Bląd odczytu!");
        }
        System.out.println(sb.toString());


    }
}
