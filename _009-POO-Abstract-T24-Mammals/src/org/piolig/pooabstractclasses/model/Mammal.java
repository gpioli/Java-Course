package org.piolig.pooabstractclasses.model;

abstract public class Mammal {

    protected String habitat;

    protected Double height;

    protected Double length;

    protected Double weight;

    protected String scientificName;

    public Mammal(String scientificName) {
        this.scientificName = scientificName;
    }

    public Mammal(String habitat, Double height, Double length, Double weight, String scientificName) {
        this.habitat = habitat;
        this.height = height;
        this.length = length;
        this.weight = weight;
        this.scientificName = scientificName;
    }

    public String getHabitat() {
        return habitat;
    }

    public Double getHeight() {
        return height;
    }

    public Double getLength() {
        return length;
    }

    public Double getWeight() {
        return weight;
    }

    public String getScientificName() {
        return scientificName;
    }

    abstract public String eat();
    abstract public String sleep();
    abstract public String run();
    abstract public String communicate();


}
