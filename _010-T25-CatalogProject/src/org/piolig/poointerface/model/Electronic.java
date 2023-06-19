package org.piolig.poointerface.model;

abstract public class Electronic extends Product implements IElectronic{

    private String manufacturer;

    public Electronic(Integer price, String manufacturer) {
        super(price);
        this.manufacturer = manufacturer;
    }

    @Override
    public String getManufacturer() {
        return this.manufacturer;
    }

}
