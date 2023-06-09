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
        return String.format("The tiger eats using his claws of %s cm!", this.getClawSize());
    }

    @Override
    public String sleep() { return String.format("The tiger sleeps peacefully in the (%s)", this.getHabitat());
    }

    @Override
    public String run() {
        return String.format("The tiger is running at %s km/h!", this.getSpeed());
    }

    @Override
    public String communicate() {
        return String.format("The tiger can communicate only with animals of the same specie, '%s' ", this.species);
    }
}
