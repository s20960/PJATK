package com.company;

public class Ciacho {

    int iloscKawalkow;

    public Ciacho(int iloscMaki, int iloscJajek, int iloscMalin){
        int tmpMaki = iloscMaki/100;
        int tmpJajek = iloscJajek/2;
        int tmpMalin = iloscMalin/3;

        if(tmpJajek<tmpMaki)
            if(tmpJajek<tmpMalin)
                iloscKawalkow = tmpJajek;
            else
                iloscKawalkow = tmpMalin;
        else
            if(tmpMaki<tmpMalin)
                    iloscKawalkow=iloscMaki;
            else
                    iloscKawalkow=tmpMalin;
        System.out.println("konst. (int, int, int)");
    }

    public Ciacho(){
        this(500,5,6);
        System.out.println("konst. ()");
    }

    public Ciacho(int iloscKawalkow){
        this.iloscKawalkow=iloscKawalkow;
    }


    public void show(){
        System.out.println(iloscKawalkow);
    }

    public boolean check(Ciacho ciacho){
        if(this.iloscKawalkow == ciacho.iloscKawalkow)
            return true;
        return false;
    }



}
