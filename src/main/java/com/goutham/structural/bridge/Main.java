package com.goutham.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Device device=new TV();
        Remote remote=new NormalRemote(device);
        remote.power();
        System.out.println(device.isEnabled());
        remote.volumeDown();
        remote.power();
        System.out.println(device.isEnabled());
    }
}
