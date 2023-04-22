package com.company;

public class Account {
    double balance;
    double dailyDebet;
    double credit;
    DebetCard dc;
    CreditCard cc;

    public  Account(double balance, double dailyDebet, double credit){
        this.balance=balance;
        this.dailyDebet=dailyDebet;
        this.credit=credit;
        dc=new DebetCard(this);
        cc=new CreditCard(this);
    }



}
