package org.piolicompany.model;

public class Cleaning extends Product{

    private String components;
    private double litres;

    public Cleaning(String name, Double price, String components, double litres) {
        super(name, price);
        this.components = components;
        this.litres = litres;
    }

    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    public double getLitres() {
        return litres;
    }

    public void setLitres(double litres) {
        this.litres = litres;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n\tcomponentes: " + components +
                "\n\tlitres: " + litres;
    }
}
