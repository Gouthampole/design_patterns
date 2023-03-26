package com.goutham.Creational.singleton.ex1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void createInstance(){
        SingleTon cart = SingleTon.getInstance();
        System.out.println(cart);
    }
    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(1);
        service.submit(Main::createInstance);
        service.submit(Main::createInstance);
        service.shutdown();

    }
}
