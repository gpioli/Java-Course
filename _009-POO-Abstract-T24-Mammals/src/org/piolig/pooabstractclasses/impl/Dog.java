package org.piolig.pooabstractclasses.impl;

import org.piolig.pooabstractclasses.model.Feline;

public class Dog extends Feline {

    private Integer bitePower;

    public Dog(String habitat, Double height, Double length, Double weight, String scientificName, Double clawSize, Integer speed, Integer bitePower) {
        super(habitat, height, length, weight, scientificName, clawSize, speed);
        this.bitePower = bitePower;
    }

    public Integer getBitePower() {
        return bitePower;
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
