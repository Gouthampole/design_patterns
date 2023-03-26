package com.goutham.Creational.builder.newtry;
public class Main {
    public static void main(String[] args) {
        Pizza pizza= Pizza.addToppings()
                .addChicken(true)
                .addOnions(true)
                .addPepperoni(true)
                .addExtraCheese(true)
                .build();

        System.out.println(pizza);
        pizza.check();
    }
}

