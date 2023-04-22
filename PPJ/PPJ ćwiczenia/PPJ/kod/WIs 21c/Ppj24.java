import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("([a-zA-Z_0-9+.-]+)@pja\\.edu\\.pl");
        Matcher m = p.matcher("Moj mail to: knopers+12!@pja.edu.pl");
        boolean b = m.matches();
        System.out.println(b);
        if (m.find()) {
            System.out.println(m.group(0));
            System.out.println(m.group(1));

        }

        StringBuilder sb = new StringBuilder();
        try {
            FileReader reader = new FileReader("console");
            int znak;
            while ((znak = reader.read()) != -1) {
                sb.append((char)znak);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("nie ma pliku");
        } catch (IOException e) {
            System.out.println("blad odczytu");
        }
        System.out.println(sb.toString());

    }
}
