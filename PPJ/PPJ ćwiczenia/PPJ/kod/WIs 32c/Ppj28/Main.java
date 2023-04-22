import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String nukleotyd = "ACGTGTCGGTGCATGCATGGTTCTGTGAACAAG";
        Pattern p = Pattern.compile("[AGCT]*ATG([AGCT]*)(TAA|TAG|TGA)[AGCT]*");
        Matcher m = p.matcher(nukleotyd);
        if (m.matches()) {
            System.out.println(m.group(1));
        }

        //zad 5
        //(\+\d{2}\([.\d]{1,2}\)\d{7,9})|(\d ?\d{3}-\d{3})|(\d{3}([_ -]\d{3}){2})

        Lista lista = new Lista();
        lista.add(new Element(4));
        lista.add(new Element(5));
        lista.add(new Element(4));
        lista.add(new Element(6));
        lista.add(new Element(8));

        lista.wypisz();

        StringBuilder sb = new StringBuilder();
        try {
            FileInputStream fis = new FileInputStream("P:\\FTP(Public)\\knopers\\PPJ\\PPJ 28\\trace.pcap");
            byte[] dane = new byte[1024 * 1024];
            int ile;
            while((ile = fis.read(dane)) != -1) {
//                sb.append((char)bajt);
                sb.append(new String(dane, 0, ile, Charset.forName("ISO-8859-1")));
//                for (int i = 0; i < ile; i++) {
//                    sb.append((char)dane[i]);
//                }
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("Bład odczytu " + e);
        }
        System.out.println(sb);
    }
}
