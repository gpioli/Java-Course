package org.piolig.pooabstractclasses.impl;

import org.piolig.pooabstractclasses.model.Feline;

public class Lion extends Feline {

    private Integer herdNumber;

    private Double roarPower;

    public Lion(String habitat, Double height, Double length, Double weight, String scientificName, Double clawSize, Integer speed, Integer herdNumber, Double roarPower) {
        super(habitat, height, length, weight, scientificName, clawSize, speed);
        this.herdNumber = herdNumber;
        this.roarPower = roarPower;
    }

    public Integer getHerdNumber() {
        return herdNumber;
    }

    public Double getRoarPower() {
        return roarPower;
    }

    @Override
    public String eat() {
        return null;
    }

    @Override
    public String sleep() {
        return null;
    }

    @Override
    public String run() {
        return null;
    }

    @Override
    public String communicate() {
        return null;
    }
}
