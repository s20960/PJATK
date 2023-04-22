package zad1;

public class Kwadrat {
    private int bok;

    public Kwadrat(int bok){
        this.bok=bok;
    }

    public void show(){
        System.out.println(
            "Pole kwadratu= "+ bok*bok
        );
        System.out.println(
                "Pole szescianu= "+ bok*bok*bok
        );
    }

}
