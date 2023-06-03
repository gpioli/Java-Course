package org.piolig.pooabstractclasses.form.validator;

abstract public class Validator {

    protected String message;

    abstract public void setMessage(String message);
    abstract public String getMessage();
    abstract public boolean isValid(String value);


}
