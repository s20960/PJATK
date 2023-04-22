package zad1;

public class Atom {

    String nazwa;
    double masa;
    int ladunek;

    public Atom(String nazwa, double masa, int ladunek){
        this.nazwa=nazwa;
        this.masa=masa;
        this.ladunek=ladunek;
    }

    public String toString(){
        return "Nazwa atomu: "+nazwa+", masa: "
                +masa+"u oraz ladunek atomu: "+ladunek+".";
    }
}
