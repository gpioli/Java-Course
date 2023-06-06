package org.piolig.pooabstractclasses.model;

abstract public class Feline extends Mammal {

    private Double clawSize;

    private Integer speed;

    public Feline(String habitat, Double height, Double length, Double weight, String scientificName, Double clawSize, Integer speed) {
        super(habitat, height, length, weight, scientificName);
        this.clawSize = clawSize;
        this.speed = speed;
    }

    public Double getClawSize() {
        return clawSize;
    }

    public Integer getSpeed() {
        return speed;
    }
}
