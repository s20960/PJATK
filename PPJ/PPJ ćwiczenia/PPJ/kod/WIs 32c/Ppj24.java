import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("([a-zA-Z0-9_+.-]+)@pja\\.edu\\.pl");
        Matcher m = p.matcher("Mój adres e-mail to: knopers@pja.edu.pl, m.knop@pja.edu.pl");
        boolean b = m.matches();
        System.out.println(b);
        if (m.find()) {
            System.out.println(m.group(0));
            System.out.println(m.group(1));
        }
        if (m.find()) {
            System.out.println(m.group(0));
            System.out.println(m.group(1));
        }
    }
}
