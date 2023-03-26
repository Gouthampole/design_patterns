package com.goutham.structural.composite.ex;

public class Book extends Product{
    public Book(String productName, double price) {
        super(productName, price);
    }

    @Override
    public double calculatePrice() {
        return price;
    }
}
