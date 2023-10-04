package org.piolig.patterns.factory;

public abstract class PizzaShopZoneAbstractFactory {

    public PizzaProduct orderPizza(String type) {
        PizzaProduct pizza = createPizza(type);
        System.out.println("----- Manufacturing pizza: " + pizza.getName() + "-----");
        pizza.prepare();
        pizza.cook();
        pizza.cut();
        pizza.pack();
        return pizza;
    }

    abstract PizzaProduct createPizza(String type);

}
