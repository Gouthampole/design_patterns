package com.goutham.structural.adapter.ex;

public class Main {
    public static void main(String[] args) {
        Phone phone=new Vivo();
        phone.readSD();

        Laptop laptop=new HP();
//        laptop.readSD();
        cardReader reader=new cardReader(new Vivo());
        reader.callFromPC("uj");
        reader.browsePC("selenium");
        reader.readSD();
    }
}
