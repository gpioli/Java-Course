package org.piolig.patterns.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class PizzaProduct {

    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> ingredients;

    public PizzaProduct() {
        this.ingredients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Selecting floor " + dough);
        System.out.println("Adding sauce " + sauce);
        System.out.println("Adding the rest of the ingredients " + ingredients);
        this.ingredients.forEach(System.out::println);
    }


    abstract public void cook();

    public abstract void cut();

    public void pack(){
        System.out.println("Putting the pizza inside a box...");
    }


    @Override
    public String toString() {
        return "PizzaProduct{" +
                "name='" + name + '\'' +
                ", floor='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
