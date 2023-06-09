package org.piolig.pooabstractclasses.impl;

import org.piolig.pooabstractclasses.model.Feline;

public class Cheetah extends Feline {

    public Cheetah(String habitat, Double height, Double length, Double weight, String scientificName, Double clawSize, Integer speed) {
        super(habitat, height, length, weight, scientificName, clawSize, speed);
    }


    @Override
    public String eat() {
        return String.format("The cheetah eats using his claws of %s cm!", this.getClawSize());
    }

    @Override
    public String sleep() {
        return String.format("The cheetah sleeps peacefully in the (%s)", this.getHabitat());
    }

    @Override
    public String run() {
        return String.format("The cheetah is running at %s km/h!", this.getSpeed());
    }

    @Override
    public String communicate() {
        return String.format("The cheetah can communicate only with animals of the same specie, '%s' ",
                this.getScientificName());
    }
}
