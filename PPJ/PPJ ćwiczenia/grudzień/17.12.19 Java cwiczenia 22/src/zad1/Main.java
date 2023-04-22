package zad1;

public class Main {
    public static void main(String[] args) {

        DetektorDymu dd= new DetektorDymu();
        try{
            dd.sprawdz();
            System.out.println("nie ma dymu");
//            dd.dym=true;
            dd.sprawdz();
            System.out.println("jest dym");
        }catch(Alarm a){
            System.out.println(a.getMessage());
        }


    }
}
