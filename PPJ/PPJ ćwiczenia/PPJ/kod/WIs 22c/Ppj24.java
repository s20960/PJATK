import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Pattern email = Pattern.compile("([a-z]+)@([a-z]+\\.[a-z]+)");
        Matcher mt = email.matcher("Moj mail to: knopers@gmail.com");
        System.out.println(mt.matches());
        if (mt.find()) {
            System.out.println(mt.group(0));
            System.out.println(mt.group(1));
            System.out.println(mt.group(2));
        }
    }
}
