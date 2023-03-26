package com.goutham.Creational.prototype.example;

public class Bus extends Vehicle{
    private int doors;
    public Bus(){}
    public Bus(Bus bus) {
        super(bus);
        this.doors = bus.doors;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    Vehicle Clone() {
        return new Bus(this);
    }
}
