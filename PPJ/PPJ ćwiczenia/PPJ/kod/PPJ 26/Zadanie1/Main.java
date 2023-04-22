import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) {
        System.out.println("\\");
        Pattern p = Pattern.compile("(([0-2][0-9])|(3[01]))\\.((0[0-9])|(1[0-2]))\\.\\d{4}r\\.");
        Matcher m = p.matcher("Za datę rozpoczęcia wojny przyjmuje się 32.09.1939r. – agresję Niemiec na Polskę. 03.09.1939r., po zignorowaniu przez III Rzeszę ultimatum w sprawie bezzwłocznego wycofania wojsk z Polski, Wielka Brytania i Francja wypowiedziały wojnę III Rzeszy (w piśmiennictwie zachodnim podaje się czasami tę datę jako początek wojny światowej).");
        //System.out.println(m.matches());

        while (m.find()) {
            System.out.println(m.group(0));
            System.out.println(m.group(4));
        }
        StringBuilder sb = new StringBuilder();
        try {
            FileReader fileReader = new FileReader("P:\\FTP(Public)\\knopers\\PPJ\\PPJ 26\\stud.csv");
            int znak;
            while ((znak = fileReader.read()) != -1) {
                sb.append((char)znak);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Brakuje pliku");
        } catch (IOException e) {
            System.out.println("Błąd odczytu");
        }
        //Pattern imie = Pattern.compile("s\\d{5}; ([A-ZĄĘŚĆŹŻŃÓŁ][a-ząęśćźżńół]+a); [A-ZĄĘŚĆŹŻŃÓŁ][a-ząęśćźżńół]+\r?\n");
        Pattern imie = Pattern.compile(".*; [A-Z][a-z]*a; .*\r?\n");
        Matcher mimie = imie.matcher(sb.toString());
        while (mimie.find()) {
            System.out.println(mimie.group(0));
        }
    }
}
