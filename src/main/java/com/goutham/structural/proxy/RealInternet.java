package com.goutham.structural.proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RealInternet implements Internet{

    List<String> bannedSites=new ArrayList<>(Arrays.asList("www.abc.com","www.example.com","www.localhost.com"));

    @Override
    public void connectTo(String site) throws Exception {
        if(!bannedSites.contains(site)){
        System.out.println("connecting to "+site);
        goTo(site);}
        else
            throw new Exception("ACCESS DENIED");
    }

    public void goTo(String str){
        System.out.println("opening "+str);
    }
}
