package zad3;

public class Drzewo {
    public Drzewo(){}

    double wagaowocow=0;

    public Owoc zerwijOwoc(){
        int pomoc = (int)( Math.random() * 3);
        if (pomoc == 1) {
            Jablko jablko=new Jablko("a",1);
            return jablko;
        } else if (pomoc == 2) {
            Gruszka gruszka=new Gruszka("gruszka", 1);
            return gruszka;
        } else {
            Pomarancza pomarancza=new Pomarancza("pomarancza", 1);
            return pomarancza;
        }

    }
}
