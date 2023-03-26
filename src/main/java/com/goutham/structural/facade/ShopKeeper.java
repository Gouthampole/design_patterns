package com.goutham.structural.facade;

public class ShopKeeper {
    private Mobile samsung;
    private Mobile onePlus;
    private Mobile iphone;
    public ShopKeeper(){
        samsung=new Samsung();
        onePlus=new OnePlus();
        iphone=new IPhone();
    }

    public void showSamsung(){
        samsung.model();
        samsung.price();
    }
    public void showIPhone(){
        iphone.model();
        iphone.price();
    }
    public void showOnePlus(){
        onePlus.model();
        onePlus.price();
    }


}
