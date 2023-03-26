package com.goutham.behavioural.strategy;

public class CreditCard implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("paying through credit card..");

    }
}
