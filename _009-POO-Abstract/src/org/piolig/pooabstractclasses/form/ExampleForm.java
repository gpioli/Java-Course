package org.piolig.pooabstractclasses.form;

import org.piolig.pooabstractclasses.form.elements.FormElement;
import org.piolig.pooabstractclasses.form.elements.InputForm;
import org.piolig.pooabstractclasses.form.elements.SelectForm;
import org.piolig.pooabstractclasses.form.elements.TextareaForm;
import org.piolig.pooabstractclasses.form.elements.select.Option;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        language.addOption(new Option("2", "Python"))
                .addOption(new Option("3", "JavaScript"))
                .addOption(new Option("4", "TypeScript"))
                .addOption(new Option("5", "PHP"));

        userName.setValue("john.doe");
        password.setValue("a1b2c3");
        email.setValue("john.doe@mail.com");
        age.setValue("29");
        experience.setValue("... more than 8 years of experience in IT ...");
        java.setSelected(true);

        // List<FormElement> elements = new ArrayList<>();
        // this does exactly the same, but the code gets cleaner
        List<FormElement> elements = Arrays.asList(userName, password, email, experience, language);

/*        elements.add(userName);
        elements.add(password);
        elements.add(email);
        elements.add(experience);
        elements.add(language);*/

/*        for(FormElement e: elements){
            System.out.println(e.drawHtml());
            System.out.println("<br>");
        }*/

        // Another way of doing this through the API stream:

        elements.forEach(e -> {
            System.out.println(e.drawHtml());
            System.out.println("<br>");;
        });

    }
}
