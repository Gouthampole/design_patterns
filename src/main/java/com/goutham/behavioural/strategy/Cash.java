package com.goutham.behavioural.strategy;

public class Cash implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("paying through cash..");

    }
}
