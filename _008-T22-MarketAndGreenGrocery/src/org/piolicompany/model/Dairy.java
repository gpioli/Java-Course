package org.piolicompany.model;

public class Dairy extends Product{

    private int amount;
    private int proteins;


    public Dairy(String name, Double price, int amount, int proteins) {
        super(name, price);
        this.amount = amount;
        this.proteins = proteins;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getProteins() {
        return proteins;
    }

    public void setProteins(int proteins) {
        this.proteins = proteins;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n\tamount: " + amount +
                "\n\tproteins: " + proteins;
    }
}
