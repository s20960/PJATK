import java.io.*;

public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try {
            FileReader fileReader = new FileReader("test.txt");
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

        sb.reverse();
        try {
            FileWriter fileWriter = new FileWriter("tset.txt");

            String zawartosc = sb.toString();
//            for (int i = zawartosc.length() - 1; i >= 0; i--) {
//                fileWriter.append(zawartosc.charAt(i));
//            }
            fileWriter.write(sb.toString());
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Wystąpił błąd zapisu");
        }

    }
}
