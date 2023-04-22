package zad4;

public class Main {
    public static void main(String[] args) throws LowFullExcaption, ExplosionException {
        Rakieta putin3=new Rakieta("putin3",0);

        try{
        putin3.zatankuj();
        putin3.start();
        }catch(LowFullExcaption a){
            System.out.println(a.getMessage());
        }catch(ExplosionException a){
            System.out.println(a.getMessage());
        }

    }
}
