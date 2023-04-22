package org.gpioli.pooinheritance;

public class InternationalStudent extends Student {

    private String country;
    private double languagesGrade;

    public InternationalStudent() {
        System.out.println("InternationalStudent: initializing constructor");
    }

    public InternationalStudent(String firstName, String lastName){
        super(firstName, lastName);
    }

    public InternationalStudent(String firstName, String lastName, String country){
        super(firstName, firstName);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getLanguagesGrade() {
        return languagesGrade;
    }

    public void setLanguagesGrade(double languagesGrade) {
        this.languagesGrade = languagesGrade;
    }
}
