package org.piolig.patterns.decorator2.decorator;

import org.piolig.patterns.decorator2.Configurable;

public class WithMilkDecorator extends DecoratorCoffee{
    public WithMilkDecorator(Configurable coffee) {
        super(coffee);
    }

    @Override
    public float getBasePrice() {
        return coffee.getBasePrice() + 3.7f;
    }

    @Override
    public String getIngredients() {
        return coffee.getIngredients() + ", Milk";
    }
}
