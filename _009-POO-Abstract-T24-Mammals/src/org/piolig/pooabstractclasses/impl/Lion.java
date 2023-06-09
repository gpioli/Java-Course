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
        return String.format("The lion hunts with his herd of %s individuals in the %s", this.herdNumber, this.getHabitat());
    }

    @Override
    public String sleep() {
        return String.format("The lion sleeps tonight with his herd (%s)", this.herdNumber);
    }

    @Override
    public String run() {
        return String.format("The lion is running at %s km/h!", this.getSpeed());
    }

    @Override
    public String communicate() {
        return String.format("The lion comunicates with the rest of the herd. He can even roar with an incredible" +
                " power of %s", this.roarPower);
    }
}
