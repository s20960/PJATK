package zad1;

public class DebetCard{
    Account konto;
    public DebetCard(Account konto){
        this.konto=konto;
    }

    public void wyplac(double kasaujemna) throws NotEnouhgFounds{
        if(kasaujemna<=konto.balance&&kasaujemna<konto.dailyDebet)
        konto.balance-=kasaujemna;
        else throw new NotEnouhgFounds(Math.max(kasaujemna-konto.balance, kasaujemna-konto.dailyDebet));
    }
}
