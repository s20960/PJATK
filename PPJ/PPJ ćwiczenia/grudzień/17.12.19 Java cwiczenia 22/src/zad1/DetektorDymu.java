package zad1;

public class DetektorDymu {

    boolean dym = false;
    public void sprawdz() throws Alarm{
        if(dym==true) throw new Alarm();
    }
}
