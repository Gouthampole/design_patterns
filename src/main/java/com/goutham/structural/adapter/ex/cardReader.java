package com.goutham.structural.adapter.ex;

public class cardReader implements Laptop{
    private Phone phone;

    public cardReader(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void browsePC(String topic) {
        phone.browse(topic);
    }

    @Override
    public void callFromPC(String name) {
        phone.callSomeone(name);
    }

    public void readSD(){
        phone.readSD();
    }
}
