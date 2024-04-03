package org.piolig.patterns.factory.product;

import org.piolig.patterns.factory.PizzaProduct;

public class PizzaNewYorkVeggie extends PizzaProduct {

    public PizzaNewYorkVeggie() {
        super(); // ingredients list is constructed in the super class
        name = "New York Veggie Pizza";
        dough = "Integral vegan floor";
        sauce = "Tomato sauce";
        ingredients.add("Vegan cheese");
        ingredients.add("Tomato");
        ingredients.add("Olives");
        ingredients.add("Spinahc");
        ingredients.add("Eggplant");

    }

    @Override
    public void cook() {
        System.out.println("Cooking for 25 min at 150°C");
    }

    @Override
    public void cut() {
        System.out.println("Cutting pizza in square slices");

    }
}
