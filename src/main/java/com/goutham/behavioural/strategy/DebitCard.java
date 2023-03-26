package com.goutham.behavioural.strategy;

public class DebitCard implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("paying through debit card..");
    }
}
