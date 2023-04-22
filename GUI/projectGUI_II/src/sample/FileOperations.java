package sample;

import sample.models.PasswordModel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class FileOperations {
    List<PasswordModel> passwordsList;
    public void readFile(){
        try {
            File file = new File("src/sample/Data/passwords.txt");
            Scanner scanner = new Scanner(file);
            passwordsList=new ArrayList<>();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String tab[]=line.split(" ");
                PasswordModel passwordModel=new PasswordModel(tab[0],tab[1],tab[2],tab[3]);
                passwordsList.add(passwordModel);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public String readTimeStamp(String fileName) throws FileNotFoundException {
        File file=new File(fileName);
        Scanner scanner = new Scanner(file);
        String timeStamp="";
        while(scanner.hasNextLine()){
             timeStamp= scanner.nextLine();
        }
        return timeStamp;
    }
    public void writeAppendToFile(PasswordModel password,boolean append,List<PasswordModel> passwordList) throws IOException {
        String filePath="src/sample/Data/passwords.txt";
        File file = new File(filePath);
        FileWriter fr = new FileWriter(file, append);
        if(append==false){
            for(int i=0;i<passwordList.size();i++){
                fr.write(passwordList.get(i).toString());
            }
        }else
            fr.write(password.toString());
        fr.close();
    }
    public void writeTimeStamp() throws IOException {
        String filePath="src/sample/Data/timeStamp.txt";
        File file = new File(filePath);
        FileWriter fr = new FileWriter(file);

        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        String dateStr=formatter.format(date);

        fr.write(dateStr);
        fr.close();
    }


    public List<PasswordModel> getPasswordsList() {
        return passwordsList;
    }
}
