package org.piolig.pooabstractclasses.form.elements;

public class InputForm extends FormElement {

    private String type = "text";

    public InputForm(String name) {
        super(name);
    }

    public InputForm(String name, String type) {
        super(name);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String drawHtml() {
        return "<input type=\"" + this.type +
                "\" name=\"" + this.name +
                " \" value=\"" + this.value + "\">";
    }
}
