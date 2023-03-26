package com.goutham.structural.facade;

public class Samsung implements Mobile{
    @Override
    public void model() {
        System.out.println("Samsung s3");
    }

    @Override
    public void price() {
        System.out.println("50000");
    }
}
