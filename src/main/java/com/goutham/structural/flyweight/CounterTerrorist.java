package com.goutham.structural.flyweight;

public class CounterTerrorist implements Player{
    private final String task;
    private String weapon;

    public CounterTerrorist() {
        task="save people";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon=weapon;
    }

    @Override
    public void mission() {
        System.out.println("Soldier, who is having "+weapon+" task is to "+task);
    }
}
