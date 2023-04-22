package zad3;

public class KulaW {

    double ppromienw;
    double ppromienk;

    public KulaW(Walec w){
        if(w.returnw()>=w.returnp()) ppromienw=w.returnp()/2;
        else ppromienw=w.returnw()/2;
    }
    public KulaW(Kwadrat k){
        ppromienk=k.returnb()/2;
    }

    void showW(){
        System.out.println("promien kuli= "+ppromienw);
    }
    void showK(){
        System.out.println("promien kuli= "+ppromienk);
    }

}
