package org.piolig.patterns.decorator2.decorator;

import org.piolig.patterns.decorator2.Configurable;

public class WithCreamDecorator extends DecoratorCoffee {
    public WithCreamDecorator(Configurable coffee) {
        super(coffee);
    }

    @Override
    public float getBasePrice() {
        return coffee.getBasePrice() + 2.5f;
    }

    @Override
    public String getIngredients() {
        return coffee.getIngredients() + ", Cream";
    }
}
