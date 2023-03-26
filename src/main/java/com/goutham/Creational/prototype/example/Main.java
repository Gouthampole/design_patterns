package com.goutham.Creational.prototype.example;

public class Main {
    public static void main(String[] args) {
//        Car car=new Car();
//        car.setBrand("Mustang");
//        car.setSpeed("200");
//        car.setModel("8g");
//        car.setColor("yellow black");
//
//        Bus bus=new Bus();
//        bus.setBrand("volvo");
//        bus.setDoors(2);
//        bus.setColor("red");
//        bus.setModel("250cc");
//
//        System.out.println("og bus:"+bus);
//        System.out.println("og car:"+car);
//        Car car1=(Car)car.Clone();
//        Bus bus1=(Bus) bus.Clone();
//        System.out.println("new bus:"+bus1);
//        System.out.println("new car:"+car1);
        VehicleCache vehicleCache=new VehicleCache();
        Car car=(Car) vehicleCache.get("mustang 8g");
        System.out.println(car.toString());
        Car car1=(Car) vehicleCache.get("mustang 8g");
        System.out.println(car1.toString());


    }
}
