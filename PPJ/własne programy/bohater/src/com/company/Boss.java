package com.company;

public class Boss extends Bohater{

    public Boss(String imie, boolean czyRange, double silaAtaku, double hp){
        super(imie,czyRange,silaAtaku,hp);
    }

    public void zadajObrazenia(Bohater boh)throws MartwyBohaterException{
        int tmp=(int)Math.random()*2;
        if(tmp==1){
            boh.przyjmijObrazenia(this.silaAtaku*1.5);
        }else
        boh.przyjmijObrazenia(this.silaAtaku);
    }
    public String toString(){
        String pomoc="Boss --->"+" "+this.imie+", "+this.hp;
        return pomoc;
    }
}
