package com.goutham.Creational.abstractfactory;

public class Cat implements Animal{
    @Override
    public void makeSound() {
        System.out.println("meow");
    }
}
