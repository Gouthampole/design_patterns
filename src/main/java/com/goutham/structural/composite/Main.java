package com.goutham.structural.composite;

public class Main {
    public static void main(String[] args) {
        Box videoGame=new singleItems("PS5",200000);
        Box Keyboard=new singleItems("Hp",400);
        Box mouse=new singleItems("alpo",1100);
        System.out.println(videoGame.getPrice());
        Composite peripheral=new Composite("ph");
        peripheral.addItems(Keyboard);
        peripheral.addItems(mouse);
        System.out.println(peripheral.getPrice());
    }
}
