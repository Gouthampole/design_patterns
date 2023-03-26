package com.goutham.Creational.builder.newtry;

public class Pizza {
    //toppings
    private static Toppings toppings=new Toppings();

    public static PizzaToppings addToppings(){
        return new PizzaToppings();
    }

    public static class PizzaToppings{
     private static Toppings toppings=new Toppings();

        public PizzaToppings addPepperoni(final boolean pepperoni) {
            this.toppings.pepperoni = pepperoni;
            return this;
        }

        public PizzaToppings addChicken(final boolean chicken) {
            this.toppings.chicken = chicken;
            return this;
        }

        public PizzaToppings addExtraCheese(final boolean extraCheese) {
            this.toppings.extraCheese = extraCheese;
            return this;
        }

        public PizzaToppings addBlackOlives(final boolean blackOlives) {
            this.toppings.blackOlives = blackOlives;
            return this;
        }

        public PizzaToppings addOnions(final boolean onions) {
            this.toppings.onions = onions;
            return this;
        }

        public PizzaToppings addMushrooms(final boolean mushrooms) {
            this.toppings.mushrooms = mushrooms;
            return this;
        }

        public Pizza build(){
            Pizza pizza=new Pizza();
            pizza.toppings.blackOlives=toppings.blackOlives;
            pizza.toppings.chicken=toppings.chicken;
            pizza.toppings.pepperoni=toppings.pepperoni;
            pizza.toppings.onions=toppings.onions;
            pizza.toppings.mushrooms=toppings.mushrooms;
            pizza.toppings.extraCheese=toppings.extraCheese;

            return pizza;
        }

    }


    public void check(){
        System.out.println(toppings.toString());
    }

}
