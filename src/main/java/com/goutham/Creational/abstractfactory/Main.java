package com.goutham.Creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = AnimalFactory.getAnimalFactory("Land");
        Animal animal= animalFactory.getAnimal("Dog");
        animal.makeSound();
        System.out.println(Types.Land.name().equalsIgnoreCase("Land"));
        System.out.println();
    }
}
