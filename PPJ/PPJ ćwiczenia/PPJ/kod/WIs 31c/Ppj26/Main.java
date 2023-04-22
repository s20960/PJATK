import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d{3}(-\\d{3}){2}");
        Matcher m = p.matcher("W tym tekście jest numer Telefonu 601-987-001 oraz 312-345-987");
//        System.out.println(m.matches());
        while (m.find()) {
            System.out.println(m.group(0));
        }
    }
}
