package org.piolig.generics.model;

public class Fruit extends Product {

    private Double weight;
    private String color;

    public Fruit(String name, Double price, Double weight, String color) {
        super(name, price);
        this.weight = weight;
        this.color = color;
    }

    public Double getWeight() {
        return weight;
    }


    public String getColor() {
        return color;
    }

}
