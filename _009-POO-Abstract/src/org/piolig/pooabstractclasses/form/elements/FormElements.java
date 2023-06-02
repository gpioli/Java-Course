package org.piolig.pooabstractclasses.form.elements;

abstract public class FormElements {

    protected String value;
    protected String name;

    public FormElements() {
    }

    public FormElements(String name) {
        this();
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    abstract public String drawHtml();


}
