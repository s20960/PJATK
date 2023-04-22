package zad1;

public class Main {
    public static void main(String[] args) {
        Account biedne = new Account(1000, 300,500);

        try {
            biedne.db.wyplac(00);
        }catch (NotEnouhgFounds a){
            System.out.println(a.getMessage());
        }
        try {
            biedne.cc.wyplac(1700);
        }catch (NotEnouhgFounds a){
            System.out.println(a.getMessage());
        }



    }
}
