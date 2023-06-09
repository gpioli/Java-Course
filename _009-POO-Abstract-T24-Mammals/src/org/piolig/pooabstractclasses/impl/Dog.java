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
        return String.format("The wolf eats using his amazing bitepower of %s PSI!", this.getBitePower());
    }

    @Override
    public String sleep() {
        return String.format("The wolf sleeps peacefully in the (%s)", this.getHabitat());
    }

    @Override
    public String run() {
        return String.format("Due to its light weight of %s, the dog can run at an amazing speed!",
                this.weight);
    }

    @Override
    public String communicate() {
        return String.format("The Cheetah can communicate only with animals of the same specie, '%s' ",
                this.getScientificName());
    }
}
