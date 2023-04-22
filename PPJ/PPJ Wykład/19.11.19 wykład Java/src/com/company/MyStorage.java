package com.company;

public class MyStorage {

    private char[] myData;
    private int fill;

    public MyStorage() {
        fill = 0;
        myData = new char[2];
    }
    public void add(char ch){
        if(fill >=myData.length)
            reSize();
        myData[fill++]=ch;
    }

    public void reSize(){
        System.out.println("reSize()");
        char[] tmp = new char[myData.length*2];
        for(int i=0;i<fill;i++)
            tmp[i]=myData[i];
        myData=tmp;
    }

    public void show(){
        for(int i=0;i<fill;i++)
            System.out.print(myData[i]);
        System.out.println();
    }

    public int length(){
        return fill;
    }

    public void replace(int index, char ch){
        if(index<fill)
        myData[index]=ch;
    }
    public int replace(char ch1,char ch2) {
        int counter = 0;
        for (int i = 0; i < fill; i++) {
            if (myData[i] == ch1) {
                myData[i] = ch2;
                counter++;
            }
        }
        return counter;
    }

    public boolean equals(MyStorage ms){
        if(this.fill==ms.fill)
            return false;
        else{
            for(int i=0;i<fill;i++)
                if(this.myData[i] != ms.myData[i])
                    return false;
            return true;
        }
    }
    public static boolean equals(MyStorage org, MyStorage ms){
        if(org.fill==ms.fill)
            return false;
        else{
            for(int i=0;i<org.fill;i++)
                if(org.myData[i] != ms.myData[i])
                    return false;
            return true;
        }
    }



}