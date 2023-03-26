package com.goutham.Creational.prototype;

public class Main {
    public static void main(String[] args) {
        Robots robots=new Robots("all","andro-humanoiac");
        Robots prototype=(Robots) robots.cloneItem();
//        prototype.setNeuralSchema("my own schema");
//        prototype.setParts("like me");

        System.out.println(robots);
        System.out.println(prototype);
    }
}
