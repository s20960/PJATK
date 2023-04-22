package com.company;

public class DebetCard {
    Account konto;
    DebetCard(Account konto){
        this.konto=konto;
    }

    public void wyplać(double hajswyplac) throws NotEnoughFunds{
        if(hajswyplac<=konto.dailyDebet&&hajswyplac<konto.balance)
        konto.balance-=hajswyplac;
        else throw new NotEnoughFunds(Math.max(hajswyplac-konto.dailyDebet,hajswyplac-konto.balance));
    }



}
