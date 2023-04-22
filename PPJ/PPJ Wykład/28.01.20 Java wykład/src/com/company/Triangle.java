package com.company;

public class Triangle extends FigGeom {

    int xy[][];

    public Triangle(int x,int y){
        super(x,y);

        xy=new int[3][2];

        double step=(2*Math.PI)/3;

        for (int i = 0; i <3 ; i++) {
            int lx=(int)(Math.cos(step*i)*r)+x;
            int ly=(int)(Math.sin(step*i)*r)+y;

        xy[i][1]=lx;
        xy[i][2]=ly;
        }


    }
}
