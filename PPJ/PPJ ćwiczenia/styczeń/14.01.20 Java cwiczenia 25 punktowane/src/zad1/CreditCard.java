package zad1;

public class CreditCard extends DebetCard{

    public CreditCard(Account konto) {
        super(konto);
    }

    public void wyplac(double kasaujemna) throws NotEnouhgFounds{
        if(kasaujemna<=(konto.balance+konto.credit))
            konto.balance-=kasaujemna;
        else throw new NotEnouhgFounds(kasaujemna-(konto.balance+konto.credit));
    }
}
