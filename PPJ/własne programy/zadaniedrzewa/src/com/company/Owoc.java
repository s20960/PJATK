package com.company;

public class Owoc {

    private String nazwa;
    private double masa;

    public Owoc(String nazwa, double masa){
        this.masa=masa;
        this.nazwa=nazwa;
    }

    public double masa(){
        return masa;
    }
    public String  nazwa(){
        return nazwa;
    }
}
