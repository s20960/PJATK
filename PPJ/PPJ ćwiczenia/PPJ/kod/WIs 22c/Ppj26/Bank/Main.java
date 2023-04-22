public class Main {

    public static void main(String[] args) {
        Account acc = new Account(100, 50, 100);
        CreditCard cc = new CreditCard(acc);
        try {
            cc.wyplac(250);
        } catch (NoMoney noMoney) {
            System.out.println(noMoney.getMessage());
        }
    }
}
