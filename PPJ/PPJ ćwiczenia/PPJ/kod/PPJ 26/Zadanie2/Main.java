package pa;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try {
            FileReader fileReader = new FileReader("receive.log");
            int znak;
            while ((znak = fileReader.read()) != -1) {
                sb.append((char)znak);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nie mam pliku do czytania :(");
        } catch (IOException e) {
            System.out.println("Wystąpił błąd odczytu");
        }

        Pattern p = Pattern.compile("AT ([\\da-f]+) (\\d+)");
        Matcher m = p.matcher(sb.toString());
        try {
            FileWriter fileWriter = new FileWriter("commands.cmd");
            while (m.find()) {
                if (checkSum(m.group(1), m.group(2))) {
                    fileWriter.write(hexToContent(m.group(1)));
                    fileWriter.write("\r\n");
                }
            }
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Wystąpił błąd zapisu");
        }
    }

    public static boolean checkSum(String content, String checksum) {
        int sum = decToInt(checksum);
        int calculated = contentToChecksum(content);
        return sum == calculated;
    }

    public static int hexToInt(char znak){
        if (znak >= 'a' && znak <= 'f') {
            return znak - 'a' + 10;
        } else if(znak >= '0' && znak <= '9') {
            return znak - '0';
        }
        return 0;
    }

    public static int decToInt(String dec){
        int sum = 0;
        for (int i = 0; i < dec.length(); i++) {
            sum *= 10;
            sum += dec.charAt(i) - '0';
        }
        return sum;
    }

    public static int contentToChecksum(String content) {
        int sum = 0;
        for (int i = 0; i < content.length(); i++) {
            sum += hexToInt(content.charAt(i));
        }
        return sum % 128;
    }

    public static String hexToContent(String hex) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i + 1 < hex.length(); i += 2) {
            int num = hexToInt(hex.charAt(i)) * 16 + hexToInt(hex.charAt(i + 1));
            sb.append((char)num);
        }
        return sb.toString();
    }
}
