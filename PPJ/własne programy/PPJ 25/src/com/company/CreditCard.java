package com.company;

public class CreditCard extends DebetCard{

    public CreditCard(Account konto){
        super(konto);
    }

    public void wyplać(double hajswyplac)throws NotEnoughFunds{
        if(hajswyplac<=konto.balance+konto.credit)
            konto.balance-=hajswyplac;
        else throw new NotEnoughFunds(hajswyplac-(konto.balance+konto.credit));
    }

}
