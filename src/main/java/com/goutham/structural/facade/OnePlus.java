package com.goutham.structural.facade;

public class OnePlus implements Mobile{
    @Override
    public void model() {
        System.out.println("One Plus N7");
    }

    @Override
    public void price() {
        System.out.println("85000");
    }
}
