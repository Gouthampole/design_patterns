package com.goutham.structural.facade;

public class IPhone implements Mobile{
    @Override
    public void model() {
        System.out.println("Iphone 14");
    }

    @Override
    public void price() {
        System.out.println("135000");
    }
}
