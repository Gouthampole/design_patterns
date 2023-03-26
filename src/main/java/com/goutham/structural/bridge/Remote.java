package com.goutham.structural.bridge;

public abstract class Remote {
    protected Device device;

    public Remote(Device device) {
        this.device = device;
    }
    abstract void power();

    abstract void volumeDown();

    abstract void volumeUp();

    abstract void channelDown();

    abstract void channelUp();
    
}
