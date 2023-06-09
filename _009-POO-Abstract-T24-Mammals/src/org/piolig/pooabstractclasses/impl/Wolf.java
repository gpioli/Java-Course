package org.piolig.pooabstractclasses.impl;

import org.piolig.pooabstractclasses.model.Canine;

public class Wolf extends Canine {

    public Wolf(String habitat, Double height, Double length, Double weight, String scientificName, String color, Double fangsSize, Integer litterNumber, String species) {
        super(habitat, height, length, weight, scientificName, color, fangsSize);
        this.litterNumber = litterNumber;
        this.wolfSpecies = species;
    }

    private Integer litterNumber;

    private String wolfSpecies;

    public Integer getLitterNumber() {
        return litterNumber;
    }

    public String getSpecies() {
        return wolfSpecies;
    }

    @Override
    public String eat() {
        return String.format("The wolf eats using his fangs of %s cm!", this.getFangsSize());
    }

    @Override
    public String sleep() {
        return String.format("The wolf sleeps peacefully in the (%s)", this.getHabitat());
    }

    @Override
    public String run() {
        return String.format("Due to its light weight of %s, the wolf can run at an amazing speed!",
                this.weight);
    }

    @Override
    public String communicate() {
        return String.format("The Cheetah can communicate only with animals of the same specie, '%s' ",
                this.getScientificName());
    }
}
