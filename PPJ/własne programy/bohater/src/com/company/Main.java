package com.company;

public class Main {

    public static void main(String[] args) {

        Bohater b1= new Bohater("Tony",true,150,200);
        Bohater boss = new Boss("Final",false,400,500);
        System.out.println(b1);
        try{
            b1.zadajObrazenia(boss);
            System.out.println(boss);
            boss.zadajObrazenia(b1);
        }catch(MartwyBohaterException e){
            System.out.println(b1);
        }
        Bohater.wskrzes(b1);
        System.out.println(b1);


    }
}
