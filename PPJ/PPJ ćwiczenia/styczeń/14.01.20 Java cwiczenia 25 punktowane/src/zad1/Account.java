package zad1;

public class Account {
    double balance;
    double dailyDebet;
    double credit;
    DebetCard db;
    CreditCard cc;

    public Account(double balance,double dailyDebet, double credit){
        this.credit=credit;
        this.balance=balance;
        this.dailyDebet=dailyDebet;
        db=new DebetCard(this);
        cc=new CreditCard(this);
    }
}
