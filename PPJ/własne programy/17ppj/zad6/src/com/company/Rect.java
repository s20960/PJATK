package com.company;

public class Rect {
    Point p1;
    Point p2;

    Rect(Point p1,Point p2){
        this.p1=p1;
        this.p2=p2;

    }

    public double countField(){
        double dlug=p2.x-p1.x;
        double wys=p1.y-p2.y;
        double field=dlug*wys;
        return field;
    }
    public double countDiagonal(){
        double dlug=p2.x-p1.x;
        double wys=p1.y-p2.y;
        double przek=Math.sqrt(dlug*dlug+wys*wys);
        return przek;

    }
}
