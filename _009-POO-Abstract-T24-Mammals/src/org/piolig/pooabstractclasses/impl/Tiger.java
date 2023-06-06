package org.piolig.pooabstractclasses.impl;

import org.piolig.pooabstractclasses.model.Feline;

public class Tiger extends Feline {

    private String species;

    public Tiger(String habitat, Double height, Double length, Double weight, String scientificName, Double clawSize, Integer speed, String species) {
        super(habitat, height, length, weight, scientificName, clawSize, speed);
        this.species = species;
    }

    public String getSpecies() {
        return species;
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
