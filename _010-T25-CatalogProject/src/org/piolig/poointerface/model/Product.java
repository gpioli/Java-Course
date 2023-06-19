package org.piolig.poointerface.model;

abstract public class Product implements IProduct{

    private Integer price;

    public Product(Integer price) {
        this.price = price;
    }

    @Override
    public Integer getPrice() {
        return price;
    }


}
