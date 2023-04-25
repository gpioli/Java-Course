package org.piolicompany.com.model;

public class Employee extends Person{

    private Double salary;
    private int employeeId;
    private int employeeIdIndex;

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
        this.employeeId = ++employeeIdIndex;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void increaseSalary(int percentage){
        this.salary += this.salary * percentage;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Employee Id: " + employeeId;
    }
}
