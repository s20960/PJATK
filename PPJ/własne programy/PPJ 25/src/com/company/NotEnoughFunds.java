package com.company;

public class NotEnoughFunds extends Exception {
    public NotEnoughFunds(double brakasy){
        super("przekroczono fundusze o: "+brakasy);
    }
}
