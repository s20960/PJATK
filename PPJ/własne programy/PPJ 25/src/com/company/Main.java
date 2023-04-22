package com.company;

public class Main {
    public static void main(String[] args) throws NotEnoughFunds {

        Account konto =new Account(1500,300,500);

        try{
            konto.dc.wyplać(300);
        }catch(NotEnoughFunds a){
            System.out.println(a.getMessage());
        }
        System.out.println(konto.balance);
        try {
            konto.cc.wyplać(1800);
        }catch(NotEnoughFunds a){
            System.out.println(a.getMessage());
        }

        System.out.println(konto.balance);

    }
}
