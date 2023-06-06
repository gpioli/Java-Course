package org.piolig.pooabstractclasses.impl;

import org.piolig.pooabstractclasses.model.Canine;

public class Wolf extends Canine {

    public Wolf(String habitat, Double height, Double length, Double weight, String scientificName, String color, Double fangsSize, Integer litterNumber, String species) {
        super(habitat, height, length, weight, scientificName, color, fangsSize);
        this.litterNumber = litterNumber;
        this.species = species;
    }

    private Integer litterNumber;

    private String species;

    public Integer getLitterNumber() {
        return litterNumber;
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
