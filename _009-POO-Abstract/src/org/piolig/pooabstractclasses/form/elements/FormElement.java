package org.piolig.pooabstractclasses.form.elements;

abstract public class FormElement {

    protected String value;
    protected String name;

    public FormElement() {
    }

    public FormElement(String name) {
        this();
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    abstract public String drawHtml();


}
