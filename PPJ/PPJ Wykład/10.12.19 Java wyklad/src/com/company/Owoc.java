package com.company;

public class Owoc {

    public void uwolnijSmak() throws ZepsutyOwocException, NiedojrzalyOwocException {

        double rand=Math.random();
        if(rand>0.6)
            System.out.println("mniam smaczny");
        else if(rand>0.3 && rand<0.6)
            throw new ZepsutyOwocException();
        else
            throw new NiedojrzalyOwocException();
    }
}
