package com.goutham.structural.proxy;

public class Main {
    public static void main(String[] args) throws Exception {
        Internet internet=new RealInternet();
        internet.connectTo("www.abcd.com");
//        internet.connectTo("www.abc.com");

        Internet internet1=new ProxyInternet();
        internet1.connectTo("www.abc.com");
    }
}
