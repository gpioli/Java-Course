package org.piolig.pooabstractclasses.form;

import org.piolig.pooabstractclasses.form.elements.*;
import org.piolig.pooabstractclasses.form.elements.select.Option;
import org.piolig.pooabstractclasses.form.validator.*;

import java.util.Arrays;
import java.util.List;

public class ExampleForm {
    public static void main(String[] args) {

        InputForm userName = new InputForm("username");
        userName.addValidator(new RequiredValidator());

        InputForm password = new InputForm("password", "password");
        password.addValidator(new RequiredValidator())
                .addValidator(new LengthValidator(6,12));

        InputForm email = new InputForm("email", "email");
        email.addValidator(new RequiredValidator())
                .addValidator(new EmailValidator());

        InputForm age = new InputForm("age", "number");
        age.addValidator(new NumberValidator());

        TextareaForm experience = new TextareaForm("exp", 5,9);

        SelectForm language = new SelectForm("language");
        language.addValidator(new NotNullValidator());

        language.addOption(new Option("1", "Java"));
        language.addOption(new Option("2", "Python"))
                .addOption(new Option("3", "JavaScript").setSelected())
                .addOption(new Option("4", "TypeScript"))
                .addOption(new Option("5", "PHP"));

        // example of an anonymous method:
        FormElement salute = new FormElement() {
            @Override
            public String drawHtml() {
                return "<input disabled name='" + this.name + "' value='" + this.value +  "'>";
            }
        };

        salute.setValue("Hi, this field is disabled!");

        userName.setValue("");
        password.setValue("");
        email.setValue("john.doeemail.com");
        age.setValue("29h");
        experience.setValue("... more than 8 years of experience in IT ...");
        //java.setSelected(true);

        // List<FormElement> elements = new ArrayList<>();
        // this does exactly the same, but the code gets cleaner
        List<FormElement> elements = Arrays.asList(userName,
                password,
                email,
                age,
                experience,
                language,
                salute);

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

        elements.forEach(e -> {
            if(!e.isValid()){
                e.getErrors().forEach(System.out::println);
            }
        });

    }
}
