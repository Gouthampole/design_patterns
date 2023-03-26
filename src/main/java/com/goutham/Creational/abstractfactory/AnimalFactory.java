package com.goutham.Creational.abstractfactory;

public abstract class AnimalFactory {

    abstract Animal getAnimal(String animalType);
    private static AnimalFactory animalFactory;
    public static AnimalFactory getAnimalFactory(String factoryType){
        if(factoryType.equalsIgnoreCase("sea"))
            animalFactory=new SeaAnimalFactory();
        if(factoryType.equalsIgnoreCase("land"))
            animalFactory=new LandAnimalFactory();
        return animalFactory;

    }
}
