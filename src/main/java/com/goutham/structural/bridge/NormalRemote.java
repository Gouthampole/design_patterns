package com.goutham.structural.bridge;

public class NormalRemote extends  Remote{
    public NormalRemote(Device device) {
        super(device);
    }

    @Override
    void power() {
        System.out.println("Remote: power toggle");
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    @Override
    void volumeDown() {
        System.out.println("Remote: volume down");
        device.setVolume(device.getVolume() - 10);
    }

    @Override
    void volumeUp() {
        System.out.println("Remote: volume up");
        device.setVolume(device.getVolume() + 10);
    }

    @Override
    void channelDown() {
        System.out.println("Remote: channel down");
        device.setChannel(device.getChannel() - 1);
    }

    @Override
    void channelUp() {
        System.out.println("Remote: channel up");
        device.setChannel(device.getChannel() + 1);

    }
}
