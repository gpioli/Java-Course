package org.piolig.pooabstractclasses.form.validator;

public class LengthValidator extends Validator{

    // we use a template, in order to be used later with String.format | %d stands for digit, but we could've used
    // %s and replace it with a string
    protected String message = "-%s- field must have a minimum of %d characters and a maximum of %d characters";
    private int min;
    private int max = Integer.MAX_VALUE;


    public LengthValidator() {
    }

    public LengthValidator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

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
        // this.message = String.format(this.message, this.min, this.max);
        if (value == null){
            return true;
        }
        int length = value.length();
        return (length >= min && length <= max);
    }

    public String getFormattedMessage(String field){
        return String.format(this.message, field, this.min, this.max);

    }
}
