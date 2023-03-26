package com.goutham.Creational.prototype.example;

public class Car extends Vehicle{
    private String speed;

    public Car(){
        super();
    }
    public Car(Car car) {
        super(car);
        this.speed = car.speed;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    @Override
    Vehicle Clone() {
        return new Car(this);
    }
}
