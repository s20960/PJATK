package com.company;

public class Bohater {

    String imie;
    boolean czyRange;
    double silaAtaku;
    double hp;

    public Bohater(String imie, boolean czyRange, double silaAtaku, double hp){
        this.imie=imie;
        this.czyRange=czyRange;
        this.silaAtaku=silaAtaku;
        this.hp=hp;
    }
    public Bohater(){
        this.imie="none";
        this.czyRange=false;
        this.silaAtaku=100;
        this.hp=400;
    }

    public void zadajObrazenia(Bohater boh)throws MartwyBohaterException{
            boh.przyjmijObrazenia(this.silaAtaku);
    }
    public void przyjmijObrazenia(double dmg) throws MartwyBohaterException{
        this.hp-=dmg;
        if(hp<=0)
            throw new MartwyBohaterException();
    }
    public static void wskrzes(Bohater noob){
        if(noob.hp<=0){
            noob.hp=200;
        }
    }
    public String toString(){
        if(hp>0){
        String pomoc=this.imie+", "+this.hp;
        return pomoc;
        }else return imie+", -Matrwy-";
    }
}
