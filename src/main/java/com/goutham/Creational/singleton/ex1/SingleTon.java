package com.goutham.Creational.singleton.ex1;

public class SingleTon {
    private SingleTon(){

    }

    private static class Holder{
        private static SingleTon instance=new SingleTon();
    }

    public static SingleTon getInstance(){
        return Holder.instance;
    }
}
