package com.goutham.structural.adapter.ex;

public class Vivo implements Phone{
    @Override
    public void callSomeone(String name) {
        System.out.println("calling "+name+"📞");
    }

    @Override
    public void readSD() {
        System.out.println("showing sd card files..📃");
    }

    @Override
    public void browse(String topic) {
        System.out.println("searching topic "+topic);
    }
}
