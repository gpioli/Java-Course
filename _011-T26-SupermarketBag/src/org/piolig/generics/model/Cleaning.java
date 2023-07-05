package org.piolig.generics.model;

public class Cleaning extends Product {

    private String components;
    private Double litres;

    public Cleaning(String name, Double price, String components, Double litres) {
        super(name, price);
        this.components = components;
        this.litres = litres;
    }

    public String getComponents() {
        return components;
    }


    public Double getLitres() {
        return litres;
    }

}
