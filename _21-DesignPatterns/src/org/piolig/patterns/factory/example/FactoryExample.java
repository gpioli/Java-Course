package org.piolig.patterns.factory.example;

import org.piolig.patterns.factory.PizzaProduct;
import org.piolig.patterns.factory.PizzaShopCaliforniaFactory;
import org.piolig.patterns.factory.PizzaShopNewYorkFactory;
import org.piolig.patterns.factory.PizzaShopZoneAbstractFactory;

public class FactoryExample {
    public static void main(String[] args) {

        PizzaShopZoneAbstractFactory ny = new PizzaShopNewYorkFactory();
        PizzaShopZoneAbstractFactory cali = new PizzaShopCaliforniaFactory();

        PizzaProduct pizza = cali.orderPizza("cheese");
        System.out.println("Bruce orders the pizza: " + pizza.getName());

        pizza = ny.orderPizza("pepperoni");
        System.out.println("Andrew orders a : " + pizza.getName());

        pizza = cali.orderPizza("veggie");
        System.out.println("James orders a : " + pizza.getName());

        pizza = ny.orderPizza("veggie");
        System.out.println("Linus orders a : " + pizza.getName());

        pizza = cali.orderPizza("pepperoni");
        System.out.println("John orders a : " + pizza.getName());

        System.out.println("pizza = " + pizza);

    }
}
