package com.goutham.structural.composite.ex;

public abstract class Product implements Box{
    protected final String productName;
    protected final double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
}
