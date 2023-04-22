package zad3;

public class KulaNa {

    double spromienW;
    double spromienK;

    public KulaNa(Walec w){
        spromienW=Math.sqrt((w.returnp()*w.returnp())+(w.returnp()*w.returnp()));
    }

    public KulaNa(Kwadrat k){
        spromienK=Math.sqrt(k.returnb()*k.returnb()+k.returnb()*k.returnb());
    }
    void showW(){
        System.out.println("promien kuli= "+spromienW);
    }
    void showK(){
        System.out.println("promien kuli= "+spromienK);
    }

}
