package com.company;

public class Drzewo {
    public Drzewo(){}

    public  Owoc zerwijOwoc() {
        int pomoc=(int)(Math.random()*3);
        switch (pomoc){
            case 1:
                Jablko jablko=new Jablko("",1);
                return jablko;
            case 2:
                Gruszka gruszka= new Gruszka("a",1);
                return gruszka;
            case 0:
                Pomarancza pomarancza=new Pomarancza("a",1);
                return pomarancza;
            default:
                Jablko jablko1=new Jablko("",1);
                return jablko1;
        }
    }
}
