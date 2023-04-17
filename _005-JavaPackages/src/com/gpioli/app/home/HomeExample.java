package com.gpioli.app.home;

import com.gpioli.app.garden.Dog;
import static com.gpioli.app.home.Person.salute;


public class HomeExample {
    public static void main(String[] args) {


        Person p = new Person();
        Dog dog = new Dog();

        //dog.play(); // We wont be able to call this method, as Dog Class is public and its default method (play in
        // this case) is only accesible inside the garden package

        String salute = salute();

    }

}
