package com.goutham.structural.proxy;

public class ProxyInternet implements Internet {
    private RealInternet realInternet=new RealInternet();

    @Override
    public void connectTo(String site) throws Exception {
        realInternet.goTo(site);
    }
}
