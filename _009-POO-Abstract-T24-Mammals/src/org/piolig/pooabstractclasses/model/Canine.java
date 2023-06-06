package org.piolig.pooabstractclasses.model;

abstract public class Canine extends Mammal {

    private String color;

    private Double fangsSize;


    public Canine(String habitat, Double height, Double length, Double weight, String scientificName, String color, Double fangsSize) {
        super(habitat, height, length, weight, scientificName);
        this.color = color;
        this.fangsSize = fangsSize;
    }

    public String getColor() {
        return color;
    }

    public Double getFangsSize() {
        return fangsSize;
    }
}
