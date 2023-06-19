package org.piolig.poointerface.model;

public class LcdTV extends Electronic {

    private Integer inches;

    public LcdTV(Integer price, String manufacturer, Integer inches) {
        super(price, manufacturer);
        this.inches = inches;
    }

    public Integer getInches() {
        return inches;
    }

    @Override
    public Double getSellPrice() {
        return getPrice() * 1.15;
    }
}
