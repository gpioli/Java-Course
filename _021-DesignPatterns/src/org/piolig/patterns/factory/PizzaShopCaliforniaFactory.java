package org.piolig.patterns.factory;

import org.piolig.patterns.factory.product.PizzaCaliforniaCheese;
import org.piolig.patterns.factory.product.PizzaCaliforniaPepperoni;
import org.piolig.patterns.factory.product.PizzaCaliforniaVeggie;

public class PizzaShopCaliforniaFactory extends PizzaShopZoneAbstractFactory{

    @Override
    PizzaProduct createPizza(String type) {
        PizzaProduct product = null;
        switch (type){
            case "veggie":
                product = new PizzaCaliforniaVeggie();
                break;
            case "pepperoni":
                product = new PizzaCaliforniaPepperoni();
                break;
            case "cheese":
                product = new PizzaCaliforniaCheese();
                break;
        }
        return product;
    }


}
