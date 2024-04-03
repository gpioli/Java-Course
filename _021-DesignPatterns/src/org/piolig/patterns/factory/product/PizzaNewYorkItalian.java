package org.piolig.patterns.factory.product;

import org.piolig.patterns.factory.PizzaProduct;

public class PizzaNewYorkItalian extends PizzaProduct {

    public PizzaNewYorkItalian() {
        super();
        name = "New York Italian pizza";
        dough = "Thick dough";
        sauce = "Tomato italian sauce with meat";
        ingredients.add("Mozzarella cheese");
        ingredients.add("Olives");
        ingredients.add("Ham");
        ingredients.add("Sausages");
        ingredients.add("Mushrooms");
    }

    @Override
    public void cook() {
        System.out.println("Cook for 30 minutes at 120°C");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza in big triangular slices");
    }
}
