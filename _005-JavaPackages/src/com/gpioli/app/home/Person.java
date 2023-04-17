package com.gpioli.app.home;

public class Person {

    private String firstName;
    private String lastname;
    private HairColor hairColor;

    public static final String MALE_GENRE = "Man";
    public static final String FEMALE_GERNE = "Female";


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public void setHairColor(HairColor hairColor) {
        this.hairColor = hairColor;
    }

    public String throwBall(){
        return "Ball thrown to the dog!";
    }

    public static String salute(){
        return "Hi! How you doing?";
    }
}
