package org.piolig.pooabstractclasses.impl;

import org.piolig.pooabstractclasses.model.Feline;

public class Cheetah extends Feline {

    public Cheetah(String habitat, Double height, Double length, Double weight, String scientificName, Double clawSize, Integer speed) {
        super(habitat, height, length, weight, scientificName, clawSize, speed);
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
