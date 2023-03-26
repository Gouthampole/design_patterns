package com.goutham.structural.flyweight;

public class Terrorist implements Player{
    private final String task;
    private String weapon;

    public Terrorist() {
        task="Kill people";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon=weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist, who is having "+weapon+" task is to "+task);
    }
}
