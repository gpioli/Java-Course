package org.piolig.patterns.factory.product;

import org.piolig.patterns.factory.PizzaProduct;

public class PizzaCaliforniaVeggie extends PizzaProduct {

    public PizzaCaliforniaVeggie() {
        super();
        name = "Pepperoni californian pizza";
        dough = "Stone thick dough";
        ingredients.add("Mozzarella cheese");
        ingredients.add("Olives");
        ingredients.add("Spinach");
        ingredients.add("Onions");
        ingredients.add("Eggplant");

    }

    @Override
    public void cook() {
        System.out.println("Cooking for 50 minutes at 140°C");

    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza in small rectangular slices");
    }
}
