package com.goutham.Creational.abstractfactory;

public class SeaAnimalFactory extends AnimalFactory{
    private static Animal animal;
    @Override
    Animal getAnimal(String animalType) {
        if(animalType.equalsIgnoreCase("Octopus"))
            animal=new Octopus();
        if (animalType.equalsIgnoreCase("Shark"))
            animal=new Shark();
        return animal;
    }
}
