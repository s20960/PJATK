import java.io.*;
import java.nio.ByteBuffer;

public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        ByteArrayOutputStream bb = new ByteArrayOutputStream();
        try {
            FileInputStream fis = new FileInputStream("P:\\FTP(Public)\\knopers\\PPJ\\PPJ 28\\trace.pcap");
            int bajt;
            byte[] tab = new byte[1024 * 1024];
            while((bajt = fis.read(tab)) != -1) {
                bb.write(tab, 0, bajt);
                fis.skip(1);
                //sb.append((char)bajt);
            }
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku");
        } catch (IOException e) {
            System.out.println("Bład odczytu");
        }

        byte[] content = bb.toByteArray();
        for(int i = 0; i < content.length; i++) {
            sb.append((char)content[i]);
        }

        System.out.println(sb);

    }

}
