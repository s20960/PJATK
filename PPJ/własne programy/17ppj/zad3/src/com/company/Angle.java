package com.company;

public class Angle {

    private double x;

    Angle(double x){
        this.x=x;
        if(this.x>360||this.x<0) this.x=180;
    }

    public double radian(){
        return (this.x/180)*Math.PI;
    }
    public double degree(){
        return x;
    }

    Angle(float x){
        this.x=(x*360)/(2*Math.PI);
        if(this.x>360||this.x<0) this.x=180;
    }

    public static Angle getComplement(Angle y){
        Angle kat3=new Angle(360-y.degree());
        return kat3;
    }



}
