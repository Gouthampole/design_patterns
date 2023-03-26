package com.goutham.Creational.builder;

public class Pizza {
    //toppings
    private boolean pepperoni;
    private boolean chicken;
    private boolean extraCheese;
    private boolean blackOlives;
    private boolean onions;
    private boolean mushrooms;

    public static PizzaToppings addToppings(){
        return new PizzaToppings();
    }

    public static class PizzaToppings{
        private boolean pepperoni;
        private boolean chicken;
        private boolean extraCheese;
        private boolean blackOlives;
        private boolean onions;
        private boolean mushrooms;

        public PizzaToppings addPepperoni(final boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public PizzaToppings addChicken(final boolean chicken) {
            this.chicken = chicken;
            return this;
        }

        public PizzaToppings addExtraCheese(final boolean extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }

        public PizzaToppings addBlackOlives(final boolean blackOlives) {
            this.blackOlives = blackOlives;
            return this;
        }

        public PizzaToppings addOnions(final boolean onions) {
            this.onions = onions;
            return this;
        }

        public PizzaToppings addMushrooms(final boolean mushrooms) {
            this.mushrooms = mushrooms;
            return this;
        }

        public Pizza build(){
            Pizza pizza=new Pizza();
            pizza.blackOlives=blackOlives;
            pizza.chicken=chicken;
            pizza.pepperoni=pepperoni;
            pizza.onions=onions;
            pizza.mushrooms=mushrooms;
            pizza.extraCheese=extraCheese;

            return pizza;
        }
    }
}
