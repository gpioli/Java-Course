package com.gpioli.app.garden;

import com.gpioli.app.home.Person;

public class Dog {

    protected String name;
    protected String breed;


    String play(Person person){
        return person.throwBall();
    }

}
