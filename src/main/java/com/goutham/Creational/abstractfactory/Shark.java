package com.goutham.Creational.abstractfactory;

public class Shark implements Animal{
    @Override
    public void makeSound() {
        System.out.println("i will not speak, but i will eat you");
    }
}
