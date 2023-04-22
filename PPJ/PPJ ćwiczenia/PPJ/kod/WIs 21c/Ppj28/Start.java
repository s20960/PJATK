import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Start {
    public static void main(String[] args) {
        Main obj = Main.getInstance();

        Element root = new Element(0);

        Element next = new Element(2);
        root.next = next;

        root.next.next = new Element(5);

        Element tmp = root;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = new Element(6);

        tmp = root;
        while (tmp.next != null) {
            System.out.println(tmp.wrt);
            tmp = tmp.next;
        }

        //\+?[0-9]{1,2}(\((\d{2})?\.?\))? ?(\d{7,9})?\d{2,4}[_ -]?\d{3}([_ -]\d{3})?

        StringBuilder sb = new StringBuilder();
        try {
            FileReader fr = new FileReader("C:\\Users\\knopers\\Downloads\\serverLog.txt");
            int znak;
            while ((znak = fr.read()) != -1){
//                sb.append((char)znak);
                sb.appendCodePoint(znak);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku");
        } catch (IOException e) {
            System.out.println("Błąd odczytu");
        }
        Pattern p = Pattern.compile("((25[0-5])|(2[0-4][0-9])|([01]?[0-9][0-9]?))(\\.((25[0-5])|(2[0-4][0-9])|([01]?[0-9][0-9]?))){3}");
        Matcher m = p.matcher(sb);

        try {
            FileWriter fw = new FileWriter("ips.txt");
            int counter = 1;
            while(m.find()){
                String ip = m.group(0);
//            p = Pattern.compile("(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})");
//            m = p.matcher(ip);
//            m.find()
//                    m.group(1)
                fw.write(counter++ + ". \t");
                String[] ipParts = ip.split("\\.");
                for (int i = 0; i < ipParts.length; i++) {
                    int dec = Integer.parseInt(ipParts[i]);
                    String hex = Integer.toHexString(dec);
                    fw.write(hex + (i < ipParts.length - 1 ? ":" : ""));
                }
                fw.write("\r\n");
            }
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("Błąd zapisu");
        }


    }
}
