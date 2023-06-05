package org.piolig.pooabstractclasses.form.validator;

public class RequiredValidator extends Validator{

    protected String message = "-%s- field cannot be null";
    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public boolean isValid(String value) {
        return (value != null && value.length() > 0);
    }
}
