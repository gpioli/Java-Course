package org.piolig.pooabstractclasses.form.validator;

public class NotNullValidator extends Validator{

    protected String message = "field cannot be null";

    @Override
    public void setMessage(String message) {
        this.message = message;

    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public boolean isValid(String value) {
        return (value != null);
    }
}
