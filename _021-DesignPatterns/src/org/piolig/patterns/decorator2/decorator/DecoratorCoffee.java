package org.piolig.patterns.decorator2.decorator;

import org.piolig.patterns.decorator2.Configurable;

public abstract class DecoratorCoffee implements Configurable {

    protected Configurable coffee;


    public DecoratorCoffee(Configurable coffee){
        this.coffee = coffee;
    }

}
