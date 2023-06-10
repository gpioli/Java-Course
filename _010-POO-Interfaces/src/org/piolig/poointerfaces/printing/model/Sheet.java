package org.piolig.poointerfaces.printing.model;

abstract public class Sheet implements Printable{

    protected String content;

    abstract public String print();

    public Sheet(String content) {
        this.content = content;
    }
}
