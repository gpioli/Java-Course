package org.piolicompany.com.model;

public class Manager extends Employee{

    private Double budget;

    public Manager(String firstName, String lastName, Double budget) {
        super(firstName, lastName);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        System.out.print("Class: ");
        Class classData = this.getClass();
        return classData + " \n" +
                super.toString() +
                ", Budget: " + budget;
    }
}
