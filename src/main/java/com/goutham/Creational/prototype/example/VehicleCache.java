package com.goutham.Creational.prototype.example;

import java.util.HashMap;
import java.util.Map;

public class VehicleCache {
    private Map<String,Vehicle> cache=new HashMap<>();
    public VehicleCache(){
        Car car=new Car();
        car.setBrand("Mustang");
        car.setSpeed("200");
        car.setModel("8g");
        car.setColor("yellow black");

        Bus bus=new Bus();
        bus.setBrand("volvo");
        bus.setDoors(2);
        bus.setColor("red");
        bus.setModel("250cc");

        cache.put("mustang 8g",car);
        cache.put("volvo 250cc",bus);
    }
    public Vehicle get(String key){
        return cache.get(key).Clone();
    }
}
