package org.piolig.pooabstractclasses.form.validator;

public class EmailValidator extends Validator{

    // we will use regular expressions in order to validate this... but a simple one.
    // not the best

    protected String message = "email format is not valid";

    private final static String EMAIL_REGEX = "^(.+)@(.+)$";

    public EmailValidator() {
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
        return value.matches(EMAIL_REGEX);
    }
}
