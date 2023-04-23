package org.gpioli.pooinheritance;

public class Professor extends Person{

    private String subject;

    public Professor() {
        System.out.println("Professor: initializing constructor");
    }

    public Professor(String firstName, String lastName){
        super(firstName, lastName);
    }

    public Professor(String firstName, String lastName, String subject){
        this(firstName, lastName);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String salute() {
        return "Good morning, I am a professor of " + this.getSubject() + " and my name is " + this.getFirstName();
    }

    @Override
    public String toString() {
        return super.toString() +
                "subject='" + subject;
    }
}
