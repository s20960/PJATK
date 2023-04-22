package zad4;

public class Rakieta {
    String nazwa;
    int wagaPaliwa;

    public Rakieta(String nazwa, int wagaPaliwa){
        this.nazwa=nazwa;
        this.wagaPaliwa=wagaPaliwa;
    }

    public void zatankuj(){
        wagaPaliwa=(int)(Math.random()*2500);
    }

    public void start() throws LowFullExcaption, ExplosionException {
        System.out.println(wagaPaliwa);
        if(wagaPaliwa<1000)
            throw new LowFullExcaption();
        else Rakieta.katastrofa();
    }
    public static void katastrofa() throws ExplosionException{
        int pomoc=(int)(Math.random()*10);
        if(pomoc>9)
            throw  new ExplosionException();
        else System.out.println("wystartowala");
    }

    public String toString(){
        return ""+wagaPaliwa;
    }
}
