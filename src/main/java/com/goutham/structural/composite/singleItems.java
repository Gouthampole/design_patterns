package com.goutham.structural.composite;

public class singleItems implements Box{
    private String name;
    private double price;

    public singleItems(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
