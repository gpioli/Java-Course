package org.piolig.patterns.factory;

import org.piolig.patterns.factory.product.PizzaNewYorkItalian;
import org.piolig.patterns.factory.product.PizzaNewYorkPepperoni;
import org.piolig.patterns.factory.product.PizzaNewYorkVeggie;

public class PizzaShopNewYorkFactory extends PizzaShopZoneAbstractFactory{
    @Override
    PizzaProduct createPizza(String type) {
        PizzaProduct product = null;
        switch (type){
            case "veggie":
                product = new PizzaNewYorkVeggie();
                break;
            case "pepperoni":
                product = new PizzaNewYorkPepperoni();
                break;
            case "italian":
                product = new PizzaNewYorkItalian();
                break;
        }
        return product;
    }
}
