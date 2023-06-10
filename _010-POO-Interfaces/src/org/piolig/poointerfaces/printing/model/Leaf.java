package org.piolig.poointerfaces.printing.model;

abstract public class Leaf {

    protected String content;

    abstract public String print();

    public Leaf(String content) {
        this.content = content;
    }
}
