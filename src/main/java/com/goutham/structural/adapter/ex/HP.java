package com.goutham.structural.adapter.ex;

public class HP implements Laptop{
    @Override
    public void browsePC(String topic) {
        System.out.println("searching topic "+topic+" from pc");
    }

    @Override
    public void callFromPC(String name) {
        System.out.println("calling "+name+"📞 from pc");
    }
}
