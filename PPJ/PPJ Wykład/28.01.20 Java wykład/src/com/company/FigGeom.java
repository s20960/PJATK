package com.company;

public abstract class FigGeom {

    int x;
    int y;

    public FigGeom(int x,int y){
        this.x=x;
        this.y=y;
    }

    abstract public void paint();
}
