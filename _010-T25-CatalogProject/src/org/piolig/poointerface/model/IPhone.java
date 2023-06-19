package org.piolig.poointerface.model;

public class IPhone extends Electronic {

    private String color;
    private String model;

    public IPhone(Integer price, String manufacturer, String color, String model) {
        super(price, manufacturer);
        this.color = color;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    @Override
    public Double getSellPrice() {
        return getPrice() * 1.15;
    }
}
