package com.goutham.behavioural.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService=new PaymentService();
        paymentService.setPaymentStrategy(new Cash());
        paymentService.payMethod();

    }
        }
