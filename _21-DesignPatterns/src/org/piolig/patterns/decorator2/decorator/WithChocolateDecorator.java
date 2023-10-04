package org.piolig.patterns.decorator2.decorator;

import org.piolig.patterns.decorator2.Configurable;

public class WithChocolateDecorator extends DecoratorCoffee {
    public WithChocolateDecorator(Configurable coffee) {
        super(coffee);
    }

    @Override
    public float getBasePrice() {
        return coffee.getBasePrice() + 5f;
    }

    @Override
    public String getIngredients() {
        return coffee.getIngredients() + ", Chocolate";
    }
}
