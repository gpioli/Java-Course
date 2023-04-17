package com.gpioli.app.garden;

import com.gpioli.app.home.*;
import static com.gpioli.app.home.Person.salute;
import static com.gpioli.app.home.Person.FEMALE_GERNE;
import static com.gpioli.app.home.Person.MALE_GENRE;
import static com.gpioli.app.home.HairColor.BLONDE;

public class PackageExample {
    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("Gaston");
        person.setHairColor(BLONDE);
        System.out.println(person.getFirstName());


        Dog dog = new Dog();
        dog.name = "Firulais";
        dog.breed = "Bulldog";

        String playing = dog.play(person);
        System.out.println(playing);

        String salute = salute();
        System.out.println("salute = " + salute);

        String femaleGenre = FEMALE_GERNE;
        String maleGenre = MALE_GENRE;

    }
}
