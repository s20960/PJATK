import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String test = "ATGTCCTAAGACGTCA";
        Pattern p = Pattern.compile("[AGCT]+");
        Matcher m = p.matcher(test);
        if (m.matches()) {
            p = Pattern.compile("ATG([AGCT]*)T((AA)|(AG)|(GA))");
            m = p.matcher(test);
            if (m.find()){
                System.out.println(m.group(1));
            }

        }
        p = Pattern.compile("(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}");
        m = p.matcher("10.0.2.147");

        System.out.println(toHex("31"));
        if (m.matches()) {
            String ip = m.group(0);
            String[] tablica = ip.split("\\.");
//            (\d{1,3})\.(\d{1,3})\.(\d{1,3})\.(\d{1,3})
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < tablica.length; i++) {
                sb.append(toHex(tablica[i]));
                if (i < tablica.length - 1) {
                    sb.append(":");
                }
            }
            try {
                FileWriter fw = new FileWriter("ip.txt");
                for(int i = 0; i < 3; i ++) {
                    fw.write(i + ".\t" + sb.toString() + "\r\n");
                }
                fw.flush();
                fw.close();
            } catch (IOException e) {
                System.out.println("Błąd zapisu");
            }
            p = Pattern.compile("[A-F0-9]{1,2}(:[A-F0-9]{1,2}){3}");
            m = p.matcher(sb.toString());
            if(m.find()) {
                System.out.println(m.group(0));
            }
        }
        //\+?\d{0,2}\(?\d{0,2}\.?\)?[\d _-]+
        //(\+\d{2}\((\d{2}|\.)\)\d{7,9})|(\d ?\d{2,3}([_ -]\d{3}){1,2})
    }
    static String toHex(String dec){
        int suma = 0;
        for (int i = 0; i < dec.length(); i++) {
            suma *= 10;
            suma += dec.charAt(i) - '0';
        }
//        suma = Integer.parseInt(dec);
//        Integer.toHexString(suma);

        if(suma == 0)
            return "0";

        StringBuilder sb = new StringBuilder();
        while(suma != 0) {
            switch(suma % 16) {
                case 15:
                    sb.append("F");
                    break;
                case 14:
                    sb.append("E");
                    break;
                case 13:
                    sb.append("D");
                    break;
                case 12:
                    sb.append("C");
                    break;
                case 11:
                    sb.append("B");
                    break;
                case 10:
                    sb.append("A");
                    break;
                default:
                    sb.append(suma % 16);
            }
            suma /= 16;
        }
        return sb.reverse().toString();
    }
}
