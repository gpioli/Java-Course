package org.piolig.optional.example.models;

import java.util.Optional;

public class Computer {
    private String name;
    private String model;
    private Processor processor;



    public Computer(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Optional<Processor> getProcessor() {
        return Optional.ofNullable(processor);
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return name + ", " + model;
    }
}
