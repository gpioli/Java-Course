package org.piolig.patterns.factory.product;

import org.piolig.patterns.factory.PizzaProduct;

public class PizzaNewYorkPepperoni extends PizzaProduct {

    public PizzaNewYorkPepperoni() {
        super();
        name = "New York Pepperoni pizza";
        dough = "Stone Thin dough";
        sauce = "Tomato sauce";
        ingredients.add("Mozzarella cheese");
        ingredients.add("Extra pepperoni");
        ingredients.add("Olives");
    }

    @Override
    public void cook() {
        System.out.println("Cook for 40 minutes at 90°C");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza in triangular slices");
    }
}
