package org.piolig.patterns.factory.product;

import org.piolig.patterns.factory.PizzaProduct;

public class PizzaCaliforniaPepperoni extends PizzaProduct {

    public PizzaCaliforniaPepperoni() {
        super();
        name = "Pepperoni californian pizza";
        dough = "Stone thin dough";
        sauce = "Tomato sauce with arugula";
        ingredients.add("Pepperoni");
        ingredients.add("Extra mozzarella cheese");
        ingredients.add("Olives");

    }

    @Override
    public void cook() {
        System.out.println("Cooking for 35 minutes at 100°C");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza in small triangular slices");

    }
}
