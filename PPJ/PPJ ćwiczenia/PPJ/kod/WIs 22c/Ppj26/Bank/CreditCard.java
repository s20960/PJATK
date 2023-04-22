public class CreditCard {
    Account acc;

    public CreditCard(Account acc) {
        this.acc = acc;
        acc.cc = this;
    }

    void wyplac(double amount) throws NoMoney {
        if (amount > acc.balnce + acc.credit) {
            throw new NoMoney(amount - (acc.balnce + acc.credit));
        }
        acc.balnce -= amount;
    }
}
