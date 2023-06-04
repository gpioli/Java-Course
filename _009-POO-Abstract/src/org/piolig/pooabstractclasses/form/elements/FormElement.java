package org.piolig.pooabstractclasses.form.elements;

import org.piolig.pooabstractclasses.form.validator.Validator;

import java.util.ArrayList;
import java.util.List;

abstract public class FormElement {

    protected String value;
    protected String name;
    private List<Validator> validatorList;
    private List<String> errors;

    public FormElement() {
        this.validatorList = new ArrayList<>();
        this.errors = new ArrayList<>();
    }

    public FormElement(String name) {
        this();
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<String> getErrors() {
        return errors;
    }

    public String getName() {
        return name;
    }

    public FormElement addValidator(Validator validator) {
        this.validatorList.add(validator);
        return this;
    }


    public boolean isValid() {
        for (Validator v : validatorList) {
            if (!v.isValid(this.value)) {
                this.errors.add(v.getMessage());
            }
        }
        return this.errors.size() == 0;
    }



    abstract public String drawHtml();


}
