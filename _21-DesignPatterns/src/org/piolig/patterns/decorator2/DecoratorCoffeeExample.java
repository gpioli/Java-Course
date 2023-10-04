package org.piolig.patterns.decorator2;

import org.piolig.patterns.decorator2.decorator.WithChocolateDecorator;
import org.piolig.patterns.decorator2.decorator.WithCreamDecorator;
import org.piolig.patterns.decorator2.decorator.WithMilkDecorator;

public class DecoratorCoffeeExample {

    public static void main(String[] args) {

        Configurable coffee = new Coffee("Mocha coffee", 7);
        WithCreamDecorator withCream = new WithCreamDecorator(coffee);
        WithMilkDecorator withMilk = new WithMilkDecorator(withCream);
        WithChocolateDecorator withChocolate = new WithChocolateDecorator(withMilk);

        System.out.println("Price of the mocca coffee is: " + withChocolate.getBasePrice());
        System.out.println("Ingredients are: " + withChocolate.getIngredients());


        Configurable cappuccino = new Coffee("Capuccino coffee", 4);
        withCream = new WithCreamDecorator(cappuccino);
        withMilk = new WithMilkDecorator(withCream);

        System.out.println("Price of the cappuccino coffee is: " + withMilk.getBasePrice());
        System.out.println("Ingredients of the cappuccino are: " + withMilk.getIngredients());


    }

}
