package org.piolig.pooabstractclasses.form;

import org.piolig.pooabstractclasses.form.elements.FormElements;
import org.piolig.pooabstractclasses.form.elements.InputForm;
import org.piolig.pooabstractclasses.form.elements.SelectForm;
import org.piolig.pooabstractclasses.form.elements.TextareaForm;
import org.piolig.pooabstractclasses.form.elements.select.Option;

public class ExampleForm {
    public static void main(String[] args) {

        InputForm userName = new InputForm("username");
        InputForm password = new InputForm("key", "password");
        InputForm email = new InputForm("email", "email");
        InputForm age = new InputForm("age", "number");

        TextareaForm experience = new TextareaForm("exp", 5,9);

        SelectForm language = new SelectForm("language");
        Option java = new Option("1", "Java");
        language.addOption(java);
        language.addOption(new Option("2", "Python"));
        language.addOption(new Option("3", "JavaScript"));
        language.addOption(new Option("4", "TypeScript"));
        language.addOption(new Option("5", "PHP"));

        userName.setValue("john.doe");
        password.setValue("a1b2c3");
        email.setValue("john.doe@mail.com");
        age.setValue("29");
        java.setSelected(true);



    }
}
