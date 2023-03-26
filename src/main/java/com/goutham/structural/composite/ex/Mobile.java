package com.goutham.structural.composite.ex;

public class Mobile extends Product{
    public Mobile(String productName, double price) {
        super(productName, price);
    }

    @Override
    public double calculatePrice() {
        return price;
    }
}
