package com.company;

import java.io.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
/*
        for(int wrt = 10;wrt<1000000000;wrt*=10){
            String tmp= "";
            long start = System.currentTimeMillis();
            for (int i = 0; i < wrt; i++) {
                tmp+='a';
            }
            System.out.println(
                wrt+" "+(System.currentTimeMillis()-start)
            );
        }
*/
/*
        for(int wrt = 10;wrt<1000000000;wrt*=10){
            StringBuffer tmp= new StringBuffer();
            long start = System.currentTimeMillis();
            for (int i = 0; i < wrt; i++) {
                tmp.append('a');
            }
            System.out.println(wrt+" "+(System.currentTimeMillis()-start));
        }
*/
/*
        for(int wrt = 10;wrt<1000000000;wrt*=10){
            StringBuilder tmp=new StringBuilder();
            long start = System.currentTimeMillis();
            for (int i = 0; i < wrt; i++) {
                tmp.append('a');
            }
            System.out.println(wrt+" "+(System.currentTimeMillis()-start));
        }
*/
/*
        StringBuilder sb=new StringBuilder();
        try{
            FileReader fr=new FileReader("C:\\Users\\mich_\\OneDrive\\Pulpit\\michalino\\PJATK\\PPJ\\PPJ Wykład\\17.12.19 Java wyklad\\dataIn.txt");
             BufferedReader br=new BufferedReader(fr);
             String tmp;
             while((tmp=br.readLine())!=null)
                sb.append(tmp);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
//        System.out.println(sb);

        String tmp = sb.toString();
        int start=0;
        boolean state=false;
        for(int i=0;i<tmp.length();i++){
            if(tmp.charAt(i)=='s' && !state){
                start = 'i';
                state=true;
            }else{
                if (state){
                    if(tmp.charAt(i)>='0'&& tmp.charAt(i)<='9')
                        ;
                    else{
                        System.out.println(
                                tmp.substring(start, i)
                        );
                        state = false;
                    }
                }
            }
        }
*/
/*
//        Pattern p = Pattern.compile("s[0-9]{4,}");
        Pattern p = Pattern.compile("s\\d{4,}");
        Matcher m = p.matcher("s20960");
        boolean b = m.matches();
        System.out.println(b);
*/

    }
}