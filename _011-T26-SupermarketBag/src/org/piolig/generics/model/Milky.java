package org.piolig.generics.model;

public class Milky extends Product {

    private int amount;
    private int proteins;

    public Milky(String name, Double price, int amount, int proteins) {
        super(name, price);
        this.amount = amount;
        this.proteins = proteins;
    }

    public int getAmount() {
        return amount;
    }


    public int getProteins() {
        return proteins;
    }

}
