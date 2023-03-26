package com.goutham.structural.composite.ex;

public class VideoGame extends Product{

    public VideoGame(String productName, double price) {
        super(productName, price);
    }

    @Override
    public double calculatePrice() {
        return price;
    }
}
