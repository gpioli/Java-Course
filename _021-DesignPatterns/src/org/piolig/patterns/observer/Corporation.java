package org.piolig.patterns.observer;

public class Corporation extends Observable {

    private String name;
    private int price;

    public Corporation(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void modifyPrice(int price){
        this.price = price;
        notifyObservers();
    }

    @Override
    public String toString() {
        return getName() +
                " new price: $" +
                getPrice();
    }
}
