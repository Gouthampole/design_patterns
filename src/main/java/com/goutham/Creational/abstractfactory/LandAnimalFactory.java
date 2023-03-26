package com.goutham.Creational.abstractfactory;

public class LandAnimalFactory extends AnimalFactory{
    private static Animal animal;
    @Override
    Animal getAnimal(String animalType) {
        if(animalType.equalsIgnoreCase("Cat"))
            animal=new Cat();
        if (animalType.equalsIgnoreCase("Dog"))
            animal=new Dog();
        return animal;
    }
}
