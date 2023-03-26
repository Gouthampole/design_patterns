package com.goutham.structural.facade;

public class Main{
    public static void main(String[] args) {
        Mobile mobile=new IPhone();
        mobile.price();
        ShopKeeper keeper=new ShopKeeper();
        keeper.showSamsung();
        keeper.showOnePlus();

    }


}
